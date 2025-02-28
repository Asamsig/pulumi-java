// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * &lt;p&gt;A date-time parameter.&lt;/p&gt;
 * 
 */
public final class DashboardDateTimeParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardDateTimeParameterArgs Empty = new DashboardDateTimeParameterArgs();

    /**
     * &lt;p&gt;A display name for the date-time parameter.&lt;/p&gt;
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return &lt;p&gt;A display name for the date-time parameter.&lt;/p&gt;
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * &lt;p&gt;The values for the date-time parameter.&lt;/p&gt;
     * 
     */
    @Import(name="values", required=true)
    private Output<List<String>> values;

    /**
     * @return &lt;p&gt;The values for the date-time parameter.&lt;/p&gt;
     * 
     */
    public Output<List<String>> values() {
        return this.values;
    }

    private DashboardDateTimeParameterArgs() {}

    private DashboardDateTimeParameterArgs(DashboardDateTimeParameterArgs $) {
        this.name = $.name;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardDateTimeParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardDateTimeParameterArgs $;

        public Builder() {
            $ = new DashboardDateTimeParameterArgs();
        }

        public Builder(DashboardDateTimeParameterArgs defaults) {
            $ = new DashboardDateTimeParameterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name &lt;p&gt;A display name for the date-time parameter.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name &lt;p&gt;A display name for the date-time parameter.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param values &lt;p&gt;The values for the date-time parameter.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values &lt;p&gt;The values for the date-time parameter.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values &lt;p&gt;The values for the date-time parameter.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public DashboardDateTimeParameterArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
