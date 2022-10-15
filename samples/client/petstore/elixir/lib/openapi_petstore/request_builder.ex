# NOTE: This file is auto generated by OpenAPI Generator 6.3.0-SNAPSHOT (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OpenapiPetstore.RequestBuilder do
  @moduledoc """
  Helper functions for building Tesla requests
  """

  @doc """
  Specify the request `method` when building a request.

  Does not override the `method` if one has already been specified.

  ### Parameters

  - `request` (Map) - Collected request options
  - `method` (atom) - Request method

  ### Returns

  Map
  """
  @spec method(map(), atom()) :: map()
  def method(request, method) do
    Map.put_new(request, :method, method)
  end

  @doc """
  Specify the request URL when building a request.

  Does not override the `url` if one has already been specified.

  ### Parameters

  - `request` (Map) - Collected request options
  - `url` (String) - Request URL

  ### Returns

  Map
  """
  @spec url(map(), String.t()) :: map()
  def url(request, url) do
    Map.put_new(request, :url, url)
  end

  @doc """
  Add optional parameters to the request.

  ### Parameters

  - `request` (Map) - Collected request options
  - `definitions` (Map) - Map of parameter name to parameter location.
  - `options` (KeywordList) - The provided optional parameters

  ### Returns

  Map
  """
  @spec add_optional_params(map(), %{optional(atom) => atom()}, keyword()) :: map()
  def add_optional_params(request, _, []), do: request

  def add_optional_params(request, definitions, [{key, value} | tail]) do
    case definitions do
      %{^key => location} ->
        request
        |> add_param(location, key, value)
        |> add_optional_params(definitions, tail)

      _ ->
        add_optional_params(request, definitions, tail)
    end
  end

  @doc """
  Add non-optional parameters to the request.

  ### Parameters

  - `request` (Map) - Collected request options
  - `location` (atom) - Where to put the parameter
  - `key` (atom) - The name of the parameter
  - `value` (any) - The value of the parameter

  ### Returns

  Map
  """
  @spec add_param(map(), atom(), atom(), any()) :: map()
  def add_param(request, :body, :body, value), do: Map.put(request, :body, value)

  def add_param(request, :body, key, value) do
    request
    |> Map.put_new_lazy(:body, &Tesla.Multipart.new/0)
    |> Map.update!(:body, fn multipart ->
      Tesla.Multipart.add_field(
        multipart,
        key,
        Poison.encode!(value),
        headers: [{:"Content-Type", "application/json"}]
      )
    end)
  end

  def add_param(request, :headers, key, value) do
    Tesla.put_header(request, key, value)
  end

  def add_param(request, :file, name, path) do
    request
    |> Map.put_new_lazy(:body, &Tesla.Multipart.new/0)
    |> Map.update!(:body, &(Tesla.Multipart.add_file(&1, path, name: name)))
  end

  def add_param(request, :form, name, value) do
    Map.update(request, :body, %{name => value}, &(Map.put(&1, name, value)))
  end

  def add_param(request, location, key, value) do
    Map.update(request, location, [{key, value}], &(&1 ++ [{key, value}]))
  end

  @doc """
  This function ensures that the `body` parameter is always set.

  When using Tesla with the `httpc` adapter (the default adapter), there is a
  bug where POST, PATCH and PUT requests will fail if the body is empty.

  ### Parameters

  - `request` (Map) - Collected request options

  ### Returns

  Map
  """
  @spec ensure_body(map()) :: map()
  def ensure_body(%{body: nil} = request) do
    %{request | body: ""}
  end

  def ensure_body(request) do
    Map.put_new(request, :body, "")
  end

  @type status_code :: 100..599
  @type response_mapping :: [{status_code, struct() | false}]

  @doc """
  Evaluate the response from a Tesla request.
  Decode the response for a Tesla request.

  ### Parameters

  - `result` (Tesla.Env.result()): The response from Tesla.request/2.
  - `mapping` ([{http_status, struct}]): The mapping for status to struct for decoding.

  ### Returns

  - `{:ok, struct}` or `{:ok, Tesla.Env.t()}` on success
  - `{:error, term}` on failure
  """
  @spec evaluate_response(Tesla.Env.result(), response_mapping) :: {:ok, struct()} | Tesla.Env.result()
  def evaluate_response({:ok, %Tesla.Env{} = env}, mapping) do
    resolve_mapping(env, mapping, nil)
  end

  def evaluate_response({:error, _} = error, _), do: error

  defp resolve_mapping(%Tesla.Env{status: status} = env, [{mapping_status, struct} | _], _)
      when status == mapping_status do
    decode(env, struct)
  end

  defp resolve_mapping(env, [{:default, struct} | tail], _), do: resolve_mapping(env, tail, struct)

  defp resolve_mapping(env, [_ | tail], struct), do: resolve_mapping(env, tail, struct)

  defp resolve_mapping(env, [], nil), do: {:error, env}

  defp resolve_mapping(env, [], struct), do: decode(env, struct)

  defp decode(%Tesla.Env{} = env, false), do: {:ok, env}

  defp decode(%Tesla.Env{body: body}, struct), do: Poison.decode(body, as: struct)
end
