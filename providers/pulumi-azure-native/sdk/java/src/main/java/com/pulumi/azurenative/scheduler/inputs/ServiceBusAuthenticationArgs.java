// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.scheduler.inputs;

import com.pulumi.azurenative.scheduler.enums.ServiceBusAuthenticationType;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceBusAuthenticationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceBusAuthenticationArgs Empty = new ServiceBusAuthenticationArgs();

    /**
     * Gets or sets the SAS key.
     * 
     */
    @Import(name="sasKey")
    private @Nullable Output<String> sasKey;

    /**
     * @return Gets or sets the SAS key.
     * 
     */
    public Optional<Output<String>> sasKey() {
        return Optional.ofNullable(this.sasKey);
    }

    /**
     * Gets or sets the SAS key name.
     * 
     */
    @Import(name="sasKeyName")
    private @Nullable Output<String> sasKeyName;

    /**
     * @return Gets or sets the SAS key name.
     * 
     */
    public Optional<Output<String>> sasKeyName() {
        return Optional.ofNullable(this.sasKeyName);
    }

    /**
     * Gets or sets the authentication type.
     * 
     */
    @Import(name="type")
    private @Nullable Output<ServiceBusAuthenticationType> type;

    /**
     * @return Gets or sets the authentication type.
     * 
     */
    public Optional<Output<ServiceBusAuthenticationType>> type() {
        return Optional.ofNullable(this.type);
    }

    private ServiceBusAuthenticationArgs() {}

    private ServiceBusAuthenticationArgs(ServiceBusAuthenticationArgs $) {
        this.sasKey = $.sasKey;
        this.sasKeyName = $.sasKeyName;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceBusAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceBusAuthenticationArgs $;

        public Builder() {
            $ = new ServiceBusAuthenticationArgs();
        }

        public Builder(ServiceBusAuthenticationArgs defaults) {
            $ = new ServiceBusAuthenticationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param sasKey Gets or sets the SAS key.
         * 
         * @return builder
         * 
         */
        public Builder sasKey(@Nullable Output<String> sasKey) {
            $.sasKey = sasKey;
            return this;
        }

        /**
         * @param sasKey Gets or sets the SAS key.
         * 
         * @return builder
         * 
         */
        public Builder sasKey(String sasKey) {
            return sasKey(Output.of(sasKey));
        }

        /**
         * @param sasKeyName Gets or sets the SAS key name.
         * 
         * @return builder
         * 
         */
        public Builder sasKeyName(@Nullable Output<String> sasKeyName) {
            $.sasKeyName = sasKeyName;
            return this;
        }

        /**
         * @param sasKeyName Gets or sets the SAS key name.
         * 
         * @return builder
         * 
         */
        public Builder sasKeyName(String sasKeyName) {
            return sasKeyName(Output.of(sasKeyName));
        }

        /**
         * @param type Gets or sets the authentication type.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<ServiceBusAuthenticationType> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Gets or sets the authentication type.
         * 
         * @return builder
         * 
         */
        public Builder type(ServiceBusAuthenticationType type) {
            return type(Output.of(type));
        }

        public ServiceBusAuthenticationArgs build() {
            return $;
        }
    }

}
