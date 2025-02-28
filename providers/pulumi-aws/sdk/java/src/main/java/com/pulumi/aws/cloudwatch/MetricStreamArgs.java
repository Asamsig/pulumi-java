// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch;

import com.pulumi.aws.cloudwatch.inputs.MetricStreamExcludeFilterArgs;
import com.pulumi.aws.cloudwatch.inputs.MetricStreamIncludeFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MetricStreamArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetricStreamArgs Empty = new MetricStreamArgs();

    /**
     * List of exclusive metric filters. If you specify this parameter, the stream sends metrics from all metric namespaces except for the namespaces that you specify here. Conflicts with `include_filter`.
     * 
     */
    @Import(name="excludeFilters")
    private @Nullable Output<List<MetricStreamExcludeFilterArgs>> excludeFilters;

    /**
     * @return List of exclusive metric filters. If you specify this parameter, the stream sends metrics from all metric namespaces except for the namespaces that you specify here. Conflicts with `include_filter`.
     * 
     */
    public Optional<Output<List<MetricStreamExcludeFilterArgs>>> excludeFilters() {
        return Optional.ofNullable(this.excludeFilters);
    }

    /**
     * ARN of the Amazon Kinesis Firehose delivery stream to use for this metric stream.
     * 
     */
    @Import(name="firehoseArn", required=true)
    private Output<String> firehoseArn;

    /**
     * @return ARN of the Amazon Kinesis Firehose delivery stream to use for this metric stream.
     * 
     */
    public Output<String> firehoseArn() {
        return this.firehoseArn;
    }

    /**
     * List of inclusive metric filters. If you specify this parameter, the stream sends only the metrics from the metric namespaces that you specify here. Conflicts with `exclude_filter`.
     * 
     */
    @Import(name="includeFilters")
    private @Nullable Output<List<MetricStreamIncludeFilterArgs>> includeFilters;

    /**
     * @return List of inclusive metric filters. If you specify this parameter, the stream sends only the metrics from the metric namespaces that you specify here. Conflicts with `exclude_filter`.
     * 
     */
    public Optional<Output<List<MetricStreamIncludeFilterArgs>>> includeFilters() {
        return Optional.ofNullable(this.includeFilters);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Creates a unique friendly name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @Import(name="namePrefix")
    private @Nullable Output<String> namePrefix;

    /**
     * @return Creates a unique friendly name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    public Optional<Output<String>> namePrefix() {
        return Optional.ofNullable(this.namePrefix);
    }

    /**
     * Output format for the stream. Possible values are `json` and `opentelemetry0.7`. For more information about output formats, see [Metric streams output formats](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-metric-streams-formats.html).
     * 
     */
    @Import(name="outputFormat", required=true)
    private Output<String> outputFormat;

    /**
     * @return Output format for the stream. Possible values are `json` and `opentelemetry0.7`. For more information about output formats, see [Metric streams output formats](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-metric-streams-formats.html).
     * 
     */
    public Output<String> outputFormat() {
        return this.outputFormat;
    }

    /**
     * ARN of the IAM role that this metric stream will use to access Amazon Kinesis Firehose resources. For more information about role permissions, see [Trust between CloudWatch and Kinesis Data Firehose](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-metric-streams-trustpolicy.html).
     * 
     */
    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    /**
     * @return ARN of the IAM role that this metric stream will use to access Amazon Kinesis Firehose resources. For more information about role permissions, see [Trust between CloudWatch and Kinesis Data Firehose](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-metric-streams-trustpolicy.html).
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }

    /**
     * Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private MetricStreamArgs() {}

    private MetricStreamArgs(MetricStreamArgs $) {
        this.excludeFilters = $.excludeFilters;
        this.firehoseArn = $.firehoseArn;
        this.includeFilters = $.includeFilters;
        this.name = $.name;
        this.namePrefix = $.namePrefix;
        this.outputFormat = $.outputFormat;
        this.roleArn = $.roleArn;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricStreamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricStreamArgs $;

        public Builder() {
            $ = new MetricStreamArgs();
        }

        public Builder(MetricStreamArgs defaults) {
            $ = new MetricStreamArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param excludeFilters List of exclusive metric filters. If you specify this parameter, the stream sends metrics from all metric namespaces except for the namespaces that you specify here. Conflicts with `include_filter`.
         * 
         * @return builder
         * 
         */
        public Builder excludeFilters(@Nullable Output<List<MetricStreamExcludeFilterArgs>> excludeFilters) {
            $.excludeFilters = excludeFilters;
            return this;
        }

        /**
         * @param excludeFilters List of exclusive metric filters. If you specify this parameter, the stream sends metrics from all metric namespaces except for the namespaces that you specify here. Conflicts with `include_filter`.
         * 
         * @return builder
         * 
         */
        public Builder excludeFilters(List<MetricStreamExcludeFilterArgs> excludeFilters) {
            return excludeFilters(Output.of(excludeFilters));
        }

        /**
         * @param excludeFilters List of exclusive metric filters. If you specify this parameter, the stream sends metrics from all metric namespaces except for the namespaces that you specify here. Conflicts with `include_filter`.
         * 
         * @return builder
         * 
         */
        public Builder excludeFilters(MetricStreamExcludeFilterArgs... excludeFilters) {
            return excludeFilters(List.of(excludeFilters));
        }

        /**
         * @param firehoseArn ARN of the Amazon Kinesis Firehose delivery stream to use for this metric stream.
         * 
         * @return builder
         * 
         */
        public Builder firehoseArn(Output<String> firehoseArn) {
            $.firehoseArn = firehoseArn;
            return this;
        }

        /**
         * @param firehoseArn ARN of the Amazon Kinesis Firehose delivery stream to use for this metric stream.
         * 
         * @return builder
         * 
         */
        public Builder firehoseArn(String firehoseArn) {
            return firehoseArn(Output.of(firehoseArn));
        }

        /**
         * @param includeFilters List of inclusive metric filters. If you specify this parameter, the stream sends only the metrics from the metric namespaces that you specify here. Conflicts with `exclude_filter`.
         * 
         * @return builder
         * 
         */
        public Builder includeFilters(@Nullable Output<List<MetricStreamIncludeFilterArgs>> includeFilters) {
            $.includeFilters = includeFilters;
            return this;
        }

        /**
         * @param includeFilters List of inclusive metric filters. If you specify this parameter, the stream sends only the metrics from the metric namespaces that you specify here. Conflicts with `exclude_filter`.
         * 
         * @return builder
         * 
         */
        public Builder includeFilters(List<MetricStreamIncludeFilterArgs> includeFilters) {
            return includeFilters(Output.of(includeFilters));
        }

        /**
         * @param includeFilters List of inclusive metric filters. If you specify this parameter, the stream sends only the metrics from the metric namespaces that you specify here. Conflicts with `exclude_filter`.
         * 
         * @return builder
         * 
         */
        public Builder includeFilters(MetricStreamIncludeFilterArgs... includeFilters) {
            return includeFilters(List.of(includeFilters));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namePrefix Creates a unique friendly name beginning with the specified prefix. Conflicts with `name`.
         * 
         * @return builder
         * 
         */
        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            $.namePrefix = namePrefix;
            return this;
        }

        /**
         * @param namePrefix Creates a unique friendly name beginning with the specified prefix. Conflicts with `name`.
         * 
         * @return builder
         * 
         */
        public Builder namePrefix(String namePrefix) {
            return namePrefix(Output.of(namePrefix));
        }

        /**
         * @param outputFormat Output format for the stream. Possible values are `json` and `opentelemetry0.7`. For more information about output formats, see [Metric streams output formats](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-metric-streams-formats.html).
         * 
         * @return builder
         * 
         */
        public Builder outputFormat(Output<String> outputFormat) {
            $.outputFormat = outputFormat;
            return this;
        }

        /**
         * @param outputFormat Output format for the stream. Possible values are `json` and `opentelemetry0.7`. For more information about output formats, see [Metric streams output formats](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-metric-streams-formats.html).
         * 
         * @return builder
         * 
         */
        public Builder outputFormat(String outputFormat) {
            return outputFormat(Output.of(outputFormat));
        }

        /**
         * @param roleArn ARN of the IAM role that this metric stream will use to access Amazon Kinesis Firehose resources. For more information about role permissions, see [Trust between CloudWatch and Kinesis Data Firehose](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-metric-streams-trustpolicy.html).
         * 
         * @return builder
         * 
         */
        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn ARN of the IAM role that this metric stream will use to access Amazon Kinesis Firehose resources. For more information about role permissions, see [Trust between CloudWatch and Kinesis Data Firehose](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-metric-streams-trustpolicy.html).
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        /**
         * @param tags Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public MetricStreamArgs build() {
            $.firehoseArn = Objects.requireNonNull($.firehoseArn, "expected parameter 'firehoseArn' to be non-null");
            $.outputFormat = Objects.requireNonNull($.outputFormat, "expected parameter 'outputFormat' to be non-null");
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            return $;
        }
    }

}
