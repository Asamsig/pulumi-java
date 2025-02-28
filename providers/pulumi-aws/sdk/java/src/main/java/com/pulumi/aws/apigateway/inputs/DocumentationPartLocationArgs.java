// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DocumentationPartLocationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DocumentationPartLocationArgs Empty = new DocumentationPartLocationArgs();

    /**
     * The HTTP verb of a method. The default value is `*` for any method.
     * 
     */
    @Import(name="method")
    private @Nullable Output<String> method;

    /**
     * @return The HTTP verb of a method. The default value is `*` for any method.
     * 
     */
    public Optional<Output<String>> method() {
        return Optional.ofNullable(this.method);
    }

    /**
     * The name of the targeted API entity.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the targeted API entity.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The URL path of the target. The default value is `/` for the root resource.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return The URL path of the target. The default value is `/` for the root resource.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * The HTTP status code of a response. The default value is `*` for any status code.
     * 
     */
    @Import(name="statusCode")
    private @Nullable Output<String> statusCode;

    /**
     * @return The HTTP status code of a response. The default value is `*` for any status code.
     * 
     */
    public Optional<Output<String>> statusCode() {
        return Optional.ofNullable(this.statusCode);
    }

    /**
     * The type of API entity to which the documentation content appliesE.g., `API`, `METHOD` or `REQUEST_BODY`
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of API entity to which the documentation content appliesE.g., `API`, `METHOD` or `REQUEST_BODY`
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private DocumentationPartLocationArgs() {}

    private DocumentationPartLocationArgs(DocumentationPartLocationArgs $) {
        this.method = $.method;
        this.name = $.name;
        this.path = $.path;
        this.statusCode = $.statusCode;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DocumentationPartLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DocumentationPartLocationArgs $;

        public Builder() {
            $ = new DocumentationPartLocationArgs();
        }

        public Builder(DocumentationPartLocationArgs defaults) {
            $ = new DocumentationPartLocationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param method The HTTP verb of a method. The default value is `*` for any method.
         * 
         * @return builder
         * 
         */
        public Builder method(@Nullable Output<String> method) {
            $.method = method;
            return this;
        }

        /**
         * @param method The HTTP verb of a method. The default value is `*` for any method.
         * 
         * @return builder
         * 
         */
        public Builder method(String method) {
            return method(Output.of(method));
        }

        /**
         * @param name The name of the targeted API entity.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the targeted API entity.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param path The URL path of the target. The default value is `/` for the root resource.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The URL path of the target. The default value is `/` for the root resource.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param statusCode The HTTP status code of a response. The default value is `*` for any status code.
         * 
         * @return builder
         * 
         */
        public Builder statusCode(@Nullable Output<String> statusCode) {
            $.statusCode = statusCode;
            return this;
        }

        /**
         * @param statusCode The HTTP status code of a response. The default value is `*` for any status code.
         * 
         * @return builder
         * 
         */
        public Builder statusCode(String statusCode) {
            return statusCode(Output.of(statusCode));
        }

        /**
         * @param type The type of API entity to which the documentation content appliesE.g., `API`, `METHOD` or `REQUEST_BODY`
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of API entity to which the documentation content appliesE.g., `API`, `METHOD` or `REQUEST_BODY`
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public DocumentationPartLocationArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
