// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudtasks_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.cloudtasks_v2.outputs.AppEngineRoutingResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class AppEngineHttpRequestResponse {
    /**
     * @return Task-level setting for App Engine routing. * If app_engine_routing_override is set on the queue, this value is used for all tasks in the queue, no matter what the setting is for the task-level app_engine_routing.
     * 
     */
    private final AppEngineRoutingResponse appEngineRouting;
    /**
     * @return HTTP request body. A request body is allowed only if the HTTP method is POST or PUT. It is an error to set a body on a task with an incompatible HttpMethod.
     * 
     */
    private final String body;
    /**
     * @return HTTP request headers. This map contains the header field names and values. Headers can be set when the task is created. Repeated headers are not supported but a header value can contain commas. Cloud Tasks sets some headers to default values: * `User-Agent`: By default, this header is `&#34;AppEngine-Google; (+http://code.google.com/appengine)&#34;`. This header can be modified, but Cloud Tasks will append `&#34;AppEngine-Google; (+http://code.google.com/appengine)&#34;` to the modified `User-Agent`. If the task has a body, Cloud Tasks sets the following headers: * `Content-Type`: By default, the `Content-Type` header is set to `&#34;application/octet-stream&#34;`. The default can be overridden by explicitly setting `Content-Type` to a particular media type when the task is created. For example, `Content-Type` can be set to `&#34;application/json&#34;`. * `Content-Length`: This is computed by Cloud Tasks. This value is output only. It cannot be changed. The headers below cannot be set or overridden: * `Host` * `X-Google-*` * `X-AppEngine-*` In addition, Cloud Tasks sets some headers when the task is dispatched, such as headers containing information about the task; see [request headers](https://cloud.google.com/tasks/docs/creating-appengine-handlers#reading_request_headers). These headers are set only when the task is dispatched, so they are not visible when the task is returned in a Cloud Tasks response. Although there is no specific limit for the maximum number of headers or the size, there is a limit on the maximum size of the Task. For more information, see the CreateTask documentation.
     * 
     */
    private final Map<String,String> headers;
    /**
     * @return The HTTP method to use for the request. The default is POST. The app&#39;s request handler for the task&#39;s target URL must be able to handle HTTP requests with this http_method, otherwise the task attempt fails with error code 405 (Method Not Allowed). See [Writing a push task request handler](https://cloud.google.com/appengine/docs/java/taskqueue/push/creating-handlers#writing_a_push_task_request_handler) and the App Engine documentation for your runtime on [How Requests are Handled](https://cloud.google.com/appengine/docs/standard/python3/how-requests-are-handled).
     * 
     */
    private final String httpMethod;
    /**
     * @return The relative URI. The relative URI must begin with &#34;/&#34; and must be a valid HTTP relative URI. It can contain a path and query string arguments. If the relative URI is empty, then the root path &#34;/&#34; will be used. No spaces are allowed, and the maximum length allowed is 2083 characters.
     * 
     */
    private final String relativeUri;

    @CustomType.Constructor
    private AppEngineHttpRequestResponse(
        @CustomType.Parameter("appEngineRouting") AppEngineRoutingResponse appEngineRouting,
        @CustomType.Parameter("body") String body,
        @CustomType.Parameter("headers") Map<String,String> headers,
        @CustomType.Parameter("httpMethod") String httpMethod,
        @CustomType.Parameter("relativeUri") String relativeUri) {
        this.appEngineRouting = appEngineRouting;
        this.body = body;
        this.headers = headers;
        this.httpMethod = httpMethod;
        this.relativeUri = relativeUri;
    }

    /**
     * @return Task-level setting for App Engine routing. * If app_engine_routing_override is set on the queue, this value is used for all tasks in the queue, no matter what the setting is for the task-level app_engine_routing.
     * 
     */
    public AppEngineRoutingResponse appEngineRouting() {
        return this.appEngineRouting;
    }
    /**
     * @return HTTP request body. A request body is allowed only if the HTTP method is POST or PUT. It is an error to set a body on a task with an incompatible HttpMethod.
     * 
     */
    public String body() {
        return this.body;
    }
    /**
     * @return HTTP request headers. This map contains the header field names and values. Headers can be set when the task is created. Repeated headers are not supported but a header value can contain commas. Cloud Tasks sets some headers to default values: * `User-Agent`: By default, this header is `&#34;AppEngine-Google; (+http://code.google.com/appengine)&#34;`. This header can be modified, but Cloud Tasks will append `&#34;AppEngine-Google; (+http://code.google.com/appengine)&#34;` to the modified `User-Agent`. If the task has a body, Cloud Tasks sets the following headers: * `Content-Type`: By default, the `Content-Type` header is set to `&#34;application/octet-stream&#34;`. The default can be overridden by explicitly setting `Content-Type` to a particular media type when the task is created. For example, `Content-Type` can be set to `&#34;application/json&#34;`. * `Content-Length`: This is computed by Cloud Tasks. This value is output only. It cannot be changed. The headers below cannot be set or overridden: * `Host` * `X-Google-*` * `X-AppEngine-*` In addition, Cloud Tasks sets some headers when the task is dispatched, such as headers containing information about the task; see [request headers](https://cloud.google.com/tasks/docs/creating-appengine-handlers#reading_request_headers). These headers are set only when the task is dispatched, so they are not visible when the task is returned in a Cloud Tasks response. Although there is no specific limit for the maximum number of headers or the size, there is a limit on the maximum size of the Task. For more information, see the CreateTask documentation.
     * 
     */
    public Map<String,String> headers() {
        return this.headers;
    }
    /**
     * @return The HTTP method to use for the request. The default is POST. The app&#39;s request handler for the task&#39;s target URL must be able to handle HTTP requests with this http_method, otherwise the task attempt fails with error code 405 (Method Not Allowed). See [Writing a push task request handler](https://cloud.google.com/appengine/docs/java/taskqueue/push/creating-handlers#writing_a_push_task_request_handler) and the App Engine documentation for your runtime on [How Requests are Handled](https://cloud.google.com/appengine/docs/standard/python3/how-requests-are-handled).
     * 
     */
    public String httpMethod() {
        return this.httpMethod;
    }
    /**
     * @return The relative URI. The relative URI must begin with &#34;/&#34; and must be a valid HTTP relative URI. It can contain a path and query string arguments. If the relative URI is empty, then the root path &#34;/&#34; will be used. No spaces are allowed, and the maximum length allowed is 2083 characters.
     * 
     */
    public String relativeUri() {
        return this.relativeUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppEngineHttpRequestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppEngineRoutingResponse appEngineRouting;
        private String body;
        private Map<String,String> headers;
        private String httpMethod;
        private String relativeUri;

        public Builder() {
    	      // Empty
        }

        public Builder(AppEngineHttpRequestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appEngineRouting = defaults.appEngineRouting;
    	      this.body = defaults.body;
    	      this.headers = defaults.headers;
    	      this.httpMethod = defaults.httpMethod;
    	      this.relativeUri = defaults.relativeUri;
        }

        public Builder appEngineRouting(AppEngineRoutingResponse appEngineRouting) {
            this.appEngineRouting = Objects.requireNonNull(appEngineRouting);
            return this;
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
        public Builder relativeUri(String relativeUri) {
            this.relativeUri = Objects.requireNonNull(relativeUri);
            return this;
        }        public AppEngineHttpRequestResponse build() {
            return new AppEngineHttpRequestResponse(appEngineRouting, body, headers, httpMethod, relativeUri);
        }
    }
}
