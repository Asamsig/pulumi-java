// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ssmincidents.outputs;

import com.pulumi.awsnative.ssmincidents.enums.ResponsePlanSsmAutomationTargetAccount;
import com.pulumi.awsnative.ssmincidents.outputs.ResponsePlanSsmParameter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResponsePlanSsmAutomation {
    /**
     * @return The document name to use when starting the SSM automation document.
     * 
     */
    private final String documentName;
    /**
     * @return The version of the document to use when starting the SSM automation document.
     * 
     */
    private final @Nullable String documentVersion;
    /**
     * @return The parameters to set when starting the SSM automation document.
     * 
     */
    private final @Nullable List<ResponsePlanSsmParameter> parameters;
    /**
     * @return The role ARN to use when starting the SSM automation document.
     * 
     */
    private final String roleArn;
    /**
     * @return The account type to use when starting the SSM automation document.
     * 
     */
    private final @Nullable ResponsePlanSsmAutomationTargetAccount targetAccount;

    @CustomType.Constructor
    private ResponsePlanSsmAutomation(
        @CustomType.Parameter("documentName") String documentName,
        @CustomType.Parameter("documentVersion") @Nullable String documentVersion,
        @CustomType.Parameter("parameters") @Nullable List<ResponsePlanSsmParameter> parameters,
        @CustomType.Parameter("roleArn") String roleArn,
        @CustomType.Parameter("targetAccount") @Nullable ResponsePlanSsmAutomationTargetAccount targetAccount) {
        this.documentName = documentName;
        this.documentVersion = documentVersion;
        this.parameters = parameters;
        this.roleArn = roleArn;
        this.targetAccount = targetAccount;
    }

    /**
     * @return The document name to use when starting the SSM automation document.
     * 
     */
    public String documentName() {
        return this.documentName;
    }
    /**
     * @return The version of the document to use when starting the SSM automation document.
     * 
     */
    public Optional<String> documentVersion() {
        return Optional.ofNullable(this.documentVersion);
    }
    /**
     * @return The parameters to set when starting the SSM automation document.
     * 
     */
    public List<ResponsePlanSsmParameter> parameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }
    /**
     * @return The role ARN to use when starting the SSM automation document.
     * 
     */
    public String roleArn() {
        return this.roleArn;
    }
    /**
     * @return The account type to use when starting the SSM automation document.
     * 
     */
    public Optional<ResponsePlanSsmAutomationTargetAccount> targetAccount() {
        return Optional.ofNullable(this.targetAccount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponsePlanSsmAutomation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String documentName;
        private @Nullable String documentVersion;
        private @Nullable List<ResponsePlanSsmParameter> parameters;
        private String roleArn;
        private @Nullable ResponsePlanSsmAutomationTargetAccount targetAccount;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponsePlanSsmAutomation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.documentName = defaults.documentName;
    	      this.documentVersion = defaults.documentVersion;
    	      this.parameters = defaults.parameters;
    	      this.roleArn = defaults.roleArn;
    	      this.targetAccount = defaults.targetAccount;
        }

        public Builder documentName(String documentName) {
            this.documentName = Objects.requireNonNull(documentName);
            return this;
        }
        public Builder documentVersion(@Nullable String documentVersion) {
            this.documentVersion = documentVersion;
            return this;
        }
        public Builder parameters(@Nullable List<ResponsePlanSsmParameter> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(ResponsePlanSsmParameter... parameters) {
            return parameters(List.of(parameters));
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder targetAccount(@Nullable ResponsePlanSsmAutomationTargetAccount targetAccount) {
            this.targetAccount = targetAccount;
            return this;
        }        public ResponsePlanSsmAutomation build() {
            return new ResponsePlanSsmAutomation(documentName, documentVersion, parameters, roleArn, targetAccount);
        }
    }
}
