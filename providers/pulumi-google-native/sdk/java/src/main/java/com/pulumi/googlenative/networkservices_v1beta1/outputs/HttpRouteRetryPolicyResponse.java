// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class HttpRouteRetryPolicyResponse {
    /**
     * @return Specifies the allowed number of retries. This number must be &gt; 0. If not specified, default to 1.
     * 
     */
    private final Integer numRetries;
    /**
     * @return Specifies a non-zero timeout per retry attempt.
     * 
     */
    private final String perTryTimeout;
    /**
     * @return Specifies one or more conditions when this retry policy applies. Valid values are: 5xx: Proxy will attempt a retry if the destination service responds with any 5xx response code, of if the destination service does not respond at all, example: disconnect, reset, read timeout, connection failure and refused streams. gateway-error: Similar to 5xx, but only applies to response codes 502, 503, 504. reset: Proxy will attempt a retry if the destination service does not respond at all (disconnect/reset/read timeout) connect-failure: Proxy will retry on failures connecting to destination for example due to connection timeouts. retriable-4xx: Proxy will retry fro retriable 4xx response codes. Currently the only retriable error supported is 409. refused-stream: Proxy will retry if the destination resets the stream with a REFUSED_STREAM error code. This reset type indicates that it is safe to retry.
     * 
     */
    private final List<String> retryConditions;

    @CustomType.Constructor
    private HttpRouteRetryPolicyResponse(
        @CustomType.Parameter("numRetries") Integer numRetries,
        @CustomType.Parameter("perTryTimeout") String perTryTimeout,
        @CustomType.Parameter("retryConditions") List<String> retryConditions) {
        this.numRetries = numRetries;
        this.perTryTimeout = perTryTimeout;
        this.retryConditions = retryConditions;
    }

    /**
     * @return Specifies the allowed number of retries. This number must be &gt; 0. If not specified, default to 1.
     * 
     */
    public Integer numRetries() {
        return this.numRetries;
    }
    /**
     * @return Specifies a non-zero timeout per retry attempt.
     * 
     */
    public String perTryTimeout() {
        return this.perTryTimeout;
    }
    /**
     * @return Specifies one or more conditions when this retry policy applies. Valid values are: 5xx: Proxy will attempt a retry if the destination service responds with any 5xx response code, of if the destination service does not respond at all, example: disconnect, reset, read timeout, connection failure and refused streams. gateway-error: Similar to 5xx, but only applies to response codes 502, 503, 504. reset: Proxy will attempt a retry if the destination service does not respond at all (disconnect/reset/read timeout) connect-failure: Proxy will retry on failures connecting to destination for example due to connection timeouts. retriable-4xx: Proxy will retry fro retriable 4xx response codes. Currently the only retriable error supported is 409. refused-stream: Proxy will retry if the destination resets the stream with a REFUSED_STREAM error code. This reset type indicates that it is safe to retry.
     * 
     */
    public List<String> retryConditions() {
        return this.retryConditions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpRouteRetryPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer numRetries;
        private String perTryTimeout;
        private List<String> retryConditions;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpRouteRetryPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numRetries = defaults.numRetries;
    	      this.perTryTimeout = defaults.perTryTimeout;
    	      this.retryConditions = defaults.retryConditions;
        }

        public Builder numRetries(Integer numRetries) {
            this.numRetries = Objects.requireNonNull(numRetries);
            return this;
        }
        public Builder perTryTimeout(String perTryTimeout) {
            this.perTryTimeout = Objects.requireNonNull(perTryTimeout);
            return this;
        }
        public Builder retryConditions(List<String> retryConditions) {
            this.retryConditions = Objects.requireNonNull(retryConditions);
            return this;
        }
        public Builder retryConditions(String... retryConditions) {
            return retryConditions(List.of(retryConditions));
        }        public HttpRouteRetryPolicyResponse build() {
            return new HttpRouteRetryPolicyResponse(numRetries, perTryTimeout, retryConditions);
        }
    }
}
