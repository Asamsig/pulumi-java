// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2CustomInfoTypeResponse;
import com.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2FindingLimitsResponse;
import com.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2InfoTypeResponse;
import com.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2InspectionRuleSetResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2InspectConfigResponse {
    /**
     * @return Deprecated and unused.
     * 
     * @deprecated
     * Deprecated and unused.
     * 
     */
    @Deprecated /* Deprecated and unused. */
    private final List<String> contentOptions;
    /**
     * @return CustomInfoTypes provided by the user. See https://cloud.google.com/dlp/docs/creating-custom-infotypes to learn more.
     * 
     */
    private final List<GooglePrivacyDlpV2CustomInfoTypeResponse> customInfoTypes;
    /**
     * @return When true, excludes type information of the findings. This is not used for data profiling.
     * 
     */
    private final Boolean excludeInfoTypes;
    /**
     * @return When true, a contextual quote from the data that triggered a finding is included in the response; see Finding.quote. This is not used for data profiling.
     * 
     */
    private final Boolean includeQuote;
    /**
     * @return Restricts what info_types to look for. The values must correspond to InfoType values returned by ListInfoTypes or listed at https://cloud.google.com/dlp/docs/infotypes-reference. When no InfoTypes or CustomInfoTypes are specified in a request, the system may automatically choose what detectors to run. By default this may be all types, but may change over time as detectors are updated. If you need precise control and predictability as to what detectors are run you should specify specific InfoTypes listed in the reference, otherwise a default list will be used, which may change over time.
     * 
     */
    private final List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes;
    /**
     * @return Configuration to control the number of findings returned. This is not used for data profiling.
     * 
     */
    private final GooglePrivacyDlpV2FindingLimitsResponse limits;
    /**
     * @return Only returns findings equal or above this threshold. The default is POSSIBLE. See https://cloud.google.com/dlp/docs/likelihood to learn more.
     * 
     */
    private final String minLikelihood;
    /**
     * @return Set of rules to apply to the findings for this InspectConfig. Exclusion rules, contained in the set are executed in the end, other rules are executed in the order they are specified for each info type.
     * 
     */
    private final List<GooglePrivacyDlpV2InspectionRuleSetResponse> ruleSet;

    @CustomType.Constructor
    private GooglePrivacyDlpV2InspectConfigResponse(
        @CustomType.Parameter("contentOptions") List<String> contentOptions,
        @CustomType.Parameter("customInfoTypes") List<GooglePrivacyDlpV2CustomInfoTypeResponse> customInfoTypes,
        @CustomType.Parameter("excludeInfoTypes") Boolean excludeInfoTypes,
        @CustomType.Parameter("includeQuote") Boolean includeQuote,
        @CustomType.Parameter("infoTypes") List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes,
        @CustomType.Parameter("limits") GooglePrivacyDlpV2FindingLimitsResponse limits,
        @CustomType.Parameter("minLikelihood") String minLikelihood,
        @CustomType.Parameter("ruleSet") List<GooglePrivacyDlpV2InspectionRuleSetResponse> ruleSet) {
        this.contentOptions = contentOptions;
        this.customInfoTypes = customInfoTypes;
        this.excludeInfoTypes = excludeInfoTypes;
        this.includeQuote = includeQuote;
        this.infoTypes = infoTypes;
        this.limits = limits;
        this.minLikelihood = minLikelihood;
        this.ruleSet = ruleSet;
    }

    /**
     * @return Deprecated and unused.
     * 
     * @deprecated
     * Deprecated and unused.
     * 
     */
    @Deprecated /* Deprecated and unused. */
    public List<String> contentOptions() {
        return this.contentOptions;
    }
    /**
     * @return CustomInfoTypes provided by the user. See https://cloud.google.com/dlp/docs/creating-custom-infotypes to learn more.
     * 
     */
    public List<GooglePrivacyDlpV2CustomInfoTypeResponse> customInfoTypes() {
        return this.customInfoTypes;
    }
    /**
     * @return When true, excludes type information of the findings. This is not used for data profiling.
     * 
     */
    public Boolean excludeInfoTypes() {
        return this.excludeInfoTypes;
    }
    /**
     * @return When true, a contextual quote from the data that triggered a finding is included in the response; see Finding.quote. This is not used for data profiling.
     * 
     */
    public Boolean includeQuote() {
        return this.includeQuote;
    }
    /**
     * @return Restricts what info_types to look for. The values must correspond to InfoType values returned by ListInfoTypes or listed at https://cloud.google.com/dlp/docs/infotypes-reference. When no InfoTypes or CustomInfoTypes are specified in a request, the system may automatically choose what detectors to run. By default this may be all types, but may change over time as detectors are updated. If you need precise control and predictability as to what detectors are run you should specify specific InfoTypes listed in the reference, otherwise a default list will be used, which may change over time.
     * 
     */
    public List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes() {
        return this.infoTypes;
    }
    /**
     * @return Configuration to control the number of findings returned. This is not used for data profiling.
     * 
     */
    public GooglePrivacyDlpV2FindingLimitsResponse limits() {
        return this.limits;
    }
    /**
     * @return Only returns findings equal or above this threshold. The default is POSSIBLE. See https://cloud.google.com/dlp/docs/likelihood to learn more.
     * 
     */
    public String minLikelihood() {
        return this.minLikelihood;
    }
    /**
     * @return Set of rules to apply to the findings for this InspectConfig. Exclusion rules, contained in the set are executed in the end, other rules are executed in the order they are specified for each info type.
     * 
     */
    public List<GooglePrivacyDlpV2InspectionRuleSetResponse> ruleSet() {
        return this.ruleSet;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2InspectConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> contentOptions;
        private List<GooglePrivacyDlpV2CustomInfoTypeResponse> customInfoTypes;
        private Boolean excludeInfoTypes;
        private Boolean includeQuote;
        private List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes;
        private GooglePrivacyDlpV2FindingLimitsResponse limits;
        private String minLikelihood;
        private List<GooglePrivacyDlpV2InspectionRuleSetResponse> ruleSet;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2InspectConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentOptions = defaults.contentOptions;
    	      this.customInfoTypes = defaults.customInfoTypes;
    	      this.excludeInfoTypes = defaults.excludeInfoTypes;
    	      this.includeQuote = defaults.includeQuote;
    	      this.infoTypes = defaults.infoTypes;
    	      this.limits = defaults.limits;
    	      this.minLikelihood = defaults.minLikelihood;
    	      this.ruleSet = defaults.ruleSet;
        }

        public Builder contentOptions(List<String> contentOptions) {
            this.contentOptions = Objects.requireNonNull(contentOptions);
            return this;
        }
        public Builder contentOptions(String... contentOptions) {
            return contentOptions(List.of(contentOptions));
        }
        public Builder customInfoTypes(List<GooglePrivacyDlpV2CustomInfoTypeResponse> customInfoTypes) {
            this.customInfoTypes = Objects.requireNonNull(customInfoTypes);
            return this;
        }
        public Builder customInfoTypes(GooglePrivacyDlpV2CustomInfoTypeResponse... customInfoTypes) {
            return customInfoTypes(List.of(customInfoTypes));
        }
        public Builder excludeInfoTypes(Boolean excludeInfoTypes) {
            this.excludeInfoTypes = Objects.requireNonNull(excludeInfoTypes);
            return this;
        }
        public Builder includeQuote(Boolean includeQuote) {
            this.includeQuote = Objects.requireNonNull(includeQuote);
            return this;
        }
        public Builder infoTypes(List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes) {
            this.infoTypes = Objects.requireNonNull(infoTypes);
            return this;
        }
        public Builder infoTypes(GooglePrivacyDlpV2InfoTypeResponse... infoTypes) {
            return infoTypes(List.of(infoTypes));
        }
        public Builder limits(GooglePrivacyDlpV2FindingLimitsResponse limits) {
            this.limits = Objects.requireNonNull(limits);
            return this;
        }
        public Builder minLikelihood(String minLikelihood) {
            this.minLikelihood = Objects.requireNonNull(minLikelihood);
            return this;
        }
        public Builder ruleSet(List<GooglePrivacyDlpV2InspectionRuleSetResponse> ruleSet) {
            this.ruleSet = Objects.requireNonNull(ruleSet);
            return this;
        }
        public Builder ruleSet(GooglePrivacyDlpV2InspectionRuleSetResponse... ruleSet) {
            return ruleSet(List.of(ruleSet));
        }        public GooglePrivacyDlpV2InspectConfigResponse build() {
            return new GooglePrivacyDlpV2InspectConfigResponse(contentOptions, customInfoTypes, excludeInfoTypes, includeQuote, infoTypes, limits, minLikelihood, ruleSet);
        }
    }
}
