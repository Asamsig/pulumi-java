// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.backup.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFrameworkPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFrameworkPlainArgs Empty = new GetFrameworkPlainArgs();

    /**
     * The backup framework name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The backup framework name.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The tag key-value pair applied to those AWS resources that you want to trigger an evaluation for a rule. A maximum of one key-value pair can be provided.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return The tag key-value pair applied to those AWS resources that you want to trigger an evaluation for a rule. A maximum of one key-value pair can be provided.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetFrameworkPlainArgs() {}

    private GetFrameworkPlainArgs(GetFrameworkPlainArgs $) {
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFrameworkPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFrameworkPlainArgs $;

        public Builder() {
            $ = new GetFrameworkPlainArgs();
        }

        public Builder(GetFrameworkPlainArgs defaults) {
            $ = new GetFrameworkPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The backup framework name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param tags The tag key-value pair applied to those AWS resources that you want to trigger an evaluation for a rule. A maximum of one key-value pair can be provided.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetFrameworkPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
