// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class IamAuditConfigAuditLogConfig {
    /**
     * @return Identities that do not cause logging for this type of permission.
     * Each entry can have one of the following values:
     * * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
     * * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
     * * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
     * * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
     * 
     */
    private final @Nullable List<String> exemptedMembers;
    /**
     * @return Permission type for which logging is to be configured.  Must be one of `DATA_READ`, `DATA_WRITE`, or `ADMIN_READ`.
     * 
     */
    private final String logType;

    @CustomType.Constructor
    private IamAuditConfigAuditLogConfig(
        @CustomType.Parameter("exemptedMembers") @Nullable List<String> exemptedMembers,
        @CustomType.Parameter("logType") String logType) {
        this.exemptedMembers = exemptedMembers;
        this.logType = logType;
    }

    /**
     * @return Identities that do not cause logging for this type of permission.
     * Each entry can have one of the following values:
     * * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
     * * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
     * * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
     * * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
     * 
     */
    public List<String> exemptedMembers() {
        return this.exemptedMembers == null ? List.of() : this.exemptedMembers;
    }
    /**
     * @return Permission type for which logging is to be configured.  Must be one of `DATA_READ`, `DATA_WRITE`, or `ADMIN_READ`.
     * 
     */
    public String logType() {
        return this.logType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IamAuditConfigAuditLogConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> exemptedMembers;
        private String logType;

        public Builder() {
    	      // Empty
        }

        public Builder(IamAuditConfigAuditLogConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exemptedMembers = defaults.exemptedMembers;
    	      this.logType = defaults.logType;
        }

        public Builder exemptedMembers(@Nullable List<String> exemptedMembers) {
            this.exemptedMembers = exemptedMembers;
            return this;
        }
        public Builder exemptedMembers(String... exemptedMembers) {
            return exemptedMembers(List.of(exemptedMembers));
        }
        public Builder logType(String logType) {
            this.logType = Objects.requireNonNull(logType);
            return this;
        }        public IamAuditConfigAuditLogConfig build() {
            return new IamAuditConfigAuditLogConfig(exemptedMembers, logType);
        }
    }
}
