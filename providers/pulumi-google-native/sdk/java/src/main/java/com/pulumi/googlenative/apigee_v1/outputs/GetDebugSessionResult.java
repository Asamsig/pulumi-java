// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDebugSessionResult {
    /**
     * @return Optional. The number of request to be traced. Min = 1, Max = 15, Default = 10.
     * 
     */
    private final Integer count;
    /**
     * @return The first transaction creation timestamp, recorded by UAP.
     * 
     */
    private final String createTime;
    /**
     * @return Optional. A conditional statement which is evaluated against the request message to determine if it should be traced. Syntax matches that of on API Proxy bundle flow Condition.
     * 
     */
    private final String filter;
    /**
     * @return A unique ID for this DebugSession.
     * 
     */
    private final String name;
    /**
     * @return Optional. The time in seconds after which this DebugSession should end. This value will override the value in query param, if both are provided.
     * 
     */
    private final String timeout;
    /**
     * @return Optional. The maximum number of bytes captured from the response payload. Min = 0, Max = 5120, Default = 5120.
     * 
     */
    private final Integer tracesize;
    /**
     * @return Optional. The length of time, in seconds, that this debug session is valid, starting from when it&#39;s received in the control plane. Min = 1, Max = 15, Default = 10.
     * 
     */
    private final Integer validity;

    @CustomType.Constructor
    private GetDebugSessionResult(
        @CustomType.Parameter("count") Integer count,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("filter") String filter,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("timeout") String timeout,
        @CustomType.Parameter("tracesize") Integer tracesize,
        @CustomType.Parameter("validity") Integer validity) {
        this.count = count;
        this.createTime = createTime;
        this.filter = filter;
        this.name = name;
        this.timeout = timeout;
        this.tracesize = tracesize;
        this.validity = validity;
    }

    /**
     * @return Optional. The number of request to be traced. Min = 1, Max = 15, Default = 10.
     * 
     */
    public Integer count() {
        return this.count;
    }
    /**
     * @return The first transaction creation timestamp, recorded by UAP.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Optional. A conditional statement which is evaluated against the request message to determine if it should be traced. Syntax matches that of on API Proxy bundle flow Condition.
     * 
     */
    public String filter() {
        return this.filter;
    }
    /**
     * @return A unique ID for this DebugSession.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Optional. The time in seconds after which this DebugSession should end. This value will override the value in query param, if both are provided.
     * 
     */
    public String timeout() {
        return this.timeout;
    }
    /**
     * @return Optional. The maximum number of bytes captured from the response payload. Min = 0, Max = 5120, Default = 5120.
     * 
     */
    public Integer tracesize() {
        return this.tracesize;
    }
    /**
     * @return Optional. The length of time, in seconds, that this debug session is valid, starting from when it&#39;s received in the control plane. Min = 1, Max = 15, Default = 10.
     * 
     */
    public Integer validity() {
        return this.validity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDebugSessionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private String createTime;
        private String filter;
        private String name;
        private String timeout;
        private Integer tracesize;
        private Integer validity;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDebugSessionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.createTime = defaults.createTime;
    	      this.filter = defaults.filter;
    	      this.name = defaults.name;
    	      this.timeout = defaults.timeout;
    	      this.tracesize = defaults.tracesize;
    	      this.validity = defaults.validity;
        }

        public Builder count(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder filter(String filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder timeout(String timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }
        public Builder tracesize(Integer tracesize) {
            this.tracesize = Objects.requireNonNull(tracesize);
            return this;
        }
        public Builder validity(Integer validity) {
            this.validity = Objects.requireNonNull(validity);
            return this;
        }        public GetDebugSessionResult build() {
            return new GetDebugSessionResult(count, createTime, filter, name, timeout, tracesize, validity);
        }
    }
}
