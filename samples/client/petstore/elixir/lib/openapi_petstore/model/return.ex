# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule OpenapiPetstore.Model.Return do
  @moduledoc """
  Model for testing reserved words
  """

  @derive [Poison.Encoder]
  defstruct [
    :return
  ]

  @type t :: %__MODULE__{
    :return => integer() | nil
  }
end

defimpl Poison.Decoder, for: OpenapiPetstore.Model.Return do
  def decode(value, _options) do
    value
  end
end

