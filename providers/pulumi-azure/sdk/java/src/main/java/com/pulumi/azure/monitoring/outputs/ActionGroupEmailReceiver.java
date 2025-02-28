// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ActionGroupEmailReceiver {
    /**
     * @return The email address of this receiver.
     * 
     */
    private final String emailAddress;
    /**
     * @return The name of the email receiver. Names must be unique (case-insensitive) across all receivers within an action group.
     * 
     */
    private final String name;
    /**
     * @return Enables or disables the common alert schema.
     * 
     */
    private final @Nullable Boolean useCommonAlertSchema;

    @CustomType.Constructor
    private ActionGroupEmailReceiver(
        @CustomType.Parameter("emailAddress") String emailAddress,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("useCommonAlertSchema") @Nullable Boolean useCommonAlertSchema) {
        this.emailAddress = emailAddress;
        this.name = name;
        this.useCommonAlertSchema = useCommonAlertSchema;
    }

    /**
     * @return The email address of this receiver.
     * 
     */
    public String emailAddress() {
        return this.emailAddress;
    }
    /**
     * @return The name of the email receiver. Names must be unique (case-insensitive) across all receivers within an action group.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Enables or disables the common alert schema.
     * 
     */
    public Optional<Boolean> useCommonAlertSchema() {
        return Optional.ofNullable(this.useCommonAlertSchema);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActionGroupEmailReceiver defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String emailAddress;
        private String name;
        private @Nullable Boolean useCommonAlertSchema;

        public Builder() {
    	      // Empty
        }

        public Builder(ActionGroupEmailReceiver defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.emailAddress = defaults.emailAddress;
    	      this.name = defaults.name;
    	      this.useCommonAlertSchema = defaults.useCommonAlertSchema;
        }

        public Builder emailAddress(String emailAddress) {
            this.emailAddress = Objects.requireNonNull(emailAddress);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder useCommonAlertSchema(@Nullable Boolean useCommonAlertSchema) {
            this.useCommonAlertSchema = useCommonAlertSchema;
            return this;
        }        public ActionGroupEmailReceiver build() {
            return new ActionGroupEmailReceiver(emailAddress, name, useCommonAlertSchema);
        }
    }
}
