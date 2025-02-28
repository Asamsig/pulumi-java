// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.tags;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.tags.inputs.TagValueIamBindingConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TagValueIamBindingArgs extends com.pulumi.resources.ResourceArgs {

    public static final TagValueIamBindingArgs Empty = new TagValueIamBindingArgs();

    @Import(name="condition")
    private @Nullable Output<TagValueIamBindingConditionArgs> condition;

    public Optional<Output<TagValueIamBindingConditionArgs>> condition() {
        return Optional.ofNullable(this.condition);
    }

    @Import(name="members", required=true)
    private Output<List<String>> members;

    public Output<List<String>> members() {
        return this.members;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.tags.TagValueIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role", required=true)
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.tags.TagValueIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    public Output<String> role() {
        return this.role;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="tagValue", required=true)
    private Output<String> tagValue;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> tagValue() {
        return this.tagValue;
    }

    private TagValueIamBindingArgs() {}

    private TagValueIamBindingArgs(TagValueIamBindingArgs $) {
        this.condition = $.condition;
        this.members = $.members;
        this.role = $.role;
        this.tagValue = $.tagValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TagValueIamBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TagValueIamBindingArgs $;

        public Builder() {
            $ = new TagValueIamBindingArgs();
        }

        public Builder(TagValueIamBindingArgs defaults) {
            $ = new TagValueIamBindingArgs(Objects.requireNonNull(defaults));
        }

        public Builder condition(@Nullable Output<TagValueIamBindingConditionArgs> condition) {
            $.condition = condition;
            return this;
        }

        public Builder condition(TagValueIamBindingConditionArgs condition) {
            return condition(Output.of(condition));
        }

        public Builder members(Output<List<String>> members) {
            $.members = members;
            return this;
        }

        public Builder members(List<String> members) {
            return members(Output.of(members));
        }

        public Builder members(String... members) {
            return members(List.of(members));
        }

        /**
         * @param role The role that should be applied. Only one
         * `gcp.tags.TagValueIamBinding` can be used per role. Note that custom roles must be of the format
         * `[projects|organizations]/{parent-name}/roles/{role-name}`.
         * 
         * @return builder
         * 
         */
        public Builder role(Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The role that should be applied. Only one
         * `gcp.tags.TagValueIamBinding` can be used per role. Note that custom roles must be of the format
         * `[projects|organizations]/{parent-name}/roles/{role-name}`.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        /**
         * @param tagValue Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder tagValue(Output<String> tagValue) {
            $.tagValue = tagValue;
            return this;
        }

        /**
         * @param tagValue Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder tagValue(String tagValue) {
            return tagValue(Output.of(tagValue));
        }

        public TagValueIamBindingArgs build() {
            $.members = Objects.requireNonNull($.members, "expected parameter 'members' to be non-null");
            $.role = Objects.requireNonNull($.role, "expected parameter 'role' to be non-null");
            $.tagValue = Objects.requireNonNull($.tagValue, "expected parameter 'tagValue' to be non-null");
            return $;
        }
    }

}
