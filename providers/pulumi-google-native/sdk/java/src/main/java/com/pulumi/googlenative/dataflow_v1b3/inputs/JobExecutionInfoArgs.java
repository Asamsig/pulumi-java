// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataflow_v1b3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Additional information about how a Cloud Dataflow job will be executed that isn&#39;t contained in the submitted job.
 * 
 */
public final class JobExecutionInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobExecutionInfoArgs Empty = new JobExecutionInfoArgs();

    /**
     * A mapping from each stage to the information about that stage.
     * 
     */
    @Import(name="stages")
    private @Nullable Output<Map<String,String>> stages;

    /**
     * @return A mapping from each stage to the information about that stage.
     * 
     */
    public Optional<Output<Map<String,String>>> stages() {
        return Optional.ofNullable(this.stages);
    }

    private JobExecutionInfoArgs() {}

    private JobExecutionInfoArgs(JobExecutionInfoArgs $) {
        this.stages = $.stages;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobExecutionInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobExecutionInfoArgs $;

        public Builder() {
            $ = new JobExecutionInfoArgs();
        }

        public Builder(JobExecutionInfoArgs defaults) {
            $ = new JobExecutionInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param stages A mapping from each stage to the information about that stage.
         * 
         * @return builder
         * 
         */
        public Builder stages(@Nullable Output<Map<String,String>> stages) {
            $.stages = stages;
            return this;
        }

        /**
         * @param stages A mapping from each stage to the information about that stage.
         * 
         * @return builder
         * 
         */
        public Builder stages(Map<String,String> stages) {
            return stages(Output.of(stages));
        }

        public JobExecutionInfoArgs build() {
            return $;
        }
    }

}
