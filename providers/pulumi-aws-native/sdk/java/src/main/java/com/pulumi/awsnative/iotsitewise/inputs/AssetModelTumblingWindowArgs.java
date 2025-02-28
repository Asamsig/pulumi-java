// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotsitewise.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains a tumbling window, which is a repeating fixed-sized, non-overlapping, and contiguous time interval. This window is used in metric and aggregation computations.
 * 
 */
public final class AssetModelTumblingWindowArgs extends com.pulumi.resources.ResourceArgs {

    public static final AssetModelTumblingWindowArgs Empty = new AssetModelTumblingWindowArgs();

    @Import(name="interval", required=true)
    private Output<String> interval;

    public Output<String> interval() {
        return this.interval;
    }

    @Import(name="offset")
    private @Nullable Output<String> offset;

    public Optional<Output<String>> offset() {
        return Optional.ofNullable(this.offset);
    }

    private AssetModelTumblingWindowArgs() {}

    private AssetModelTumblingWindowArgs(AssetModelTumblingWindowArgs $) {
        this.interval = $.interval;
        this.offset = $.offset;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AssetModelTumblingWindowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AssetModelTumblingWindowArgs $;

        public Builder() {
            $ = new AssetModelTumblingWindowArgs();
        }

        public Builder(AssetModelTumblingWindowArgs defaults) {
            $ = new AssetModelTumblingWindowArgs(Objects.requireNonNull(defaults));
        }

        public Builder interval(Output<String> interval) {
            $.interval = interval;
            return this;
        }

        public Builder interval(String interval) {
            return interval(Output.of(interval));
        }

        public Builder offset(@Nullable Output<String> offset) {
            $.offset = offset;
            return this;
        }

        public Builder offset(String offset) {
            return offset(Output.of(offset));
        }

        public AssetModelTumblingWindowArgs build() {
            $.interval = Objects.requireNonNull($.interval, "expected parameter 'interval' to be non-null");
            return $;
        }
    }

}
