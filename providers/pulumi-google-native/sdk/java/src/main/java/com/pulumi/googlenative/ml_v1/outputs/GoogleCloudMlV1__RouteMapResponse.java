// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudMlV1__RouteMapResponse {
    /**
     * @return HTTP path on the container to send health checkss to. AI Platform Prediction intermittently sends GET requests to this path on the container&#39;s IP address and port to check that the container is healthy. Read more about [health checks](/ai-platform/prediction/docs/custom-container-requirements#checks). For example, if you set this field to `/bar`, then AI Platform Prediction intermittently sends a GET request to the `/bar` path on the port of your container specified by the first value of Version.container.ports. If you don&#39;t specify this field, it defaults to the following value: /v1/models/ MODEL/versions/VERSION The placeholders in this value are replaced as follows: * MODEL: The name of the parent Model. This does not include the &#34;projects/PROJECT_ID/models/&#34; prefix that the API returns in output; it is the bare model name, as provided to projects.models.create. * VERSION: The name of the model version. This does not include the &#34;projects/PROJECT_ID /models/MODEL/versions/&#34; prefix that the API returns in output; it is the bare version name, as provided to projects.models.versions.create.
     * 
     */
    private final String health;
    /**
     * @return HTTP path on the container to send prediction requests to. AI Platform Prediction forwards requests sent using projects.predict to this path on the container&#39;s IP address and port. AI Platform Prediction then returns the container&#39;s response in the API response. For example, if you set this field to `/foo`, then when AI Platform Prediction receives a prediction request, it forwards the request body in a POST request to the `/foo` path on the port of your container specified by the first value of Version.container.ports. If you don&#39;t specify this field, it defaults to the following value: /v1/models/MODEL/versions/VERSION:predict The placeholders in this value are replaced as follows: * MODEL: The name of the parent Model. This does not include the &#34;projects/PROJECT_ID/models/&#34; prefix that the API returns in output; it is the bare model name, as provided to projects.models.create. * VERSION: The name of the model version. This does not include the &#34;projects/PROJECT_ID/models/MODEL/versions/&#34; prefix that the API returns in output; it is the bare version name, as provided to projects.models.versions.create.
     * 
     */
    private final String predict;

    @CustomType.Constructor
    private GoogleCloudMlV1__RouteMapResponse(
        @CustomType.Parameter("health") String health,
        @CustomType.Parameter("predict") String predict) {
        this.health = health;
        this.predict = predict;
    }

    /**
     * @return HTTP path on the container to send health checkss to. AI Platform Prediction intermittently sends GET requests to this path on the container&#39;s IP address and port to check that the container is healthy. Read more about [health checks](/ai-platform/prediction/docs/custom-container-requirements#checks). For example, if you set this field to `/bar`, then AI Platform Prediction intermittently sends a GET request to the `/bar` path on the port of your container specified by the first value of Version.container.ports. If you don&#39;t specify this field, it defaults to the following value: /v1/models/ MODEL/versions/VERSION The placeholders in this value are replaced as follows: * MODEL: The name of the parent Model. This does not include the &#34;projects/PROJECT_ID/models/&#34; prefix that the API returns in output; it is the bare model name, as provided to projects.models.create. * VERSION: The name of the model version. This does not include the &#34;projects/PROJECT_ID /models/MODEL/versions/&#34; prefix that the API returns in output; it is the bare version name, as provided to projects.models.versions.create.
     * 
     */
    public String health() {
        return this.health;
    }
    /**
     * @return HTTP path on the container to send prediction requests to. AI Platform Prediction forwards requests sent using projects.predict to this path on the container&#39;s IP address and port. AI Platform Prediction then returns the container&#39;s response in the API response. For example, if you set this field to `/foo`, then when AI Platform Prediction receives a prediction request, it forwards the request body in a POST request to the `/foo` path on the port of your container specified by the first value of Version.container.ports. If you don&#39;t specify this field, it defaults to the following value: /v1/models/MODEL/versions/VERSION:predict The placeholders in this value are replaced as follows: * MODEL: The name of the parent Model. This does not include the &#34;projects/PROJECT_ID/models/&#34; prefix that the API returns in output; it is the bare model name, as provided to projects.models.create. * VERSION: The name of the model version. This does not include the &#34;projects/PROJECT_ID/models/MODEL/versions/&#34; prefix that the API returns in output; it is the bare version name, as provided to projects.models.versions.create.
     * 
     */
    public String predict() {
        return this.predict;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__RouteMapResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String health;
        private String predict;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__RouteMapResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.health = defaults.health;
    	      this.predict = defaults.predict;
        }

        public Builder health(String health) {
            this.health = Objects.requireNonNull(health);
            return this;
        }
        public Builder predict(String predict) {
            this.predict = Objects.requireNonNull(predict);
            return this;
        }        public GoogleCloudMlV1__RouteMapResponse build() {
            return new GoogleCloudMlV1__RouteMapResponse(health, predict);
        }
    }
}
