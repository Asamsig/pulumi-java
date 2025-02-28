// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.app.inputs;

import com.pulumi.azurenative.app.inputs.AzureFilePropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Storage properties
 * 
 */
public final class ManagedEnvironmentStoragePropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedEnvironmentStoragePropertiesArgs Empty = new ManagedEnvironmentStoragePropertiesArgs();

    /**
     * Azure file properties
     * 
     */
    @Import(name="azureFile")
    private @Nullable Output<AzureFilePropertiesArgs> azureFile;

    /**
     * @return Azure file properties
     * 
     */
    public Optional<Output<AzureFilePropertiesArgs>> azureFile() {
        return Optional.ofNullable(this.azureFile);
    }

    private ManagedEnvironmentStoragePropertiesArgs() {}

    private ManagedEnvironmentStoragePropertiesArgs(ManagedEnvironmentStoragePropertiesArgs $) {
        this.azureFile = $.azureFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedEnvironmentStoragePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedEnvironmentStoragePropertiesArgs $;

        public Builder() {
            $ = new ManagedEnvironmentStoragePropertiesArgs();
        }

        public Builder(ManagedEnvironmentStoragePropertiesArgs defaults) {
            $ = new ManagedEnvironmentStoragePropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param azureFile Azure file properties
         * 
         * @return builder
         * 
         */
        public Builder azureFile(@Nullable Output<AzureFilePropertiesArgs> azureFile) {
            $.azureFile = azureFile;
            return this;
        }

        /**
         * @param azureFile Azure file properties
         * 
         * @return builder
         * 
         */
        public Builder azureFile(AzureFilePropertiesArgs azureFile) {
            return azureFile(Output.of(azureFile));
        }

        public ManagedEnvironmentStoragePropertiesArgs build() {
            return $;
        }
    }

}
