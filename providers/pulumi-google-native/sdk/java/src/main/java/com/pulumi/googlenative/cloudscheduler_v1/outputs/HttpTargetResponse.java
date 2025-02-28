// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudscheduler_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.cloudscheduler_v1.outputs.OAuthTokenResponse;
import com.pulumi.googlenative.cloudscheduler_v1.outputs.OidcTokenResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class HttpTargetResponse {
    /**
     * @return HTTP request body. A request body is allowed only if the HTTP method is POST, PUT, or PATCH. It is an error to set body on a job with an incompatible HttpMethod.
     * 
     */
    private final String body;
    /**
     * @return The user can specify HTTP request headers to send with the job&#39;s HTTP request. This map contains the header field names and values. Repeated headers are not supported, but a header value can contain commas. These headers represent a subset of the headers that will accompany the job&#39;s HTTP request. Some HTTP request headers will be ignored or replaced. A partial list of headers that will be ignored or replaced is below: - Host: This will be computed by Cloud Scheduler and derived from uri. * `Content-Length`: This will be computed by Cloud Scheduler. * `User-Agent`: This will be set to `&#34;Google-Cloud-Scheduler&#34;`. * `X-Google-*`: Google internal use only. * `X-AppEngine-*`: Google internal use only. * `X-CloudScheduler`: This header will be set to true. * `X-CloudScheduler-JobName`: This header will contain the job name. * `X-CloudScheduler-ScheduleTime`: For Cloud Scheduler jobs specified in the unix-cron format, this header will contain the job schedule time in RFC3339 UTC &#34;Zulu&#34; format. The total size of headers must be less than 80KB.
     * 
     */
    private final Map<String,String> headers;
    /**
     * @return Which HTTP method to use for the request.
     * 
     */
    private final String httpMethod;
    /**
     * @return If specified, an [OAuth token](https://developers.google.com/identity/protocols/OAuth2) will be generated and attached as an `Authorization` header in the HTTP request. This type of authorization should generally only be used when calling Google APIs hosted on *.googleapis.com.
     * 
     */
    private final OAuthTokenResponse oauthToken;
    /**
     * @return If specified, an [OIDC](https://developers.google.com/identity/protocols/OpenIDConnect) token will be generated and attached as an `Authorization` header in the HTTP request. This type of authorization can be used for many scenarios, including calling Cloud Run, or endpoints where you intend to validate the token yourself.
     * 
     */
    private final OidcTokenResponse oidcToken;
    /**
     * @return The full URI path that the request will be sent to. This string must begin with either &#34;http://&#34; or &#34;https://&#34;. Some examples of valid values for uri are: `http://acme.com` and `https://acme.com/sales:8080`. Cloud Scheduler will encode some characters for safety and compatibility. The maximum allowed URL length is 2083 characters after encoding.
     * 
     */
    private final String uri;

    @CustomType.Constructor
    private HttpTargetResponse(
        @CustomType.Parameter("body") String body,
        @CustomType.Parameter("headers") Map<String,String> headers,
        @CustomType.Parameter("httpMethod") String httpMethod,
        @CustomType.Parameter("oauthToken") OAuthTokenResponse oauthToken,
        @CustomType.Parameter("oidcToken") OidcTokenResponse oidcToken,
        @CustomType.Parameter("uri") String uri) {
        this.body = body;
        this.headers = headers;
        this.httpMethod = httpMethod;
        this.oauthToken = oauthToken;
        this.oidcToken = oidcToken;
        this.uri = uri;
    }

    /**
     * @return HTTP request body. A request body is allowed only if the HTTP method is POST, PUT, or PATCH. It is an error to set body on a job with an incompatible HttpMethod.
     * 
     */
    public String body() {
        return this.body;
    }
    /**
     * @return The user can specify HTTP request headers to send with the job&#39;s HTTP request. This map contains the header field names and values. Repeated headers are not supported, but a header value can contain commas. These headers represent a subset of the headers that will accompany the job&#39;s HTTP request. Some HTTP request headers will be ignored or replaced. A partial list of headers that will be ignored or replaced is below: - Host: This will be computed by Cloud Scheduler and derived from uri. * `Content-Length`: This will be computed by Cloud Scheduler. * `User-Agent`: This will be set to `&#34;Google-Cloud-Scheduler&#34;`. * `X-Google-*`: Google internal use only. * `X-AppEngine-*`: Google internal use only. * `X-CloudScheduler`: This header will be set to true. * `X-CloudScheduler-JobName`: This header will contain the job name. * `X-CloudScheduler-ScheduleTime`: For Cloud Scheduler jobs specified in the unix-cron format, this header will contain the job schedule time in RFC3339 UTC &#34;Zulu&#34; format. The total size of headers must be less than 80KB.
     * 
     */
    public Map<String,String> headers() {
        return this.headers;
    }
    /**
     * @return Which HTTP method to use for the request.
     * 
     */
    public String httpMethod() {
        return this.httpMethod;
    }
    /**
     * @return If specified, an [OAuth token](https://developers.google.com/identity/protocols/OAuth2) will be generated and attached as an `Authorization` header in the HTTP request. This type of authorization should generally only be used when calling Google APIs hosted on *.googleapis.com.
     * 
     */
    public OAuthTokenResponse oauthToken() {
        return this.oauthToken;
    }
    /**
     * @return If specified, an [OIDC](https://developers.google.com/identity/protocols/OpenIDConnect) token will be generated and attached as an `Authorization` header in the HTTP request. This type of authorization can be used for many scenarios, including calling Cloud Run, or endpoints where you intend to validate the token yourself.
     * 
     */
    public OidcTokenResponse oidcToken() {
        return this.oidcToken;
    }
    /**
     * @return The full URI path that the request will be sent to. This string must begin with either &#34;http://&#34; or &#34;https://&#34;. Some examples of valid values for uri are: `http://acme.com` and `https://acme.com/sales:8080`. Cloud Scheduler will encode some characters for safety and compatibility. The maximum allowed URL length is 2083 characters after encoding.
     * 
     */
    public String uri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpTargetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String body;
        private Map<String,String> headers;
        private String httpMethod;
        private OAuthTokenResponse oauthToken;
        private OidcTokenResponse oidcToken;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpTargetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.body = defaults.body;
    	      this.headers = defaults.headers;
    	      this.httpMethod = defaults.httpMethod;
    	      this.oauthToken = defaults.oauthToken;
    	      this.oidcToken = defaults.oidcToken;
    	      this.uri = defaults.uri;
        }

        public Builder body(String body) {
            this.body = Objects.requireNonNull(body);
            return this;
        }
        public Builder headers(Map<String,String> headers) {
            this.headers = Objects.requireNonNull(headers);
            return this;
        }
        public Builder httpMethod(String httpMethod) {
            this.httpMethod = Objects.requireNonNull(httpMethod);
            return this;
        }
        public Builder oauthToken(OAuthTokenResponse oauthToken) {
            this.oauthToken = Objects.requireNonNull(oauthToken);
            return this;
        }
        public Builder oidcToken(OidcTokenResponse oidcToken) {
            this.oidcToken = Objects.requireNonNull(oidcToken);
            return this;
        }
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }        public HttpTargetResponse build() {
            return new HttpTargetResponse(body, headers, httpMethod, oauthToken, oidcToken, uri);
        }
    }
}
