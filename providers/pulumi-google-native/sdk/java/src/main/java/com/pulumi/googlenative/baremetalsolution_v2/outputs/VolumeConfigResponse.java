// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.baremetalsolution_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.baremetalsolution_v2.outputs.LunRangeResponse;
import com.pulumi.googlenative.baremetalsolution_v2.outputs.NfsExportResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class VolumeConfigResponse {
    /**
     * @return The GCP service of the storage volume. Available gcp_service are in https://cloud.google.com/bare-metal/docs/bms-planning.
     * 
     */
    private final String gcpService;
    /**
     * @return LUN ranges to be configured. Set only when protocol is PROTOCOL_FC.
     * 
     */
    private final List<LunRangeResponse> lunRanges;
    /**
     * @return Machine ids connected to this volume. Set only when protocol is PROTOCOL_FC.
     * 
     */
    private final List<String> machineIds;
    /**
     * @return The name of the volume config.
     * 
     */
    private final String name;
    /**
     * @return NFS exports. Set only when protocol is PROTOCOL_NFS.
     * 
     */
    private final List<NfsExportResponse> nfsExports;
    /**
     * @return Volume protocol.
     * 
     */
    private final String protocol;
    /**
     * @return The requested size of this volume, in GB.
     * 
     */
    private final Integer sizeGb;
    /**
     * @return Whether snapshots should be enabled.
     * 
     */
    private final Boolean snapshotsEnabled;
    /**
     * @return The type of this Volume.
     * 
     */
    private final String type;
    /**
     * @return User note field, it can be used by customers to add additional information for the BMS Ops team (b/194021617).
     * 
     */
    private final String userNote;

    @CustomType.Constructor
    private VolumeConfigResponse(
        @CustomType.Parameter("gcpService") String gcpService,
        @CustomType.Parameter("lunRanges") List<LunRangeResponse> lunRanges,
        @CustomType.Parameter("machineIds") List<String> machineIds,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("nfsExports") List<NfsExportResponse> nfsExports,
        @CustomType.Parameter("protocol") String protocol,
        @CustomType.Parameter("sizeGb") Integer sizeGb,
        @CustomType.Parameter("snapshotsEnabled") Boolean snapshotsEnabled,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("userNote") String userNote) {
        this.gcpService = gcpService;
        this.lunRanges = lunRanges;
        this.machineIds = machineIds;
        this.name = name;
        this.nfsExports = nfsExports;
        this.protocol = protocol;
        this.sizeGb = sizeGb;
        this.snapshotsEnabled = snapshotsEnabled;
        this.type = type;
        this.userNote = userNote;
    }

    /**
     * @return The GCP service of the storage volume. Available gcp_service are in https://cloud.google.com/bare-metal/docs/bms-planning.
     * 
     */
    public String gcpService() {
        return this.gcpService;
    }
    /**
     * @return LUN ranges to be configured. Set only when protocol is PROTOCOL_FC.
     * 
     */
    public List<LunRangeResponse> lunRanges() {
        return this.lunRanges;
    }
    /**
     * @return Machine ids connected to this volume. Set only when protocol is PROTOCOL_FC.
     * 
     */
    public List<String> machineIds() {
        return this.machineIds;
    }
    /**
     * @return The name of the volume config.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return NFS exports. Set only when protocol is PROTOCOL_NFS.
     * 
     */
    public List<NfsExportResponse> nfsExports() {
        return this.nfsExports;
    }
    /**
     * @return Volume protocol.
     * 
     */
    public String protocol() {
        return this.protocol;
    }
    /**
     * @return The requested size of this volume, in GB.
     * 
     */
    public Integer sizeGb() {
        return this.sizeGb;
    }
    /**
     * @return Whether snapshots should be enabled.
     * 
     */
    public Boolean snapshotsEnabled() {
        return this.snapshotsEnabled;
    }
    /**
     * @return The type of this Volume.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return User note field, it can be used by customers to add additional information for the BMS Ops team (b/194021617).
     * 
     */
    public String userNote() {
        return this.userNote;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String gcpService;
        private List<LunRangeResponse> lunRanges;
        private List<String> machineIds;
        private String name;
        private List<NfsExportResponse> nfsExports;
        private String protocol;
        private Integer sizeGb;
        private Boolean snapshotsEnabled;
        private String type;
        private String userNote;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gcpService = defaults.gcpService;
    	      this.lunRanges = defaults.lunRanges;
    	      this.machineIds = defaults.machineIds;
    	      this.name = defaults.name;
    	      this.nfsExports = defaults.nfsExports;
    	      this.protocol = defaults.protocol;
    	      this.sizeGb = defaults.sizeGb;
    	      this.snapshotsEnabled = defaults.snapshotsEnabled;
    	      this.type = defaults.type;
    	      this.userNote = defaults.userNote;
        }

        public Builder gcpService(String gcpService) {
            this.gcpService = Objects.requireNonNull(gcpService);
            return this;
        }
        public Builder lunRanges(List<LunRangeResponse> lunRanges) {
            this.lunRanges = Objects.requireNonNull(lunRanges);
            return this;
        }
        public Builder lunRanges(LunRangeResponse... lunRanges) {
            return lunRanges(List.of(lunRanges));
        }
        public Builder machineIds(List<String> machineIds) {
            this.machineIds = Objects.requireNonNull(machineIds);
            return this;
        }
        public Builder machineIds(String... machineIds) {
            return machineIds(List.of(machineIds));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder nfsExports(List<NfsExportResponse> nfsExports) {
            this.nfsExports = Objects.requireNonNull(nfsExports);
            return this;
        }
        public Builder nfsExports(NfsExportResponse... nfsExports) {
            return nfsExports(List.of(nfsExports));
        }
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public Builder sizeGb(Integer sizeGb) {
            this.sizeGb = Objects.requireNonNull(sizeGb);
            return this;
        }
        public Builder snapshotsEnabled(Boolean snapshotsEnabled) {
            this.snapshotsEnabled = Objects.requireNonNull(snapshotsEnabled);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder userNote(String userNote) {
            this.userNote = Objects.requireNonNull(userNote);
            return this;
        }        public VolumeConfigResponse build() {
            return new VolumeConfigResponse(gcpService, lunRanges, machineIds, name, nfsExports, protocol, sizeGb, snapshotsEnabled, type, userNote);
        }
    }
}
