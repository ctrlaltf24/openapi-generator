# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule OpenapiPetstore.Model.EnumTest do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"enum_string",
    :"enum_string_required",
    :"enum_integer",
    :"enum_number",
    :"outerEnum",
    :"outerEnumInteger",
    :"outerEnumDefaultValue",
    :"outerEnumIntegerDefaultValue"
  ]

  @type t :: %__MODULE__{
    :"enum_string" => String.t | nil,
    :"enum_string_required" => String.t,
    :"enum_integer" => integer() | nil,
    :"enum_number" => float() | nil,
    :"outerEnum" => OpenapiPetstore.Model.OuterEnum.t | nil,
    :"outerEnumInteger" => OpenapiPetstore.Model.OuterEnumInteger.t | nil,
    :"outerEnumDefaultValue" => OpenapiPetstore.Model.OuterEnumDefaultValue.t | nil,
    :"outerEnumIntegerDefaultValue" => OpenapiPetstore.Model.OuterEnumIntegerDefaultValue.t | nil
  }
end

defimpl Poison.Decoder, for: OpenapiPetstore.Model.EnumTest do
  import OpenapiPetstore.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"outerEnum", :struct, OpenapiPetstore.Model.OuterEnum, options)
    |> deserialize(:"outerEnumInteger", :struct, OpenapiPetstore.Model.OuterEnumInteger, options)
    |> deserialize(:"outerEnumDefaultValue", :struct, OpenapiPetstore.Model.OuterEnumDefaultValue, options)
    |> deserialize(:"outerEnumIntegerDefaultValue", :struct, OpenapiPetstore.Model.OuterEnumIntegerDefaultValue, options)
  end
end

