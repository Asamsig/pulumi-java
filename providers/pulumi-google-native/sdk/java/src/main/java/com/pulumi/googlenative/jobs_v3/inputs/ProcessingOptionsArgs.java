// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.jobs_v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.jobs_v3.enums.ProcessingOptionsHtmlSanitization;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Input only. Options for job processing.
 * 
 */
public final class ProcessingOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProcessingOptionsArgs Empty = new ProcessingOptionsArgs();

    /**
     * Optional. If set to `true`, the service does not attempt to resolve a more precise address for the job.
     * 
     */
    @Import(name="disableStreetAddressResolution")
    private @Nullable Output<Boolean> disableStreetAddressResolution;

    /**
     * @return Optional. If set to `true`, the service does not attempt to resolve a more precise address for the job.
     * 
     */
    public Optional<Output<Boolean>> disableStreetAddressResolution() {
        return Optional.ofNullable(this.disableStreetAddressResolution);
    }

    /**
     * Optional. Option for job HTML content sanitization. Applied fields are: * description * applicationInfo.instruction * incentives * qualifications * responsibilities HTML tags in these fields may be stripped if sanitiazation is not disabled. Defaults to HtmlSanitization.SIMPLE_FORMATTING_ONLY.
     * 
     */
    @Import(name="htmlSanitization")
    private @Nullable Output<ProcessingOptionsHtmlSanitization> htmlSanitization;

    /**
     * @return Optional. Option for job HTML content sanitization. Applied fields are: * description * applicationInfo.instruction * incentives * qualifications * responsibilities HTML tags in these fields may be stripped if sanitiazation is not disabled. Defaults to HtmlSanitization.SIMPLE_FORMATTING_ONLY.
     * 
     */
    public Optional<Output<ProcessingOptionsHtmlSanitization>> htmlSanitization() {
        return Optional.ofNullable(this.htmlSanitization);
    }

    private ProcessingOptionsArgs() {}

    private ProcessingOptionsArgs(ProcessingOptionsArgs $) {
        this.disableStreetAddressResolution = $.disableStreetAddressResolution;
        this.htmlSanitization = $.htmlSanitization;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProcessingOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProcessingOptionsArgs $;

        public Builder() {
            $ = new ProcessingOptionsArgs();
        }

        public Builder(ProcessingOptionsArgs defaults) {
            $ = new ProcessingOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param disableStreetAddressResolution Optional. If set to `true`, the service does not attempt to resolve a more precise address for the job.
         * 
         * @return builder
         * 
         */
        public Builder disableStreetAddressResolution(@Nullable Output<Boolean> disableStreetAddressResolution) {
            $.disableStreetAddressResolution = disableStreetAddressResolution;
            return this;
        }

        /**
         * @param disableStreetAddressResolution Optional. If set to `true`, the service does not attempt to resolve a more precise address for the job.
         * 
         * @return builder
         * 
         */
        public Builder disableStreetAddressResolution(Boolean disableStreetAddressResolution) {
            return disableStreetAddressResolution(Output.of(disableStreetAddressResolution));
        }

        /**
         * @param htmlSanitization Optional. Option for job HTML content sanitization. Applied fields are: * description * applicationInfo.instruction * incentives * qualifications * responsibilities HTML tags in these fields may be stripped if sanitiazation is not disabled. Defaults to HtmlSanitization.SIMPLE_FORMATTING_ONLY.
         * 
         * @return builder
         * 
         */
        public Builder htmlSanitization(@Nullable Output<ProcessingOptionsHtmlSanitization> htmlSanitization) {
            $.htmlSanitization = htmlSanitization;
            return this;
        }

        /**
         * @param htmlSanitization Optional. Option for job HTML content sanitization. Applied fields are: * description * applicationInfo.instruction * incentives * qualifications * responsibilities HTML tags in these fields may be stripped if sanitiazation is not disabled. Defaults to HtmlSanitization.SIMPLE_FORMATTING_ONLY.
         * 
         * @return builder
         * 
         */
        public Builder htmlSanitization(ProcessingOptionsHtmlSanitization htmlSanitization) {
            return htmlSanitization(Output.of(htmlSanitization));
        }

        public ProcessingOptionsArgs build() {
            return $;
        }
    }

}
