// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.appengine_v1.inputs.VolumeArgs;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Machine resources for a version.
 * 
 */
public final class ResourcesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourcesArgs Empty = new ResourcesArgs();

    /**
     * Number of CPU cores needed.
     * 
     */
    @Import(name="cpu")
    private @Nullable Output<Double> cpu;

    /**
     * @return Number of CPU cores needed.
     * 
     */
    public Optional<Output<Double>> cpu() {
        return Optional.ofNullable(this.cpu);
    }

    /**
     * Disk size (GB) needed.
     * 
     */
    @Import(name="diskGb")
    private @Nullable Output<Double> diskGb;

    /**
     * @return Disk size (GB) needed.
     * 
     */
    public Optional<Output<Double>> diskGb() {
        return Optional.ofNullable(this.diskGb);
    }

    /**
     * The name of the encryption key that is stored in Google Cloud KMS. Only should be used by Cloud Composer to encrypt the vm disk
     * 
     */
    @Import(name="kmsKeyReference")
    private @Nullable Output<String> kmsKeyReference;

    /**
     * @return The name of the encryption key that is stored in Google Cloud KMS. Only should be used by Cloud Composer to encrypt the vm disk
     * 
     */
    public Optional<Output<String>> kmsKeyReference() {
        return Optional.ofNullable(this.kmsKeyReference);
    }

    /**
     * Memory (GB) needed.
     * 
     */
    @Import(name="memoryGb")
    private @Nullable Output<Double> memoryGb;

    /**
     * @return Memory (GB) needed.
     * 
     */
    public Optional<Output<Double>> memoryGb() {
        return Optional.ofNullable(this.memoryGb);
    }

    /**
     * User specified volumes.
     * 
     */
    @Import(name="volumes")
    private @Nullable Output<List<VolumeArgs>> volumes;

    /**
     * @return User specified volumes.
     * 
     */
    public Optional<Output<List<VolumeArgs>>> volumes() {
        return Optional.ofNullable(this.volumes);
    }

    private ResourcesArgs() {}

    private ResourcesArgs(ResourcesArgs $) {
        this.cpu = $.cpu;
        this.diskGb = $.diskGb;
        this.kmsKeyReference = $.kmsKeyReference;
        this.memoryGb = $.memoryGb;
        this.volumes = $.volumes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourcesArgs $;

        public Builder() {
            $ = new ResourcesArgs();
        }

        public Builder(ResourcesArgs defaults) {
            $ = new ResourcesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cpu Number of CPU cores needed.
         * 
         * @return builder
         * 
         */
        public Builder cpu(@Nullable Output<Double> cpu) {
            $.cpu = cpu;
            return this;
        }

        /**
         * @param cpu Number of CPU cores needed.
         * 
         * @return builder
         * 
         */
        public Builder cpu(Double cpu) {
            return cpu(Output.of(cpu));
        }

        /**
         * @param diskGb Disk size (GB) needed.
         * 
         * @return builder
         * 
         */
        public Builder diskGb(@Nullable Output<Double> diskGb) {
            $.diskGb = diskGb;
            return this;
        }

        /**
         * @param diskGb Disk size (GB) needed.
         * 
         * @return builder
         * 
         */
        public Builder diskGb(Double diskGb) {
            return diskGb(Output.of(diskGb));
        }

        /**
         * @param kmsKeyReference The name of the encryption key that is stored in Google Cloud KMS. Only should be used by Cloud Composer to encrypt the vm disk
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyReference(@Nullable Output<String> kmsKeyReference) {
            $.kmsKeyReference = kmsKeyReference;
            return this;
        }

        /**
         * @param kmsKeyReference The name of the encryption key that is stored in Google Cloud KMS. Only should be used by Cloud Composer to encrypt the vm disk
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyReference(String kmsKeyReference) {
            return kmsKeyReference(Output.of(kmsKeyReference));
        }

        /**
         * @param memoryGb Memory (GB) needed.
         * 
         * @return builder
         * 
         */
        public Builder memoryGb(@Nullable Output<Double> memoryGb) {
            $.memoryGb = memoryGb;
            return this;
        }

        /**
         * @param memoryGb Memory (GB) needed.
         * 
         * @return builder
         * 
         */
        public Builder memoryGb(Double memoryGb) {
            return memoryGb(Output.of(memoryGb));
        }

        /**
         * @param volumes User specified volumes.
         * 
         * @return builder
         * 
         */
        public Builder volumes(@Nullable Output<List<VolumeArgs>> volumes) {
            $.volumes = volumes;
            return this;
        }

        /**
         * @param volumes User specified volumes.
         * 
         * @return builder
         * 
         */
        public Builder volumes(List<VolumeArgs> volumes) {
            return volumes(Output.of(volumes));
        }

        /**
         * @param volumes User specified volumes.
         * 
         * @return builder
         * 
         */
        public Builder volumes(VolumeArgs... volumes) {
            return volumes(List.of(volumes));
        }

        public ResourcesArgs build() {
            return $;
        }
    }

}
