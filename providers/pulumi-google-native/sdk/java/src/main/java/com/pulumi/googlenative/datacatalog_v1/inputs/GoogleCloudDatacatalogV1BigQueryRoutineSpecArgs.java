// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Fields specific for BigQuery routines.
 * 
 */
public final class GoogleCloudDatacatalogV1BigQueryRoutineSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatacatalogV1BigQueryRoutineSpecArgs Empty = new GoogleCloudDatacatalogV1BigQueryRoutineSpecArgs();

    /**
     * Paths of the imported libraries.
     * 
     */
    @Import(name="importedLibraries")
    private @Nullable Output<List<String>> importedLibraries;

    /**
     * @return Paths of the imported libraries.
     * 
     */
    public Optional<Output<List<String>>> importedLibraries() {
        return Optional.ofNullable(this.importedLibraries);
    }

    private GoogleCloudDatacatalogV1BigQueryRoutineSpecArgs() {}

    private GoogleCloudDatacatalogV1BigQueryRoutineSpecArgs(GoogleCloudDatacatalogV1BigQueryRoutineSpecArgs $) {
        this.importedLibraries = $.importedLibraries;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDatacatalogV1BigQueryRoutineSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDatacatalogV1BigQueryRoutineSpecArgs $;

        public Builder() {
            $ = new GoogleCloudDatacatalogV1BigQueryRoutineSpecArgs();
        }

        public Builder(GoogleCloudDatacatalogV1BigQueryRoutineSpecArgs defaults) {
            $ = new GoogleCloudDatacatalogV1BigQueryRoutineSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param importedLibraries Paths of the imported libraries.
         * 
         * @return builder
         * 
         */
        public Builder importedLibraries(@Nullable Output<List<String>> importedLibraries) {
            $.importedLibraries = importedLibraries;
            return this;
        }

        /**
         * @param importedLibraries Paths of the imported libraries.
         * 
         * @return builder
         * 
         */
        public Builder importedLibraries(List<String> importedLibraries) {
            return importedLibraries(Output.of(importedLibraries));
        }

        /**
         * @param importedLibraries Paths of the imported libraries.
         * 
         * @return builder
         * 
         */
        public Builder importedLibraries(String... importedLibraries) {
            return importedLibraries(List.of(importedLibraries));
        }

        public GoogleCloudDatacatalogV1BigQueryRoutineSpecArgs build() {
            return $;
        }
    }

}
