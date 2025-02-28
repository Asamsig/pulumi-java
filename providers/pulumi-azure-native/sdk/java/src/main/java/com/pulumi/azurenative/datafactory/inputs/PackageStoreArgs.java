// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.EntityReferenceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Package store for the SSIS integration runtime.
 * 
 */
public final class PackageStoreArgs extends com.pulumi.resources.ResourceArgs {

    public static final PackageStoreArgs Empty = new PackageStoreArgs();

    /**
     * The name of the package store
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the package store
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The package store linked service reference.
     * 
     */
    @Import(name="packageStoreLinkedService", required=true)
    private Output<EntityReferenceArgs> packageStoreLinkedService;

    /**
     * @return The package store linked service reference.
     * 
     */
    public Output<EntityReferenceArgs> packageStoreLinkedService() {
        return this.packageStoreLinkedService;
    }

    private PackageStoreArgs() {}

    private PackageStoreArgs(PackageStoreArgs $) {
        this.name = $.name;
        this.packageStoreLinkedService = $.packageStoreLinkedService;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PackageStoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PackageStoreArgs $;

        public Builder() {
            $ = new PackageStoreArgs();
        }

        public Builder(PackageStoreArgs defaults) {
            $ = new PackageStoreArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the package store
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the package store
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param packageStoreLinkedService The package store linked service reference.
         * 
         * @return builder
         * 
         */
        public Builder packageStoreLinkedService(Output<EntityReferenceArgs> packageStoreLinkedService) {
            $.packageStoreLinkedService = packageStoreLinkedService;
            return this;
        }

        /**
         * @param packageStoreLinkedService The package store linked service reference.
         * 
         * @return builder
         * 
         */
        public Builder packageStoreLinkedService(EntityReferenceArgs packageStoreLinkedService) {
            return packageStoreLinkedService(Output.of(packageStoreLinkedService));
        }

        public PackageStoreArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.packageStoreLinkedService = Objects.requireNonNull($.packageStoreLinkedService, "expected parameter 'packageStoreLinkedService' to be non-null");
            return $;
        }
    }

}
