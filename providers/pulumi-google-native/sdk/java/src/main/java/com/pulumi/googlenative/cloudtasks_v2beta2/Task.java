// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudtasks_v2beta2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.cloudtasks_v2beta2.TaskArgs;
import com.pulumi.googlenative.cloudtasks_v2beta2.outputs.AppEngineHttpRequestResponse;
import com.pulumi.googlenative.cloudtasks_v2beta2.outputs.PullMessageResponse;
import com.pulumi.googlenative.cloudtasks_v2beta2.outputs.TaskStatusResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a task and adds it to a queue. Tasks cannot be updated after creation; there is no UpdateTask command. * For App Engine queues, the maximum task size is 100KB. * For pull queues, the maximum task size is 1MB.
 * 
 */
@ResourceType(type="google-native:cloudtasks/v2beta2:Task")
public class Task extends com.pulumi.resources.CustomResource {
    /**
     * App Engine HTTP request that is sent to the task&#39;s target. Can be set only if app_engine_http_target is set on the queue. An App Engine task is a task that has AppEngineHttpRequest set.
     * 
     */
    @Export(name="appEngineHttpRequest", type=AppEngineHttpRequestResponse.class, parameters={})
    private Output<AppEngineHttpRequestResponse> appEngineHttpRequest;

    /**
     * @return App Engine HTTP request that is sent to the task&#39;s target. Can be set only if app_engine_http_target is set on the queue. An App Engine task is a task that has AppEngineHttpRequest set.
     * 
     */
    public Output<AppEngineHttpRequestResponse> appEngineHttpRequest() {
        return this.appEngineHttpRequest;
    }
    /**
     * The time that the task was created. `create_time` will be truncated to the nearest second.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time that the task was created. `create_time` will be truncated to the nearest second.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Optionally caller-specified in CreateTask. The task name. The task name must have the following format: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID` * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the task&#39;s location. The list of available locations can be obtained by calling ListLocations. For more information, see https://cloud.google.com/about/locations/. * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or hyphens (-). The maximum length is 100 characters. * `TASK_ID` can contain only letters ([A-Za-z]), numbers ([0-9]), hyphens (-), or underscores (_). The maximum length is 500 characters.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Optionally caller-specified in CreateTask. The task name. The task name must have the following format: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID` * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the task&#39;s location. The list of available locations can be obtained by calling ListLocations. For more information, see https://cloud.google.com/about/locations/. * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or hyphens (-). The maximum length is 100 characters. * `TASK_ID` can contain only letters ([A-Za-z]), numbers ([0-9]), hyphens (-), or underscores (_). The maximum length is 500 characters.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * LeaseTasks to process the task. Can be set only if pull_target is set on the queue. A pull task is a task that has PullMessage set.
     * 
     */
    @Export(name="pullMessage", type=PullMessageResponse.class, parameters={})
    private Output<PullMessageResponse> pullMessage;

    /**
     * @return LeaseTasks to process the task. Can be set only if pull_target is set on the queue. A pull task is a task that has PullMessage set.
     * 
     */
    public Output<PullMessageResponse> pullMessage() {
        return this.pullMessage;
    }
    /**
     * The time when the task is scheduled to be attempted. For App Engine queues, this is when the task will be attempted or retried. For pull queues, this is the time when the task is available to be leased; if a task is currently leased, this is the time when the current lease expires, that is, the time that the task was leased plus the lease_duration. `schedule_time` will be truncated to the nearest microsecond.
     * 
     */
    @Export(name="scheduleTime", type=String.class, parameters={})
    private Output<String> scheduleTime;

    /**
     * @return The time when the task is scheduled to be attempted. For App Engine queues, this is when the task will be attempted or retried. For pull queues, this is the time when the task is available to be leased; if a task is currently leased, this is the time when the current lease expires, that is, the time that the task was leased plus the lease_duration. `schedule_time` will be truncated to the nearest microsecond.
     * 
     */
    public Output<String> scheduleTime() {
        return this.scheduleTime;
    }
    /**
     * The task status.
     * 
     */
    @Export(name="status", type=TaskStatusResponse.class, parameters={})
    private Output<TaskStatusResponse> status;

    /**
     * @return The task status.
     * 
     */
    public Output<TaskStatusResponse> status() {
        return this.status;
    }
    /**
     * The view specifies which subset of the Task has been returned.
     * 
     */
    @Export(name="view", type=String.class, parameters={})
    private Output<String> view;

    /**
     * @return The view specifies which subset of the Task has been returned.
     * 
     */
    public Output<String> view() {
        return this.view;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Task(String name) {
        this(name, TaskArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Task(String name, TaskArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Task(String name, TaskArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudtasks/v2beta2:Task", name, args == null ? TaskArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Task(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudtasks/v2beta2:Task", name, null, makeResourceOptions(options, id));
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
    public static Task get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Task(name, id, options);
    }
}
