// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.dataproc_v1.BatchArgs;
import com.pulumi.googlenative.dataproc_v1.outputs.EnvironmentConfigResponse;
import com.pulumi.googlenative.dataproc_v1.outputs.PySparkBatchResponse;
import com.pulumi.googlenative.dataproc_v1.outputs.RuntimeConfigResponse;
import com.pulumi.googlenative.dataproc_v1.outputs.RuntimeInfoResponse;
import com.pulumi.googlenative.dataproc_v1.outputs.SparkBatchResponse;
import com.pulumi.googlenative.dataproc_v1.outputs.SparkRBatchResponse;
import com.pulumi.googlenative.dataproc_v1.outputs.SparkSqlBatchResponse;
import com.pulumi.googlenative.dataproc_v1.outputs.StateHistoryResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a batch workload that executes asynchronously.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:dataproc/v1:Batch")
public class Batch extends com.pulumi.resources.CustomResource {
    /**
     * The time when the batch was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time when the batch was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The email address of the user who created the batch.
     * 
     */
    @Export(name="creator", type=String.class, parameters={})
    private Output<String> creator;

    /**
     * @return The email address of the user who created the batch.
     * 
     */
    public Output<String> creator() {
        return this.creator;
    }
    /**
     * Optional. Environment configuration for the batch execution.
     * 
     */
    @Export(name="environmentConfig", type=EnvironmentConfigResponse.class, parameters={})
    private Output<EnvironmentConfigResponse> environmentConfig;

    /**
     * @return Optional. Environment configuration for the batch execution.
     * 
     */
    public Output<EnvironmentConfigResponse> environmentConfig() {
        return this.environmentConfig;
    }
    /**
     * Optional. The labels to associate with this batch. Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a batch.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Optional. The labels to associate with this batch. Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a batch.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * The resource name of the batch.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the batch.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The resource name of the operation associated with this batch.
     * 
     */
    @Export(name="operation", type=String.class, parameters={})
    private Output<String> operation;

    /**
     * @return The resource name of the operation associated with this batch.
     * 
     */
    public Output<String> operation() {
        return this.operation;
    }
    /**
     * Optional. PySpark batch config.
     * 
     */
    @Export(name="pysparkBatch", type=PySparkBatchResponse.class, parameters={})
    private Output<PySparkBatchResponse> pysparkBatch;

    /**
     * @return Optional. PySpark batch config.
     * 
     */
    public Output<PySparkBatchResponse> pysparkBatch() {
        return this.pysparkBatch;
    }
    /**
     * Optional. Runtime configuration for the batch execution.
     * 
     */
    @Export(name="runtimeConfig", type=RuntimeConfigResponse.class, parameters={})
    private Output<RuntimeConfigResponse> runtimeConfig;

    /**
     * @return Optional. Runtime configuration for the batch execution.
     * 
     */
    public Output<RuntimeConfigResponse> runtimeConfig() {
        return this.runtimeConfig;
    }
    /**
     * Runtime information about batch execution.
     * 
     */
    @Export(name="runtimeInfo", type=RuntimeInfoResponse.class, parameters={})
    private Output<RuntimeInfoResponse> runtimeInfo;

    /**
     * @return Runtime information about batch execution.
     * 
     */
    public Output<RuntimeInfoResponse> runtimeInfo() {
        return this.runtimeInfo;
    }
    /**
     * Optional. Spark batch config.
     * 
     */
    @Export(name="sparkBatch", type=SparkBatchResponse.class, parameters={})
    private Output<SparkBatchResponse> sparkBatch;

    /**
     * @return Optional. Spark batch config.
     * 
     */
    public Output<SparkBatchResponse> sparkBatch() {
        return this.sparkBatch;
    }
    /**
     * Optional. SparkR batch config.
     * 
     */
    @Export(name="sparkRBatch", type=SparkRBatchResponse.class, parameters={})
    private Output<SparkRBatchResponse> sparkRBatch;

    /**
     * @return Optional. SparkR batch config.
     * 
     */
    public Output<SparkRBatchResponse> sparkRBatch() {
        return this.sparkRBatch;
    }
    /**
     * Optional. SparkSql batch config.
     * 
     */
    @Export(name="sparkSqlBatch", type=SparkSqlBatchResponse.class, parameters={})
    private Output<SparkSqlBatchResponse> sparkSqlBatch;

    /**
     * @return Optional. SparkSql batch config.
     * 
     */
    public Output<SparkSqlBatchResponse> sparkSqlBatch() {
        return this.sparkSqlBatch;
    }
    /**
     * The state of the batch.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of the batch.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Historical state information for the batch.
     * 
     */
    @Export(name="stateHistory", type=List.class, parameters={StateHistoryResponse.class})
    private Output<List<StateHistoryResponse>> stateHistory;

    /**
     * @return Historical state information for the batch.
     * 
     */
    public Output<List<StateHistoryResponse>> stateHistory() {
        return this.stateHistory;
    }
    /**
     * Batch state details, such as a failure description if the state is FAILED.
     * 
     */
    @Export(name="stateMessage", type=String.class, parameters={})
    private Output<String> stateMessage;

    /**
     * @return Batch state details, such as a failure description if the state is FAILED.
     * 
     */
    public Output<String> stateMessage() {
        return this.stateMessage;
    }
    /**
     * The time when the batch entered a current state.
     * 
     */
    @Export(name="stateTime", type=String.class, parameters={})
    private Output<String> stateTime;

    /**
     * @return The time when the batch entered a current state.
     * 
     */
    public Output<String> stateTime() {
        return this.stateTime;
    }
    /**
     * A batch UUID (Unique Universal Identifier). The service generates this value when it creates the batch.
     * 
     */
    @Export(name="uuid", type=String.class, parameters={})
    private Output<String> uuid;

    /**
     * @return A batch UUID (Unique Universal Identifier). The service generates this value when it creates the batch.
     * 
     */
    public Output<String> uuid() {
        return this.uuid;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Batch(String name) {
        this(name, BatchArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Batch(String name, @Nullable BatchArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Batch(String name, @Nullable BatchArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dataproc/v1:Batch", name, args == null ? BatchArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Batch(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dataproc/v1:Batch", name, null, makeResourceOptions(options, id));
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
    public static Batch get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Batch(name, id, options);
    }
}
