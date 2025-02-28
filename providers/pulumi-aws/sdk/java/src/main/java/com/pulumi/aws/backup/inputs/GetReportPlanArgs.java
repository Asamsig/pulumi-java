// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.backup.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetReportPlanArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetReportPlanArgs Empty = new GetReportPlanArgs();

    /**
     * The backup report plan name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The backup report plan name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Metadata that you can assign to help organize the report plans you create.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Metadata that you can assign to help organize the report plans you create.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetReportPlanArgs() {}

    private GetReportPlanArgs(GetReportPlanArgs $) {
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetReportPlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetReportPlanArgs $;

        public Builder() {
            $ = new GetReportPlanArgs();
        }

        public Builder(GetReportPlanArgs defaults) {
            $ = new GetReportPlanArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The backup report plan name.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The backup report plan name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tags Metadata that you can assign to help organize the report plans you create.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Metadata that you can assign to help organize the report plans you create.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public GetReportPlanArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
