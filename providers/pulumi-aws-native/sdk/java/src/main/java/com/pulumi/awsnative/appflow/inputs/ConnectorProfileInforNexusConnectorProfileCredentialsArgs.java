// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ConnectorProfileInforNexusConnectorProfileCredentialsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectorProfileInforNexusConnectorProfileCredentialsArgs Empty = new ConnectorProfileInforNexusConnectorProfileCredentialsArgs();

    /**
     * The Access Key portion of the credentials.
     * 
     */
    @Import(name="accessKeyId", required=true)
    private Output<String> accessKeyId;

    /**
     * @return The Access Key portion of the credentials.
     * 
     */
    public Output<String> accessKeyId() {
        return this.accessKeyId;
    }

    /**
     * The encryption keys used to encrypt data.
     * 
     */
    @Import(name="datakey", required=true)
    private Output<String> datakey;

    /**
     * @return The encryption keys used to encrypt data.
     * 
     */
    public Output<String> datakey() {
        return this.datakey;
    }

    /**
     * The secret key used to sign requests.
     * 
     */
    @Import(name="secretAccessKey", required=true)
    private Output<String> secretAccessKey;

    /**
     * @return The secret key used to sign requests.
     * 
     */
    public Output<String> secretAccessKey() {
        return this.secretAccessKey;
    }

    /**
     * The identiﬁer for the user.
     * 
     */
    @Import(name="userId", required=true)
    private Output<String> userId;

    /**
     * @return The identiﬁer for the user.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    private ConnectorProfileInforNexusConnectorProfileCredentialsArgs() {}

    private ConnectorProfileInforNexusConnectorProfileCredentialsArgs(ConnectorProfileInforNexusConnectorProfileCredentialsArgs $) {
        this.accessKeyId = $.accessKeyId;
        this.datakey = $.datakey;
        this.secretAccessKey = $.secretAccessKey;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectorProfileInforNexusConnectorProfileCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorProfileInforNexusConnectorProfileCredentialsArgs $;

        public Builder() {
            $ = new ConnectorProfileInforNexusConnectorProfileCredentialsArgs();
        }

        public Builder(ConnectorProfileInforNexusConnectorProfileCredentialsArgs defaults) {
            $ = new ConnectorProfileInforNexusConnectorProfileCredentialsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessKeyId The Access Key portion of the credentials.
         * 
         * @return builder
         * 
         */
        public Builder accessKeyId(Output<String> accessKeyId) {
            $.accessKeyId = accessKeyId;
            return this;
        }

        /**
         * @param accessKeyId The Access Key portion of the credentials.
         * 
         * @return builder
         * 
         */
        public Builder accessKeyId(String accessKeyId) {
            return accessKeyId(Output.of(accessKeyId));
        }

        /**
         * @param datakey The encryption keys used to encrypt data.
         * 
         * @return builder
         * 
         */
        public Builder datakey(Output<String> datakey) {
            $.datakey = datakey;
            return this;
        }

        /**
         * @param datakey The encryption keys used to encrypt data.
         * 
         * @return builder
         * 
         */
        public Builder datakey(String datakey) {
            return datakey(Output.of(datakey));
        }

        /**
         * @param secretAccessKey The secret key used to sign requests.
         * 
         * @return builder
         * 
         */
        public Builder secretAccessKey(Output<String> secretAccessKey) {
            $.secretAccessKey = secretAccessKey;
            return this;
        }

        /**
         * @param secretAccessKey The secret key used to sign requests.
         * 
         * @return builder
         * 
         */
        public Builder secretAccessKey(String secretAccessKey) {
            return secretAccessKey(Output.of(secretAccessKey));
        }

        /**
         * @param userId The identiﬁer for the user.
         * 
         * @return builder
         * 
         */
        public Builder userId(Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId The identiﬁer for the user.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public ConnectorProfileInforNexusConnectorProfileCredentialsArgs build() {
            $.accessKeyId = Objects.requireNonNull($.accessKeyId, "expected parameter 'accessKeyId' to be non-null");
            $.datakey = Objects.requireNonNull($.datakey, "expected parameter 'datakey' to be non-null");
            $.secretAccessKey = Objects.requireNonNull($.secretAccessKey, "expected parameter 'secretAccessKey' to be non-null");
            $.userId = Objects.requireNonNull($.userId, "expected parameter 'userId' to be non-null");
            return $;
        }
    }

}
