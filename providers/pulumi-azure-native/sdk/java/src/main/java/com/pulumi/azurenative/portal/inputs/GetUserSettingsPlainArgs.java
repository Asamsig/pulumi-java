// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.portal.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetUserSettingsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetUserSettingsPlainArgs Empty = new GetUserSettingsPlainArgs();

    /**
     * The name of the user settings
     * 
     */
    @Import(name="userSettingsName", required=true)
    private String userSettingsName;

    /**
     * @return The name of the user settings
     * 
     */
    public String userSettingsName() {
        return this.userSettingsName;
    }

    private GetUserSettingsPlainArgs() {}

    private GetUserSettingsPlainArgs(GetUserSettingsPlainArgs $) {
        this.userSettingsName = $.userSettingsName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUserSettingsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUserSettingsPlainArgs $;

        public Builder() {
            $ = new GetUserSettingsPlainArgs();
        }

        public Builder(GetUserSettingsPlainArgs defaults) {
            $ = new GetUserSettingsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param userSettingsName The name of the user settings
         * 
         * @return builder
         * 
         */
        public Builder userSettingsName(String userSettingsName) {
            $.userSettingsName = userSettingsName;
            return this;
        }

        public GetUserSettingsPlainArgs build() {
            $.userSettingsName = Objects.requireNonNull($.userSettingsName, "expected parameter 'userSettingsName' to be non-null");
            return $;
        }
    }

}
