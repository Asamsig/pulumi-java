// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1EntityMetadataResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetApiResult {
    /**
     * @return The type of the API proxy.
     * 
     */
    private final String apiProxyType;
    /**
     * @return User labels applied to this API Proxy.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return The id of the most recently created revision for this api proxy.
     * 
     */
    private final String latestRevisionId;
    /**
     * @return Metadata describing the API proxy.
     * 
     */
    private final GoogleCloudApigeeV1EntityMetadataResponse metaData;
    /**
     * @return Name of the API proxy.
     * 
     */
    private final String name;
    /**
     * @return Whether this proxy is read-only. A read-only proxy cannot have new revisions created through calls to CreateApiProxyRevision. A proxy is read-only if it was generated by an archive.
     * 
     */
    private final Boolean readOnly;
    /**
     * @return List of revisons defined for the API proxy.
     * 
     */
    private final List<String> revision;

    @CustomType.Constructor
    private GetApiResult(
        @CustomType.Parameter("apiProxyType") String apiProxyType,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("latestRevisionId") String latestRevisionId,
        @CustomType.Parameter("metaData") GoogleCloudApigeeV1EntityMetadataResponse metaData,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("readOnly") Boolean readOnly,
        @CustomType.Parameter("revision") List<String> revision) {
        this.apiProxyType = apiProxyType;
        this.labels = labels;
        this.latestRevisionId = latestRevisionId;
        this.metaData = metaData;
        this.name = name;
        this.readOnly = readOnly;
        this.revision = revision;
    }

    /**
     * @return The type of the API proxy.
     * 
     */
    public String apiProxyType() {
        return this.apiProxyType;
    }
    /**
     * @return User labels applied to this API Proxy.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return The id of the most recently created revision for this api proxy.
     * 
     */
    public String latestRevisionId() {
        return this.latestRevisionId;
    }
    /**
     * @return Metadata describing the API proxy.
     * 
     */
    public GoogleCloudApigeeV1EntityMetadataResponse metaData() {
        return this.metaData;
    }
    /**
     * @return Name of the API proxy.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Whether this proxy is read-only. A read-only proxy cannot have new revisions created through calls to CreateApiProxyRevision. A proxy is read-only if it was generated by an archive.
     * 
     */
    public Boolean readOnly() {
        return this.readOnly;
    }
    /**
     * @return List of revisons defined for the API proxy.
     * 
     */
    public List<String> revision() {
        return this.revision;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiProxyType;
        private Map<String,String> labels;
        private String latestRevisionId;
        private GoogleCloudApigeeV1EntityMetadataResponse metaData;
        private String name;
        private Boolean readOnly;
        private List<String> revision;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApiResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiProxyType = defaults.apiProxyType;
    	      this.labels = defaults.labels;
    	      this.latestRevisionId = defaults.latestRevisionId;
    	      this.metaData = defaults.metaData;
    	      this.name = defaults.name;
    	      this.readOnly = defaults.readOnly;
    	      this.revision = defaults.revision;
        }

        public Builder apiProxyType(String apiProxyType) {
            this.apiProxyType = Objects.requireNonNull(apiProxyType);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder latestRevisionId(String latestRevisionId) {
            this.latestRevisionId = Objects.requireNonNull(latestRevisionId);
            return this;
        }
        public Builder metaData(GoogleCloudApigeeV1EntityMetadataResponse metaData) {
            this.metaData = Objects.requireNonNull(metaData);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder readOnly(Boolean readOnly) {
            this.readOnly = Objects.requireNonNull(readOnly);
            return this;
        }
        public Builder revision(List<String> revision) {
            this.revision = Objects.requireNonNull(revision);
            return this;
        }
        public Builder revision(String... revision) {
            return revision(List.of(revision));
        }        public GetApiResult build() {
            return new GetApiResult(apiProxyType, labels, latestRevisionId, metaData, name, readOnly, revision);
        }
    }
}
