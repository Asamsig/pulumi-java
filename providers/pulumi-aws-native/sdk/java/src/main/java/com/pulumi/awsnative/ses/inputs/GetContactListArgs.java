// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ses.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetContactListArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetContactListArgs Empty = new GetContactListArgs();

    /**
     * The name of the contact list.
     * 
     */
    @Import(name="contactListName", required=true)
    private Output<String> contactListName;

    /**
     * @return The name of the contact list.
     * 
     */
    public Output<String> contactListName() {
        return this.contactListName;
    }

    private GetContactListArgs() {}

    private GetContactListArgs(GetContactListArgs $) {
        this.contactListName = $.contactListName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetContactListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetContactListArgs $;

        public Builder() {
            $ = new GetContactListArgs();
        }

        public Builder(GetContactListArgs defaults) {
            $ = new GetContactListArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param contactListName The name of the contact list.
         * 
         * @return builder
         * 
         */
        public Builder contactListName(Output<String> contactListName) {
            $.contactListName = contactListName;
            return this;
        }

        /**
         * @param contactListName The name of the contact list.
         * 
         * @return builder
         * 
         */
        public Builder contactListName(String contactListName) {
            return contactListName(Output.of(contactListName));
        }

        public GetContactListArgs build() {
            $.contactListName = Objects.requireNonNull($.contactListName, "expected parameter 'contactListName' to be non-null");
            return $;
        }
    }

}
