// <auto-generated>

#nullable enable

using System;
using System.Linq;
using System.Threading;
using System.Threading.Tasks;

namespace UseSourceGeneration.Client
{
    /// <summary>
    /// A token constructed from a token from a bearer token.
    /// </summary>
    public class BearerToken : TokenBase
    {
        private string _raw;

        /// <summary>
        /// Constructs a BearerToken object.
        /// </summary>
        /// <param name="value"></param>
        /// <param name="timeout"></param>
        public BearerToken(string value, TimeSpan? timeout = null) : base(timeout)
        {
            _raw = value;
        }

        /// <summary>
        /// Places the token in the header.
        /// </summary>
        /// <param name="request"></param>
        /// <param name="headerName"></param>
        public virtual void UseInHeader(System.Net.Http.HttpRequestMessage request, string headerName)
        {
            request.Headers.Authorization = new System.Net.Http.Headers.AuthenticationHeaderValue("Bearer", _raw);
        }
    }
}