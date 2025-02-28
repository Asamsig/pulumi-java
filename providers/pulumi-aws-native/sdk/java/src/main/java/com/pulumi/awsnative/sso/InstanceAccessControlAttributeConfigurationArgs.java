// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sso;

import com.pulumi.awsnative.sso.inputs.InstanceAccessControlAttributeConfigurationAccessControlAttributeArgs;
import com.pulumi.awsnative.sso.inputs.InstanceAccessControlAttributeConfigurationPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceAccessControlAttributeConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceAccessControlAttributeConfigurationArgs Empty = new InstanceAccessControlAttributeConfigurationArgs();

    @Import(name="accessControlAttributes")
    private @Nullable Output<List<InstanceAccessControlAttributeConfigurationAccessControlAttributeArgs>> accessControlAttributes;

    public Optional<Output<List<InstanceAccessControlAttributeConfigurationAccessControlAttributeArgs>>> accessControlAttributes() {
        return Optional.ofNullable(this.accessControlAttributes);
    }

    /**
     * The InstanceAccessControlAttributeConfiguration property has been deprecated but is still supported for backwards compatibility purposes. We recomend that you use  AccessControlAttributes property instead.
     * 
     */
    @Import(name="instanceAccessControlAttributeConfiguration")
    private @Nullable Output<InstanceAccessControlAttributeConfigurationPropertiesArgs> instanceAccessControlAttributeConfiguration;

    /**
     * @return The InstanceAccessControlAttributeConfiguration property has been deprecated but is still supported for backwards compatibility purposes. We recomend that you use  AccessControlAttributes property instead.
     * 
     */
    public Optional<Output<InstanceAccessControlAttributeConfigurationPropertiesArgs>> instanceAccessControlAttributeConfiguration() {
        return Optional.ofNullable(this.instanceAccessControlAttributeConfiguration);
    }

    /**
     * The ARN of the AWS SSO instance under which the operation will be executed.
     * 
     */
    @Import(name="instanceArn", required=true)
    private Output<String> instanceArn;

    /**
     * @return The ARN of the AWS SSO instance under which the operation will be executed.
     * 
     */
    public Output<String> instanceArn() {
        return this.instanceArn;
    }

    private InstanceAccessControlAttributeConfigurationArgs() {}

    private InstanceAccessControlAttributeConfigurationArgs(InstanceAccessControlAttributeConfigurationArgs $) {
        this.accessControlAttributes = $.accessControlAttributes;
        this.instanceAccessControlAttributeConfiguration = $.instanceAccessControlAttributeConfiguration;
        this.instanceArn = $.instanceArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceAccessControlAttributeConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceAccessControlAttributeConfigurationArgs $;

        public Builder() {
            $ = new InstanceAccessControlAttributeConfigurationArgs();
        }

        public Builder(InstanceAccessControlAttributeConfigurationArgs defaults) {
            $ = new InstanceAccessControlAttributeConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessControlAttributes(@Nullable Output<List<InstanceAccessControlAttributeConfigurationAccessControlAttributeArgs>> accessControlAttributes) {
            $.accessControlAttributes = accessControlAttributes;
            return this;
        }

        public Builder accessControlAttributes(List<InstanceAccessControlAttributeConfigurationAccessControlAttributeArgs> accessControlAttributes) {
            return accessControlAttributes(Output.of(accessControlAttributes));
        }

        public Builder accessControlAttributes(InstanceAccessControlAttributeConfigurationAccessControlAttributeArgs... accessControlAttributes) {
            return accessControlAttributes(List.of(accessControlAttributes));
        }

        /**
         * @param instanceAccessControlAttributeConfiguration The InstanceAccessControlAttributeConfiguration property has been deprecated but is still supported for backwards compatibility purposes. We recomend that you use  AccessControlAttributes property instead.
         * 
         * @return builder
         * 
         */
        public Builder instanceAccessControlAttributeConfiguration(@Nullable Output<InstanceAccessControlAttributeConfigurationPropertiesArgs> instanceAccessControlAttributeConfiguration) {
            $.instanceAccessControlAttributeConfiguration = instanceAccessControlAttributeConfiguration;
            return this;
        }

        /**
         * @param instanceAccessControlAttributeConfiguration The InstanceAccessControlAttributeConfiguration property has been deprecated but is still supported for backwards compatibility purposes. We recomend that you use  AccessControlAttributes property instead.
         * 
         * @return builder
         * 
         */
        public Builder instanceAccessControlAttributeConfiguration(InstanceAccessControlAttributeConfigurationPropertiesArgs instanceAccessControlAttributeConfiguration) {
            return instanceAccessControlAttributeConfiguration(Output.of(instanceAccessControlAttributeConfiguration));
        }

        /**
         * @param instanceArn The ARN of the AWS SSO instance under which the operation will be executed.
         * 
         * @return builder
         * 
         */
        public Builder instanceArn(Output<String> instanceArn) {
            $.instanceArn = instanceArn;
            return this;
        }

        /**
         * @param instanceArn The ARN of the AWS SSO instance under which the operation will be executed.
         * 
         * @return builder
         * 
         */
        public Builder instanceArn(String instanceArn) {
            return instanceArn(Output.of(instanceArn));
        }

        public InstanceAccessControlAttributeConfigurationArgs build() {
            $.instanceArn = Objects.requireNonNull($.instanceArn, "expected parameter 'instanceArn' to be non-null");
            return $;
        }
    }

}
