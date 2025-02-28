// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.inputs;

import com.pulumi.awsnative.quicksight.inputs.DashboardDataSetReferenceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * &lt;p&gt;Dashboard source template.&lt;/p&gt;
 * 
 */
public final class DashboardSourceTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardSourceTemplateArgs Empty = new DashboardSourceTemplateArgs();

    /**
     * &lt;p&gt;The Amazon Resource Name (ARN) of the resource.&lt;/p&gt;
     * 
     */
    @Import(name="arn", required=true)
    private Output<String> arn;

    /**
     * @return &lt;p&gt;The Amazon Resource Name (ARN) of the resource.&lt;/p&gt;
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }

    /**
     * &lt;p&gt;Dataset references.&lt;/p&gt;
     * 
     */
    @Import(name="dataSetReferences", required=true)
    private Output<List<DashboardDataSetReferenceArgs>> dataSetReferences;

    /**
     * @return &lt;p&gt;Dataset references.&lt;/p&gt;
     * 
     */
    public Output<List<DashboardDataSetReferenceArgs>> dataSetReferences() {
        return this.dataSetReferences;
    }

    private DashboardSourceTemplateArgs() {}

    private DashboardSourceTemplateArgs(DashboardSourceTemplateArgs $) {
        this.arn = $.arn;
        this.dataSetReferences = $.dataSetReferences;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardSourceTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardSourceTemplateArgs $;

        public Builder() {
            $ = new DashboardSourceTemplateArgs();
        }

        public Builder(DashboardSourceTemplateArgs defaults) {
            $ = new DashboardSourceTemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn &lt;p&gt;The Amazon Resource Name (ARN) of the resource.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder arn(Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn &lt;p&gt;The Amazon Resource Name (ARN) of the resource.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param dataSetReferences &lt;p&gt;Dataset references.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder dataSetReferences(Output<List<DashboardDataSetReferenceArgs>> dataSetReferences) {
            $.dataSetReferences = dataSetReferences;
            return this;
        }

        /**
         * @param dataSetReferences &lt;p&gt;Dataset references.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder dataSetReferences(List<DashboardDataSetReferenceArgs> dataSetReferences) {
            return dataSetReferences(Output.of(dataSetReferences));
        }

        /**
         * @param dataSetReferences &lt;p&gt;Dataset references.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder dataSetReferences(DashboardDataSetReferenceArgs... dataSetReferences) {
            return dataSetReferences(List.of(dataSetReferences));
        }

        public DashboardSourceTemplateArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            $.dataSetReferences = Objects.requireNonNull($.dataSetReferences, "expected parameter 'dataSetReferences' to be non-null");
            return $;
        }
    }

}
