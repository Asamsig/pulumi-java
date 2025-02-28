// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hybridnetwork.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataDiskResponse {
    /**
     * @return Specifies how the virtual machine should be created.
     * 
     */
    private final @Nullable String createOption;
    /**
     * @return Specifies the size of an empty disk in gigabytes. This element can be used to overwrite the size of the disk in a virtual machine image.
     * 
     */
    private final @Nullable Integer diskSizeGB;
    /**
     * @return The name of data disk.
     * 
     */
    private final @Nullable String name;

    @CustomType.Constructor
    private DataDiskResponse(
        @CustomType.Parameter("createOption") @Nullable String createOption,
        @CustomType.Parameter("diskSizeGB") @Nullable Integer diskSizeGB,
        @CustomType.Parameter("name") @Nullable String name) {
        this.createOption = createOption;
        this.diskSizeGB = diskSizeGB;
        this.name = name;
    }

    /**
     * @return Specifies how the virtual machine should be created.
     * 
     */
    public Optional<String> createOption() {
        return Optional.ofNullable(this.createOption);
    }
    /**
     * @return Specifies the size of an empty disk in gigabytes. This element can be used to overwrite the size of the disk in a virtual machine image.
     * 
     */
    public Optional<Integer> diskSizeGB() {
        return Optional.ofNullable(this.diskSizeGB);
    }
    /**
     * @return The name of data disk.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String createOption;
        private @Nullable Integer diskSizeGB;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(DataDiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createOption = defaults.createOption;
    	      this.diskSizeGB = defaults.diskSizeGB;
    	      this.name = defaults.name;
        }

        public Builder createOption(@Nullable String createOption) {
            this.createOption = createOption;
            return this;
        }
        public Builder diskSizeGB(@Nullable Integer diskSizeGB) {
            this.diskSizeGB = diskSizeGB;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }        public DataDiskResponse build() {
            return new DataDiskResponse(createOption, diskSizeGB, name);
        }
    }
}
