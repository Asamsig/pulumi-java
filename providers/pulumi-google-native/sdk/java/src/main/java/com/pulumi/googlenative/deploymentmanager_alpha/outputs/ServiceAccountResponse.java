// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.deploymentmanager_alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ServiceAccountResponse {
    /**
     * @return The IAM service account email address like test@myproject.iam.gserviceaccount.com
     * 
     */
    private final String email;

    @CustomType.Constructor
    private ServiceAccountResponse(@CustomType.Parameter("email") String email) {
        this.email = email;
    }

    /**
     * @return The IAM service account email address like test@myproject.iam.gserviceaccount.com
     * 
     */
    public String email() {
        return this.email;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAccountResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String email;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAccountResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
        }

        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }        public ServiceAccountResponse build() {
            return new ServiceAccountResponse(email);
        }
    }
}
