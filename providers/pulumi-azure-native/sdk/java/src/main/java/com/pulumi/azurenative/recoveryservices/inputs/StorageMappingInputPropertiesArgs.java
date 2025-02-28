// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Storage mapping input properties.
 * 
 */
public final class StorageMappingInputPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final StorageMappingInputPropertiesArgs Empty = new StorageMappingInputPropertiesArgs();

    /**
     * The ID of the storage object.
     * 
     */
    @Import(name="targetStorageClassificationId")
    private @Nullable Output<String> targetStorageClassificationId;

    /**
     * @return The ID of the storage object.
     * 
     */
    public Optional<Output<String>> targetStorageClassificationId() {
        return Optional.ofNullable(this.targetStorageClassificationId);
    }

    private StorageMappingInputPropertiesArgs() {}

    private StorageMappingInputPropertiesArgs(StorageMappingInputPropertiesArgs $) {
        this.targetStorageClassificationId = $.targetStorageClassificationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StorageMappingInputPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StorageMappingInputPropertiesArgs $;

        public Builder() {
            $ = new StorageMappingInputPropertiesArgs();
        }

        public Builder(StorageMappingInputPropertiesArgs defaults) {
            $ = new StorageMappingInputPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param targetStorageClassificationId The ID of the storage object.
         * 
         * @return builder
         * 
         */
        public Builder targetStorageClassificationId(@Nullable Output<String> targetStorageClassificationId) {
            $.targetStorageClassificationId = targetStorageClassificationId;
            return this;
        }

        /**
         * @param targetStorageClassificationId The ID of the storage object.
         * 
         * @return builder
         * 
         */
        public Builder targetStorageClassificationId(String targetStorageClassificationId) {
            return targetStorageClassificationId(Output.of(targetStorageClassificationId));
        }

        public StorageMappingInputPropertiesArgs build() {
            return $;
        }
    }

}
