// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.connectedvmwarevsphere.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetMachineExtensionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMachineExtensionPlainArgs Empty = new GetMachineExtensionPlainArgs();

    /**
     * The name of the machine extension.
     * 
     */
    @Import(name="extensionName", required=true)
    private String extensionName;

    /**
     * @return The name of the machine extension.
     * 
     */
    public String extensionName() {
        return this.extensionName;
    }

    /**
     * The name of the machine containing the extension.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the machine containing the extension.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The Resource Group Name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The Resource Group Name.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetMachineExtensionPlainArgs() {}

    private GetMachineExtensionPlainArgs(GetMachineExtensionPlainArgs $) {
        this.extensionName = $.extensionName;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMachineExtensionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMachineExtensionPlainArgs $;

        public Builder() {
            $ = new GetMachineExtensionPlainArgs();
        }

        public Builder(GetMachineExtensionPlainArgs defaults) {
            $ = new GetMachineExtensionPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param extensionName The name of the machine extension.
         * 
         * @return builder
         * 
         */
        public Builder extensionName(String extensionName) {
            $.extensionName = extensionName;
            return this;
        }

        /**
         * @param name The name of the machine containing the extension.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName The Resource Group Name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetMachineExtensionPlainArgs build() {
            $.extensionName = Objects.requireNonNull($.extensionName, "expected parameter 'extensionName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
