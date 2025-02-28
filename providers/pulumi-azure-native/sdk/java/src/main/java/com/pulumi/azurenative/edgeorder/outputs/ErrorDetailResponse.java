// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.edgeorder.outputs;

import com.pulumi.azurenative.edgeorder.outputs.ErrorAdditionalInfoResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ErrorDetailResponse {
    /**
     * @return The error additional info.
     * 
     */
    private final List<ErrorAdditionalInfoResponse> additionalInfo;
    /**
     * @return The error code.
     * 
     */
    private final String code;
    /**
     * @return The error details.
     * 
     */
    private final List<ErrorDetailResponse> details;
    /**
     * @return The error message.
     * 
     */
    private final String message;
    /**
     * @return The error target.
     * 
     */
    private final String target;

    @CustomType.Constructor
    private ErrorDetailResponse(
        @CustomType.Parameter("additionalInfo") List<ErrorAdditionalInfoResponse> additionalInfo,
        @CustomType.Parameter("code") String code,
        @CustomType.Parameter("details") List<ErrorDetailResponse> details,
        @CustomType.Parameter("message") String message,
        @CustomType.Parameter("target") String target) {
        this.additionalInfo = additionalInfo;
        this.code = code;
        this.details = details;
        this.message = message;
        this.target = target;
    }

    /**
     * @return The error additional info.
     * 
     */
    public List<ErrorAdditionalInfoResponse> additionalInfo() {
        return this.additionalInfo;
    }
    /**
     * @return The error code.
     * 
     */
    public String code() {
        return this.code;
    }
    /**
     * @return The error details.
     * 
     */
    public List<ErrorDetailResponse> details() {
        return this.details;
    }
    /**
     * @return The error message.
     * 
     */
    public String message() {
        return this.message;
    }
    /**
     * @return The error target.
     * 
     */
    public String target() {
        return this.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ErrorDetailResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ErrorAdditionalInfoResponse> additionalInfo;
        private String code;
        private List<ErrorDetailResponse> details;
        private String message;
        private String target;

        public Builder() {
    	      // Empty
        }

        public Builder(ErrorDetailResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalInfo = defaults.additionalInfo;
    	      this.code = defaults.code;
    	      this.details = defaults.details;
    	      this.message = defaults.message;
    	      this.target = defaults.target;
        }

        public Builder additionalInfo(List<ErrorAdditionalInfoResponse> additionalInfo) {
            this.additionalInfo = Objects.requireNonNull(additionalInfo);
            return this;
        }
        public Builder additionalInfo(ErrorAdditionalInfoResponse... additionalInfo) {
            return additionalInfo(List.of(additionalInfo));
        }
        public Builder code(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }
        public Builder details(List<ErrorDetailResponse> details) {
            this.details = Objects.requireNonNull(details);
            return this;
        }
        public Builder details(ErrorDetailResponse... details) {
            return details(List.of(details));
        }
        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        public Builder target(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }        public ErrorDetailResponse build() {
            return new ErrorDetailResponse(additionalInfo, code, details, message, target);
        }
    }
}
