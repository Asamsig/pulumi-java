// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.healthcare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.healthcare.inputs.FhirStoreNotificationConfigArgs;
import com.pulumi.gcp.healthcare.inputs.FhirStoreStreamConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FhirStoreArgs extends com.pulumi.resources.ResourceArgs {

    public static final FhirStoreArgs Empty = new FhirStoreArgs();

    /**
     * Identifies the dataset addressed by this request. Must be in the format
     * &#39;projects/{project}/locations/{location}/datasets/{dataset}&#39;
     * 
     */
    @Import(name="dataset", required=true)
    private Output<String> dataset;

    /**
     * @return Identifies the dataset addressed by this request. Must be in the format
     * &#39;projects/{project}/locations/{location}/datasets/{dataset}&#39;
     * 
     */
    public Output<String> dataset() {
        return this.dataset;
    }

    /**
     * Whether to disable referential integrity in this FHIR store. This field is immutable after FHIR store
     * creation. The default value is false, meaning that the API will enforce referential integrity and fail the
     * requests that will result in inconsistent state in the FHIR store. When this field is set to true, the API
     * will skip referential integrity check. Consequently, operations that rely on references, such as
     * Patient.get$everything, will not return all the results if broken references exist.
     * ** Changing this property may recreate the FHIR store (removing all data) **
     * 
     */
    @Import(name="disableReferentialIntegrity")
    private @Nullable Output<Boolean> disableReferentialIntegrity;

    /**
     * @return Whether to disable referential integrity in this FHIR store. This field is immutable after FHIR store
     * creation. The default value is false, meaning that the API will enforce referential integrity and fail the
     * requests that will result in inconsistent state in the FHIR store. When this field is set to true, the API
     * will skip referential integrity check. Consequently, operations that rely on references, such as
     * Patient.get$everything, will not return all the results if broken references exist.
     * ** Changing this property may recreate the FHIR store (removing all data) **
     * 
     */
    public Optional<Output<Boolean>> disableReferentialIntegrity() {
        return Optional.ofNullable(this.disableReferentialIntegrity);
    }

    /**
     * Whether to disable resource versioning for this FHIR store. This field can not be changed after the creation
     * of FHIR store. If set to false, which is the default behavior, all write operations will cause historical
     * versions to be recorded automatically. The historical versions can be fetched through the history APIs, but
     * cannot be updated. If set to true, no historical versions will be kept. The server will send back errors for
     * attempts to read the historical versions.
     * ** Changing this property may recreate the FHIR store (removing all data) **
     * 
     */
    @Import(name="disableResourceVersioning")
    private @Nullable Output<Boolean> disableResourceVersioning;

    /**
     * @return Whether to disable resource versioning for this FHIR store. This field can not be changed after the creation
     * of FHIR store. If set to false, which is the default behavior, all write operations will cause historical
     * versions to be recorded automatically. The historical versions can be fetched through the history APIs, but
     * cannot be updated. If set to true, no historical versions will be kept. The server will send back errors for
     * attempts to read the historical versions.
     * ** Changing this property may recreate the FHIR store (removing all data) **
     * 
     */
    public Optional<Output<Boolean>> disableResourceVersioning() {
        return Optional.ofNullable(this.disableResourceVersioning);
    }

    /**
     * Whether to allow the bulk import API to accept history bundles and directly insert historical resource
     * versions into the FHIR store. Importing resource histories creates resource interactions that appear to have
     * occurred in the past, which clients may not want to allow. If set to false, history bundles within an import
     * will fail with an error.
     * ** Changing this property may recreate the FHIR store (removing all data) **
     * ** This property can be changed manually in the Google Cloud Healthcare admin console without recreating the FHIR store **
     * 
     */
    @Import(name="enableHistoryImport")
    private @Nullable Output<Boolean> enableHistoryImport;

    /**
     * @return Whether to allow the bulk import API to accept history bundles and directly insert historical resource
     * versions into the FHIR store. Importing resource histories creates resource interactions that appear to have
     * occurred in the past, which clients may not want to allow. If set to false, history bundles within an import
     * will fail with an error.
     * ** Changing this property may recreate the FHIR store (removing all data) **
     * ** This property can be changed manually in the Google Cloud Healthcare admin console without recreating the FHIR store **
     * 
     */
    public Optional<Output<Boolean>> enableHistoryImport() {
        return Optional.ofNullable(this.enableHistoryImport);
    }

    /**
     * Whether this FHIR store has the updateCreate capability. This determines if the client can use an Update
     * operation to create a new resource with a client-specified ID. If false, all IDs are server-assigned through
     * the Create operation and attempts to Update a non-existent resource will return errors. Please treat the audit
     * logs with appropriate levels of care if client-specified resource IDs contain sensitive data such as patient
     * identifiers, those IDs will be part of the FHIR resource path recorded in Cloud audit logs and Cloud Pub/Sub
     * notifications.
     * 
     */
    @Import(name="enableUpdateCreate")
    private @Nullable Output<Boolean> enableUpdateCreate;

    /**
     * @return Whether this FHIR store has the updateCreate capability. This determines if the client can use an Update
     * operation to create a new resource with a client-specified ID. If false, all IDs are server-assigned through
     * the Create operation and attempts to Update a non-existent resource will return errors. Please treat the audit
     * logs with appropriate levels of care if client-specified resource IDs contain sensitive data such as patient
     * identifiers, those IDs will be part of the FHIR resource path recorded in Cloud audit logs and Cloud Pub/Sub
     * notifications.
     * 
     */
    public Optional<Output<Boolean>> enableUpdateCreate() {
        return Optional.ofNullable(this.enableUpdateCreate);
    }

    /**
     * User-supplied key-value pairs used to organize FHIR stores.
     * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must
     * conform to the following PCRE regular expression: [\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}
     * Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
     * bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}
     * No more than 64 labels can be associated with a given store.
     * An object containing a list of &#34;key&#34;: value pairs.
     * Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return User-supplied key-value pairs used to organize FHIR stores.
     * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must
     * conform to the following PCRE regular expression: [\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}
     * Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
     * bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}
     * No more than 64 labels can be associated with a given store.
     * An object containing a list of &#34;key&#34;: value pairs.
     * Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The resource name for the FhirStore.
     * ** Changing this property may recreate the FHIR store (removing all data) **
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The resource name for the FhirStore.
     * ** Changing this property may recreate the FHIR store (removing all data) **
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    @Import(name="notificationConfig")
    private @Nullable Output<FhirStoreNotificationConfigArgs> notificationConfig;

    /**
     * @return A nested object resource
     * Structure is documented below.
     * 
     */
    public Optional<Output<FhirStoreNotificationConfigArgs>> notificationConfig() {
        return Optional.ofNullable(this.notificationConfig);
    }

    /**
     * A list of streaming configs that configure the destinations of streaming export for every resource mutation in
     * this FHIR store. Each store is allowed to have up to 10 streaming configs. After a new config is added, the next
     * resource mutation is streamed to the new location in addition to the existing ones. When a location is removed
     * from the list, the server stops streaming to that location. Before adding a new config, you must add the required
     * bigquery.dataEditor role to your project&#39;s Cloud Healthcare Service Agent service account. Some lag (typically on
     * the order of dozens of seconds) is expected before the results show up in the streaming destination.
     * Structure is documented below.
     * 
     */
    @Import(name="streamConfigs")
    private @Nullable Output<List<FhirStoreStreamConfigArgs>> streamConfigs;

    /**
     * @return A list of streaming configs that configure the destinations of streaming export for every resource mutation in
     * this FHIR store. Each store is allowed to have up to 10 streaming configs. After a new config is added, the next
     * resource mutation is streamed to the new location in addition to the existing ones. When a location is removed
     * from the list, the server stops streaming to that location. Before adding a new config, you must add the required
     * bigquery.dataEditor role to your project&#39;s Cloud Healthcare Service Agent service account. Some lag (typically on
     * the order of dozens of seconds) is expected before the results show up in the streaming destination.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<FhirStoreStreamConfigArgs>>> streamConfigs() {
        return Optional.ofNullable(this.streamConfigs);
    }

    /**
     * The FHIR specification version.
     * Default value is `STU3`.
     * Possible values are `DSTU2`, `STU3`, and `R4`.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return The FHIR specification version.
     * Default value is `STU3`.
     * Possible values are `DSTU2`, `STU3`, and `R4`.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private FhirStoreArgs() {}

    private FhirStoreArgs(FhirStoreArgs $) {
        this.dataset = $.dataset;
        this.disableReferentialIntegrity = $.disableReferentialIntegrity;
        this.disableResourceVersioning = $.disableResourceVersioning;
        this.enableHistoryImport = $.enableHistoryImport;
        this.enableUpdateCreate = $.enableUpdateCreate;
        this.labels = $.labels;
        this.name = $.name;
        this.notificationConfig = $.notificationConfig;
        this.streamConfigs = $.streamConfigs;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FhirStoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FhirStoreArgs $;

        public Builder() {
            $ = new FhirStoreArgs();
        }

        public Builder(FhirStoreArgs defaults) {
            $ = new FhirStoreArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataset Identifies the dataset addressed by this request. Must be in the format
         * &#39;projects/{project}/locations/{location}/datasets/{dataset}&#39;
         * 
         * @return builder
         * 
         */
        public Builder dataset(Output<String> dataset) {
            $.dataset = dataset;
            return this;
        }

        /**
         * @param dataset Identifies the dataset addressed by this request. Must be in the format
         * &#39;projects/{project}/locations/{location}/datasets/{dataset}&#39;
         * 
         * @return builder
         * 
         */
        public Builder dataset(String dataset) {
            return dataset(Output.of(dataset));
        }

        /**
         * @param disableReferentialIntegrity Whether to disable referential integrity in this FHIR store. This field is immutable after FHIR store
         * creation. The default value is false, meaning that the API will enforce referential integrity and fail the
         * requests that will result in inconsistent state in the FHIR store. When this field is set to true, the API
         * will skip referential integrity check. Consequently, operations that rely on references, such as
         * Patient.get$everything, will not return all the results if broken references exist.
         * ** Changing this property may recreate the FHIR store (removing all data) **
         * 
         * @return builder
         * 
         */
        public Builder disableReferentialIntegrity(@Nullable Output<Boolean> disableReferentialIntegrity) {
            $.disableReferentialIntegrity = disableReferentialIntegrity;
            return this;
        }

        /**
         * @param disableReferentialIntegrity Whether to disable referential integrity in this FHIR store. This field is immutable after FHIR store
         * creation. The default value is false, meaning that the API will enforce referential integrity and fail the
         * requests that will result in inconsistent state in the FHIR store. When this field is set to true, the API
         * will skip referential integrity check. Consequently, operations that rely on references, such as
         * Patient.get$everything, will not return all the results if broken references exist.
         * ** Changing this property may recreate the FHIR store (removing all data) **
         * 
         * @return builder
         * 
         */
        public Builder disableReferentialIntegrity(Boolean disableReferentialIntegrity) {
            return disableReferentialIntegrity(Output.of(disableReferentialIntegrity));
        }

        /**
         * @param disableResourceVersioning Whether to disable resource versioning for this FHIR store. This field can not be changed after the creation
         * of FHIR store. If set to false, which is the default behavior, all write operations will cause historical
         * versions to be recorded automatically. The historical versions can be fetched through the history APIs, but
         * cannot be updated. If set to true, no historical versions will be kept. The server will send back errors for
         * attempts to read the historical versions.
         * ** Changing this property may recreate the FHIR store (removing all data) **
         * 
         * @return builder
         * 
         */
        public Builder disableResourceVersioning(@Nullable Output<Boolean> disableResourceVersioning) {
            $.disableResourceVersioning = disableResourceVersioning;
            return this;
        }

        /**
         * @param disableResourceVersioning Whether to disable resource versioning for this FHIR store. This field can not be changed after the creation
         * of FHIR store. If set to false, which is the default behavior, all write operations will cause historical
         * versions to be recorded automatically. The historical versions can be fetched through the history APIs, but
         * cannot be updated. If set to true, no historical versions will be kept. The server will send back errors for
         * attempts to read the historical versions.
         * ** Changing this property may recreate the FHIR store (removing all data) **
         * 
         * @return builder
         * 
         */
        public Builder disableResourceVersioning(Boolean disableResourceVersioning) {
            return disableResourceVersioning(Output.of(disableResourceVersioning));
        }

        /**
         * @param enableHistoryImport Whether to allow the bulk import API to accept history bundles and directly insert historical resource
         * versions into the FHIR store. Importing resource histories creates resource interactions that appear to have
         * occurred in the past, which clients may not want to allow. If set to false, history bundles within an import
         * will fail with an error.
         * ** Changing this property may recreate the FHIR store (removing all data) **
         * ** This property can be changed manually in the Google Cloud Healthcare admin console without recreating the FHIR store **
         * 
         * @return builder
         * 
         */
        public Builder enableHistoryImport(@Nullable Output<Boolean> enableHistoryImport) {
            $.enableHistoryImport = enableHistoryImport;
            return this;
        }

        /**
         * @param enableHistoryImport Whether to allow the bulk import API to accept history bundles and directly insert historical resource
         * versions into the FHIR store. Importing resource histories creates resource interactions that appear to have
         * occurred in the past, which clients may not want to allow. If set to false, history bundles within an import
         * will fail with an error.
         * ** Changing this property may recreate the FHIR store (removing all data) **
         * ** This property can be changed manually in the Google Cloud Healthcare admin console without recreating the FHIR store **
         * 
         * @return builder
         * 
         */
        public Builder enableHistoryImport(Boolean enableHistoryImport) {
            return enableHistoryImport(Output.of(enableHistoryImport));
        }

        /**
         * @param enableUpdateCreate Whether this FHIR store has the updateCreate capability. This determines if the client can use an Update
         * operation to create a new resource with a client-specified ID. If false, all IDs are server-assigned through
         * the Create operation and attempts to Update a non-existent resource will return errors. Please treat the audit
         * logs with appropriate levels of care if client-specified resource IDs contain sensitive data such as patient
         * identifiers, those IDs will be part of the FHIR resource path recorded in Cloud audit logs and Cloud Pub/Sub
         * notifications.
         * 
         * @return builder
         * 
         */
        public Builder enableUpdateCreate(@Nullable Output<Boolean> enableUpdateCreate) {
            $.enableUpdateCreate = enableUpdateCreate;
            return this;
        }

        /**
         * @param enableUpdateCreate Whether this FHIR store has the updateCreate capability. This determines if the client can use an Update
         * operation to create a new resource with a client-specified ID. If false, all IDs are server-assigned through
         * the Create operation and attempts to Update a non-existent resource will return errors. Please treat the audit
         * logs with appropriate levels of care if client-specified resource IDs contain sensitive data such as patient
         * identifiers, those IDs will be part of the FHIR resource path recorded in Cloud audit logs and Cloud Pub/Sub
         * notifications.
         * 
         * @return builder
         * 
         */
        public Builder enableUpdateCreate(Boolean enableUpdateCreate) {
            return enableUpdateCreate(Output.of(enableUpdateCreate));
        }

        /**
         * @param labels User-supplied key-value pairs used to organize FHIR stores.
         * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must
         * conform to the following PCRE regular expression: [\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}
         * Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
         * bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}
         * No more than 64 labels can be associated with a given store.
         * An object containing a list of &#34;key&#34;: value pairs.
         * Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels User-supplied key-value pairs used to organize FHIR stores.
         * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must
         * conform to the following PCRE regular expression: [\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}
         * Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
         * bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}
         * No more than 64 labels can be associated with a given store.
         * An object containing a list of &#34;key&#34;: value pairs.
         * Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name The resource name for the FhirStore.
         * ** Changing this property may recreate the FHIR store (removing all data) **
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The resource name for the FhirStore.
         * ** Changing this property may recreate the FHIR store (removing all data) **
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param notificationConfig A nested object resource
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder notificationConfig(@Nullable Output<FhirStoreNotificationConfigArgs> notificationConfig) {
            $.notificationConfig = notificationConfig;
            return this;
        }

        /**
         * @param notificationConfig A nested object resource
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder notificationConfig(FhirStoreNotificationConfigArgs notificationConfig) {
            return notificationConfig(Output.of(notificationConfig));
        }

        /**
         * @param streamConfigs A list of streaming configs that configure the destinations of streaming export for every resource mutation in
         * this FHIR store. Each store is allowed to have up to 10 streaming configs. After a new config is added, the next
         * resource mutation is streamed to the new location in addition to the existing ones. When a location is removed
         * from the list, the server stops streaming to that location. Before adding a new config, you must add the required
         * bigquery.dataEditor role to your project&#39;s Cloud Healthcare Service Agent service account. Some lag (typically on
         * the order of dozens of seconds) is expected before the results show up in the streaming destination.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder streamConfigs(@Nullable Output<List<FhirStoreStreamConfigArgs>> streamConfigs) {
            $.streamConfigs = streamConfigs;
            return this;
        }

        /**
         * @param streamConfigs A list of streaming configs that configure the destinations of streaming export for every resource mutation in
         * this FHIR store. Each store is allowed to have up to 10 streaming configs. After a new config is added, the next
         * resource mutation is streamed to the new location in addition to the existing ones. When a location is removed
         * from the list, the server stops streaming to that location. Before adding a new config, you must add the required
         * bigquery.dataEditor role to your project&#39;s Cloud Healthcare Service Agent service account. Some lag (typically on
         * the order of dozens of seconds) is expected before the results show up in the streaming destination.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder streamConfigs(List<FhirStoreStreamConfigArgs> streamConfigs) {
            return streamConfigs(Output.of(streamConfigs));
        }

        /**
         * @param streamConfigs A list of streaming configs that configure the destinations of streaming export for every resource mutation in
         * this FHIR store. Each store is allowed to have up to 10 streaming configs. After a new config is added, the next
         * resource mutation is streamed to the new location in addition to the existing ones. When a location is removed
         * from the list, the server stops streaming to that location. Before adding a new config, you must add the required
         * bigquery.dataEditor role to your project&#39;s Cloud Healthcare Service Agent service account. Some lag (typically on
         * the order of dozens of seconds) is expected before the results show up in the streaming destination.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder streamConfigs(FhirStoreStreamConfigArgs... streamConfigs) {
            return streamConfigs(List.of(streamConfigs));
        }

        /**
         * @param version The FHIR specification version.
         * Default value is `STU3`.
         * Possible values are `DSTU2`, `STU3`, and `R4`.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The FHIR specification version.
         * Default value is `STU3`.
         * Possible values are `DSTU2`, `STU3`, and `R4`.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public FhirStoreArgs build() {
            $.dataset = Objects.requireNonNull($.dataset, "expected parameter 'dataset' to be non-null");
            return $;
        }
    }

}
