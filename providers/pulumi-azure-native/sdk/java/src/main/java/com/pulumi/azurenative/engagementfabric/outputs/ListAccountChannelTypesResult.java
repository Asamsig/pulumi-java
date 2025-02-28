// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.engagementfabric.outputs;

import com.pulumi.azurenative.engagementfabric.outputs.ChannelTypeDescriptionResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ListAccountChannelTypesResult {
    /**
     * @return Channel descriptions
     * 
     */
    private final @Nullable List<ChannelTypeDescriptionResponse> value;

    @CustomType.Constructor
    private ListAccountChannelTypesResult(@CustomType.Parameter("value") @Nullable List<ChannelTypeDescriptionResponse> value) {
        this.value = value;
    }

    /**
     * @return Channel descriptions
     * 
     */
    public List<ChannelTypeDescriptionResponse> value() {
        return this.value == null ? List.of() : this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListAccountChannelTypesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ChannelTypeDescriptionResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListAccountChannelTypesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder value(@Nullable List<ChannelTypeDescriptionResponse> value) {
            this.value = value;
            return this;
        }
        public Builder value(ChannelTypeDescriptionResponse... value) {
            return value(List.of(value));
        }        public ListAccountChannelTypesResult build() {
            return new ListAccountChannelTypesResult(value);
        }
    }
}
