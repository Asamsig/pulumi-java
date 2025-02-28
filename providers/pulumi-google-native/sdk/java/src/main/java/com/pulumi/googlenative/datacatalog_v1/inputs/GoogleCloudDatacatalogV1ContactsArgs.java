// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datacatalog_v1.inputs.GoogleCloudDatacatalogV1ContactsPersonArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contact people for the entry.
 * 
 */
public final class GoogleCloudDatacatalogV1ContactsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatacatalogV1ContactsArgs Empty = new GoogleCloudDatacatalogV1ContactsArgs();

    /**
     * The list of contact people for the entry.
     * 
     */
    @Import(name="people")
    private @Nullable Output<List<GoogleCloudDatacatalogV1ContactsPersonArgs>> people;

    /**
     * @return The list of contact people for the entry.
     * 
     */
    public Optional<Output<List<GoogleCloudDatacatalogV1ContactsPersonArgs>>> people() {
        return Optional.ofNullable(this.people);
    }

    private GoogleCloudDatacatalogV1ContactsArgs() {}

    private GoogleCloudDatacatalogV1ContactsArgs(GoogleCloudDatacatalogV1ContactsArgs $) {
        this.people = $.people;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDatacatalogV1ContactsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDatacatalogV1ContactsArgs $;

        public Builder() {
            $ = new GoogleCloudDatacatalogV1ContactsArgs();
        }

        public Builder(GoogleCloudDatacatalogV1ContactsArgs defaults) {
            $ = new GoogleCloudDatacatalogV1ContactsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param people The list of contact people for the entry.
         * 
         * @return builder
         * 
         */
        public Builder people(@Nullable Output<List<GoogleCloudDatacatalogV1ContactsPersonArgs>> people) {
            $.people = people;
            return this;
        }

        /**
         * @param people The list of contact people for the entry.
         * 
         * @return builder
         * 
         */
        public Builder people(List<GoogleCloudDatacatalogV1ContactsPersonArgs> people) {
            return people(Output.of(people));
        }

        /**
         * @param people The list of contact people for the entry.
         * 
         * @return builder
         * 
         */
        public Builder people(GoogleCloudDatacatalogV1ContactsPersonArgs... people) {
            return people(List.of(people));
        }

        public GoogleCloudDatacatalogV1ContactsArgs build() {
            return $;
        }
    }

}
