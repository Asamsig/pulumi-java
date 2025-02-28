// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotwireless;

import com.pulumi.awsnative.iotwireless.inputs.FuotaTaskLoRaWANArgs;
import com.pulumi.awsnative.iotwireless.inputs.FuotaTaskTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FuotaTaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final FuotaTaskArgs Empty = new FuotaTaskArgs();

    /**
     * Multicast group to associate. Only for update request.
     * 
     */
    @Import(name="associateMulticastGroup")
    private @Nullable Output<String> associateMulticastGroup;

    /**
     * @return Multicast group to associate. Only for update request.
     * 
     */
    public Optional<Output<String>> associateMulticastGroup() {
        return Optional.ofNullable(this.associateMulticastGroup);
    }

    /**
     * Wireless device to associate. Only for update request.
     * 
     */
    @Import(name="associateWirelessDevice")
    private @Nullable Output<String> associateWirelessDevice;

    /**
     * @return Wireless device to associate. Only for update request.
     * 
     */
    public Optional<Output<String>> associateWirelessDevice() {
        return Optional.ofNullable(this.associateWirelessDevice);
    }

    /**
     * FUOTA task description
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return FUOTA task description
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Multicast group to disassociate. Only for update request.
     * 
     */
    @Import(name="disassociateMulticastGroup")
    private @Nullable Output<String> disassociateMulticastGroup;

    /**
     * @return Multicast group to disassociate. Only for update request.
     * 
     */
    public Optional<Output<String>> disassociateMulticastGroup() {
        return Optional.ofNullable(this.disassociateMulticastGroup);
    }

    /**
     * Wireless device to disassociate. Only for update request.
     * 
     */
    @Import(name="disassociateWirelessDevice")
    private @Nullable Output<String> disassociateWirelessDevice;

    /**
     * @return Wireless device to disassociate. Only for update request.
     * 
     */
    public Optional<Output<String>> disassociateWirelessDevice() {
        return Optional.ofNullable(this.disassociateWirelessDevice);
    }

    /**
     * FUOTA task firmware update image binary S3 link
     * 
     */
    @Import(name="firmwareUpdateImage", required=true)
    private Output<String> firmwareUpdateImage;

    /**
     * @return FUOTA task firmware update image binary S3 link
     * 
     */
    public Output<String> firmwareUpdateImage() {
        return this.firmwareUpdateImage;
    }

    /**
     * FUOTA task firmware IAM role for reading S3
     * 
     */
    @Import(name="firmwareUpdateRole", required=true)
    private Output<String> firmwareUpdateRole;

    /**
     * @return FUOTA task firmware IAM role for reading S3
     * 
     */
    public Output<String> firmwareUpdateRole() {
        return this.firmwareUpdateRole;
    }

    /**
     * FUOTA task LoRaWAN
     * 
     */
    @Import(name="loRaWAN", required=true)
    private Output<FuotaTaskLoRaWANArgs> loRaWAN;

    /**
     * @return FUOTA task LoRaWAN
     * 
     */
    public Output<FuotaTaskLoRaWANArgs> loRaWAN() {
        return this.loRaWAN;
    }

    /**
     * Name of FUOTA task
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of FUOTA task
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A list of key-value pairs that contain metadata for the FUOTA task.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<FuotaTaskTagArgs>> tags;

    /**
     * @return A list of key-value pairs that contain metadata for the FUOTA task.
     * 
     */
    public Optional<Output<List<FuotaTaskTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private FuotaTaskArgs() {}

    private FuotaTaskArgs(FuotaTaskArgs $) {
        this.associateMulticastGroup = $.associateMulticastGroup;
        this.associateWirelessDevice = $.associateWirelessDevice;
        this.description = $.description;
        this.disassociateMulticastGroup = $.disassociateMulticastGroup;
        this.disassociateWirelessDevice = $.disassociateWirelessDevice;
        this.firmwareUpdateImage = $.firmwareUpdateImage;
        this.firmwareUpdateRole = $.firmwareUpdateRole;
        this.loRaWAN = $.loRaWAN;
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FuotaTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FuotaTaskArgs $;

        public Builder() {
            $ = new FuotaTaskArgs();
        }

        public Builder(FuotaTaskArgs defaults) {
            $ = new FuotaTaskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param associateMulticastGroup Multicast group to associate. Only for update request.
         * 
         * @return builder
         * 
         */
        public Builder associateMulticastGroup(@Nullable Output<String> associateMulticastGroup) {
            $.associateMulticastGroup = associateMulticastGroup;
            return this;
        }

        /**
         * @param associateMulticastGroup Multicast group to associate. Only for update request.
         * 
         * @return builder
         * 
         */
        public Builder associateMulticastGroup(String associateMulticastGroup) {
            return associateMulticastGroup(Output.of(associateMulticastGroup));
        }

        /**
         * @param associateWirelessDevice Wireless device to associate. Only for update request.
         * 
         * @return builder
         * 
         */
        public Builder associateWirelessDevice(@Nullable Output<String> associateWirelessDevice) {
            $.associateWirelessDevice = associateWirelessDevice;
            return this;
        }

        /**
         * @param associateWirelessDevice Wireless device to associate. Only for update request.
         * 
         * @return builder
         * 
         */
        public Builder associateWirelessDevice(String associateWirelessDevice) {
            return associateWirelessDevice(Output.of(associateWirelessDevice));
        }

        /**
         * @param description FUOTA task description
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description FUOTA task description
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param disassociateMulticastGroup Multicast group to disassociate. Only for update request.
         * 
         * @return builder
         * 
         */
        public Builder disassociateMulticastGroup(@Nullable Output<String> disassociateMulticastGroup) {
            $.disassociateMulticastGroup = disassociateMulticastGroup;
            return this;
        }

        /**
         * @param disassociateMulticastGroup Multicast group to disassociate. Only for update request.
         * 
         * @return builder
         * 
         */
        public Builder disassociateMulticastGroup(String disassociateMulticastGroup) {
            return disassociateMulticastGroup(Output.of(disassociateMulticastGroup));
        }

        /**
         * @param disassociateWirelessDevice Wireless device to disassociate. Only for update request.
         * 
         * @return builder
         * 
         */
        public Builder disassociateWirelessDevice(@Nullable Output<String> disassociateWirelessDevice) {
            $.disassociateWirelessDevice = disassociateWirelessDevice;
            return this;
        }

        /**
         * @param disassociateWirelessDevice Wireless device to disassociate. Only for update request.
         * 
         * @return builder
         * 
         */
        public Builder disassociateWirelessDevice(String disassociateWirelessDevice) {
            return disassociateWirelessDevice(Output.of(disassociateWirelessDevice));
        }

        /**
         * @param firmwareUpdateImage FUOTA task firmware update image binary S3 link
         * 
         * @return builder
         * 
         */
        public Builder firmwareUpdateImage(Output<String> firmwareUpdateImage) {
            $.firmwareUpdateImage = firmwareUpdateImage;
            return this;
        }

        /**
         * @param firmwareUpdateImage FUOTA task firmware update image binary S3 link
         * 
         * @return builder
         * 
         */
        public Builder firmwareUpdateImage(String firmwareUpdateImage) {
            return firmwareUpdateImage(Output.of(firmwareUpdateImage));
        }

        /**
         * @param firmwareUpdateRole FUOTA task firmware IAM role for reading S3
         * 
         * @return builder
         * 
         */
        public Builder firmwareUpdateRole(Output<String> firmwareUpdateRole) {
            $.firmwareUpdateRole = firmwareUpdateRole;
            return this;
        }

        /**
         * @param firmwareUpdateRole FUOTA task firmware IAM role for reading S3
         * 
         * @return builder
         * 
         */
        public Builder firmwareUpdateRole(String firmwareUpdateRole) {
            return firmwareUpdateRole(Output.of(firmwareUpdateRole));
        }

        /**
         * @param loRaWAN FUOTA task LoRaWAN
         * 
         * @return builder
         * 
         */
        public Builder loRaWAN(Output<FuotaTaskLoRaWANArgs> loRaWAN) {
            $.loRaWAN = loRaWAN;
            return this;
        }

        /**
         * @param loRaWAN FUOTA task LoRaWAN
         * 
         * @return builder
         * 
         */
        public Builder loRaWAN(FuotaTaskLoRaWANArgs loRaWAN) {
            return loRaWAN(Output.of(loRaWAN));
        }

        /**
         * @param name Name of FUOTA task
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of FUOTA task
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tags A list of key-value pairs that contain metadata for the FUOTA task.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<FuotaTaskTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A list of key-value pairs that contain metadata for the FUOTA task.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<FuotaTaskTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A list of key-value pairs that contain metadata for the FUOTA task.
         * 
         * @return builder
         * 
         */
        public Builder tags(FuotaTaskTagArgs... tags) {
            return tags(List.of(tags));
        }

        public FuotaTaskArgs build() {
            $.firmwareUpdateImage = Objects.requireNonNull($.firmwareUpdateImage, "expected parameter 'firmwareUpdateImage' to be non-null");
            $.firmwareUpdateRole = Objects.requireNonNull($.firmwareUpdateRole, "expected parameter 'firmwareUpdateRole' to be non-null");
            $.loRaWAN = Objects.requireNonNull($.loRaWAN, "expected parameter 'loRaWAN' to be non-null");
            return $;
        }
    }

}
