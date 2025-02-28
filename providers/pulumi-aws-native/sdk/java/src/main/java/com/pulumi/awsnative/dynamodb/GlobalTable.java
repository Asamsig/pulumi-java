// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.dynamodb;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.dynamodb.GlobalTableArgs;
import com.pulumi.awsnative.dynamodb.outputs.GlobalTableAttributeDefinition;
import com.pulumi.awsnative.dynamodb.outputs.GlobalTableGlobalSecondaryIndex;
import com.pulumi.awsnative.dynamodb.outputs.GlobalTableKeySchema;
import com.pulumi.awsnative.dynamodb.outputs.GlobalTableLocalSecondaryIndex;
import com.pulumi.awsnative.dynamodb.outputs.GlobalTableReplicaSpecification;
import com.pulumi.awsnative.dynamodb.outputs.GlobalTableSSESpecification;
import com.pulumi.awsnative.dynamodb.outputs.GlobalTableStreamSpecification;
import com.pulumi.awsnative.dynamodb.outputs.GlobalTableTimeToLiveSpecification;
import com.pulumi.awsnative.dynamodb.outputs.GlobalTableWriteProvisionedThroughputSettings;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Version: None. Resource Type definition for AWS::DynamoDB::GlobalTable
 * 
 */
@ResourceType(type="aws-native:dynamodb:GlobalTable")
public class GlobalTable extends com.pulumi.resources.CustomResource {
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }
    @Export(name="attributeDefinitions", type=List.class, parameters={GlobalTableAttributeDefinition.class})
    private Output<List<GlobalTableAttributeDefinition>> attributeDefinitions;

    public Output<List<GlobalTableAttributeDefinition>> attributeDefinitions() {
        return this.attributeDefinitions;
    }
    @Export(name="billingMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> billingMode;

    public Output<Optional<String>> billingMode() {
        return Codegen.optional(this.billingMode);
    }
    @Export(name="globalSecondaryIndexes", type=List.class, parameters={GlobalTableGlobalSecondaryIndex.class})
    private Output</* @Nullable */ List<GlobalTableGlobalSecondaryIndex>> globalSecondaryIndexes;

    public Output<Optional<List<GlobalTableGlobalSecondaryIndex>>> globalSecondaryIndexes() {
        return Codegen.optional(this.globalSecondaryIndexes);
    }
    @Export(name="keySchema", type=List.class, parameters={GlobalTableKeySchema.class})
    private Output<List<GlobalTableKeySchema>> keySchema;

    public Output<List<GlobalTableKeySchema>> keySchema() {
        return this.keySchema;
    }
    @Export(name="localSecondaryIndexes", type=List.class, parameters={GlobalTableLocalSecondaryIndex.class})
    private Output</* @Nullable */ List<GlobalTableLocalSecondaryIndex>> localSecondaryIndexes;

    public Output<Optional<List<GlobalTableLocalSecondaryIndex>>> localSecondaryIndexes() {
        return Codegen.optional(this.localSecondaryIndexes);
    }
    @Export(name="replicas", type=List.class, parameters={GlobalTableReplicaSpecification.class})
    private Output<List<GlobalTableReplicaSpecification>> replicas;

    public Output<List<GlobalTableReplicaSpecification>> replicas() {
        return this.replicas;
    }
    @Export(name="sSESpecification", type=GlobalTableSSESpecification.class, parameters={})
    private Output</* @Nullable */ GlobalTableSSESpecification> sSESpecification;

    public Output<Optional<GlobalTableSSESpecification>> sSESpecification() {
        return Codegen.optional(this.sSESpecification);
    }
    @Export(name="streamArn", type=String.class, parameters={})
    private Output<String> streamArn;

    public Output<String> streamArn() {
        return this.streamArn;
    }
    @Export(name="streamSpecification", type=GlobalTableStreamSpecification.class, parameters={})
    private Output</* @Nullable */ GlobalTableStreamSpecification> streamSpecification;

    public Output<Optional<GlobalTableStreamSpecification>> streamSpecification() {
        return Codegen.optional(this.streamSpecification);
    }
    @Export(name="tableId", type=String.class, parameters={})
    private Output<String> tableId;

    public Output<String> tableId() {
        return this.tableId;
    }
    @Export(name="tableName", type=String.class, parameters={})
    private Output</* @Nullable */ String> tableName;

    public Output<Optional<String>> tableName() {
        return Codegen.optional(this.tableName);
    }
    @Export(name="timeToLiveSpecification", type=GlobalTableTimeToLiveSpecification.class, parameters={})
    private Output</* @Nullable */ GlobalTableTimeToLiveSpecification> timeToLiveSpecification;

    public Output<Optional<GlobalTableTimeToLiveSpecification>> timeToLiveSpecification() {
        return Codegen.optional(this.timeToLiveSpecification);
    }
    @Export(name="writeProvisionedThroughputSettings", type=GlobalTableWriteProvisionedThroughputSettings.class, parameters={})
    private Output</* @Nullable */ GlobalTableWriteProvisionedThroughputSettings> writeProvisionedThroughputSettings;

    public Output<Optional<GlobalTableWriteProvisionedThroughputSettings>> writeProvisionedThroughputSettings() {
        return Codegen.optional(this.writeProvisionedThroughputSettings);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GlobalTable(String name) {
        this(name, GlobalTableArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GlobalTable(String name, GlobalTableArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GlobalTable(String name, GlobalTableArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:dynamodb:GlobalTable", name, args == null ? GlobalTableArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GlobalTable(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:dynamodb:GlobalTable", name, null, makeResourceOptions(options, id));
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
    public static GlobalTable get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GlobalTable(name, id, options);
    }
}
