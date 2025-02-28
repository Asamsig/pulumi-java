// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotsitewise.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AssetModelVariableValueArgs extends com.pulumi.resources.ResourceArgs {

    public static final AssetModelVariableValueArgs Empty = new AssetModelVariableValueArgs();

    @Import(name="hierarchyLogicalId")
    private @Nullable Output<String> hierarchyLogicalId;

    public Optional<Output<String>> hierarchyLogicalId() {
        return Optional.ofNullable(this.hierarchyLogicalId);
    }

    @Import(name="propertyLogicalId", required=true)
    private Output<String> propertyLogicalId;

    public Output<String> propertyLogicalId() {
        return this.propertyLogicalId;
    }

    private AssetModelVariableValueArgs() {}

    private AssetModelVariableValueArgs(AssetModelVariableValueArgs $) {
        this.hierarchyLogicalId = $.hierarchyLogicalId;
        this.propertyLogicalId = $.propertyLogicalId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AssetModelVariableValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AssetModelVariableValueArgs $;

        public Builder() {
            $ = new AssetModelVariableValueArgs();
        }

        public Builder(AssetModelVariableValueArgs defaults) {
            $ = new AssetModelVariableValueArgs(Objects.requireNonNull(defaults));
        }

        public Builder hierarchyLogicalId(@Nullable Output<String> hierarchyLogicalId) {
            $.hierarchyLogicalId = hierarchyLogicalId;
            return this;
        }

        public Builder hierarchyLogicalId(String hierarchyLogicalId) {
            return hierarchyLogicalId(Output.of(hierarchyLogicalId));
        }

        public Builder propertyLogicalId(Output<String> propertyLogicalId) {
            $.propertyLogicalId = propertyLogicalId;
            return this;
        }

        public Builder propertyLogicalId(String propertyLogicalId) {
            return propertyLogicalId(Output.of(propertyLogicalId));
        }

        public AssetModelVariableValueArgs build() {
            $.propertyLogicalId = Objects.requireNonNull($.propertyLogicalId, "expected parameter 'propertyLogicalId' to be non-null");
            return $;
        }
    }

}
