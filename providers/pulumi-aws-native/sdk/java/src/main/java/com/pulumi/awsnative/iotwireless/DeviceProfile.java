// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotwireless;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.iotwireless.DeviceProfileArgs;
import com.pulumi.awsnative.iotwireless.outputs.DeviceProfileLoRaWANDeviceProfile;
import com.pulumi.awsnative.iotwireless.outputs.DeviceProfileTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Device Profile&#39;s resource schema demonstrating some basic constructs and validation rules.
 * 
 */
@ResourceType(type="aws-native:iotwireless:DeviceProfile")
public class DeviceProfile extends com.pulumi.resources.CustomResource {
    /**
     * Service profile Arn. Returned after successful create.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Service profile Arn. Returned after successful create.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * LoRaWANDeviceProfile supports all LoRa specific attributes for service profile for CreateDeviceProfile operation
     * 
     */
    @Export(name="loRaWAN", type=DeviceProfileLoRaWANDeviceProfile.class, parameters={})
    private Output</* @Nullable */ DeviceProfileLoRaWANDeviceProfile> loRaWAN;

    /**
     * @return LoRaWANDeviceProfile supports all LoRa specific attributes for service profile for CreateDeviceProfile operation
     * 
     */
    public Output<Optional<DeviceProfileLoRaWANDeviceProfile>> loRaWAN() {
        return Codegen.optional(this.loRaWAN);
    }
    /**
     * Name of service profile
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return Name of service profile
     * 
     */
    public Output<Optional<String>> name() {
        return Codegen.optional(this.name);
    }
    /**
     * A list of key-value pairs that contain metadata for the device profile.
     * 
     */
    @Export(name="tags", type=List.class, parameters={DeviceProfileTag.class})
    private Output</* @Nullable */ List<DeviceProfileTag>> tags;

    /**
     * @return A list of key-value pairs that contain metadata for the device profile.
     * 
     */
    public Output<Optional<List<DeviceProfileTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DeviceProfile(String name) {
        this(name, DeviceProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DeviceProfile(String name, @Nullable DeviceProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DeviceProfile(String name, @Nullable DeviceProfileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotwireless:DeviceProfile", name, args == null ? DeviceProfileArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DeviceProfile(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotwireless:DeviceProfile", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static DeviceProfile get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DeviceProfile(name, id, options);
    }
}
