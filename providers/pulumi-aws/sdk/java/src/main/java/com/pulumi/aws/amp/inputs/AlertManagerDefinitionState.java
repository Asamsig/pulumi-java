// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.amp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlertManagerDefinitionState extends com.pulumi.resources.ResourceArgs {

    public static final AlertManagerDefinitionState Empty = new AlertManagerDefinitionState();

    /**
     * the alert manager definition that you want to be applied. See more [in AWS Docs](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-alert-manager.html).
     * 
     */
    @Import(name="definition")
    private @Nullable Output<String> definition;

    /**
     * @return the alert manager definition that you want to be applied. See more [in AWS Docs](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-alert-manager.html).
     * 
     */
    public Optional<Output<String>> definition() {
        return Optional.ofNullable(this.definition);
    }

    /**
     * The id of the prometheus workspace the alert manager definition should be linked to
     * 
     */
    @Import(name="workspaceId")
    private @Nullable Output<String> workspaceId;

    /**
     * @return The id of the prometheus workspace the alert manager definition should be linked to
     * 
     */
    public Optional<Output<String>> workspaceId() {
        return Optional.ofNullable(this.workspaceId);
    }

    private AlertManagerDefinitionState() {}

    private AlertManagerDefinitionState(AlertManagerDefinitionState $) {
        this.definition = $.definition;
        this.workspaceId = $.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertManagerDefinitionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertManagerDefinitionState $;

        public Builder() {
            $ = new AlertManagerDefinitionState();
        }

        public Builder(AlertManagerDefinitionState defaults) {
            $ = new AlertManagerDefinitionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param definition the alert manager definition that you want to be applied. See more [in AWS Docs](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-alert-manager.html).
         * 
         * @return builder
         * 
         */
        public Builder definition(@Nullable Output<String> definition) {
            $.definition = definition;
            return this;
        }

        /**
         * @param definition the alert manager definition that you want to be applied. See more [in AWS Docs](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-alert-manager.html).
         * 
         * @return builder
         * 
         */
        public Builder definition(String definition) {
            return definition(Output.of(definition));
        }

        /**
         * @param workspaceId The id of the prometheus workspace the alert manager definition should be linked to
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(@Nullable Output<String> workspaceId) {
            $.workspaceId = workspaceId;
            return this;
        }

        /**
         * @param workspaceId The id of the prometheus workspace the alert manager definition should be linked to
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(String workspaceId) {
            return workspaceId(Output.of(workspaceId));
        }

        public AlertManagerDefinitionState build() {
            return $;
        }
    }

}
