// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudsearch.inputs;

import com.pulumi.aws.cloudsearch.inputs.DomainEndpointOptionsArgs;
import com.pulumi.aws.cloudsearch.inputs.DomainIndexFieldArgs;
import com.pulumi.aws.cloudsearch.inputs.DomainScalingParametersArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainState extends com.pulumi.resources.ResourceArgs {

    public static final DomainState Empty = new DomainState();

    /**
     * The domain&#39;s ARN.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The domain&#39;s ARN.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The service endpoint for updating documents in a search domain.
     * 
     */
    @Import(name="documentServiceEndpoint")
    private @Nullable Output<String> documentServiceEndpoint;

    /**
     * @return The service endpoint for updating documents in a search domain.
     * 
     */
    public Optional<Output<String>> documentServiceEndpoint() {
        return Optional.ofNullable(this.documentServiceEndpoint);
    }

    /**
     * An internally generated unique identifier for the domain.
     * 
     */
    @Import(name="domainId")
    private @Nullable Output<String> domainId;

    /**
     * @return An internally generated unique identifier for the domain.
     * 
     */
    public Optional<Output<String>> domainId() {
        return Optional.ofNullable(this.domainId);
    }

    /**
     * Domain endpoint options. Documented below.
     * 
     */
    @Import(name="endpointOptions")
    private @Nullable Output<DomainEndpointOptionsArgs> endpointOptions;

    /**
     * @return Domain endpoint options. Documented below.
     * 
     */
    public Optional<Output<DomainEndpointOptionsArgs>> endpointOptions() {
        return Optional.ofNullable(this.endpointOptions);
    }

    /**
     * The index fields for documents added to the domain. Documented below.
     * 
     */
    @Import(name="indexFields")
    private @Nullable Output<List<DomainIndexFieldArgs>> indexFields;

    /**
     * @return The index fields for documents added to the domain. Documented below.
     * 
     */
    public Optional<Output<List<DomainIndexFieldArgs>>> indexFields() {
        return Optional.ofNullable(this.indexFields);
    }

    /**
     * Whether or not to maintain extra instances for the domain in a second Availability Zone to ensure high availability.
     * 
     */
    @Import(name="multiAz")
    private @Nullable Output<Boolean> multiAz;

    /**
     * @return Whether or not to maintain extra instances for the domain in a second Availability Zone to ensure high availability.
     * 
     */
    public Optional<Output<Boolean>> multiAz() {
        return Optional.ofNullable(this.multiAz);
    }

    /**
     * A unique name for the field. Field names must begin with a letter and be at least 3 and no more than 64 characters long. The allowed characters are: `a`-`z` (lower-case letters), `0`-`9`, and `_` (underscore). The name `score` is reserved and cannot be used as a field name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A unique name for the field. Field names must begin with a letter and be at least 3 and no more than 64 characters long. The allowed characters are: `a`-`z` (lower-case letters), `0`-`9`, and `_` (underscore). The name `score` is reserved and cannot be used as a field name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Domain scaling parameters. Documented below.
     * 
     */
    @Import(name="scalingParameters")
    private @Nullable Output<DomainScalingParametersArgs> scalingParameters;

    /**
     * @return Domain scaling parameters. Documented below.
     * 
     */
    public Optional<Output<DomainScalingParametersArgs>> scalingParameters() {
        return Optional.ofNullable(this.scalingParameters);
    }

    /**
     * The service endpoint for requesting search results from a search domain.
     * 
     */
    @Import(name="searchServiceEndpoint")
    private @Nullable Output<String> searchServiceEndpoint;

    /**
     * @return The service endpoint for requesting search results from a search domain.
     * 
     */
    public Optional<Output<String>> searchServiceEndpoint() {
        return Optional.ofNullable(this.searchServiceEndpoint);
    }

    private DomainState() {}

    private DomainState(DomainState $) {
        this.arn = $.arn;
        this.documentServiceEndpoint = $.documentServiceEndpoint;
        this.domainId = $.domainId;
        this.endpointOptions = $.endpointOptions;
        this.indexFields = $.indexFields;
        this.multiAz = $.multiAz;
        this.name = $.name;
        this.scalingParameters = $.scalingParameters;
        this.searchServiceEndpoint = $.searchServiceEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainState $;

        public Builder() {
            $ = new DomainState();
        }

        public Builder(DomainState defaults) {
            $ = new DomainState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The domain&#39;s ARN.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The domain&#39;s ARN.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param documentServiceEndpoint The service endpoint for updating documents in a search domain.
         * 
         * @return builder
         * 
         */
        public Builder documentServiceEndpoint(@Nullable Output<String> documentServiceEndpoint) {
            $.documentServiceEndpoint = documentServiceEndpoint;
            return this;
        }

        /**
         * @param documentServiceEndpoint The service endpoint for updating documents in a search domain.
         * 
         * @return builder
         * 
         */
        public Builder documentServiceEndpoint(String documentServiceEndpoint) {
            return documentServiceEndpoint(Output.of(documentServiceEndpoint));
        }

        /**
         * @param domainId An internally generated unique identifier for the domain.
         * 
         * @return builder
         * 
         */
        public Builder domainId(@Nullable Output<String> domainId) {
            $.domainId = domainId;
            return this;
        }

        /**
         * @param domainId An internally generated unique identifier for the domain.
         * 
         * @return builder
         * 
         */
        public Builder domainId(String domainId) {
            return domainId(Output.of(domainId));
        }

        /**
         * @param endpointOptions Domain endpoint options. Documented below.
         * 
         * @return builder
         * 
         */
        public Builder endpointOptions(@Nullable Output<DomainEndpointOptionsArgs> endpointOptions) {
            $.endpointOptions = endpointOptions;
            return this;
        }

        /**
         * @param endpointOptions Domain endpoint options. Documented below.
         * 
         * @return builder
         * 
         */
        public Builder endpointOptions(DomainEndpointOptionsArgs endpointOptions) {
            return endpointOptions(Output.of(endpointOptions));
        }

        /**
         * @param indexFields The index fields for documents added to the domain. Documented below.
         * 
         * @return builder
         * 
         */
        public Builder indexFields(@Nullable Output<List<DomainIndexFieldArgs>> indexFields) {
            $.indexFields = indexFields;
            return this;
        }

        /**
         * @param indexFields The index fields for documents added to the domain. Documented below.
         * 
         * @return builder
         * 
         */
        public Builder indexFields(List<DomainIndexFieldArgs> indexFields) {
            return indexFields(Output.of(indexFields));
        }

        /**
         * @param indexFields The index fields for documents added to the domain. Documented below.
         * 
         * @return builder
         * 
         */
        public Builder indexFields(DomainIndexFieldArgs... indexFields) {
            return indexFields(List.of(indexFields));
        }

        /**
         * @param multiAz Whether or not to maintain extra instances for the domain in a second Availability Zone to ensure high availability.
         * 
         * @return builder
         * 
         */
        public Builder multiAz(@Nullable Output<Boolean> multiAz) {
            $.multiAz = multiAz;
            return this;
        }

        /**
         * @param multiAz Whether or not to maintain extra instances for the domain in a second Availability Zone to ensure high availability.
         * 
         * @return builder
         * 
         */
        public Builder multiAz(Boolean multiAz) {
            return multiAz(Output.of(multiAz));
        }

        /**
         * @param name A unique name for the field. Field names must begin with a letter and be at least 3 and no more than 64 characters long. The allowed characters are: `a`-`z` (lower-case letters), `0`-`9`, and `_` (underscore). The name `score` is reserved and cannot be used as a field name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A unique name for the field. Field names must begin with a letter and be at least 3 and no more than 64 characters long. The allowed characters are: `a`-`z` (lower-case letters), `0`-`9`, and `_` (underscore). The name `score` is reserved and cannot be used as a field name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param scalingParameters Domain scaling parameters. Documented below.
         * 
         * @return builder
         * 
         */
        public Builder scalingParameters(@Nullable Output<DomainScalingParametersArgs> scalingParameters) {
            $.scalingParameters = scalingParameters;
            return this;
        }

        /**
         * @param scalingParameters Domain scaling parameters. Documented below.
         * 
         * @return builder
         * 
         */
        public Builder scalingParameters(DomainScalingParametersArgs scalingParameters) {
            return scalingParameters(Output.of(scalingParameters));
        }

        /**
         * @param searchServiceEndpoint The service endpoint for requesting search results from a search domain.
         * 
         * @return builder
         * 
         */
        public Builder searchServiceEndpoint(@Nullable Output<String> searchServiceEndpoint) {
            $.searchServiceEndpoint = searchServiceEndpoint;
            return this;
        }

        /**
         * @param searchServiceEndpoint The service endpoint for requesting search results from a search domain.
         * 
         * @return builder
         * 
         */
        public Builder searchServiceEndpoint(String searchServiceEndpoint) {
            return searchServiceEndpoint(Output.of(searchServiceEndpoint));
        }

        public DomainState build() {
            return $;
        }
    }

}
