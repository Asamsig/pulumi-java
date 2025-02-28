// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ram.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceShareState extends com.pulumi.resources.ResourceArgs {

    public static final ResourceShareState Empty = new ResourceShareState();

    /**
     * Indicates whether principals outside your organization can be associated with a resource share.
     * 
     */
    @Import(name="allowExternalPrincipals")
    private @Nullable Output<Boolean> allowExternalPrincipals;

    /**
     * @return Indicates whether principals outside your organization can be associated with a resource share.
     * 
     */
    public Optional<Output<Boolean>> allowExternalPrincipals() {
        return Optional.ofNullable(this.allowExternalPrincipals);
    }

    /**
     * The Amazon Resource Name (ARN) of the resource share.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the resource share.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The name of the resource share.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the resource share.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A map of tags to assign to the resource share. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource share. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private ResourceShareState() {}

    private ResourceShareState(ResourceShareState $) {
        this.allowExternalPrincipals = $.allowExternalPrincipals;
        this.arn = $.arn;
        this.name = $.name;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceShareState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceShareState $;

        public Builder() {
            $ = new ResourceShareState();
        }

        public Builder(ResourceShareState defaults) {
            $ = new ResourceShareState(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowExternalPrincipals Indicates whether principals outside your organization can be associated with a resource share.
         * 
         * @return builder
         * 
         */
        public Builder allowExternalPrincipals(@Nullable Output<Boolean> allowExternalPrincipals) {
            $.allowExternalPrincipals = allowExternalPrincipals;
            return this;
        }

        /**
         * @param allowExternalPrincipals Indicates whether principals outside your organization can be associated with a resource share.
         * 
         * @return builder
         * 
         */
        public Builder allowExternalPrincipals(Boolean allowExternalPrincipals) {
            return allowExternalPrincipals(Output.of(allowExternalPrincipals));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the resource share.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the resource share.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param name The name of the resource share.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the resource share.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tags A map of tags to assign to the resource share. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource share. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public ResourceShareState build() {
            return $;
        }
    }

}
