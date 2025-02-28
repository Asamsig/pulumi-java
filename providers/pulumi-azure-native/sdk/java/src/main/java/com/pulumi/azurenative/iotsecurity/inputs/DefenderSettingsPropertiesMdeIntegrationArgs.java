// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.iotsecurity.inputs;

import com.pulumi.azurenative.iotsecurity.enums.MdeIntegration;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * MDE integration configuration
 * 
 */
public final class DefenderSettingsPropertiesMdeIntegrationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DefenderSettingsPropertiesMdeIntegrationArgs Empty = new DefenderSettingsPropertiesMdeIntegrationArgs();

    /**
     * Integration status
     * 
     */
    @Import(name="status", required=true)
    private Output<Either<String,MdeIntegration>> status;

    /**
     * @return Integration status
     * 
     */
    public Output<Either<String,MdeIntegration>> status() {
        return this.status;
    }

    private DefenderSettingsPropertiesMdeIntegrationArgs() {}

    private DefenderSettingsPropertiesMdeIntegrationArgs(DefenderSettingsPropertiesMdeIntegrationArgs $) {
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DefenderSettingsPropertiesMdeIntegrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DefenderSettingsPropertiesMdeIntegrationArgs $;

        public Builder() {
            $ = new DefenderSettingsPropertiesMdeIntegrationArgs();
        }

        public Builder(DefenderSettingsPropertiesMdeIntegrationArgs defaults) {
            $ = new DefenderSettingsPropertiesMdeIntegrationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param status Integration status
         * 
         * @return builder
         * 
         */
        public Builder status(Output<Either<String,MdeIntegration>> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Integration status
         * 
         * @return builder
         * 
         */
        public Builder status(Either<String,MdeIntegration> status) {
            return status(Output.of(status));
        }

        /**
         * @param status Integration status
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Either.ofLeft(status));
        }

        /**
         * @param status Integration status
         * 
         * @return builder
         * 
         */
        public Builder status(MdeIntegration status) {
            return status(Either.ofRight(status));
        }

        public DefenderSettingsPropertiesMdeIntegrationArgs build() {
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            return $;
        }
    }

}
