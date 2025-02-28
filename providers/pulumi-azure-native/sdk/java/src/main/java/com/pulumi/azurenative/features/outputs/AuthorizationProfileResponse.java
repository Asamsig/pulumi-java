// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.features.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AuthorizationProfileResponse {
    /**
     * @return The approved time
     * 
     */
    private final String approvedTime;
    /**
     * @return The approver
     * 
     */
    private final String approver;
    /**
     * @return The requested time
     * 
     */
    private final String requestedTime;
    /**
     * @return The requester
     * 
     */
    private final String requester;
    /**
     * @return The requester object id
     * 
     */
    private final String requesterObjectId;

    @CustomType.Constructor
    private AuthorizationProfileResponse(
        @CustomType.Parameter("approvedTime") String approvedTime,
        @CustomType.Parameter("approver") String approver,
        @CustomType.Parameter("requestedTime") String requestedTime,
        @CustomType.Parameter("requester") String requester,
        @CustomType.Parameter("requesterObjectId") String requesterObjectId) {
        this.approvedTime = approvedTime;
        this.approver = approver;
        this.requestedTime = requestedTime;
        this.requester = requester;
        this.requesterObjectId = requesterObjectId;
    }

    /**
     * @return The approved time
     * 
     */
    public String approvedTime() {
        return this.approvedTime;
    }
    /**
     * @return The approver
     * 
     */
    public String approver() {
        return this.approver;
    }
    /**
     * @return The requested time
     * 
     */
    public String requestedTime() {
        return this.requestedTime;
    }
    /**
     * @return The requester
     * 
     */
    public String requester() {
        return this.requester;
    }
    /**
     * @return The requester object id
     * 
     */
    public String requesterObjectId() {
        return this.requesterObjectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorizationProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String approvedTime;
        private String approver;
        private String requestedTime;
        private String requester;
        private String requesterObjectId;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorizationProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.approvedTime = defaults.approvedTime;
    	      this.approver = defaults.approver;
    	      this.requestedTime = defaults.requestedTime;
    	      this.requester = defaults.requester;
    	      this.requesterObjectId = defaults.requesterObjectId;
        }

        public Builder approvedTime(String approvedTime) {
            this.approvedTime = Objects.requireNonNull(approvedTime);
            return this;
        }
        public Builder approver(String approver) {
            this.approver = Objects.requireNonNull(approver);
            return this;
        }
        public Builder requestedTime(String requestedTime) {
            this.requestedTime = Objects.requireNonNull(requestedTime);
            return this;
        }
        public Builder requester(String requester) {
            this.requester = Objects.requireNonNull(requester);
            return this;
        }
        public Builder requesterObjectId(String requesterObjectId) {
            this.requesterObjectId = Objects.requireNonNull(requesterObjectId);
            return this;
        }        public AuthorizationProfileResponse build() {
            return new AuthorizationProfileResponse(approvedTime, approver, requestedTime, requester, requesterObjectId);
        }
    }
}
