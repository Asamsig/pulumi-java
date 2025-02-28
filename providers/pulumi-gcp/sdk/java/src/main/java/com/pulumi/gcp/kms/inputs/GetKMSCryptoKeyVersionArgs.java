// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.kms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetKMSCryptoKeyVersionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetKMSCryptoKeyVersionArgs Empty = new GetKMSCryptoKeyVersionArgs();

    /**
     * The `id` of the Google Cloud Platform CryptoKey to which the key version belongs. This is also the `id` field of the
     * `gcp.kms.CryptoKey` resource/datasource.
     * 
     */
    @Import(name="cryptoKey", required=true)
    private Output<String> cryptoKey;

    /**
     * @return The `id` of the Google Cloud Platform CryptoKey to which the key version belongs. This is also the `id` field of the
     * `gcp.kms.CryptoKey` resource/datasource.
     * 
     */
    public Output<String> cryptoKey() {
        return this.cryptoKey;
    }

    /**
     * The version number for this CryptoKeyVersion. Defaults to `1`.
     * 
     */
    @Import(name="version")
    private @Nullable Output<Integer> version;

    /**
     * @return The version number for this CryptoKeyVersion. Defaults to `1`.
     * 
     */
    public Optional<Output<Integer>> version() {
        return Optional.ofNullable(this.version);
    }

    private GetKMSCryptoKeyVersionArgs() {}

    private GetKMSCryptoKeyVersionArgs(GetKMSCryptoKeyVersionArgs $) {
        this.cryptoKey = $.cryptoKey;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKMSCryptoKeyVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKMSCryptoKeyVersionArgs $;

        public Builder() {
            $ = new GetKMSCryptoKeyVersionArgs();
        }

        public Builder(GetKMSCryptoKeyVersionArgs defaults) {
            $ = new GetKMSCryptoKeyVersionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cryptoKey The `id` of the Google Cloud Platform CryptoKey to which the key version belongs. This is also the `id` field of the
         * `gcp.kms.CryptoKey` resource/datasource.
         * 
         * @return builder
         * 
         */
        public Builder cryptoKey(Output<String> cryptoKey) {
            $.cryptoKey = cryptoKey;
            return this;
        }

        /**
         * @param cryptoKey The `id` of the Google Cloud Platform CryptoKey to which the key version belongs. This is also the `id` field of the
         * `gcp.kms.CryptoKey` resource/datasource.
         * 
         * @return builder
         * 
         */
        public Builder cryptoKey(String cryptoKey) {
            return cryptoKey(Output.of(cryptoKey));
        }

        /**
         * @param version The version number for this CryptoKeyVersion. Defaults to `1`.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<Integer> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The version number for this CryptoKeyVersion. Defaults to `1`.
         * 
         * @return builder
         * 
         */
        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public GetKMSCryptoKeyVersionArgs build() {
            $.cryptoKey = Objects.requireNonNull($.cryptoKey, "expected parameter 'cryptoKey' to be non-null");
            return $;
        }
    }

}
