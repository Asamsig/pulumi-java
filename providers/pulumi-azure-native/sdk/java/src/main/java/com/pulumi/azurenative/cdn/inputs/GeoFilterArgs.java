// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.azurenative.cdn.enums.GeoFilterActions;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Rules defining user&#39;s geo access within a CDN endpoint.
 * 
 */
public final class GeoFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final GeoFilterArgs Empty = new GeoFilterArgs();

    /**
     * Action of the geo filter, i.e. allow or block access.
     * 
     */
    @Import(name="action", required=true)
    private Output<GeoFilterActions> action;

    /**
     * @return Action of the geo filter, i.e. allow or block access.
     * 
     */
    public Output<GeoFilterActions> action() {
        return this.action;
    }

    /**
     * Two letter country codes defining user country access in a geo filter, e.g. AU, MX, US.
     * 
     */
    @Import(name="countryCodes", required=true)
    private Output<List<String>> countryCodes;

    /**
     * @return Two letter country codes defining user country access in a geo filter, e.g. AU, MX, US.
     * 
     */
    public Output<List<String>> countryCodes() {
        return this.countryCodes;
    }

    /**
     * Relative path applicable to geo filter. (e.g. &#39;/mypictures&#39;, &#39;/mypicture/kitty.jpg&#39;, and etc.)
     * 
     */
    @Import(name="relativePath", required=true)
    private Output<String> relativePath;

    /**
     * @return Relative path applicable to geo filter. (e.g. &#39;/mypictures&#39;, &#39;/mypicture/kitty.jpg&#39;, and etc.)
     * 
     */
    public Output<String> relativePath() {
        return this.relativePath;
    }

    private GeoFilterArgs() {}

    private GeoFilterArgs(GeoFilterArgs $) {
        this.action = $.action;
        this.countryCodes = $.countryCodes;
        this.relativePath = $.relativePath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GeoFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GeoFilterArgs $;

        public Builder() {
            $ = new GeoFilterArgs();
        }

        public Builder(GeoFilterArgs defaults) {
            $ = new GeoFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action Action of the geo filter, i.e. allow or block access.
         * 
         * @return builder
         * 
         */
        public Builder action(Output<GeoFilterActions> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action Action of the geo filter, i.e. allow or block access.
         * 
         * @return builder
         * 
         */
        public Builder action(GeoFilterActions action) {
            return action(Output.of(action));
        }

        /**
         * @param countryCodes Two letter country codes defining user country access in a geo filter, e.g. AU, MX, US.
         * 
         * @return builder
         * 
         */
        public Builder countryCodes(Output<List<String>> countryCodes) {
            $.countryCodes = countryCodes;
            return this;
        }

        /**
         * @param countryCodes Two letter country codes defining user country access in a geo filter, e.g. AU, MX, US.
         * 
         * @return builder
         * 
         */
        public Builder countryCodes(List<String> countryCodes) {
            return countryCodes(Output.of(countryCodes));
        }

        /**
         * @param countryCodes Two letter country codes defining user country access in a geo filter, e.g. AU, MX, US.
         * 
         * @return builder
         * 
         */
        public Builder countryCodes(String... countryCodes) {
            return countryCodes(List.of(countryCodes));
        }

        /**
         * @param relativePath Relative path applicable to geo filter. (e.g. &#39;/mypictures&#39;, &#39;/mypicture/kitty.jpg&#39;, and etc.)
         * 
         * @return builder
         * 
         */
        public Builder relativePath(Output<String> relativePath) {
            $.relativePath = relativePath;
            return this;
        }

        /**
         * @param relativePath Relative path applicable to geo filter. (e.g. &#39;/mypictures&#39;, &#39;/mypicture/kitty.jpg&#39;, and etc.)
         * 
         * @return builder
         * 
         */
        public Builder relativePath(String relativePath) {
            return relativePath(Output.of(relativePath));
        }

        public GeoFilterArgs build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            $.countryCodes = Objects.requireNonNull($.countryCodes, "expected parameter 'countryCodes' to be non-null");
            $.relativePath = Objects.requireNonNull($.relativePath, "expected parameter 'relativePath' to be non-null");
            return $;
        }
    }

}
