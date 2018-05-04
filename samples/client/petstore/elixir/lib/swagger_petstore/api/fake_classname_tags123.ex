# NOTE: This class is auto generated by the swagger code generator program.
# https://github.com/swagger-api/swagger-codegen.git
# Do not edit the class manually.

defmodule SwaggerPetstore.Api.FakeClassnameTags123 do
  @moduledoc """
  API calls for all endpoints tagged `FakeClassnameTags123`.
  """

  alias SwaggerPetstore.Connection
  import SwaggerPetstore.RequestBuilder


  @doc """
  To test class name in snake case
  To test class name in snake case

  ## Parameters

  - connection (SwaggerPetstore.Connection): Connection to server
  - client (Client): client model
  - opts (KeywordList): [optional] Optional parameters
  ## Returns

  {:ok, %SwaggerPetstore.Model.Client{}} on success
  {:error, info} on failure
  """
  @spec test_classname(Tesla.Env.client, SwaggerPetstore.Model.Client.t, keyword()) :: {:ok, SwaggerPetstore.Model.Client.t} | {:error, Tesla.Env.t}
  def test_classname(connection, client, _opts \\ []) do
    %{}
    |> method(:patch)
    |> url("/fake_classname_test")
    |> add_param(:body, :"Client", client)
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> decode(%SwaggerPetstore.Model.Client{})
  end
end
