// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ApplicationGatewayProbeMatch {
    /**
     * @return A snippet from the Response Body which must be present in the Response.
     * 
     */
    private final String body;
    /**
     * @return A list of allowed status codes for this Health Probe.
     * 
     */
    private final List<String> statusCodes;

    @CustomType.Constructor
    private ApplicationGatewayProbeMatch(
        @CustomType.Parameter("body") String body,
        @CustomType.Parameter("statusCodes") List<String> statusCodes) {
        this.body = body;
        this.statusCodes = statusCodes;
    }

    /**
     * @return A snippet from the Response Body which must be present in the Response.
     * 
     */
    public String body() {
        return this.body;
    }
    /**
     * @return A list of allowed status codes for this Health Probe.
     * 
     */
    public List<String> statusCodes() {
        return this.statusCodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayProbeMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String body;
        private List<String> statusCodes;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayProbeMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.body = defaults.body;
    	      this.statusCodes = defaults.statusCodes;
        }

        public Builder body(String body) {
            this.body = Objects.requireNonNull(body);
            return this;
        }
        public Builder statusCodes(List<String> statusCodes) {
            this.statusCodes = Objects.requireNonNull(statusCodes);
            return this;
        }
        public Builder statusCodes(String... statusCodes) {
            return statusCodes(List.of(statusCodes));
        }        public ApplicationGatewayProbeMatch build() {
            return new ApplicationGatewayProbeMatch(body, statusCodes);
        }
    }
}
