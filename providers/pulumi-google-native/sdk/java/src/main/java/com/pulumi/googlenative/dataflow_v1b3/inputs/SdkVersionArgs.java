// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataflow_v1b3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dataflow_v1b3.enums.SdkVersionSdkSupportStatus;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The version of the SDK used to run the job.
 * 
 */
public final class SdkVersionArgs extends com.pulumi.resources.ResourceArgs {

    public static final SdkVersionArgs Empty = new SdkVersionArgs();

    /**
     * The support status for this SDK version.
     * 
     */
    @Import(name="sdkSupportStatus")
    private @Nullable Output<SdkVersionSdkSupportStatus> sdkSupportStatus;

    /**
     * @return The support status for this SDK version.
     * 
     */
    public Optional<Output<SdkVersionSdkSupportStatus>> sdkSupportStatus() {
        return Optional.ofNullable(this.sdkSupportStatus);
    }

    /**
     * The version of the SDK used to run the job.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return The version of the SDK used to run the job.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    /**
     * A readable string describing the version of the SDK.
     * 
     */
    @Import(name="versionDisplayName")
    private @Nullable Output<String> versionDisplayName;

    /**
     * @return A readable string describing the version of the SDK.
     * 
     */
    public Optional<Output<String>> versionDisplayName() {
        return Optional.ofNullable(this.versionDisplayName);
    }

    private SdkVersionArgs() {}

    private SdkVersionArgs(SdkVersionArgs $) {
        this.sdkSupportStatus = $.sdkSupportStatus;
        this.version = $.version;
        this.versionDisplayName = $.versionDisplayName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SdkVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SdkVersionArgs $;

        public Builder() {
            $ = new SdkVersionArgs();
        }

        public Builder(SdkVersionArgs defaults) {
            $ = new SdkVersionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param sdkSupportStatus The support status for this SDK version.
         * 
         * @return builder
         * 
         */
        public Builder sdkSupportStatus(@Nullable Output<SdkVersionSdkSupportStatus> sdkSupportStatus) {
            $.sdkSupportStatus = sdkSupportStatus;
            return this;
        }

        /**
         * @param sdkSupportStatus The support status for this SDK version.
         * 
         * @return builder
         * 
         */
        public Builder sdkSupportStatus(SdkVersionSdkSupportStatus sdkSupportStatus) {
            return sdkSupportStatus(Output.of(sdkSupportStatus));
        }

        /**
         * @param version The version of the SDK used to run the job.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The version of the SDK used to run the job.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        /**
         * @param versionDisplayName A readable string describing the version of the SDK.
         * 
         * @return builder
         * 
         */
        public Builder versionDisplayName(@Nullable Output<String> versionDisplayName) {
            $.versionDisplayName = versionDisplayName;
            return this;
        }

        /**
         * @param versionDisplayName A readable string describing the version of the SDK.
         * 
         * @return builder
         * 
         */
        public Builder versionDisplayName(String versionDisplayName) {
            return versionDisplayName(Output.of(versionDisplayName));
        }

        public SdkVersionArgs build() {
            return $;
        }
    }

}
