// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServicePolicy {
    /**
     * @return The XML Content for this Policy.
     * 
     */
    private final @Nullable String xmlContent;
    /**
     * @return A link to an API Management Policy XML Document, which must be publicly available.
     * 
     */
    private final @Nullable String xmlLink;

    @CustomType.Constructor
    private ServicePolicy(
        @CustomType.Parameter("xmlContent") @Nullable String xmlContent,
        @CustomType.Parameter("xmlLink") @Nullable String xmlLink) {
        this.xmlContent = xmlContent;
        this.xmlLink = xmlLink;
    }

    /**
     * @return The XML Content for this Policy.
     * 
     */
    public Optional<String> xmlContent() {
        return Optional.ofNullable(this.xmlContent);
    }
    /**
     * @return A link to an API Management Policy XML Document, which must be publicly available.
     * 
     */
    public Optional<String> xmlLink() {
        return Optional.ofNullable(this.xmlLink);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String xmlContent;
        private @Nullable String xmlLink;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.xmlContent = defaults.xmlContent;
    	      this.xmlLink = defaults.xmlLink;
        }

        public Builder xmlContent(@Nullable String xmlContent) {
            this.xmlContent = xmlContent;
            return this;
        }
        public Builder xmlLink(@Nullable String xmlLink) {
            this.xmlLink = xmlLink;
            return this;
        }        public ServicePolicy build() {
            return new ServicePolicy(xmlContent, xmlLink);
        }
    }
}
