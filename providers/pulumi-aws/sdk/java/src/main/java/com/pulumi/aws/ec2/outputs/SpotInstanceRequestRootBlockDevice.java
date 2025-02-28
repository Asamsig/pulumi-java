// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SpotInstanceRequestRootBlockDevice {
    /**
     * @return Whether the volume should be destroyed on instance termination. Defaults to `true`.
     * 
     */
    private final @Nullable Boolean deleteOnTermination;
    /**
     * @return Name of the device to mount.
     * 
     */
    private final @Nullable String deviceName;
    /**
     * @return Whether to enable volume encryption. Defaults to `false`. Must be configured to perform drift detection.
     * 
     */
    private final @Nullable Boolean encrypted;
    /**
     * @return Amount of provisioned [IOPS](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-io-characteristics.html). Only valid for volume_type of `io1`, `io2` or `gp3`.
     * 
     */
    private final @Nullable Integer iops;
    /**
     * @return Amazon Resource Name (ARN) of the KMS Key to use when encrypting the volume. Must be configured to perform drift detection.
     * 
     */
    private final @Nullable String kmsKeyId;
    /**
     * @return A map of tags to assign to the device.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return Throughput to provision for a volume in mebibytes per second (MiB/s). This is only valid for `volume_type` of `gp3`.
     * 
     */
    private final @Nullable Integer throughput;
    private final @Nullable String volumeId;
    /**
     * @return Size of the volume in gibibytes (GiB).
     * 
     */
    private final @Nullable Integer volumeSize;
    /**
     * @return Type of volume. Valid values include `standard`, `gp2`, `gp3`, `io1`, `io2`, `sc1`, or `st1`. Defaults to `gp2`.
     * 
     */
    private final @Nullable String volumeType;

    @CustomType.Constructor
    private SpotInstanceRequestRootBlockDevice(
        @CustomType.Parameter("deleteOnTermination") @Nullable Boolean deleteOnTermination,
        @CustomType.Parameter("deviceName") @Nullable String deviceName,
        @CustomType.Parameter("encrypted") @Nullable Boolean encrypted,
        @CustomType.Parameter("iops") @Nullable Integer iops,
        @CustomType.Parameter("kmsKeyId") @Nullable String kmsKeyId,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("throughput") @Nullable Integer throughput,
        @CustomType.Parameter("volumeId") @Nullable String volumeId,
        @CustomType.Parameter("volumeSize") @Nullable Integer volumeSize,
        @CustomType.Parameter("volumeType") @Nullable String volumeType) {
        this.deleteOnTermination = deleteOnTermination;
        this.deviceName = deviceName;
        this.encrypted = encrypted;
        this.iops = iops;
        this.kmsKeyId = kmsKeyId;
        this.tags = tags;
        this.throughput = throughput;
        this.volumeId = volumeId;
        this.volumeSize = volumeSize;
        this.volumeType = volumeType;
    }

    /**
     * @return Whether the volume should be destroyed on instance termination. Defaults to `true`.
     * 
     */
    public Optional<Boolean> deleteOnTermination() {
        return Optional.ofNullable(this.deleteOnTermination);
    }
    /**
     * @return Name of the device to mount.
     * 
     */
    public Optional<String> deviceName() {
        return Optional.ofNullable(this.deviceName);
    }
    /**
     * @return Whether to enable volume encryption. Defaults to `false`. Must be configured to perform drift detection.
     * 
     */
    public Optional<Boolean> encrypted() {
        return Optional.ofNullable(this.encrypted);
    }
    /**
     * @return Amount of provisioned [IOPS](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-io-characteristics.html). Only valid for volume_type of `io1`, `io2` or `gp3`.
     * 
     */
    public Optional<Integer> iops() {
        return Optional.ofNullable(this.iops);
    }
    /**
     * @return Amazon Resource Name (ARN) of the KMS Key to use when encrypting the volume. Must be configured to perform drift detection.
     * 
     */
    public Optional<String> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }
    /**
     * @return A map of tags to assign to the device.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Throughput to provision for a volume in mebibytes per second (MiB/s). This is only valid for `volume_type` of `gp3`.
     * 
     */
    public Optional<Integer> throughput() {
        return Optional.ofNullable(this.throughput);
    }
    public Optional<String> volumeId() {
        return Optional.ofNullable(this.volumeId);
    }
    /**
     * @return Size of the volume in gibibytes (GiB).
     * 
     */
    public Optional<Integer> volumeSize() {
        return Optional.ofNullable(this.volumeSize);
    }
    /**
     * @return Type of volume. Valid values include `standard`, `gp2`, `gp3`, `io1`, `io2`, `sc1`, or `st1`. Defaults to `gp2`.
     * 
     */
    public Optional<String> volumeType() {
        return Optional.ofNullable(this.volumeType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotInstanceRequestRootBlockDevice defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean deleteOnTermination;
        private @Nullable String deviceName;
        private @Nullable Boolean encrypted;
        private @Nullable Integer iops;
        private @Nullable String kmsKeyId;
        private @Nullable Map<String,String> tags;
        private @Nullable Integer throughput;
        private @Nullable String volumeId;
        private @Nullable Integer volumeSize;
        private @Nullable String volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotInstanceRequestRootBlockDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOnTermination = defaults.deleteOnTermination;
    	      this.deviceName = defaults.deviceName;
    	      this.encrypted = defaults.encrypted;
    	      this.iops = defaults.iops;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.tags = defaults.tags;
    	      this.throughput = defaults.throughput;
    	      this.volumeId = defaults.volumeId;
    	      this.volumeSize = defaults.volumeSize;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder deleteOnTermination(@Nullable Boolean deleteOnTermination) {
            this.deleteOnTermination = deleteOnTermination;
            return this;
        }
        public Builder deviceName(@Nullable String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public Builder encrypted(@Nullable Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Builder iops(@Nullable Integer iops) {
            this.iops = iops;
            return this;
        }
        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder throughput(@Nullable Integer throughput) {
            this.throughput = throughput;
            return this;
        }
        public Builder volumeId(@Nullable String volumeId) {
            this.volumeId = volumeId;
            return this;
        }
        public Builder volumeSize(@Nullable Integer volumeSize) {
            this.volumeSize = volumeSize;
            return this;
        }
        public Builder volumeType(@Nullable String volumeType) {
            this.volumeType = volumeType;
            return this;
        }        public SpotInstanceRequestRootBlockDevice build() {
            return new SpotInstanceRequestRootBlockDevice(deleteOnTermination, deviceName, encrypted, iops, kmsKeyId, tags, throughput, volumeId, volumeSize, volumeType);
        }
    }
}
