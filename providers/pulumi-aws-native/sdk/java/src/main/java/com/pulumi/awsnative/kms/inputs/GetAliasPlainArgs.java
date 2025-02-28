// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kms.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAliasPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAliasPlainArgs Empty = new GetAliasPlainArgs();

    /**
     * Specifies the alias name. This value must begin with alias/ followed by a name, such as alias/ExampleAlias. The alias name cannot begin with alias/aws/. The alias/aws/ prefix is reserved for AWS managed CMKs.
     * 
     */
    @Import(name="aliasName", required=true)
    private String aliasName;

    /**
     * @return Specifies the alias name. This value must begin with alias/ followed by a name, such as alias/ExampleAlias. The alias name cannot begin with alias/aws/. The alias/aws/ prefix is reserved for AWS managed CMKs.
     * 
     */
    public String aliasName() {
        return this.aliasName;
    }

    private GetAliasPlainArgs() {}

    private GetAliasPlainArgs(GetAliasPlainArgs $) {
        this.aliasName = $.aliasName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAliasPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAliasPlainArgs $;

        public Builder() {
            $ = new GetAliasPlainArgs();
        }

        public Builder(GetAliasPlainArgs defaults) {
            $ = new GetAliasPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aliasName Specifies the alias name. This value must begin with alias/ followed by a name, such as alias/ExampleAlias. The alias name cannot begin with alias/aws/. The alias/aws/ prefix is reserved for AWS managed CMKs.
         * 
         * @return builder
         * 
         */
        public Builder aliasName(String aliasName) {
            $.aliasName = aliasName;
            return this;
        }

        public GetAliasPlainArgs build() {
            $.aliasName = Objects.requireNonNull($.aliasName, "expected parameter 'aliasName' to be non-null");
            return $;
        }
    }

}
