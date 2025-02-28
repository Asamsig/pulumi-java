// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.AttestationAuthorityResponse;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.BasisResponse;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.BuildTypeResponse;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.ComplianceNoteResponse;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.DSSEAttestationNoteResponse;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.DeployableResponse;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.DiscoveryResponse;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.DocumentNoteResponse;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.FileNoteResponse;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.PackageInfoNoteResponse;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.PackageResponse;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.RelatedUrlResponse;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.RelationshipNoteResponse;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.UpgradeNoteResponse;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.VulnerabilityTypeResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetNoteResult {
    /**
     * @return A note describing an attestation role.
     * 
     */
    private final AttestationAuthorityResponse attestationAuthority;
    /**
     * @return A note describing a base image.
     * 
     */
    private final BasisResponse baseImage;
    /**
     * @return Build provenance type for a verifiable build.
     * 
     */
    private final BuildTypeResponse buildType;
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
    private final DeployableResponse deployable;
    /**
     * @return A note describing a provider/analysis type.
     * 
     */
    private final DiscoveryResponse discovery;
    /**
     * @return A note describing a dsse attestation note.
     * 
     */
    private final DSSEAttestationNoteResponse dsseAttestation;
    /**
     * @return Time of expiration for this note, null if note does not expire.
     * 
     */
    private final String expirationTime;
    /**
     * @return This explicitly denotes which kind of note is specified. This field can be used as a filter in list requests.
     * 
     */
    private final String kind;
    /**
     * @return A detailed description of this `Note`.
     * 
     */
    private final String longDescription;
    /**
     * @return The name of the note in the form &#34;projects/{provider_project_id}/notes/{NOTE_ID}&#34;
     * 
     */
    private final String name;
    /**
     * @return A note describing a package hosted by various package managers.
     * 
     */
    private final PackageResponse package_;
    /**
     * @return URLs associated with this note
     * 
     */
    private final List<RelatedUrlResponse> relatedUrl;
    /**
     * @return A note describing a software bill of materials.
     * 
     */
    private final DocumentNoteResponse sbom;
    /**
     * @return A one sentence description of this `Note`.
     * 
     */
    private final String shortDescription;
    /**
     * @return A note describing an SPDX File.
     * 
     */
    private final FileNoteResponse spdxFile;
    /**
     * @return A note describing an SPDX Package.
     * 
     */
    private final PackageInfoNoteResponse spdxPackage;
    /**
     * @return A note describing a relationship between SPDX elements.
     * 
     */
    private final RelationshipNoteResponse spdxRelationship;
    /**
     * @return The time this note was last updated. This field can be used as a filter in list requests.
     * 
     */
    private final String updateTime;
    /**
     * @return A note describing an upgrade.
     * 
     */
    private final UpgradeNoteResponse upgrade;
    /**
     * @return A package vulnerability type of note.
     * 
     */
    private final VulnerabilityTypeResponse vulnerabilityType;

    @CustomType.Constructor
    private GetNoteResult(
        @CustomType.Parameter("attestationAuthority") AttestationAuthorityResponse attestationAuthority,
        @CustomType.Parameter("baseImage") BasisResponse baseImage,
        @CustomType.Parameter("buildType") BuildTypeResponse buildType,
        @CustomType.Parameter("compliance") ComplianceNoteResponse compliance,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("deployable") DeployableResponse deployable,
        @CustomType.Parameter("discovery") DiscoveryResponse discovery,
        @CustomType.Parameter("dsseAttestation") DSSEAttestationNoteResponse dsseAttestation,
        @CustomType.Parameter("expirationTime") String expirationTime,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("longDescription") String longDescription,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("package") PackageResponse package_,
        @CustomType.Parameter("relatedUrl") List<RelatedUrlResponse> relatedUrl,
        @CustomType.Parameter("sbom") DocumentNoteResponse sbom,
        @CustomType.Parameter("shortDescription") String shortDescription,
        @CustomType.Parameter("spdxFile") FileNoteResponse spdxFile,
        @CustomType.Parameter("spdxPackage") PackageInfoNoteResponse spdxPackage,
        @CustomType.Parameter("spdxRelationship") RelationshipNoteResponse spdxRelationship,
        @CustomType.Parameter("updateTime") String updateTime,
        @CustomType.Parameter("upgrade") UpgradeNoteResponse upgrade,
        @CustomType.Parameter("vulnerabilityType") VulnerabilityTypeResponse vulnerabilityType) {
        this.attestationAuthority = attestationAuthority;
        this.baseImage = baseImage;
        this.buildType = buildType;
        this.compliance = compliance;
        this.createTime = createTime;
        this.deployable = deployable;
        this.discovery = discovery;
        this.dsseAttestation = dsseAttestation;
        this.expirationTime = expirationTime;
        this.kind = kind;
        this.longDescription = longDescription;
        this.name = name;
        this.package_ = package_;
        this.relatedUrl = relatedUrl;
        this.sbom = sbom;
        this.shortDescription = shortDescription;
        this.spdxFile = spdxFile;
        this.spdxPackage = spdxPackage;
        this.spdxRelationship = spdxRelationship;
        this.updateTime = updateTime;
        this.upgrade = upgrade;
        this.vulnerabilityType = vulnerabilityType;
    }

    /**
     * @return A note describing an attestation role.
     * 
     */
    public AttestationAuthorityResponse attestationAuthority() {
        return this.attestationAuthority;
    }
    /**
     * @return A note describing a base image.
     * 
     */
    public BasisResponse baseImage() {
        return this.baseImage;
    }
    /**
     * @return Build provenance type for a verifiable build.
     * 
     */
    public BuildTypeResponse buildType() {
        return this.buildType;
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
    public DeployableResponse deployable() {
        return this.deployable;
    }
    /**
     * @return A note describing a provider/analysis type.
     * 
     */
    public DiscoveryResponse discovery() {
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
     * @return Time of expiration for this note, null if note does not expire.
     * 
     */
    public String expirationTime() {
        return this.expirationTime;
    }
    /**
     * @return This explicitly denotes which kind of note is specified. This field can be used as a filter in list requests.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return A detailed description of this `Note`.
     * 
     */
    public String longDescription() {
        return this.longDescription;
    }
    /**
     * @return The name of the note in the form &#34;projects/{provider_project_id}/notes/{NOTE_ID}&#34;
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A note describing a package hosted by various package managers.
     * 
     */
    public PackageResponse package_() {
        return this.package_;
    }
    /**
     * @return URLs associated with this note
     * 
     */
    public List<RelatedUrlResponse> relatedUrl() {
        return this.relatedUrl;
    }
    /**
     * @return A note describing a software bill of materials.
     * 
     */
    public DocumentNoteResponse sbom() {
        return this.sbom;
    }
    /**
     * @return A one sentence description of this `Note`.
     * 
     */
    public String shortDescription() {
        return this.shortDescription;
    }
    /**
     * @return A note describing an SPDX File.
     * 
     */
    public FileNoteResponse spdxFile() {
        return this.spdxFile;
    }
    /**
     * @return A note describing an SPDX Package.
     * 
     */
    public PackageInfoNoteResponse spdxPackage() {
        return this.spdxPackage;
    }
    /**
     * @return A note describing a relationship between SPDX elements.
     * 
     */
    public RelationshipNoteResponse spdxRelationship() {
        return this.spdxRelationship;
    }
    /**
     * @return The time this note was last updated. This field can be used as a filter in list requests.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }
    /**
     * @return A note describing an upgrade.
     * 
     */
    public UpgradeNoteResponse upgrade() {
        return this.upgrade;
    }
    /**
     * @return A package vulnerability type of note.
     * 
     */
    public VulnerabilityTypeResponse vulnerabilityType() {
        return this.vulnerabilityType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNoteResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AttestationAuthorityResponse attestationAuthority;
        private BasisResponse baseImage;
        private BuildTypeResponse buildType;
        private ComplianceNoteResponse compliance;
        private String createTime;
        private DeployableResponse deployable;
        private DiscoveryResponse discovery;
        private DSSEAttestationNoteResponse dsseAttestation;
        private String expirationTime;
        private String kind;
        private String longDescription;
        private String name;
        private PackageResponse package_;
        private List<RelatedUrlResponse> relatedUrl;
        private DocumentNoteResponse sbom;
        private String shortDescription;
        private FileNoteResponse spdxFile;
        private PackageInfoNoteResponse spdxPackage;
        private RelationshipNoteResponse spdxRelationship;
        private String updateTime;
        private UpgradeNoteResponse upgrade;
        private VulnerabilityTypeResponse vulnerabilityType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNoteResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attestationAuthority = defaults.attestationAuthority;
    	      this.baseImage = defaults.baseImage;
    	      this.buildType = defaults.buildType;
    	      this.compliance = defaults.compliance;
    	      this.createTime = defaults.createTime;
    	      this.deployable = defaults.deployable;
    	      this.discovery = defaults.discovery;
    	      this.dsseAttestation = defaults.dsseAttestation;
    	      this.expirationTime = defaults.expirationTime;
    	      this.kind = defaults.kind;
    	      this.longDescription = defaults.longDescription;
    	      this.name = defaults.name;
    	      this.package_ = defaults.package_;
    	      this.relatedUrl = defaults.relatedUrl;
    	      this.sbom = defaults.sbom;
    	      this.shortDescription = defaults.shortDescription;
    	      this.spdxFile = defaults.spdxFile;
    	      this.spdxPackage = defaults.spdxPackage;
    	      this.spdxRelationship = defaults.spdxRelationship;
    	      this.updateTime = defaults.updateTime;
    	      this.upgrade = defaults.upgrade;
    	      this.vulnerabilityType = defaults.vulnerabilityType;
        }

        public Builder attestationAuthority(AttestationAuthorityResponse attestationAuthority) {
            this.attestationAuthority = Objects.requireNonNull(attestationAuthority);
            return this;
        }
        public Builder baseImage(BasisResponse baseImage) {
            this.baseImage = Objects.requireNonNull(baseImage);
            return this;
        }
        public Builder buildType(BuildTypeResponse buildType) {
            this.buildType = Objects.requireNonNull(buildType);
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
        public Builder deployable(DeployableResponse deployable) {
            this.deployable = Objects.requireNonNull(deployable);
            return this;
        }
        public Builder discovery(DiscoveryResponse discovery) {
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
        public Builder package_(PackageResponse package_) {
            this.package_ = Objects.requireNonNull(package_);
            return this;
        }
        public Builder relatedUrl(List<RelatedUrlResponse> relatedUrl) {
            this.relatedUrl = Objects.requireNonNull(relatedUrl);
            return this;
        }
        public Builder relatedUrl(RelatedUrlResponse... relatedUrl) {
            return relatedUrl(List.of(relatedUrl));
        }
        public Builder sbom(DocumentNoteResponse sbom) {
            this.sbom = Objects.requireNonNull(sbom);
            return this;
        }
        public Builder shortDescription(String shortDescription) {
            this.shortDescription = Objects.requireNonNull(shortDescription);
            return this;
        }
        public Builder spdxFile(FileNoteResponse spdxFile) {
            this.spdxFile = Objects.requireNonNull(spdxFile);
            return this;
        }
        public Builder spdxPackage(PackageInfoNoteResponse spdxPackage) {
            this.spdxPackage = Objects.requireNonNull(spdxPackage);
            return this;
        }
        public Builder spdxRelationship(RelationshipNoteResponse spdxRelationship) {
            this.spdxRelationship = Objects.requireNonNull(spdxRelationship);
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
        public Builder vulnerabilityType(VulnerabilityTypeResponse vulnerabilityType) {
            this.vulnerabilityType = Objects.requireNonNull(vulnerabilityType);
            return this;
        }        public GetNoteResult build() {
            return new GetNoteResult(attestationAuthority, baseImage, buildType, compliance, createTime, deployable, discovery, dsseAttestation, expirationTime, kind, longDescription, name, package_, relatedUrl, sbom, shortDescription, spdxFile, spdxPackage, spdxRelationship, updateTime, upgrade, vulnerabilityType);
        }
    }
}
