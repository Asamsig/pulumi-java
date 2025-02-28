// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.licensemanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class LicenseValidityDateFormatArgs extends com.pulumi.resources.ResourceArgs {

    public static final LicenseValidityDateFormatArgs Empty = new LicenseValidityDateFormatArgs();

    /**
     * Validity begin date for the license.
     * 
     */
    @Import(name="begin", required=true)
    private Output<String> begin;

    /**
     * @return Validity begin date for the license.
     * 
     */
    public Output<String> begin() {
        return this.begin;
    }

    /**
     * Validity begin date for the license.
     * 
     */
    @Import(name="end", required=true)
    private Output<String> end;

    /**
     * @return Validity begin date for the license.
     * 
     */
    public Output<String> end() {
        return this.end;
    }

    private LicenseValidityDateFormatArgs() {}

    private LicenseValidityDateFormatArgs(LicenseValidityDateFormatArgs $) {
        this.begin = $.begin;
        this.end = $.end;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LicenseValidityDateFormatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LicenseValidityDateFormatArgs $;

        public Builder() {
            $ = new LicenseValidityDateFormatArgs();
        }

        public Builder(LicenseValidityDateFormatArgs defaults) {
            $ = new LicenseValidityDateFormatArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param begin Validity begin date for the license.
         * 
         * @return builder
         * 
         */
        public Builder begin(Output<String> begin) {
            $.begin = begin;
            return this;
        }

        /**
         * @param begin Validity begin date for the license.
         * 
         * @return builder
         * 
         */
        public Builder begin(String begin) {
            return begin(Output.of(begin));
        }

        /**
         * @param end Validity begin date for the license.
         * 
         * @return builder
         * 
         */
        public Builder end(Output<String> end) {
            $.end = end;
            return this;
        }

        /**
         * @param end Validity begin date for the license.
         * 
         * @return builder
         * 
         */
        public Builder end(String end) {
            return end(Output.of(end));
        }

        public LicenseValidityDateFormatArgs build() {
            $.begin = Objects.requireNonNull($.begin, "expected parameter 'begin' to be non-null");
            $.end = Objects.requireNonNull($.end, "expected parameter 'end' to be non-null");
            return $;
        }
    }

}
