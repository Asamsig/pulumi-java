// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.logging;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.logging.MetricArgs;
import com.pulumi.gcp.logging.inputs.MetricState;
import com.pulumi.gcp.logging.outputs.MetricBucketOptions;
import com.pulumi.gcp.logging.outputs.MetricMetricDescriptor;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Logs-based metric can also be used to extract values from logs and create a a distribution
 * of the values. The distribution records the statistics of the extracted values along with
 * an optional histogram of the values as specified by the bucket options.
 * 
 * To get more information about Metric, see:
 * 
 * * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/projects.metrics/create)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/logging/docs/apis)
 * 
 * ## Example Usage
 * ### Logging Metric Basic
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
 *         var loggingMetric = new Metric(&#34;loggingMetric&#34;, MetricArgs.builder()        
 *             .bucketOptions(MetricBucketOptions.builder()
 *                 .linearBuckets(MetricBucketOptionsLinearBuckets.builder()
 *                     .numFiniteBuckets(3)
 *                     .offset(1)
 *                     .width(1)
 *                     .build())
 *                 .build())
 *             .filter(&#34;resource.type=gae_app AND severity&gt;=ERROR&#34;)
 *             .labelExtractors(Map.ofEntries(
 *                 Map.entry(&#34;mass&#34;, &#34;EXTRACT(jsonPayload.request)&#34;),
 *                 Map.entry(&#34;sku&#34;, &#34;EXTRACT(jsonPayload.id)&#34;)
 *             ))
 *             .metricDescriptor(MetricMetricDescriptor.builder()
 *                 .displayName(&#34;My metric&#34;)
 *                 .labels(                
 *                     MetricMetricDescriptorLabel.builder()
 *                         .description(&#34;amount of matter&#34;)
 *                         .key(&#34;mass&#34;)
 *                         .valueType(&#34;STRING&#34;)
 *                         .build(),
 *                     MetricMetricDescriptorLabel.builder()
 *                         .description(&#34;Identifying number for item&#34;)
 *                         .key(&#34;sku&#34;)
 *                         .valueType(&#34;INT64&#34;)
 *                         .build())
 *                 .metricKind(&#34;DELTA&#34;)
 *                 .unit(&#34;1&#34;)
 *                 .valueType(&#34;DISTRIBUTION&#34;)
 *                 .build())
 *             .valueExtractor(&#34;EXTRACT(jsonPayload.request)&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Logging Metric Counter Basic
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
 *         var loggingMetric = new Metric(&#34;loggingMetric&#34;, MetricArgs.builder()        
 *             .filter(&#34;resource.type=gae_app AND severity&gt;=ERROR&#34;)
 *             .metricDescriptor(MetricMetricDescriptor.builder()
 *                 .metricKind(&#34;DELTA&#34;)
 *                 .valueType(&#34;INT64&#34;)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Logging Metric Counter Labels
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
 *         var loggingMetric = new Metric(&#34;loggingMetric&#34;, MetricArgs.builder()        
 *             .filter(&#34;resource.type=gae_app AND severity&gt;=ERROR&#34;)
 *             .labelExtractors(Map.of(&#34;mass&#34;, &#34;EXTRACT(jsonPayload.request)&#34;))
 *             .metricDescriptor(MetricMetricDescriptor.builder()
 *                 .labels(MetricMetricDescriptorLabel.builder()
 *                     .description(&#34;amount of matter&#34;)
 *                     .key(&#34;mass&#34;)
 *                     .valueType(&#34;STRING&#34;)
 *                     .build())
 *                 .metricKind(&#34;DELTA&#34;)
 *                 .valueType(&#34;INT64&#34;)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Metric can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:logging/metric:Metric default {{project}} {{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:logging/metric:Metric default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:logging/metric:Metric")
public class Metric extends com.pulumi.resources.CustomResource {
    /**
     * The bucketOptions are required when the logs-based metric is using a DISTRIBUTION value type and it
     * describes the bucket boundaries used to create a histogram of the extracted values.
     * Structure is documented below.
     * 
     */
    @Export(name="bucketOptions", type=MetricBucketOptions.class, parameters={})
    private Output</* @Nullable */ MetricBucketOptions> bucketOptions;

    /**
     * @return The bucketOptions are required when the logs-based metric is using a DISTRIBUTION value type and it
     * describes the bucket boundaries used to create a histogram of the extracted values.
     * Structure is documented below.
     * 
     */
    public Output<Optional<MetricBucketOptions>> bucketOptions() {
        return Codegen.optional(this.bucketOptions);
    }
    /**
     * A description of this metric, which is used in documentation. The maximum length of the
     * description is 8000 characters.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of this metric, which is used in documentation. The maximum length of the
     * description is 8000 characters.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * An advanced logs filter (https://cloud.google.com/logging/docs/view/advanced-filters) which
     * is used to match log entries.
     * 
     */
    @Export(name="filter", type=String.class, parameters={})
    private Output<String> filter;

    /**
     * @return An advanced logs filter (https://cloud.google.com/logging/docs/view/advanced-filters) which
     * is used to match log entries.
     * 
     */
    public Output<String> filter() {
        return this.filter;
    }
    /**
     * A map from a label key string to an extractor expression which is used to extract data from a log
     * entry field and assign as the label value. Each label key specified in the LabelDescriptor must
     * have an associated extractor expression in this map. The syntax of the extractor expression is
     * the same as for the valueExtractor field.
     * 
     */
    @Export(name="labelExtractors", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labelExtractors;

    /**
     * @return A map from a label key string to an extractor expression which is used to extract data from a log
     * entry field and assign as the label value. Each label key specified in the LabelDescriptor must
     * have an associated extractor expression in this map. The syntax of the extractor expression is
     * the same as for the valueExtractor field.
     * 
     */
    public Output<Optional<Map<String,String>>> labelExtractors() {
        return Codegen.optional(this.labelExtractors);
    }
    /**
     * The metric descriptor associated with the logs-based metric.
     * Structure is documented below.
     * 
     */
    @Export(name="metricDescriptor", type=MetricMetricDescriptor.class, parameters={})
    private Output<MetricMetricDescriptor> metricDescriptor;

    /**
     * @return The metric descriptor associated with the logs-based metric.
     * Structure is documented below.
     * 
     */
    public Output<MetricMetricDescriptor> metricDescriptor() {
        return this.metricDescriptor;
    }
    /**
     * The client-assigned metric identifier. Examples - &#34;error_count&#34;, &#34;nginx/requests&#34;.
     * Metric identifiers are limited to 100 characters and can include only the following
     * characters A-Z, a-z, 0-9, and the special characters _-.,+!*&#39;,()%/. The forward-slash
     * character (/) denotes a hierarchy of name pieces, and it cannot be the first character
     * of the name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The client-assigned metric identifier. Examples - &#34;error_count&#34;, &#34;nginx/requests&#34;.
     * Metric identifiers are limited to 100 characters and can include only the following
     * characters A-Z, a-z, 0-9, and the special characters _-.,+!*&#39;,()%/. The forward-slash
     * character (/) denotes a hierarchy of name pieces, and it cannot be the first character
     * of the name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * A valueExtractor is required when using a distribution logs-based metric to extract the values to
     * record from a log entry. Two functions are supported for value extraction - EXTRACT(field) or
     * REGEXP_EXTRACT(field, regex). The argument are 1. field - The name of the log entry field from which
     * the value is to be extracted. 2. regex - A regular expression using the Google RE2 syntax
     * (https://github.com/google/re2/wiki/Syntax) with a single capture group to extract data from the specified
     * log entry field. The value of the field is converted to a string before applying the regex. It is an
     * error to specify a regex that does not include exactly one capture group.
     * 
     */
    @Export(name="valueExtractor", type=String.class, parameters={})
    private Output</* @Nullable */ String> valueExtractor;

    /**
     * @return A valueExtractor is required when using a distribution logs-based metric to extract the values to
     * record from a log entry. Two functions are supported for value extraction - EXTRACT(field) or
     * REGEXP_EXTRACT(field, regex). The argument are 1. field - The name of the log entry field from which
     * the value is to be extracted. 2. regex - A regular expression using the Google RE2 syntax
     * (https://github.com/google/re2/wiki/Syntax) with a single capture group to extract data from the specified
     * log entry field. The value of the field is converted to a string before applying the regex. It is an
     * error to specify a regex that does not include exactly one capture group.
     * 
     */
    public Output<Optional<String>> valueExtractor() {
        return Codegen.optional(this.valueExtractor);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Metric(String name) {
        this(name, MetricArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Metric(String name, MetricArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Metric(String name, MetricArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:logging/metric:Metric", name, args == null ? MetricArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Metric(String name, Output<String> id, @Nullable MetricState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:logging/metric:Metric", name, state, makeResourceOptions(options, id));
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
    public static Metric get(String name, Output<String> id, @Nullable MetricState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Metric(name, id, state, options);
    }
}
