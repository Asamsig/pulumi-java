// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kafkaconnect;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.kafkaconnect.ConnectorArgs;
import com.pulumi.awsnative.kafkaconnect.outputs.ConnectorCapacity;
import com.pulumi.awsnative.kafkaconnect.outputs.ConnectorKafkaCluster;
import com.pulumi.awsnative.kafkaconnect.outputs.ConnectorKafkaClusterClientAuthentication;
import com.pulumi.awsnative.kafkaconnect.outputs.ConnectorKafkaClusterEncryptionInTransit;
import com.pulumi.awsnative.kafkaconnect.outputs.ConnectorLogDelivery;
import com.pulumi.awsnative.kafkaconnect.outputs.ConnectorPlugin;
import com.pulumi.awsnative.kafkaconnect.outputs.ConnectorWorkerConfiguration;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::KafkaConnect::Connector
 * 
 */
@ResourceType(type="aws-native:kafkaconnect:Connector")
public class Connector extends com.pulumi.resources.CustomResource {
    @Export(name="capacity", type=ConnectorCapacity.class, parameters={})
    private Output<ConnectorCapacity> capacity;

    public Output<ConnectorCapacity> capacity() {
        return this.capacity;
    }
    /**
     * Amazon Resource Name for the created Connector.
     * 
     */
    @Export(name="connectorArn", type=String.class, parameters={})
    private Output<String> connectorArn;

    /**
     * @return Amazon Resource Name for the created Connector.
     * 
     */
    public Output<String> connectorArn() {
        return this.connectorArn;
    }
    /**
     * The configuration for the connector.
     * 
     */
    @Export(name="connectorConfiguration", type=Object.class, parameters={})
    private Output<Object> connectorConfiguration;

    /**
     * @return The configuration for the connector.
     * 
     */
    public Output<Object> connectorConfiguration() {
        return this.connectorConfiguration;
    }
    /**
     * A summary description of the connector.
     * 
     */
    @Export(name="connectorDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> connectorDescription;

    /**
     * @return A summary description of the connector.
     * 
     */
    public Output<Optional<String>> connectorDescription() {
        return Codegen.optional(this.connectorDescription);
    }
    /**
     * The name of the connector.
     * 
     */
    @Export(name="connectorName", type=String.class, parameters={})
    private Output<String> connectorName;

    /**
     * @return The name of the connector.
     * 
     */
    public Output<String> connectorName() {
        return this.connectorName;
    }
    @Export(name="kafkaCluster", type=ConnectorKafkaCluster.class, parameters={})
    private Output<ConnectorKafkaCluster> kafkaCluster;

    public Output<ConnectorKafkaCluster> kafkaCluster() {
        return this.kafkaCluster;
    }
    @Export(name="kafkaClusterClientAuthentication", type=ConnectorKafkaClusterClientAuthentication.class, parameters={})
    private Output<ConnectorKafkaClusterClientAuthentication> kafkaClusterClientAuthentication;

    public Output<ConnectorKafkaClusterClientAuthentication> kafkaClusterClientAuthentication() {
        return this.kafkaClusterClientAuthentication;
    }
    @Export(name="kafkaClusterEncryptionInTransit", type=ConnectorKafkaClusterEncryptionInTransit.class, parameters={})
    private Output<ConnectorKafkaClusterEncryptionInTransit> kafkaClusterEncryptionInTransit;

    public Output<ConnectorKafkaClusterEncryptionInTransit> kafkaClusterEncryptionInTransit() {
        return this.kafkaClusterEncryptionInTransit;
    }
    /**
     * The version of Kafka Connect. It has to be compatible with both the Kafka cluster&#39;s version and the plugins.
     * 
     */
    @Export(name="kafkaConnectVersion", type=String.class, parameters={})
    private Output<String> kafkaConnectVersion;

    /**
     * @return The version of Kafka Connect. It has to be compatible with both the Kafka cluster&#39;s version and the plugins.
     * 
     */
    public Output<String> kafkaConnectVersion() {
        return this.kafkaConnectVersion;
    }
    @Export(name="logDelivery", type=ConnectorLogDelivery.class, parameters={})
    private Output</* @Nullable */ ConnectorLogDelivery> logDelivery;

    public Output<Optional<ConnectorLogDelivery>> logDelivery() {
        return Codegen.optional(this.logDelivery);
    }
    /**
     * List of plugins to use with the connector.
     * 
     */
    @Export(name="plugins", type=List.class, parameters={ConnectorPlugin.class})
    private Output<List<ConnectorPlugin>> plugins;

    /**
     * @return List of plugins to use with the connector.
     * 
     */
    public Output<List<ConnectorPlugin>> plugins() {
        return this.plugins;
    }
    /**
     * The Amazon Resource Name (ARN) of the IAM role used by the connector to access Amazon S3 objects and other external resources.
     * 
     */
    @Export(name="serviceExecutionRoleArn", type=String.class, parameters={})
    private Output<String> serviceExecutionRoleArn;

    /**
     * @return The Amazon Resource Name (ARN) of the IAM role used by the connector to access Amazon S3 objects and other external resources.
     * 
     */
    public Output<String> serviceExecutionRoleArn() {
        return this.serviceExecutionRoleArn;
    }
    @Export(name="workerConfiguration", type=ConnectorWorkerConfiguration.class, parameters={})
    private Output</* @Nullable */ ConnectorWorkerConfiguration> workerConfiguration;

    public Output<Optional<ConnectorWorkerConfiguration>> workerConfiguration() {
        return Codegen.optional(this.workerConfiguration);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Connector(String name) {
        this(name, ConnectorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Connector(String name, ConnectorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Connector(String name, ConnectorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:kafkaconnect:Connector", name, args == null ? ConnectorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Connector(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:kafkaconnect:Connector", name, null, makeResourceOptions(options, id));
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
    public static Connector get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Connector(name, id, options);
    }
}
