// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.composer_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.util.Objects;

@CustomType
public final class WebServerResourceResponse {
    /**
     * @return Optional. CPU request and limit for Airflow web server.
     * 
     */
    private final Double cpu;
    /**
     * @return Optional. Memory (GB) request and limit for Airflow web server.
     * 
     */
    private final Double memoryGb;
    /**
     * @return Optional. Storage (GB) request and limit for Airflow web server.
     * 
     */
    private final Double storageGb;

    @CustomType.Constructor
    private WebServerResourceResponse(
        @CustomType.Parameter("cpu") Double cpu,
        @CustomType.Parameter("memoryGb") Double memoryGb,
        @CustomType.Parameter("storageGb") Double storageGb) {
        this.cpu = cpu;
        this.memoryGb = memoryGb;
        this.storageGb = storageGb;
    }

    /**
     * @return Optional. CPU request and limit for Airflow web server.
     * 
     */
    public Double cpu() {
        return this.cpu;
    }
    /**
     * @return Optional. Memory (GB) request and limit for Airflow web server.
     * 
     */
    public Double memoryGb() {
        return this.memoryGb;
    }
    /**
     * @return Optional. Storage (GB) request and limit for Airflow web server.
     * 
     */
    public Double storageGb() {
        return this.storageGb;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebServerResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double cpu;
        private Double memoryGb;
        private Double storageGb;

        public Builder() {
    	      // Empty
        }

        public Builder(WebServerResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.memoryGb = defaults.memoryGb;
    	      this.storageGb = defaults.storageGb;
        }

        public Builder cpu(Double cpu) {
            this.cpu = Objects.requireNonNull(cpu);
            return this;
        }
        public Builder memoryGb(Double memoryGb) {
            this.memoryGb = Objects.requireNonNull(memoryGb);
            return this;
        }
        public Builder storageGb(Double storageGb) {
            this.storageGb = Objects.requireNonNull(storageGb);
            return this;
        }        public WebServerResourceResponse build() {
            return new WebServerResourceResponse(cpu, memoryGb, storageGb);
        }
    }
}
