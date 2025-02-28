// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetKubernetesClusterWindowsProfile {
    /**
     * @return The username associated with the administrator account of the Windows VMs.
     * 
     */
    private final String adminUsername;

    @CustomType.Constructor
    private GetKubernetesClusterWindowsProfile(@CustomType.Parameter("adminUsername") String adminUsername) {
        this.adminUsername = adminUsername;
    }

    /**
     * @return The username associated with the administrator account of the Windows VMs.
     * 
     */
    public String adminUsername() {
        return this.adminUsername;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKubernetesClusterWindowsProfile defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String adminUsername;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKubernetesClusterWindowsProfile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminUsername = defaults.adminUsername;
        }

        public Builder adminUsername(String adminUsername) {
            this.adminUsername = Objects.requireNonNull(adminUsername);
            return this;
        }        public GetKubernetesClusterWindowsProfile build() {
            return new GetKubernetesClusterWindowsProfile(adminUsername);
        }
    }
}
