=begin
#OpenAPI Petstore

#This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

The version of the OpenAPI document: 1.0.0

Generated by: https://openapi-generator.tech
<<<<<<< HEAD
OpenAPI Generator version: 5.0.0-SNAPSHOT
=======
OpenAPI Generator version: 4.3.1-SNAPSHOT
>>>>>>> origin/master

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for Petstore::Client
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'Client' do
  before do
    # run before each test
    @instance = Petstore::Client.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of Client' do
    it 'should create an instance of Client' do
      expect(@instance).to be_instance_of(Petstore::Client)
    end
  end
  describe 'test attribute "client"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
