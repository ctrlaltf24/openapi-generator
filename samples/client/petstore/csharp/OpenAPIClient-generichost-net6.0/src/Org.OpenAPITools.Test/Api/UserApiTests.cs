/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Xunit;
using Microsoft.Extensions.DependencyInjection;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Model;


/* *********************************************************************************
*              Follow these manual steps to construct tests.
*              This file will not be overwritten.
*  *********************************************************************************
* 1. Navigate to ApiTests.Base.cs and ensure any tokens are being created correctly.
*    Take care not to commit credentials to any repository.
*
* 2. Mocking is coordinated by ApiTestsBase#AddApiHttpClients.
*    To mock the client, use the generic AddApiHttpClients.
*    To mock the server, change the client's BaseAddress.
*
* 3. Locate the test you want below
*      - remove the skip property from the Fact attribute
*      - set the value of any variables if necessary
*
* 4. Run the tests and ensure they work.
*
*/


namespace Org.OpenAPITools.Test.Api
{
    /// <summary>
    ///  Class for testing UserApi
    /// </summary>
    public sealed class UserApiTests : ApiTestsBase
    {
        private readonly IUserApi _instance;

        public UserApiTests(): base(Array.Empty<string>())
        {
            _instance = _host.Services.GetRequiredService<IUserApi>();
        }

        /// <summary>
        /// Test CreateUser
        /// </summary>
        [Fact (Skip = "not implemented")]
        public async Task CreateUserAsyncTest()
        {
            User user = default;
            await _instance.CreateUserAsync(user);
        }

        /// <summary>
        /// Test CreateUsersWithArrayInput
        /// </summary>
        [Fact (Skip = "not implemented")]
        public async Task CreateUsersWithArrayInputAsyncTest()
        {
            List<User> user = default;
            await _instance.CreateUsersWithArrayInputAsync(user);
        }

        /// <summary>
        /// Test CreateUsersWithListInput
        /// </summary>
        [Fact (Skip = "not implemented")]
        public async Task CreateUsersWithListInputAsyncTest()
        {
            List<User> user = default;
            await _instance.CreateUsersWithListInputAsync(user);
        }

        /// <summary>
        /// Test DeleteUser
        /// </summary>
        [Fact (Skip = "not implemented")]
        public async Task DeleteUserAsyncTest()
        {
            string username = default;
            await _instance.DeleteUserAsync(username);
        }

        /// <summary>
        /// Test GetUserByName
        /// </summary>
        [Fact (Skip = "not implemented")]
        public async Task GetUserByNameAsyncTest()
        {
            string username = default;
            var response = await _instance.GetUserByNameAsync(username);
            var model = response.AsModel();
            Assert.IsType<User>(model);
        }

        /// <summary>
        /// Test LoginUser
        /// </summary>
        [Fact (Skip = "not implemented")]
        public async Task LoginUserAsyncTest()
        {
            string username = default;
            string password = default;
            var response = await _instance.LoginUserAsync(username, password);
            var model = response.AsModel();
            Assert.IsType<string>(model);
        }

        /// <summary>
        /// Test LogoutUser
        /// </summary>
        [Fact (Skip = "not implemented")]
        public async Task LogoutUserAsyncTest()
        {
            await _instance.LogoutUserAsync();
        }

        /// <summary>
        /// Test UpdateUser
        /// </summary>
        [Fact (Skip = "not implemented")]
        public async Task UpdateUserAsyncTest()
        {
            User user = default;
            string username = default;
            await _instance.UpdateUserAsync(user, username);
        }
    }
}
