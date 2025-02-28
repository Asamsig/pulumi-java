// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.containeranalysis_v1.outputs.AttestationNoteResponse;
import com.pulumi.googlenative.containeranalysis_v1.outputs.BuildNoteResponse;
import com.pulumi.googlenative.containeranalysis_v1.outputs.ComplianceNoteResponse;
import com.pulumi.googlenative.containeranalysis_v1.outputs.DSSEAttestationNoteResponse;
import com.pulumi.googlenative.containeranalysis_v1.outputs.DeploymentNoteResponse;
import com.pulumi.googlenative.containeranalysis_v1.outputs.DiscoveryNoteResponse;
import com.pulumi.googlenative.containeranalysis_v1.outputs.ImageNoteResponse;
import com.pulumi.googlenative.containeranalysis_v1.outputs.PackageNoteResponse;
import com.pulumi.googlenative.containeranalysis_v1.outputs.RelatedUrlResponse;
import com.pulumi.googlenative.containeranalysis_v1.outputs.UpgradeNoteResponse;
import com.pulumi.googlenative.containeranalysis_v1.outputs.VulnerabilityNoteResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetNoteResult {
    /**
     * @return A note describing an attestation role.
     * 
     */
    private final AttestationNoteResponse attestation;
    /**
     * @return A note describing build provenance for a verifiable build.
     * 
     */
    private final BuildNoteResponse build;
    /**
     * @return A note describing a compliance check.
     * 
     */
    private final ComplianceNoteResponse compliance;
    /**
     * @return The time this note was created. This field can be used as a filter in list requests.
     * 
     */
    private final String createTime;
    /**
     * @return A note describing something that can be deployed.
     * 
     */
    private final DeploymentNoteResponse deployment;
    /**
     * @return A note describing the initial analysis of a resource.
     * 
     */
    private final DiscoveryNoteResponse discovery;
    /**
     * @return A note describing a dsse attestation note.
     * 
     */
    private final DSSEAttestationNoteResponse dsseAttestation;
    /**
     * @return Time of expiration for this note. Empty if note does not expire.
     * 
     */
    private final String expirationTime;
    /**
     * @return A note describing a base image.
     * 
     */
    private final ImageNoteResponse image;
    /**
     * @return The type of analysis. This field can be used as a filter in list requests.
     * 
     */
    private final String kind;
    /**
     * @return A detailed description of this note.
     * 
     */
    private final String longDescription;
    /**
     * @return The name of the note in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
     * 
     */
    private final String name;
    /**
     * @return A note describing a package hosted by various package managers.
     * 
     */
    private final PackageNoteResponse package_;
    /**
     * @return Other notes related to this note.
     * 
     */
    private final List<String> relatedNoteNames;
    /**
     * @return URLs associated with this note.
     * 
     */
    private final List<RelatedUrlResponse> relatedUrl;
    /**
     * @return A one sentence description of this note.
     * 
     */
    private final String shortDescription;
    /**
     * @return The time this note was last updated. This field can be used as a filter in list requests.
     * 
     */
    private final String updateTime;
    /**
     * @return A note describing available package upgrades.
     * 
     */
    private final UpgradeNoteResponse upgrade;
    /**
     * @return A note describing a package vulnerability.
     * 
     */
    private final VulnerabilityNoteResponse vulnerability;

    @CustomType.Constructor
    private GetNoteResult(
        @CustomType.Parameter("attestation") AttestationNoteResponse attestation,
        @CustomType.Parameter("build") BuildNoteResponse build,
        @CustomType.Parameter("compliance") ComplianceNoteResponse compliance,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("deployment") DeploymentNoteResponse deployment,
        @CustomType.Parameter("discovery") DiscoveryNoteResponse discovery,
        @CustomType.Parameter("dsseAttestation") DSSEAttestationNoteResponse dsseAttestation,
        @CustomType.Parameter("expirationTime") String expirationTime,
        @CustomType.Parameter("image") ImageNoteResponse image,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("longDescription") String longDescription,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("package") PackageNoteResponse package_,
        @CustomType.Parameter("relatedNoteNames") List<String> relatedNoteNames,
        @CustomType.Parameter("relatedUrl") List<RelatedUrlResponse> relatedUrl,
        @CustomType.Parameter("shortDescription") String shortDescription,
        @CustomType.Parameter("updateTime") String updateTime,
        @CustomType.Parameter("upgrade") UpgradeNoteResponse upgrade,
        @CustomType.Parameter("vulnerability") VulnerabilityNoteResponse vulnerability) {
        this.attestation = attestation;
        this.build = build;
        this.compliance = compliance;
        this.createTime = createTime;
        this.deployment = deployment;
        this.discovery = discovery;
        this.dsseAttestation = dsseAttestation;
        this.expirationTime = expirationTime;
        this.image = image;
        this.kind = kind;
        this.longDescription = longDescription;
        this.name = name;
        this.package_ = package_;
        this.relatedNoteNames = relatedNoteNames;
        this.relatedUrl = relatedUrl;
        this.shortDescription = shortDescription;
        this.updateTime = updateTime;
        this.upgrade = upgrade;
        this.vulnerability = vulnerability;
    }

    /**
     * @return A note describing an attestation role.
     * 
     */
    public AttestationNoteResponse attestation() {
        return this.attestation;
    }
    /**
     * @return A note describing build provenance for a verifiable build.
     * 
     */
    public BuildNoteResponse build() {
        return this.build;
    }
    /**
     * @return A note describing a compliance check.
     * 
     */
    public ComplianceNoteResponse compliance() {
        return this.compliance;
    }
    /**
     * @return The time this note was created. This field can be used as a filter in list requests.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return A note describing something that can be deployed.
     * 
     */
    public DeploymentNoteResponse deployment() {
        return this.deployment;
    }
    /**
     * @return A note describing the initial analysis of a resource.
     * 
     */
    public DiscoveryNoteResponse discovery() {
        return this.discovery;
    }
    /**
     * @return A note describing a dsse attestation note.
     * 
     */
    public DSSEAttestationNoteResponse dsseAttestation() {
        return this.dsseAttestation;
    }
    /**
     * @return Time of expiration for this note. Empty if note does not expire.
     * 
     */
    public String expirationTime() {
        return this.expirationTime;
    }
    /**
     * @return A note describing a base image.
     * 
     */
    public ImageNoteResponse image() {
        return this.image;
    }
    /**
     * @return The type of analysis. This field can be used as a filter in list requests.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return A detailed description of this note.
     * 
     */
    public String longDescription() {
        return this.longDescription;
    }
    /**
     * @return The name of the note in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A note describing a package hosted by various package managers.
     * 
     */
    public PackageNoteResponse package_() {
        return this.package_;
    }
    /**
     * @return Other notes related to this note.
     * 
     */
    public List<String> relatedNoteNames() {
        return this.relatedNoteNames;
    }
    /**
     * @return URLs associated with this note.
     * 
     */
    public List<RelatedUrlResponse> relatedUrl() {
        return this.relatedUrl;
    }
    /**
     * @return A one sentence description of this note.
     * 
     */
    public String shortDescription() {
        return this.shortDescription;
    }
    /**
     * @return The time this note was last updated. This field can be used as a filter in list requests.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }
    /**
     * @return A note describing available package upgrades.
     * 
     */
    public UpgradeNoteResponse upgrade() {
        return this.upgrade;
    }
    /**
     * @return A note describing a package vulnerability.
     * 
     */
    public VulnerabilityNoteResponse vulnerability() {
        return this.vulnerability;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNoteResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AttestationNoteResponse attestation;
        private BuildNoteResponse build;
        private ComplianceNoteResponse compliance;
        private String createTime;
        private DeploymentNoteResponse deployment;
        private DiscoveryNoteResponse discovery;
        private DSSEAttestationNoteResponse dsseAttestation;
        private String expirationTime;
        private ImageNoteResponse image;
        private String kind;
        private String longDescription;
        private String name;
        private PackageNoteResponse package_;
        private List<String> relatedNoteNames;
        private List<RelatedUrlResponse> relatedUrl;
        private String shortDescription;
        private String updateTime;
        private UpgradeNoteResponse upgrade;
        private VulnerabilityNoteResponse vulnerability;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNoteResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attestation = defaults.attestation;
    	      this.build = defaults.build;
    	      this.compliance = defaults.compliance;
    	      this.createTime = defaults.createTime;
    	      this.deployment = defaults.deployment;
    	      this.discovery = defaults.discovery;
    	      this.dsseAttestation = defaults.dsseAttestation;
    	      this.expirationTime = defaults.expirationTime;
    	      this.image = defaults.image;
    	      this.kind = defaults.kind;
    	      this.longDescription = defaults.longDescription;
    	      this.name = defaults.name;
    	      this.package_ = defaults.package_;
    	      this.relatedNoteNames = defaults.relatedNoteNames;
    	      this.relatedUrl = defaults.relatedUrl;
    	      this.shortDescription = defaults.shortDescription;
    	      this.updateTime = defaults.updateTime;
    	      this.upgrade = defaults.upgrade;
    	      this.vulnerability = defaults.vulnerability;
        }

        public Builder attestation(AttestationNoteResponse attestation) {
            this.attestation = Objects.requireNonNull(attestation);
            return this;
        }
        public Builder build(BuildNoteResponse build) {
            this.build = Objects.requireNonNull(build);
            return this;
        }
        public Builder compliance(ComplianceNoteResponse compliance) {
            this.compliance = Objects.requireNonNull(compliance);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder deployment(DeploymentNoteResponse deployment) {
            this.deployment = Objects.requireNonNull(deployment);
            return this;
        }
        public Builder discovery(DiscoveryNoteResponse discovery) {
            this.discovery = Objects.requireNonNull(discovery);
            return this;
        }
        public Builder dsseAttestation(DSSEAttestationNoteResponse dsseAttestation) {
            this.dsseAttestation = Objects.requireNonNull(dsseAttestation);
            return this;
        }
        public Builder expirationTime(String expirationTime) {
            this.expirationTime = Objects.requireNonNull(expirationTime);
            return this;
        }
        public Builder image(ImageNoteResponse image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder longDescription(String longDescription) {
            this.longDescription = Objects.requireNonNull(longDescription);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder package_(PackageNoteResponse package_) {
            this.package_ = Objects.requireNonNull(package_);
            return this;
        }
        public Builder relatedNoteNames(List<String> relatedNoteNames) {
            this.relatedNoteNames = Objects.requireNonNull(relatedNoteNames);
            return this;
        }
        public Builder relatedNoteNames(String... relatedNoteNames) {
            return relatedNoteNames(List.of(relatedNoteNames));
        }
        public Builder relatedUrl(List<RelatedUrlResponse> relatedUrl) {
            this.relatedUrl = Objects.requireNonNull(relatedUrl);
            return this;
        }
        public Builder relatedUrl(RelatedUrlResponse... relatedUrl) {
            return relatedUrl(List.of(relatedUrl));
        }
        public Builder shortDescription(String shortDescription) {
            this.shortDescription = Objects.requireNonNull(shortDescription);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public Builder upgrade(UpgradeNoteResponse upgrade) {
            this.upgrade = Objects.requireNonNull(upgrade);
            return this;
        }
        public Builder vulnerability(VulnerabilityNoteResponse vulnerability) {
            this.vulnerability = Objects.requireNonNull(vulnerability);
            return this;
        }        public GetNoteResult build() {
            return new GetNoteResult(attestation, build, compliance, createTime, deployment, discovery, dsseAttestation, expirationTime, image, kind, longDescription, name, package_, relatedNoteNames, relatedUrl, shortDescription, updateTime, upgrade, vulnerability);
        }
    }
}
