// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration_v1alpha1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.vmmigration_v1alpha1.DatacenterConnectorArgs;
import com.pulumi.googlenative.vmmigration_v1alpha1.outputs.AvailableUpdatesResponse;
import com.pulumi.googlenative.vmmigration_v1alpha1.outputs.StatusResponse;
import com.pulumi.googlenative.vmmigration_v1alpha1.outputs.UpgradeStatusResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new DatacenterConnector in a given Source.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:vmmigration/v1alpha1:DatacenterConnector")
public class DatacenterConnector extends com.pulumi.resources.CustomResource {
    /**
     * Appliance OVA version. This is the OVA which is manually installed by the user and contains the infrastructure for the automatically updatable components on the appliance.
     * 
     */
    @Export(name="applianceInfrastructureVersion", type=String.class, parameters={})
    private Output<String> applianceInfrastructureVersion;

    /**
     * @return Appliance OVA version. This is the OVA which is manually installed by the user and contains the infrastructure for the automatically updatable components on the appliance.
     * 
     */
    public Output<String> applianceInfrastructureVersion() {
        return this.applianceInfrastructureVersion;
    }
    /**
     * Appliance last installed update bundle version. This is the version of the automatically updatable components on the appliance.
     * 
     */
    @Export(name="applianceSoftwareVersion", type=String.class, parameters={})
    private Output<String> applianceSoftwareVersion;

    /**
     * @return Appliance last installed update bundle version. This is the version of the automatically updatable components on the appliance.
     * 
     */
    public Output<String> applianceSoftwareVersion() {
        return this.applianceSoftwareVersion;
    }
    /**
     * The available versions for updating this appliance.
     * 
     */
    @Export(name="availableVersions", type=AvailableUpdatesResponse.class, parameters={})
    private Output<AvailableUpdatesResponse> availableVersions;

    /**
     * @return The available versions for updating this appliance.
     * 
     */
    public Output<AvailableUpdatesResponse> availableVersions() {
        return this.availableVersions;
    }
    /**
     * The communication channel between the datacenter connector and GCP.
     * 
     */
    @Export(name="bucket", type=String.class, parameters={})
    private Output<String> bucket;

    /**
     * @return The communication channel between the datacenter connector and GCP.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }
    /**
     * The time the connector was created (as an API call, not when it was actually installed).
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time the connector was created (as an API call, not when it was actually installed).
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Provides details on the state of the Datacenter Connector in case of an error.
     * 
     */
    @Export(name="error", type=StatusResponse.class, parameters={})
    private Output<StatusResponse> error;

    /**
     * @return Provides details on the state of the Datacenter Connector in case of an error.
     * 
     */
    public Output<StatusResponse> error() {
        return this.error;
    }
    /**
     * The connector&#39;s name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The connector&#39;s name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Immutable. A unique key for this connector. This key is internal to the OVA connector and is supplied with its creation during the registration process and can not be modified.
     * 
     */
    @Export(name="registrationId", type=String.class, parameters={})
    private Output<String> registrationId;

    /**
     * @return Immutable. A unique key for this connector. This key is internal to the OVA connector and is supplied with its creation during the registration process and can not be modified.
     * 
     */
    public Output<String> registrationId() {
        return this.registrationId;
    }
    /**
     * The service account to use in the connector when communicating with the cloud.
     * 
     */
    @Export(name="serviceAccount", type=String.class, parameters={})
    private Output<String> serviceAccount;

    /**
     * @return The service account to use in the connector when communicating with the cloud.
     * 
     */
    public Output<String> serviceAccount() {
        return this.serviceAccount;
    }
    /**
     * State of the DatacenterConnector, as determined by the health checks.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return State of the DatacenterConnector, as determined by the health checks.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The time the state was last set.
     * 
     */
    @Export(name="stateTime", type=String.class, parameters={})
    private Output<String> stateTime;

    /**
     * @return The time the state was last set.
     * 
     */
    public Output<String> stateTime() {
        return this.stateTime;
    }
    /**
     * The last time the connector was updated with an API call.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The last time the connector was updated with an API call.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }
    /**
     * The status of the current / last upgradeAppliance operation.
     * 
     */
    @Export(name="upgradeStatus", type=UpgradeStatusResponse.class, parameters={})
    private Output<UpgradeStatusResponse> upgradeStatus;

    /**
     * @return The status of the current / last upgradeAppliance operation.
     * 
     */
    public Output<UpgradeStatusResponse> upgradeStatus() {
        return this.upgradeStatus;
    }
    /**
     * The version running in the DatacenterConnector. This is supplied by the OVA connector during the registration process and can not be modified.
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return The version running in the DatacenterConnector. This is supplied by the OVA connector during the registration process and can not be modified.
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DatacenterConnector(String name) {
        this(name, DatacenterConnectorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DatacenterConnector(String name, DatacenterConnectorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DatacenterConnector(String name, DatacenterConnectorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:vmmigration/v1alpha1:DatacenterConnector", name, args == null ? DatacenterConnectorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DatacenterConnector(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:vmmigration/v1alpha1:DatacenterConnector", name, null, makeResourceOptions(options, id));
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
    public static DatacenterConnector get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DatacenterConnector(name, id, options);
    }
}
