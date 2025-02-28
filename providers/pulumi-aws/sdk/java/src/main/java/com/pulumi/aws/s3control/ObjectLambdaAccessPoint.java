// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3control;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.s3control.ObjectLambdaAccessPointArgs;
import com.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointState;
import com.pulumi.aws.s3control.outputs.ObjectLambdaAccessPointConfiguration;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage an S3 Object Lambda Access Point.
 * An Object Lambda access point is associated with exactly one standard access point and thus one Amazon S3 bucket.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleBucketV2 = new BucketV2(&#34;exampleBucketV2&#34;);
 * 
 *         var exampleAccessPoint = new AccessPoint(&#34;exampleAccessPoint&#34;, AccessPointArgs.builder()        
 *             .bucket(exampleBucketV2.getId())
 *             .build());
 * 
 *         var exampleObjectLambdaAccessPoint = new ObjectLambdaAccessPoint(&#34;exampleObjectLambdaAccessPoint&#34;, ObjectLambdaAccessPointArgs.builder()        
 *             .configuration(ObjectLambdaAccessPointConfiguration.builder()
 *                 .supportingAccessPoint(exampleAccessPoint.getArn())
 *                 .transformationConfigurations(ObjectLambdaAccessPointConfigurationTransformationConfiguration.builder()
 *                     .actions(&#34;GetObject&#34;)
 *                     .contentTransformation(ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformation.builder()
 *                         .awsLambda(ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda.builder()
 *                             .functionArn(aws_lambda_function.getExample().getArn())
 *                             .build())
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Object Lambda Access Points can be imported using the `account_id` and `name`, separated by a colon (`:`), e.g.
 * 
 * ```sh
 *  $ pulumi import aws:s3control/objectLambdaAccessPoint:ObjectLambdaAccessPoint example 123456789012:example
 * ```
 * 
 */
@ResourceType(type="aws:s3control/objectLambdaAccessPoint:ObjectLambdaAccessPoint")
public class ObjectLambdaAccessPoint extends com.pulumi.resources.CustomResource {
    @Export(name="accountId", type=String.class, parameters={})
    private Output<String> accountId;

    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * Amazon Resource Name (ARN) of the Object Lambda Access Point.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the Object Lambda Access Point.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * A configuration block containing details about the Object Lambda Access Point. See Configuration below for more details.
     * 
     */
    @Export(name="configuration", type=ObjectLambdaAccessPointConfiguration.class, parameters={})
    private Output<ObjectLambdaAccessPointConfiguration> configuration;

    /**
     * @return A configuration block containing details about the Object Lambda Access Point. See Configuration below for more details.
     * 
     */
    public Output<ObjectLambdaAccessPointConfiguration> configuration() {
        return this.configuration;
    }
    /**
     * The name for this Object Lambda Access Point.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name for this Object Lambda Access Point.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ObjectLambdaAccessPoint(String name) {
        this(name, ObjectLambdaAccessPointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ObjectLambdaAccessPoint(String name, ObjectLambdaAccessPointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ObjectLambdaAccessPoint(String name, ObjectLambdaAccessPointArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3control/objectLambdaAccessPoint:ObjectLambdaAccessPoint", name, args == null ? ObjectLambdaAccessPointArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ObjectLambdaAccessPoint(String name, Output<String> id, @Nullable ObjectLambdaAccessPointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3control/objectLambdaAccessPoint:ObjectLambdaAccessPoint", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ObjectLambdaAccessPoint get(String name, Output<String> id, @Nullable ObjectLambdaAccessPointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ObjectLambdaAccessPoint(name, id, state, options);
    }
}
