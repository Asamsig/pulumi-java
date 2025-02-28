// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.organizations.outputs;

import com.pulumi.aws.organizations.outputs.OrganizationRootPolicyType;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OrganizationRoot {
    /**
     * @return ARN of the root
     * 
     */
    private final @Nullable String arn;
    /**
     * @return Identifier of the root
     * 
     */
    private final @Nullable String id;
    /**
     * @return The name of the policy type
     * 
     */
    private final @Nullable String name;
    /**
     * @return List of policy types enabled for this root. All elements have these attributes:
     * 
     */
    private final @Nullable List<OrganizationRootPolicyType> policyTypes;

    @CustomType.Constructor
    private OrganizationRoot(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("policyTypes") @Nullable List<OrganizationRootPolicyType> policyTypes) {
        this.arn = arn;
        this.id = id;
        this.name = name;
        this.policyTypes = policyTypes;
    }

    /**
     * @return ARN of the root
     * 
     */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * @return Identifier of the root
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The name of the policy type
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return List of policy types enabled for this root. All elements have these attributes:
     * 
     */
    public List<OrganizationRootPolicyType> policyTypes() {
        return this.policyTypes == null ? List.of() : this.policyTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationRoot defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable List<OrganizationRootPolicyType> policyTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationRoot defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.policyTypes = defaults.policyTypes;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder policyTypes(@Nullable List<OrganizationRootPolicyType> policyTypes) {
            this.policyTypes = policyTypes;
            return this;
        }
        public Builder policyTypes(OrganizationRootPolicyType... policyTypes) {
            return policyTypes(List.of(policyTypes));
        }        public OrganizationRoot build() {
            return new OrganizationRoot(arn, id, name, policyTypes);
        }
    }
}
