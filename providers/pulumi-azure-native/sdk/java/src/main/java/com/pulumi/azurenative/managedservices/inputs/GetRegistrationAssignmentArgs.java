// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.managedservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegistrationAssignmentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegistrationAssignmentArgs Empty = new GetRegistrationAssignmentArgs();

    /**
     * Tells whether to return registration definition details also along with registration assignment details.
     * 
     */
    @Import(name="expandRegistrationDefinition")
    private @Nullable Output<Boolean> expandRegistrationDefinition;

    /**
     * @return Tells whether to return registration definition details also along with registration assignment details.
     * 
     */
    public Optional<Output<Boolean>> expandRegistrationDefinition() {
        return Optional.ofNullable(this.expandRegistrationDefinition);
    }

    /**
     * Guid of the registration assignment.
     * 
     */
    @Import(name="registrationAssignmentId", required=true)
    private Output<String> registrationAssignmentId;

    /**
     * @return Guid of the registration assignment.
     * 
     */
    public Output<String> registrationAssignmentId() {
        return this.registrationAssignmentId;
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

    private GetRegistrationAssignmentArgs() {}

    private GetRegistrationAssignmentArgs(GetRegistrationAssignmentArgs $) {
        this.expandRegistrationDefinition = $.expandRegistrationDefinition;
        this.registrationAssignmentId = $.registrationAssignmentId;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegistrationAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegistrationAssignmentArgs $;

        public Builder() {
            $ = new GetRegistrationAssignmentArgs();
        }

        public Builder(GetRegistrationAssignmentArgs defaults) {
            $ = new GetRegistrationAssignmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expandRegistrationDefinition Tells whether to return registration definition details also along with registration assignment details.
         * 
         * @return builder
         * 
         */
        public Builder expandRegistrationDefinition(@Nullable Output<Boolean> expandRegistrationDefinition) {
            $.expandRegistrationDefinition = expandRegistrationDefinition;
            return this;
        }

        /**
         * @param expandRegistrationDefinition Tells whether to return registration definition details also along with registration assignment details.
         * 
         * @return builder
         * 
         */
        public Builder expandRegistrationDefinition(Boolean expandRegistrationDefinition) {
            return expandRegistrationDefinition(Output.of(expandRegistrationDefinition));
        }

        /**
         * @param registrationAssignmentId Guid of the registration assignment.
         * 
         * @return builder
         * 
         */
        public Builder registrationAssignmentId(Output<String> registrationAssignmentId) {
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

        public GetRegistrationAssignmentArgs build() {
            $.registrationAssignmentId = Objects.requireNonNull($.registrationAssignmentId, "expected parameter 'registrationAssignmentId' to be non-null");
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            return $;
        }
    }

}
