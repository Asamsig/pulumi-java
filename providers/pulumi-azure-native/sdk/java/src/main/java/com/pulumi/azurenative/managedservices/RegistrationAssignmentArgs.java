// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.managedservices;

import com.pulumi.azurenative.managedservices.inputs.RegistrationAssignmentPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegistrationAssignmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegistrationAssignmentArgs Empty = new RegistrationAssignmentArgs();

    /**
     * Properties of a registration assignment.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<RegistrationAssignmentPropertiesArgs> properties;

    /**
     * @return Properties of a registration assignment.
     * 
     */
    public Optional<Output<RegistrationAssignmentPropertiesArgs>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * Guid of the registration assignment.
     * 
     */
    @Import(name="registrationAssignmentId")
    private @Nullable Output<String> registrationAssignmentId;

    /**
     * @return Guid of the registration assignment.
     * 
     */
    public Optional<Output<String>> registrationAssignmentId() {
        return Optional.ofNullable(this.registrationAssignmentId);
    }

    /**
     * Scope of the resource.
     * 
     */
    @Import(name="scope", required=true)
    private Output<String> scope;

    /**
     * @return Scope of the resource.
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }

    private RegistrationAssignmentArgs() {}

    private RegistrationAssignmentArgs(RegistrationAssignmentArgs $) {
        this.properties = $.properties;
        this.registrationAssignmentId = $.registrationAssignmentId;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegistrationAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegistrationAssignmentArgs $;

        public Builder() {
            $ = new RegistrationAssignmentArgs();
        }

        public Builder(RegistrationAssignmentArgs defaults) {
            $ = new RegistrationAssignmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param properties Properties of a registration assignment.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<RegistrationAssignmentPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Properties of a registration assignment.
         * 
         * @return builder
         * 
         */
        public Builder properties(RegistrationAssignmentPropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param registrationAssignmentId Guid of the registration assignment.
         * 
         * @return builder
         * 
         */
        public Builder registrationAssignmentId(@Nullable Output<String> registrationAssignmentId) {
            $.registrationAssignmentId = registrationAssignmentId;
            return this;
        }

        /**
         * @param registrationAssignmentId Guid of the registration assignment.
         * 
         * @return builder
         * 
         */
        public Builder registrationAssignmentId(String registrationAssignmentId) {
            return registrationAssignmentId(Output.of(registrationAssignmentId));
        }

        /**
         * @param scope Scope of the resource.
         * 
         * @return builder
         * 
         */
        public Builder scope(Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope Scope of the resource.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public RegistrationAssignmentArgs build() {
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            return $;
        }
    }

}
