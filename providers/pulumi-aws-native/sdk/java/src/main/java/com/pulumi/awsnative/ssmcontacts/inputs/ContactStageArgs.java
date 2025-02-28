// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ssmcontacts.inputs;

import com.pulumi.awsnative.ssmcontacts.inputs.ContactTargetsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A set amount of time that an escalation plan or engagement plan engages the specified contacts or contact methods.
 * 
 */
public final class ContactStageArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContactStageArgs Empty = new ContactStageArgs();

    /**
     * The time to wait until beginning the next stage.
     * 
     */
    @Import(name="durationInMinutes", required=true)
    private Output<Integer> durationInMinutes;

    /**
     * @return The time to wait until beginning the next stage.
     * 
     */
    public Output<Integer> durationInMinutes() {
        return this.durationInMinutes;
    }

    /**
     * The contacts or contact methods that the escalation plan or engagement plan is engaging.
     * 
     */
    @Import(name="targets")
    private @Nullable Output<List<ContactTargetsArgs>> targets;

    /**
     * @return The contacts or contact methods that the escalation plan or engagement plan is engaging.
     * 
     */
    public Optional<Output<List<ContactTargetsArgs>>> targets() {
        return Optional.ofNullable(this.targets);
    }

    private ContactStageArgs() {}

    private ContactStageArgs(ContactStageArgs $) {
        this.durationInMinutes = $.durationInMinutes;
        this.targets = $.targets;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContactStageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContactStageArgs $;

        public Builder() {
            $ = new ContactStageArgs();
        }

        public Builder(ContactStageArgs defaults) {
            $ = new ContactStageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param durationInMinutes The time to wait until beginning the next stage.
         * 
         * @return builder
         * 
         */
        public Builder durationInMinutes(Output<Integer> durationInMinutes) {
            $.durationInMinutes = durationInMinutes;
            return this;
        }

        /**
         * @param durationInMinutes The time to wait until beginning the next stage.
         * 
         * @return builder
         * 
         */
        public Builder durationInMinutes(Integer durationInMinutes) {
            return durationInMinutes(Output.of(durationInMinutes));
        }

        /**
         * @param targets The contacts or contact methods that the escalation plan or engagement plan is engaging.
         * 
         * @return builder
         * 
         */
        public Builder targets(@Nullable Output<List<ContactTargetsArgs>> targets) {
            $.targets = targets;
            return this;
        }

        /**
         * @param targets The contacts or contact methods that the escalation plan or engagement plan is engaging.
         * 
         * @return builder
         * 
         */
        public Builder targets(List<ContactTargetsArgs> targets) {
            return targets(Output.of(targets));
        }

        /**
         * @param targets The contacts or contact methods that the escalation plan or engagement plan is engaging.
         * 
         * @return builder
         * 
         */
        public Builder targets(ContactTargetsArgs... targets) {
            return targets(List.of(targets));
        }

        public ContactStageArgs build() {
            $.durationInMinutes = Objects.requireNonNull($.durationInMinutes, "expected parameter 'durationInMinutes' to be non-null");
            return $;
        }
    }

}
