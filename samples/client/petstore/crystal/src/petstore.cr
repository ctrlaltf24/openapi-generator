# #OpenAPI Petstore
#
##This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
#
#The version of the OpenAPI document: 1.0.0
#
#Generated by: https://openapi-generator.tech
#OpenAPI Generator version: 5.1.1-SNAPSHOT
#

# Dependencies
require "crest"
require "log"

module Petstore
  Log = ::Log.for("Petstore") # => Log for Petstore source

  VERSION = {{ `shards version #{__DIR__}`.chomp.stringify }}

  # Customize default settings for the SDK using block.
  #   Petstore.configure do |config|
  #     config.username = "xxx"
  #     config.password = "xxx"
  #   end
  # If no block given, return the default Configuration object.
  def configure
    if block_given?
      yield(Configuration.default)
    else
      Configuration.default
    end
  end
end

require "./petstore/**"
