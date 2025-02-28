// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.iotcentral.outputs;

import com.pulumi.azurenative.iotcentral.outputs.AppSkuInfoResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAppResult {
    /**
     * @return The ID of the application.
     * 
     */
    private final String applicationId;
    /**
     * @return The display name of the application.
     * 
     */
    private final @Nullable String displayName;
    /**
     * @return The ARM resource identifier.
     * 
     */
    private final String id;
    /**
     * @return The resource location.
     * 
     */
    private final String location;
    /**
     * @return The ARM resource name.
     * 
     */
    private final String name;
    /**
     * @return A valid instance SKU.
     * 
     */
    private final AppSkuInfoResponse sku;
    /**
     * @return The subdomain of the application.
     * 
     */
    private final @Nullable String subdomain;
    /**
     * @return The resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return The ID of the application template, which is a blueprint that defines the characteristics and behaviors of an application. Optional; if not specified, defaults to a blank blueprint and allows the application to be defined from scratch.
     * 
     */
    private final @Nullable String template;
    /**
     * @return The resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetAppResult(
        @CustomType.Parameter("applicationId") String applicationId,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("sku") AppSkuInfoResponse sku,
        @CustomType.Parameter("subdomain") @Nullable String subdomain,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("template") @Nullable String template,
        @CustomType.Parameter("type") String type) {
        this.applicationId = applicationId;
        this.displayName = displayName;
        this.id = id;
        this.location = location;
        this.name = name;
        this.sku = sku;
        this.subdomain = subdomain;
        this.tags = tags;
        this.template = template;
        this.type = type;
    }

    /**
     * @return The ID of the application.
     * 
     */
    public String applicationId() {
        return this.applicationId;
    }
    /**
     * @return The display name of the application.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * @return The ARM resource identifier.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The resource location.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return The ARM resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A valid instance SKU.
     * 
     */
    public AppSkuInfoResponse sku() {
        return this.sku;
    }
    /**
     * @return The subdomain of the application.
     * 
     */
    public Optional<String> subdomain() {
        return Optional.ofNullable(this.subdomain);
    }
    /**
     * @return The resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return The ID of the application template, which is a blueprint that defines the characteristics and behaviors of an application. Optional; if not specified, defaults to a blank blueprint and allows the application to be defined from scratch.
     * 
     */
    public Optional<String> template() {
        return Optional.ofNullable(this.template);
    }
    /**
     * @return The resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String applicationId;
        private @Nullable String displayName;
        private String id;
        private String location;
        private String name;
        private AppSkuInfoResponse sku;
        private @Nullable String subdomain;
        private @Nullable Map<String,String> tags;
        private @Nullable String template;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAppResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.sku = defaults.sku;
    	      this.subdomain = defaults.subdomain;
    	      this.tags = defaults.tags;
    	      this.template = defaults.template;
    	      this.type = defaults.type;
        }

        public Builder applicationId(String applicationId) {
            this.applicationId = Objects.requireNonNull(applicationId);
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder sku(AppSkuInfoResponse sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }
        public Builder subdomain(@Nullable String subdomain) {
            this.subdomain = subdomain;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder template(@Nullable String template) {
            this.template = template;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetAppResult build() {
            return new GetAppResult(applicationId, displayName, id, location, name, sku, subdomain, tags, template, type);
        }
    }
}
