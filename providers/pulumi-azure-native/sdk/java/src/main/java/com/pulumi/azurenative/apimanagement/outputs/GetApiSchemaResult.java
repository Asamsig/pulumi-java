// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetApiSchemaResult {
    /**
     * @return Must be a valid a media type used in a Content-Type header as defined in the RFC 2616. Media type of the schema document (e.g. application/json, application/xml). &lt;/br&gt; - `Swagger` Schema use `application/vnd.ms-azure-apim.swagger.definitions+json` &lt;/br&gt; - `WSDL` Schema use `application/vnd.ms-azure-apim.xsd+xml` &lt;/br&gt; - `OpenApi` Schema use `application/vnd.oai.openapi.components+json` &lt;/br&gt; - `WADL Schema` use `application/vnd.ms-azure-apim.wadl.grammars+xml`.
     * 
     */
    private final String contentType;
    /**
     * @return Types definitions. Used for Swagger/OpenAPI schemas only, null otherwise.
     * 
     */
    private final @Nullable Object definitions;
    /**
     * @return Resource ID.
     * 
     */
    private final String id;
    /**
     * @return Resource name.
     * 
     */
    private final String name;
    /**
     * @return Resource type for API Management resource.
     * 
     */
    private final String type;
    /**
     * @return Json escaped string defining the document representing the Schema. Used for schemas other than Swagger/OpenAPI.
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private GetApiSchemaResult(
        @CustomType.Parameter("contentType") String contentType,
        @CustomType.Parameter("definitions") @Nullable Object definitions,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("value") @Nullable String value) {
        this.contentType = contentType;
        this.definitions = definitions;
        this.id = id;
        this.name = name;
        this.type = type;
        this.value = value;
    }

    /**
     * @return Must be a valid a media type used in a Content-Type header as defined in the RFC 2616. Media type of the schema document (e.g. application/json, application/xml). &lt;/br&gt; - `Swagger` Schema use `application/vnd.ms-azure-apim.swagger.definitions+json` &lt;/br&gt; - `WSDL` Schema use `application/vnd.ms-azure-apim.xsd+xml` &lt;/br&gt; - `OpenApi` Schema use `application/vnd.oai.openapi.components+json` &lt;/br&gt; - `WADL Schema` use `application/vnd.ms-azure-apim.wadl.grammars+xml`.
     * 
     */
    public String contentType() {
        return this.contentType;
    }
    /**
     * @return Types definitions. Used for Swagger/OpenAPI schemas only, null otherwise.
     * 
     */
    public Optional<Object> definitions() {
        return Optional.ofNullable(this.definitions);
    }
    /**
     * @return Resource ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Resource type for API Management resource.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Json escaped string defining the document representing the Schema. Used for schemas other than Swagger/OpenAPI.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiSchemaResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contentType;
        private @Nullable Object definitions;
        private String id;
        private String name;
        private String type;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApiSchemaResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.definitions = defaults.definitions;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder contentType(String contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }
        public Builder definitions(@Nullable Object definitions) {
            this.definitions = definitions;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public GetApiSchemaResult build() {
            return new GetApiSchemaResult(contentType, definitions, id, name, type, value);
        }
    }
}
