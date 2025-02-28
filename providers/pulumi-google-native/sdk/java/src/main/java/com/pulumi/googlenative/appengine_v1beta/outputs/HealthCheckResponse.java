// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class HealthCheckResponse {
    /**
     * @return Interval between health checks.
     * 
     */
    private final String checkInterval;
    /**
     * @return Whether to explicitly disable health checks for this instance.
     * 
     */
    private final Boolean disableHealthCheck;
    /**
     * @return Number of consecutive successful health checks required before receiving traffic.
     * 
     */
    private final Integer healthyThreshold;
    /**
     * @return Host header to send when performing an HTTP health check. Example: &#34;myapp.appspot.com&#34;
     * 
     */
    private final String host;
    /**
     * @return Number of consecutive failed health checks required before an instance is restarted.
     * 
     */
    private final Integer restartThreshold;
    /**
     * @return Time before the health check is considered failed.
     * 
     */
    private final String timeout;
    /**
     * @return Number of consecutive failed health checks required before removing traffic.
     * 
     */
    private final Integer unhealthyThreshold;

    @CustomType.Constructor
    private HealthCheckResponse(
        @CustomType.Parameter("checkInterval") String checkInterval,
        @CustomType.Parameter("disableHealthCheck") Boolean disableHealthCheck,
        @CustomType.Parameter("healthyThreshold") Integer healthyThreshold,
        @CustomType.Parameter("host") String host,
        @CustomType.Parameter("restartThreshold") Integer restartThreshold,
        @CustomType.Parameter("timeout") String timeout,
        @CustomType.Parameter("unhealthyThreshold") Integer unhealthyThreshold) {
        this.checkInterval = checkInterval;
        this.disableHealthCheck = disableHealthCheck;
        this.healthyThreshold = healthyThreshold;
        this.host = host;
        this.restartThreshold = restartThreshold;
        this.timeout = timeout;
        this.unhealthyThreshold = unhealthyThreshold;
    }

    /**
     * @return Interval between health checks.
     * 
     */
    public String checkInterval() {
        return this.checkInterval;
    }
    /**
     * @return Whether to explicitly disable health checks for this instance.
     * 
     */
    public Boolean disableHealthCheck() {
        return this.disableHealthCheck;
    }
    /**
     * @return Number of consecutive successful health checks required before receiving traffic.
     * 
     */
    public Integer healthyThreshold() {
        return this.healthyThreshold;
    }
    /**
     * @return Host header to send when performing an HTTP health check. Example: &#34;myapp.appspot.com&#34;
     * 
     */
    public String host() {
        return this.host;
    }
    /**
     * @return Number of consecutive failed health checks required before an instance is restarted.
     * 
     */
    public Integer restartThreshold() {
        return this.restartThreshold;
    }
    /**
     * @return Time before the health check is considered failed.
     * 
     */
    public String timeout() {
        return this.timeout;
    }
    /**
     * @return Number of consecutive failed health checks required before removing traffic.
     * 
     */
    public Integer unhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HealthCheckResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String checkInterval;
        private Boolean disableHealthCheck;
        private Integer healthyThreshold;
        private String host;
        private Integer restartThreshold;
        private String timeout;
        private Integer unhealthyThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(HealthCheckResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkInterval = defaults.checkInterval;
    	      this.disableHealthCheck = defaults.disableHealthCheck;
    	      this.healthyThreshold = defaults.healthyThreshold;
    	      this.host = defaults.host;
    	      this.restartThreshold = defaults.restartThreshold;
    	      this.timeout = defaults.timeout;
    	      this.unhealthyThreshold = defaults.unhealthyThreshold;
        }

        public Builder checkInterval(String checkInterval) {
            this.checkInterval = Objects.requireNonNull(checkInterval);
            return this;
        }
        public Builder disableHealthCheck(Boolean disableHealthCheck) {
            this.disableHealthCheck = Objects.requireNonNull(disableHealthCheck);
            return this;
        }
        public Builder healthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = Objects.requireNonNull(healthyThreshold);
            return this;
        }
        public Builder host(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        public Builder restartThreshold(Integer restartThreshold) {
            this.restartThreshold = Objects.requireNonNull(restartThreshold);
            return this;
        }
        public Builder timeout(String timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }
        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = Objects.requireNonNull(unhealthyThreshold);
            return this;
        }        public HealthCheckResponse build() {
            return new HealthCheckResponse(checkInterval, disableHealthCheck, healthyThreshold, host, restartThreshold, timeout, unhealthyThreshold);
        }
    }
}
