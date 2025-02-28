// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.SecureStringArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.util.Objects;


/**
 * SSIS package execution credential.
 * 
 */
public final class SSISExecutionCredentialArgs extends com.pulumi.resources.ResourceArgs {

    public static final SSISExecutionCredentialArgs Empty = new SSISExecutionCredentialArgs();

    /**
     * Domain for windows authentication.
     * 
     */
    @Import(name="domain", required=true)
    private Output<Object> domain;

    /**
     * @return Domain for windows authentication.
     * 
     */
    public Output<Object> domain() {
        return this.domain;
    }

    /**
     * Password for windows authentication.
     * 
     */
    @Import(name="password", required=true)
    private Output<SecureStringArgs> password;

    /**
     * @return Password for windows authentication.
     * 
     */
    public Output<SecureStringArgs> password() {
        return this.password;
    }

    /**
     * UseName for windows authentication.
     * 
     */
    @Import(name="userName", required=true)
    private Output<Object> userName;

    /**
     * @return UseName for windows authentication.
     * 
     */
    public Output<Object> userName() {
        return this.userName;
    }

    private SSISExecutionCredentialArgs() {}

    private SSISExecutionCredentialArgs(SSISExecutionCredentialArgs $) {
        this.domain = $.domain;
        this.password = $.password;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SSISExecutionCredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SSISExecutionCredentialArgs $;

        public Builder() {
            $ = new SSISExecutionCredentialArgs();
        }

        public Builder(SSISExecutionCredentialArgs defaults) {
            $ = new SSISExecutionCredentialArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domain Domain for windows authentication.
         * 
         * @return builder
         * 
         */
        public Builder domain(Output<Object> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain Domain for windows authentication.
         * 
         * @return builder
         * 
         */
        public Builder domain(Object domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param password Password for windows authentication.
         * 
         * @return builder
         * 
         */
        public Builder password(Output<SecureStringArgs> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Password for windows authentication.
         * 
         * @return builder
         * 
         */
        public Builder password(SecureStringArgs password) {
            return password(Output.of(password));
        }

        /**
         * @param userName UseName for windows authentication.
         * 
         * @return builder
         * 
         */
        public Builder userName(Output<Object> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName UseName for windows authentication.
         * 
         * @return builder
         * 
         */
        public Builder userName(Object userName) {
            return userName(Output.of(userName));
        }

        public SSISExecutionCredentialArgs build() {
            $.domain = Objects.requireNonNull($.domain, "expected parameter 'domain' to be non-null");
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.userName = Objects.requireNonNull($.userName, "expected parameter 'userName' to be non-null");
            return $;
        }
    }

}
