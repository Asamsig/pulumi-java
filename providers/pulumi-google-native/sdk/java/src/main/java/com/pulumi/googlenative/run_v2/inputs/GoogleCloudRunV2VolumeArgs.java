// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.run_v2.inputs.GoogleCloudRunV2CloudSqlInstanceArgs;
import com.pulumi.googlenative.run_v2.inputs.GoogleCloudRunV2SecretVolumeSourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Volume represents a named volume in a container.
 * 
 */
public final class GoogleCloudRunV2VolumeArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRunV2VolumeArgs Empty = new GoogleCloudRunV2VolumeArgs();

    /**
     * For Cloud SQL volumes, contains the specific instances that should be mounted. Visit https://cloud.google.com/sql/docs/mysql/connect-run for more information on how to connect Cloud SQL and Cloud Run.
     * 
     */
    @Import(name="cloudSqlInstance")
    private @Nullable Output<GoogleCloudRunV2CloudSqlInstanceArgs> cloudSqlInstance;

    /**
     * @return For Cloud SQL volumes, contains the specific instances that should be mounted. Visit https://cloud.google.com/sql/docs/mysql/connect-run for more information on how to connect Cloud SQL and Cloud Run.
     * 
     */
    public Optional<Output<GoogleCloudRunV2CloudSqlInstanceArgs>> cloudSqlInstance() {
        return Optional.ofNullable(this.cloudSqlInstance);
    }

    /**
     * Volume&#39;s name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Volume&#39;s name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Secret represents a secret that should populate this volume. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
     * 
     */
    @Import(name="secret")
    private @Nullable Output<GoogleCloudRunV2SecretVolumeSourceArgs> secret;

    /**
     * @return Secret represents a secret that should populate this volume. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
     * 
     */
    public Optional<Output<GoogleCloudRunV2SecretVolumeSourceArgs>> secret() {
        return Optional.ofNullable(this.secret);
    }

    private GoogleCloudRunV2VolumeArgs() {}

    private GoogleCloudRunV2VolumeArgs(GoogleCloudRunV2VolumeArgs $) {
        this.cloudSqlInstance = $.cloudSqlInstance;
        this.name = $.name;
        this.secret = $.secret;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRunV2VolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRunV2VolumeArgs $;

        public Builder() {
            $ = new GoogleCloudRunV2VolumeArgs();
        }

        public Builder(GoogleCloudRunV2VolumeArgs defaults) {
            $ = new GoogleCloudRunV2VolumeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudSqlInstance For Cloud SQL volumes, contains the specific instances that should be mounted. Visit https://cloud.google.com/sql/docs/mysql/connect-run for more information on how to connect Cloud SQL and Cloud Run.
         * 
         * @return builder
         * 
         */
        public Builder cloudSqlInstance(@Nullable Output<GoogleCloudRunV2CloudSqlInstanceArgs> cloudSqlInstance) {
            $.cloudSqlInstance = cloudSqlInstance;
            return this;
        }

        /**
         * @param cloudSqlInstance For Cloud SQL volumes, contains the specific instances that should be mounted. Visit https://cloud.google.com/sql/docs/mysql/connect-run for more information on how to connect Cloud SQL and Cloud Run.
         * 
         * @return builder
         * 
         */
        public Builder cloudSqlInstance(GoogleCloudRunV2CloudSqlInstanceArgs cloudSqlInstance) {
            return cloudSqlInstance(Output.of(cloudSqlInstance));
        }

        /**
         * @param name Volume&#39;s name.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Volume&#39;s name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param secret Secret represents a secret that should populate this volume. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
         * 
         * @return builder
         * 
         */
        public Builder secret(@Nullable Output<GoogleCloudRunV2SecretVolumeSourceArgs> secret) {
            $.secret = secret;
            return this;
        }

        /**
         * @param secret Secret represents a secret that should populate this volume. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
         * 
         * @return builder
         * 
         */
        public Builder secret(GoogleCloudRunV2SecretVolumeSourceArgs secret) {
            return secret(Output.of(secret));
        }

        public GoogleCloudRunV2VolumeArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
