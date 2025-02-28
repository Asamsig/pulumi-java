// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.datasync;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.datasync.LocationHDFSArgs;
import com.pulumi.awsnative.datasync.enums.LocationHDFSAuthenticationType;
import com.pulumi.awsnative.datasync.outputs.LocationHDFSNameNode;
import com.pulumi.awsnative.datasync.outputs.LocationHDFSQopConfiguration;
import com.pulumi.awsnative.datasync.outputs.LocationHDFSTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::DataSync::LocationHDFS.
 * 
 */
@ResourceType(type="aws-native:datasync:LocationHDFS")
public class LocationHDFS extends com.pulumi.resources.CustomResource {
    /**
     * ARN(s) of the agent(s) to use for an HDFS location.
     * 
     */
    @Export(name="agentArns", type=List.class, parameters={String.class})
    private Output<List<String>> agentArns;

    /**
     * @return ARN(s) of the agent(s) to use for an HDFS location.
     * 
     */
    public Output<List<String>> agentArns() {
        return this.agentArns;
    }
    /**
     * The authentication mode used to determine identity of user.
     * 
     */
    @Export(name="authenticationType", type=LocationHDFSAuthenticationType.class, parameters={})
    private Output<LocationHDFSAuthenticationType> authenticationType;

    /**
     * @return The authentication mode used to determine identity of user.
     * 
     */
    public Output<LocationHDFSAuthenticationType> authenticationType() {
        return this.authenticationType;
    }
    /**
     * Size of chunks (blocks) in bytes that the data is divided into when stored in the HDFS cluster.
     * 
     */
    @Export(name="blockSize", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> blockSize;

    /**
     * @return Size of chunks (blocks) in bytes that the data is divided into when stored in the HDFS cluster.
     * 
     */
    public Output<Optional<Integer>> blockSize() {
        return Codegen.optional(this.blockSize);
    }
    /**
     * The Base64 string representation of the Keytab file.
     * 
     */
    @Export(name="kerberosKeytab", type=String.class, parameters={})
    private Output</* @Nullable */ String> kerberosKeytab;

    /**
     * @return The Base64 string representation of the Keytab file.
     * 
     */
    public Output<Optional<String>> kerberosKeytab() {
        return Codegen.optional(this.kerberosKeytab);
    }
    /**
     * The string representation of the Krb5Conf file, or the presigned URL to access the Krb5.conf file within an S3 bucket.
     * 
     */
    @Export(name="kerberosKrb5Conf", type=String.class, parameters={})
    private Output</* @Nullable */ String> kerberosKrb5Conf;

    /**
     * @return The string representation of the Krb5Conf file, or the presigned URL to access the Krb5.conf file within an S3 bucket.
     * 
     */
    public Output<Optional<String>> kerberosKrb5Conf() {
        return Codegen.optional(this.kerberosKrb5Conf);
    }
    /**
     * The unique identity, or principal, to which Kerberos can assign tickets.
     * 
     */
    @Export(name="kerberosPrincipal", type=String.class, parameters={})
    private Output</* @Nullable */ String> kerberosPrincipal;

    /**
     * @return The unique identity, or principal, to which Kerberos can assign tickets.
     * 
     */
    public Output<Optional<String>> kerberosPrincipal() {
        return Codegen.optional(this.kerberosPrincipal);
    }
    /**
     * The identifier for the Key Management Server where the encryption keys that encrypt data inside HDFS clusters are stored.
     * 
     */
    @Export(name="kmsKeyProviderUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> kmsKeyProviderUri;

    /**
     * @return The identifier for the Key Management Server where the encryption keys that encrypt data inside HDFS clusters are stored.
     * 
     */
    public Output<Optional<String>> kmsKeyProviderUri() {
        return Codegen.optional(this.kmsKeyProviderUri);
    }
    /**
     * The Amazon Resource Name (ARN) of the HDFS location.
     * 
     */
    @Export(name="locationArn", type=String.class, parameters={})
    private Output<String> locationArn;

    /**
     * @return The Amazon Resource Name (ARN) of the HDFS location.
     * 
     */
    public Output<String> locationArn() {
        return this.locationArn;
    }
    /**
     * The URL of the HDFS location that was described.
     * 
     */
    @Export(name="locationUri", type=String.class, parameters={})
    private Output<String> locationUri;

    /**
     * @return The URL of the HDFS location that was described.
     * 
     */
    public Output<String> locationUri() {
        return this.locationUri;
    }
    /**
     * An array of Name Node(s) of the HDFS location.
     * 
     */
    @Export(name="nameNodes", type=List.class, parameters={LocationHDFSNameNode.class})
    private Output<List<LocationHDFSNameNode>> nameNodes;

    /**
     * @return An array of Name Node(s) of the HDFS location.
     * 
     */
    public Output<List<LocationHDFSNameNode>> nameNodes() {
        return this.nameNodes;
    }
    @Export(name="qopConfiguration", type=LocationHDFSQopConfiguration.class, parameters={})
    private Output</* @Nullable */ LocationHDFSQopConfiguration> qopConfiguration;

    public Output<Optional<LocationHDFSQopConfiguration>> qopConfiguration() {
        return Codegen.optional(this.qopConfiguration);
    }
    /**
     * Number of copies of each block that exists inside the HDFS cluster.
     * 
     */
    @Export(name="replicationFactor", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> replicationFactor;

    /**
     * @return Number of copies of each block that exists inside the HDFS cluster.
     * 
     */
    public Output<Optional<Integer>> replicationFactor() {
        return Codegen.optional(this.replicationFactor);
    }
    /**
     * The user name that has read and write permissions on the specified HDFS cluster.
     * 
     */
    @Export(name="simpleUser", type=String.class, parameters={})
    private Output</* @Nullable */ String> simpleUser;

    /**
     * @return The user name that has read and write permissions on the specified HDFS cluster.
     * 
     */
    public Output<Optional<String>> simpleUser() {
        return Codegen.optional(this.simpleUser);
    }
    /**
     * The subdirectory in HDFS that is used to read data from the HDFS source location or write data to the HDFS destination.
     * 
     */
    @Export(name="subdirectory", type=String.class, parameters={})
    private Output</* @Nullable */ String> subdirectory;

    /**
     * @return The subdirectory in HDFS that is used to read data from the HDFS source location or write data to the HDFS destination.
     * 
     */
    public Output<Optional<String>> subdirectory() {
        return Codegen.optional(this.subdirectory);
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Export(name="tags", type=List.class, parameters={LocationHDFSTag.class})
    private Output</* @Nullable */ List<LocationHDFSTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Output<Optional<List<LocationHDFSTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LocationHDFS(String name) {
        this(name, LocationHDFSArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LocationHDFS(String name, LocationHDFSArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LocationHDFS(String name, LocationHDFSArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:datasync:LocationHDFS", name, args == null ? LocationHDFSArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LocationHDFS(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:datasync:LocationHDFS", name, null, makeResourceOptions(options, id));
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
    public static LocationHDFS get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LocationHDFS(name, id, options);
    }
}
