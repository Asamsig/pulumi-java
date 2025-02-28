// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.containeranalysis_v1beta1.outputs.DetailsResponse;
import com.pulumi.googlenative.containeranalysis_v1beta1.outputs.DocumentOccurrenceResponse;
import com.pulumi.googlenative.containeranalysis_v1beta1.outputs.FileOccurrenceResponse;
import com.pulumi.googlenative.containeranalysis_v1beta1.outputs.GrafeasV1beta1BuildDetailsResponse;
import com.pulumi.googlenative.containeranalysis_v1beta1.outputs.GrafeasV1beta1DeploymentDetailsResponse;
import com.pulumi.googlenative.containeranalysis_v1beta1.outputs.GrafeasV1beta1DiscoveryDetailsResponse;
import com.pulumi.googlenative.containeranalysis_v1beta1.outputs.GrafeasV1beta1ImageDetailsResponse;
import com.pulumi.googlenative.containeranalysis_v1beta1.outputs.GrafeasV1beta1IntotoDetailsResponse;
import com.pulumi.googlenative.containeranalysis_v1beta1.outputs.GrafeasV1beta1PackageDetailsResponse;
import com.pulumi.googlenative.containeranalysis_v1beta1.outputs.GrafeasV1beta1VulnerabilityDetailsResponse;
import com.pulumi.googlenative.containeranalysis_v1beta1.outputs.PackageInfoOccurrenceResponse;
import com.pulumi.googlenative.containeranalysis_v1beta1.outputs.RelationshipOccurrenceResponse;
import com.pulumi.googlenative.containeranalysis_v1beta1.outputs.ResourceResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetOccurrenceResult {
    /**
     * @return Describes an attestation of an artifact.
     * 
     */
    private final DetailsResponse attestation;
    /**
     * @return Describes a verifiable build.
     * 
     */
    private final GrafeasV1beta1BuildDetailsResponse build;
    /**
     * @return The time this occurrence was created.
     * 
     */
    private final String createTime;
    /**
     * @return Describes the deployment of an artifact on a runtime.
     * 
     */
    private final GrafeasV1beta1DeploymentDetailsResponse deployment;
    /**
     * @return Describes how this resource derives from the basis in the associated note.
     * 
     */
    private final GrafeasV1beta1ImageDetailsResponse derivedImage;
    /**
     * @return Describes when a resource was discovered.
     * 
     */
    private final GrafeasV1beta1DiscoveryDetailsResponse discovered;
    /**
     * @return Describes the installation of a package on the linked resource.
     * 
     */
    private final GrafeasV1beta1PackageDetailsResponse installation;
    /**
     * @return Describes a specific in-toto link.
     * 
     */
    private final GrafeasV1beta1IntotoDetailsResponse intoto;
    /**
     * @return This explicitly denotes which of the occurrence details are specified. This field can be used as a filter in list requests.
     * 
     */
    private final String kind;
    /**
     * @return The name of the occurrence in the form of `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
     * 
     */
    private final String name;
    /**
     * @return Immutable. The analysis note associated with this occurrence, in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`. This field can be used as a filter in list requests.
     * 
     */
    private final String noteName;
    /**
     * @return A description of actions that can be taken to remedy the note.
     * 
     */
    private final String remediation;
    /**
     * @return Immutable. The resource for which the occurrence applies.
     * 
     */
    private final ResourceResponse resource;
    /**
     * @return Describes a specific software bill of materials document.
     * 
     */
    private final DocumentOccurrenceResponse sbom;
    /**
     * @return Describes a specific SPDX File.
     * 
     */
    private final FileOccurrenceResponse spdxFile;
    /**
     * @return Describes a specific SPDX Package.
     * 
     */
    private final PackageInfoOccurrenceResponse spdxPackage;
    /**
     * @return Describes a specific SPDX Relationship.
     * 
     */
    private final RelationshipOccurrenceResponse spdxRelationship;
    /**
     * @return The time this occurrence was last updated.
     * 
     */
    private final String updateTime;
    /**
     * @return Describes a security vulnerability.
     * 
     */
    private final GrafeasV1beta1VulnerabilityDetailsResponse vulnerability;

    @CustomType.Constructor
    private GetOccurrenceResult(
        @CustomType.Parameter("attestation") DetailsResponse attestation,
        @CustomType.Parameter("build") GrafeasV1beta1BuildDetailsResponse build,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("deployment") GrafeasV1beta1DeploymentDetailsResponse deployment,
        @CustomType.Parameter("derivedImage") GrafeasV1beta1ImageDetailsResponse derivedImage,
        @CustomType.Parameter("discovered") GrafeasV1beta1DiscoveryDetailsResponse discovered,
        @CustomType.Parameter("installation") GrafeasV1beta1PackageDetailsResponse installation,
        @CustomType.Parameter("intoto") GrafeasV1beta1IntotoDetailsResponse intoto,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("noteName") String noteName,
        @CustomType.Parameter("remediation") String remediation,
        @CustomType.Parameter("resource") ResourceResponse resource,
        @CustomType.Parameter("sbom") DocumentOccurrenceResponse sbom,
        @CustomType.Parameter("spdxFile") FileOccurrenceResponse spdxFile,
        @CustomType.Parameter("spdxPackage") PackageInfoOccurrenceResponse spdxPackage,
        @CustomType.Parameter("spdxRelationship") RelationshipOccurrenceResponse spdxRelationship,
        @CustomType.Parameter("updateTime") String updateTime,
        @CustomType.Parameter("vulnerability") GrafeasV1beta1VulnerabilityDetailsResponse vulnerability) {
        this.attestation = attestation;
        this.build = build;
        this.createTime = createTime;
        this.deployment = deployment;
        this.derivedImage = derivedImage;
        this.discovered = discovered;
        this.installation = installation;
        this.intoto = intoto;
        this.kind = kind;
        this.name = name;
        this.noteName = noteName;
        this.remediation = remediation;
        this.resource = resource;
        this.sbom = sbom;
        this.spdxFile = spdxFile;
        this.spdxPackage = spdxPackage;
        this.spdxRelationship = spdxRelationship;
        this.updateTime = updateTime;
        this.vulnerability = vulnerability;
    }

    /**
     * @return Describes an attestation of an artifact.
     * 
     */
    public DetailsResponse attestation() {
        return this.attestation;
    }
    /**
     * @return Describes a verifiable build.
     * 
     */
    public GrafeasV1beta1BuildDetailsResponse build() {
        return this.build;
    }
    /**
     * @return The time this occurrence was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Describes the deployment of an artifact on a runtime.
     * 
     */
    public GrafeasV1beta1DeploymentDetailsResponse deployment() {
        return this.deployment;
    }
    /**
     * @return Describes how this resource derives from the basis in the associated note.
     * 
     */
    public GrafeasV1beta1ImageDetailsResponse derivedImage() {
        return this.derivedImage;
    }
    /**
     * @return Describes when a resource was discovered.
     * 
     */
    public GrafeasV1beta1DiscoveryDetailsResponse discovered() {
        return this.discovered;
    }
    /**
     * @return Describes the installation of a package on the linked resource.
     * 
     */
    public GrafeasV1beta1PackageDetailsResponse installation() {
        return this.installation;
    }
    /**
     * @return Describes a specific in-toto link.
     * 
     */
    public GrafeasV1beta1IntotoDetailsResponse intoto() {
        return this.intoto;
    }
    /**
     * @return This explicitly denotes which of the occurrence details are specified. This field can be used as a filter in list requests.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return The name of the occurrence in the form of `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Immutable. The analysis note associated with this occurrence, in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`. This field can be used as a filter in list requests.
     * 
     */
    public String noteName() {
        return this.noteName;
    }
    /**
     * @return A description of actions that can be taken to remedy the note.
     * 
     */
    public String remediation() {
        return this.remediation;
    }
    /**
     * @return Immutable. The resource for which the occurrence applies.
     * 
     */
    public ResourceResponse resource() {
        return this.resource;
    }
    /**
     * @return Describes a specific software bill of materials document.
     * 
     */
    public DocumentOccurrenceResponse sbom() {
        return this.sbom;
    }
    /**
     * @return Describes a specific SPDX File.
     * 
     */
    public FileOccurrenceResponse spdxFile() {
        return this.spdxFile;
    }
    /**
     * @return Describes a specific SPDX Package.
     * 
     */
    public PackageInfoOccurrenceResponse spdxPackage() {
        return this.spdxPackage;
    }
    /**
     * @return Describes a specific SPDX Relationship.
     * 
     */
    public RelationshipOccurrenceResponse spdxRelationship() {
        return this.spdxRelationship;
    }
    /**
     * @return The time this occurrence was last updated.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }
    /**
     * @return Describes a security vulnerability.
     * 
     */
    public GrafeasV1beta1VulnerabilityDetailsResponse vulnerability() {
        return this.vulnerability;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOccurrenceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DetailsResponse attestation;
        private GrafeasV1beta1BuildDetailsResponse build;
        private String createTime;
        private GrafeasV1beta1DeploymentDetailsResponse deployment;
        private GrafeasV1beta1ImageDetailsResponse derivedImage;
        private GrafeasV1beta1DiscoveryDetailsResponse discovered;
        private GrafeasV1beta1PackageDetailsResponse installation;
        private GrafeasV1beta1IntotoDetailsResponse intoto;
        private String kind;
        private String name;
        private String noteName;
        private String remediation;
        private ResourceResponse resource;
        private DocumentOccurrenceResponse sbom;
        private FileOccurrenceResponse spdxFile;
        private PackageInfoOccurrenceResponse spdxPackage;
        private RelationshipOccurrenceResponse spdxRelationship;
        private String updateTime;
        private GrafeasV1beta1VulnerabilityDetailsResponse vulnerability;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOccurrenceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attestation = defaults.attestation;
    	      this.build = defaults.build;
    	      this.createTime = defaults.createTime;
    	      this.deployment = defaults.deployment;
    	      this.derivedImage = defaults.derivedImage;
    	      this.discovered = defaults.discovered;
    	      this.installation = defaults.installation;
    	      this.intoto = defaults.intoto;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.noteName = defaults.noteName;
    	      this.remediation = defaults.remediation;
    	      this.resource = defaults.resource;
    	      this.sbom = defaults.sbom;
    	      this.spdxFile = defaults.spdxFile;
    	      this.spdxPackage = defaults.spdxPackage;
    	      this.spdxRelationship = defaults.spdxRelationship;
    	      this.updateTime = defaults.updateTime;
    	      this.vulnerability = defaults.vulnerability;
        }

        public Builder attestation(DetailsResponse attestation) {
            this.attestation = Objects.requireNonNull(attestation);
            return this;
        }
        public Builder build(GrafeasV1beta1BuildDetailsResponse build) {
            this.build = Objects.requireNonNull(build);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder deployment(GrafeasV1beta1DeploymentDetailsResponse deployment) {
            this.deployment = Objects.requireNonNull(deployment);
            return this;
        }
        public Builder derivedImage(GrafeasV1beta1ImageDetailsResponse derivedImage) {
            this.derivedImage = Objects.requireNonNull(derivedImage);
            return this;
        }
        public Builder discovered(GrafeasV1beta1DiscoveryDetailsResponse discovered) {
            this.discovered = Objects.requireNonNull(discovered);
            return this;
        }
        public Builder installation(GrafeasV1beta1PackageDetailsResponse installation) {
            this.installation = Objects.requireNonNull(installation);
            return this;
        }
        public Builder intoto(GrafeasV1beta1IntotoDetailsResponse intoto) {
            this.intoto = Objects.requireNonNull(intoto);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder noteName(String noteName) {
            this.noteName = Objects.requireNonNull(noteName);
            return this;
        }
        public Builder remediation(String remediation) {
            this.remediation = Objects.requireNonNull(remediation);
            return this;
        }
        public Builder resource(ResourceResponse resource) {
            this.resource = Objects.requireNonNull(resource);
            return this;
        }
        public Builder sbom(DocumentOccurrenceResponse sbom) {
            this.sbom = Objects.requireNonNull(sbom);
            return this;
        }
        public Builder spdxFile(FileOccurrenceResponse spdxFile) {
            this.spdxFile = Objects.requireNonNull(spdxFile);
            return this;
        }
        public Builder spdxPackage(PackageInfoOccurrenceResponse spdxPackage) {
            this.spdxPackage = Objects.requireNonNull(spdxPackage);
            return this;
        }
        public Builder spdxRelationship(RelationshipOccurrenceResponse spdxRelationship) {
            this.spdxRelationship = Objects.requireNonNull(spdxRelationship);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public Builder vulnerability(GrafeasV1beta1VulnerabilityDetailsResponse vulnerability) {
            this.vulnerability = Objects.requireNonNull(vulnerability);
            return this;
        }        public GetOccurrenceResult build() {
            return new GetOccurrenceResult(attestation, build, createTime, deployment, derivedImage, discovered, installation, intoto, kind, name, noteName, remediation, resource, sbom, spdxFile, spdxPackage, spdxRelationship, updateTime, vulnerability);
        }
    }
}
