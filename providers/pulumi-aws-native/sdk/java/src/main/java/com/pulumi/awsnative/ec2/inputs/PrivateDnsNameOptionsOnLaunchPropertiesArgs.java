// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivateDnsNameOptionsOnLaunchPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateDnsNameOptionsOnLaunchPropertiesArgs Empty = new PrivateDnsNameOptionsOnLaunchPropertiesArgs();

    @Import(name="enableResourceNameDnsAAAARecord")
    private @Nullable Output<Boolean> enableResourceNameDnsAAAARecord;

    public Optional<Output<Boolean>> enableResourceNameDnsAAAARecord() {
        return Optional.ofNullable(this.enableResourceNameDnsAAAARecord);
    }

    @Import(name="enableResourceNameDnsARecord")
    private @Nullable Output<Boolean> enableResourceNameDnsARecord;

    public Optional<Output<Boolean>> enableResourceNameDnsARecord() {
        return Optional.ofNullable(this.enableResourceNameDnsARecord);
    }

    @Import(name="hostnameType")
    private @Nullable Output<String> hostnameType;

    public Optional<Output<String>> hostnameType() {
        return Optional.ofNullable(this.hostnameType);
    }

    private PrivateDnsNameOptionsOnLaunchPropertiesArgs() {}

    private PrivateDnsNameOptionsOnLaunchPropertiesArgs(PrivateDnsNameOptionsOnLaunchPropertiesArgs $) {
        this.enableResourceNameDnsAAAARecord = $.enableResourceNameDnsAAAARecord;
        this.enableResourceNameDnsARecord = $.enableResourceNameDnsARecord;
        this.hostnameType = $.hostnameType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateDnsNameOptionsOnLaunchPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateDnsNameOptionsOnLaunchPropertiesArgs $;

        public Builder() {
            $ = new PrivateDnsNameOptionsOnLaunchPropertiesArgs();
        }

        public Builder(PrivateDnsNameOptionsOnLaunchPropertiesArgs defaults) {
            $ = new PrivateDnsNameOptionsOnLaunchPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder enableResourceNameDnsAAAARecord(@Nullable Output<Boolean> enableResourceNameDnsAAAARecord) {
            $.enableResourceNameDnsAAAARecord = enableResourceNameDnsAAAARecord;
            return this;
        }

        public Builder enableResourceNameDnsAAAARecord(Boolean enableResourceNameDnsAAAARecord) {
            return enableResourceNameDnsAAAARecord(Output.of(enableResourceNameDnsAAAARecord));
        }

        public Builder enableResourceNameDnsARecord(@Nullable Output<Boolean> enableResourceNameDnsARecord) {
            $.enableResourceNameDnsARecord = enableResourceNameDnsARecord;
            return this;
        }

        public Builder enableResourceNameDnsARecord(Boolean enableResourceNameDnsARecord) {
            return enableResourceNameDnsARecord(Output.of(enableResourceNameDnsARecord));
        }

        public Builder hostnameType(@Nullable Output<String> hostnameType) {
            $.hostnameType = hostnameType;
            return this;
        }

        public Builder hostnameType(String hostnameType) {
            return hostnameType(Output.of(hostnameType));
        }

        public PrivateDnsNameOptionsOnLaunchPropertiesArgs build() {
            return $;
        }
    }

}
