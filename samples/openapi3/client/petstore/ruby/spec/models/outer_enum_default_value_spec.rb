=begin
#OpenAPI Petstore

#This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

The version of the OpenAPI document: 1.0.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 4.1.2-SNAPSHOT

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for Petstore::OuterEnumDefaultValue
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'OuterEnumDefaultValue' do
  before do
    # run before each test
    @instance = Petstore::OuterEnumDefaultValue.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of OuterEnumDefaultValue' do
    it 'should create an instance of OuterEnumDefaultValue' do
      expect(@instance).to be_instance_of(Petstore::OuterEnumDefaultValue)
    end
  end
end
