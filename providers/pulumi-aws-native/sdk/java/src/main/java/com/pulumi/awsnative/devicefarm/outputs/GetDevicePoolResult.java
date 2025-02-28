// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.devicefarm.outputs;

import com.pulumi.awsnative.devicefarm.outputs.DevicePoolRule;
import com.pulumi.awsnative.devicefarm.outputs.DevicePoolTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDevicePoolResult {
    private final @Nullable String arn;
    private final @Nullable String description;
    private final @Nullable Integer maxDevices;
    private final @Nullable String name;
    private final @Nullable List<DevicePoolRule> rules;
    private final @Nullable List<DevicePoolTag> tags;

    @CustomType.Constructor
    private GetDevicePoolResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("maxDevices") @Nullable Integer maxDevices,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("rules") @Nullable List<DevicePoolRule> rules,
        @CustomType.Parameter("tags") @Nullable List<DevicePoolTag> tags) {
        this.arn = arn;
        this.description = description;
        this.maxDevices = maxDevices;
        this.name = name;
        this.rules = rules;
        this.tags = tags;
    }

    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    public Optional<Integer> maxDevices() {
        return Optional.ofNullable(this.maxDevices);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public List<DevicePoolRule> rules() {
        return this.rules == null ? List.of() : this.rules;
    }
    public List<DevicePoolTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDevicePoolResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String description;
        private @Nullable Integer maxDevices;
        private @Nullable String name;
        private @Nullable List<DevicePoolRule> rules;
        private @Nullable List<DevicePoolTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDevicePoolResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.maxDevices = defaults.maxDevices;
    	      this.name = defaults.name;
    	      this.rules = defaults.rules;
    	      this.tags = defaults.tags;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder maxDevices(@Nullable Integer maxDevices) {
            this.maxDevices = maxDevices;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder rules(@Nullable List<DevicePoolRule> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(DevicePoolRule... rules) {
            return rules(List.of(rules));
        }
        public Builder tags(@Nullable List<DevicePoolTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(DevicePoolTag... tags) {
            return tags(List.of(tags));
        }        public GetDevicePoolResult build() {
            return new GetDevicePoolResult(arn, description, maxDevices, name, rules, tags);
        }
    }
}
