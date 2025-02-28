// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2CryptoKeyResponse;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2CryptoHashConfigResponse {
    /**
     * @return The key used by the hash function.
     * 
     */
    private final GooglePrivacyDlpV2CryptoKeyResponse cryptoKey;

    @CustomType.Constructor
    private GooglePrivacyDlpV2CryptoHashConfigResponse(@CustomType.Parameter("cryptoKey") GooglePrivacyDlpV2CryptoKeyResponse cryptoKey) {
        this.cryptoKey = cryptoKey;
    }

    /**
     * @return The key used by the hash function.
     * 
     */
    public GooglePrivacyDlpV2CryptoKeyResponse cryptoKey() {
        return this.cryptoKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2CryptoHashConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2CryptoKeyResponse cryptoKey;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2CryptoHashConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cryptoKey = defaults.cryptoKey;
        }

        public Builder cryptoKey(GooglePrivacyDlpV2CryptoKeyResponse cryptoKey) {
            this.cryptoKey = Objects.requireNonNull(cryptoKey);
            return this;
        }        public GooglePrivacyDlpV2CryptoHashConfigResponse build() {
            return new GooglePrivacyDlpV2CryptoHashConfigResponse(cryptoKey);
        }
    }
}
