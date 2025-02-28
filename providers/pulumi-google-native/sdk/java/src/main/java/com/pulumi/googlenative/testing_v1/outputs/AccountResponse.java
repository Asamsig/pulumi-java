// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.testing_v1.outputs.GoogleAutoResponse;
import java.util.Objects;

@CustomType
public final class AccountResponse {
    /**
     * @return An automatic google login account.
     * 
     */
    private final GoogleAutoResponse googleAuto;

    @CustomType.Constructor
    private AccountResponse(@CustomType.Parameter("googleAuto") GoogleAutoResponse googleAuto) {
        this.googleAuto = googleAuto;
    }

    /**
     * @return An automatic google login account.
     * 
     */
    public GoogleAutoResponse googleAuto() {
        return this.googleAuto;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleAutoResponse googleAuto;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.googleAuto = defaults.googleAuto;
        }

        public Builder googleAuto(GoogleAutoResponse googleAuto) {
            this.googleAuto = Objects.requireNonNull(googleAuto);
            return this;
        }        public AccountResponse build() {
            return new AccountResponse(googleAuto);
        }
    }
}
