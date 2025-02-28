// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The AssignmentPrincipal
 * 
 */
public final class AssignmentPrincipalArgs extends com.pulumi.resources.ResourceArgs {

    public static final AssignmentPrincipalArgs Empty = new AssignmentPrincipalArgs();

    /**
     * The principal id being assigned to.
     * 
     */
    @Import(name="principalId", required=true)
    private Output<String> principalId;

    /**
     * @return The principal id being assigned to.
     * 
     */
    public Output<String> principalId() {
        return this.principalId;
    }

    /**
     * Other metadata for the principal.
     * 
     */
    @Import(name="principalMetadata")
    private @Nullable Output<Map<String,String>> principalMetadata;

    /**
     * @return Other metadata for the principal.
     * 
     */
    public Optional<Output<Map<String,String>>> principalMetadata() {
        return Optional.ofNullable(this.principalMetadata);
    }

    /**
     * The Type of the principal ID.
     * 
     */
    @Import(name="principalType", required=true)
    private Output<String> principalType;

    /**
     * @return The Type of the principal ID.
     * 
     */
    public Output<String> principalType() {
        return this.principalType;
    }

    private AssignmentPrincipalArgs() {}

    private AssignmentPrincipalArgs(AssignmentPrincipalArgs $) {
        this.principalId = $.principalId;
        this.principalMetadata = $.principalMetadata;
        this.principalType = $.principalType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AssignmentPrincipalArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AssignmentPrincipalArgs $;

        public Builder() {
            $ = new AssignmentPrincipalArgs();
        }

        public Builder(AssignmentPrincipalArgs defaults) {
            $ = new AssignmentPrincipalArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param principalId The principal id being assigned to.
         * 
         * @return builder
         * 
         */
        public Builder principalId(Output<String> principalId) {
            $.principalId = principalId;
            return this;
        }

        /**
         * @param principalId The principal id being assigned to.
         * 
         * @return builder
         * 
         */
        public Builder principalId(String principalId) {
            return principalId(Output.of(principalId));
        }

        /**
         * @param principalMetadata Other metadata for the principal.
         * 
         * @return builder
         * 
         */
        public Builder principalMetadata(@Nullable Output<Map<String,String>> principalMetadata) {
            $.principalMetadata = principalMetadata;
            return this;
        }

        /**
         * @param principalMetadata Other metadata for the principal.
         * 
         * @return builder
         * 
         */
        public Builder principalMetadata(Map<String,String> principalMetadata) {
            return principalMetadata(Output.of(principalMetadata));
        }

        /**
         * @param principalType The Type of the principal ID.
         * 
         * @return builder
         * 
         */
        public Builder principalType(Output<String> principalType) {
            $.principalType = principalType;
            return this;
        }

        /**
         * @param principalType The Type of the principal ID.
         * 
         * @return builder
         * 
         */
        public Builder principalType(String principalType) {
            return principalType(Output.of(principalType));
        }

        public AssignmentPrincipalArgs build() {
            $.principalId = Objects.requireNonNull($.principalId, "expected parameter 'principalId' to be non-null");
            $.principalType = Objects.requireNonNull($.principalType, "expected parameter 'principalType' to be non-null");
            return $;
        }
    }

}
