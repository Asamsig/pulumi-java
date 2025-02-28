// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lambda.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetLayerVersionResult {
    /**
     * @return The Amazon Resource Name (ARN) of the Lambda Layer with version.
     * 
     */
    private final String arn;
    private final @Nullable String compatibleArchitecture;
    /**
     * @return A list of [Architectures](https://docs.aws.amazon.com/lambda/latest/dg/API_GetLayerVersion.html#SSS-GetLayerVersion-response-CompatibleArchitectures) the specific Lambda Layer version is compatible with.
     * 
     */
    private final List<String> compatibleArchitectures;
    private final @Nullable String compatibleRuntime;
    /**
     * @return A list of [Runtimes](https://docs.aws.amazon.com/lambda/latest/dg/API_GetLayerVersion.html#SSS-GetLayerVersion-response-CompatibleRuntimes) the specific Lambda Layer version is compatible with.
     * 
     */
    private final List<String> compatibleRuntimes;
    /**
     * @return The date this resource was created.
     * 
     */
    private final String createdDate;
    /**
     * @return Description of the specific Lambda Layer version.
     * 
     */
    private final String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The Amazon Resource Name (ARN) of the Lambda Layer without version.
     * 
     */
    private final String layerArn;
    private final String layerName;
    /**
     * @return License info associated with the specific Lambda Layer version.
     * 
     */
    private final String licenseInfo;
    /**
     * @return The Amazon Resource Name (ARN) of a signing job.
     * 
     */
    private final String signingJobArn;
    /**
     * @return The Amazon Resource Name (ARN) for a signing profile version.
     * 
     */
    private final String signingProfileVersionArn;
    /**
     * @return Base64-encoded representation of raw SHA-256 sum of the zip file.
     * 
     */
    private final String sourceCodeHash;
    /**
     * @return The size in bytes of the function .zip file.
     * 
     */
    private final Integer sourceCodeSize;
    /**
     * @return This Lamba Layer version.
     * 
     */
    private final Integer version;

    @CustomType.Constructor
    private GetLayerVersionResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("compatibleArchitecture") @Nullable String compatibleArchitecture,
        @CustomType.Parameter("compatibleArchitectures") List<String> compatibleArchitectures,
        @CustomType.Parameter("compatibleRuntime") @Nullable String compatibleRuntime,
        @CustomType.Parameter("compatibleRuntimes") List<String> compatibleRuntimes,
        @CustomType.Parameter("createdDate") String createdDate,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("layerArn") String layerArn,
        @CustomType.Parameter("layerName") String layerName,
        @CustomType.Parameter("licenseInfo") String licenseInfo,
        @CustomType.Parameter("signingJobArn") String signingJobArn,
        @CustomType.Parameter("signingProfileVersionArn") String signingProfileVersionArn,
        @CustomType.Parameter("sourceCodeHash") String sourceCodeHash,
        @CustomType.Parameter("sourceCodeSize") Integer sourceCodeSize,
        @CustomType.Parameter("version") Integer version) {
        this.arn = arn;
        this.compatibleArchitecture = compatibleArchitecture;
        this.compatibleArchitectures = compatibleArchitectures;
        this.compatibleRuntime = compatibleRuntime;
        this.compatibleRuntimes = compatibleRuntimes;
        this.createdDate = createdDate;
        this.description = description;
        this.id = id;
        this.layerArn = layerArn;
        this.layerName = layerName;
        this.licenseInfo = licenseInfo;
        this.signingJobArn = signingJobArn;
        this.signingProfileVersionArn = signingProfileVersionArn;
        this.sourceCodeHash = sourceCodeHash;
        this.sourceCodeSize = sourceCodeSize;
        this.version = version;
    }

    /**
     * @return The Amazon Resource Name (ARN) of the Lambda Layer with version.
     * 
     */
    public String arn() {
        return this.arn;
    }
    public Optional<String> compatibleArchitecture() {
        return Optional.ofNullable(this.compatibleArchitecture);
    }
    /**
     * @return A list of [Architectures](https://docs.aws.amazon.com/lambda/latest/dg/API_GetLayerVersion.html#SSS-GetLayerVersion-response-CompatibleArchitectures) the specific Lambda Layer version is compatible with.
     * 
     */
    public List<String> compatibleArchitectures() {
        return this.compatibleArchitectures;
    }
    public Optional<String> compatibleRuntime() {
        return Optional.ofNullable(this.compatibleRuntime);
    }
    /**
     * @return A list of [Runtimes](https://docs.aws.amazon.com/lambda/latest/dg/API_GetLayerVersion.html#SSS-GetLayerVersion-response-CompatibleRuntimes) the specific Lambda Layer version is compatible with.
     * 
     */
    public List<String> compatibleRuntimes() {
        return this.compatibleRuntimes;
    }
    /**
     * @return The date this resource was created.
     * 
     */
    public String createdDate() {
        return this.createdDate;
    }
    /**
     * @return Description of the specific Lambda Layer version.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Amazon Resource Name (ARN) of the Lambda Layer without version.
     * 
     */
    public String layerArn() {
        return this.layerArn;
    }
    public String layerName() {
        return this.layerName;
    }
    /**
     * @return License info associated with the specific Lambda Layer version.
     * 
     */
    public String licenseInfo() {
        return this.licenseInfo;
    }
    /**
     * @return The Amazon Resource Name (ARN) of a signing job.
     * 
     */
    public String signingJobArn() {
        return this.signingJobArn;
    }
    /**
     * @return The Amazon Resource Name (ARN) for a signing profile version.
     * 
     */
    public String signingProfileVersionArn() {
        return this.signingProfileVersionArn;
    }
    /**
     * @return Base64-encoded representation of raw SHA-256 sum of the zip file.
     * 
     */
    public String sourceCodeHash() {
        return this.sourceCodeHash;
    }
    /**
     * @return The size in bytes of the function .zip file.
     * 
     */
    public Integer sourceCodeSize() {
        return this.sourceCodeSize;
    }
    /**
     * @return This Lamba Layer version.
     * 
     */
    public Integer version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLayerVersionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private @Nullable String compatibleArchitecture;
        private List<String> compatibleArchitectures;
        private @Nullable String compatibleRuntime;
        private List<String> compatibleRuntimes;
        private String createdDate;
        private String description;
        private String id;
        private String layerArn;
        private String layerName;
        private String licenseInfo;
        private String signingJobArn;
        private String signingProfileVersionArn;
        private String sourceCodeHash;
        private Integer sourceCodeSize;
        private Integer version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLayerVersionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.compatibleArchitecture = defaults.compatibleArchitecture;
    	      this.compatibleArchitectures = defaults.compatibleArchitectures;
    	      this.compatibleRuntime = defaults.compatibleRuntime;
    	      this.compatibleRuntimes = defaults.compatibleRuntimes;
    	      this.createdDate = defaults.createdDate;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.layerArn = defaults.layerArn;
    	      this.layerName = defaults.layerName;
    	      this.licenseInfo = defaults.licenseInfo;
    	      this.signingJobArn = defaults.signingJobArn;
    	      this.signingProfileVersionArn = defaults.signingProfileVersionArn;
    	      this.sourceCodeHash = defaults.sourceCodeHash;
    	      this.sourceCodeSize = defaults.sourceCodeSize;
    	      this.version = defaults.version;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder compatibleArchitecture(@Nullable String compatibleArchitecture) {
            this.compatibleArchitecture = compatibleArchitecture;
            return this;
        }
        public Builder compatibleArchitectures(List<String> compatibleArchitectures) {
            this.compatibleArchitectures = Objects.requireNonNull(compatibleArchitectures);
            return this;
        }
        public Builder compatibleArchitectures(String... compatibleArchitectures) {
            return compatibleArchitectures(List.of(compatibleArchitectures));
        }
        public Builder compatibleRuntime(@Nullable String compatibleRuntime) {
            this.compatibleRuntime = compatibleRuntime;
            return this;
        }
        public Builder compatibleRuntimes(List<String> compatibleRuntimes) {
            this.compatibleRuntimes = Objects.requireNonNull(compatibleRuntimes);
            return this;
        }
        public Builder compatibleRuntimes(String... compatibleRuntimes) {
            return compatibleRuntimes(List.of(compatibleRuntimes));
        }
        public Builder createdDate(String createdDate) {
            this.createdDate = Objects.requireNonNull(createdDate);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder layerArn(String layerArn) {
            this.layerArn = Objects.requireNonNull(layerArn);
            return this;
        }
        public Builder layerName(String layerName) {
            this.layerName = Objects.requireNonNull(layerName);
            return this;
        }
        public Builder licenseInfo(String licenseInfo) {
            this.licenseInfo = Objects.requireNonNull(licenseInfo);
            return this;
        }
        public Builder signingJobArn(String signingJobArn) {
            this.signingJobArn = Objects.requireNonNull(signingJobArn);
            return this;
        }
        public Builder signingProfileVersionArn(String signingProfileVersionArn) {
            this.signingProfileVersionArn = Objects.requireNonNull(signingProfileVersionArn);
            return this;
        }
        public Builder sourceCodeHash(String sourceCodeHash) {
            this.sourceCodeHash = Objects.requireNonNull(sourceCodeHash);
            return this;
        }
        public Builder sourceCodeSize(Integer sourceCodeSize) {
            this.sourceCodeSize = Objects.requireNonNull(sourceCodeSize);
            return this;
        }
        public Builder version(Integer version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public GetLayerVersionResult build() {
            return new GetLayerVersionResult(arn, compatibleArchitecture, compatibleArchitectures, compatibleRuntime, compatibleRuntimes, createdDate, description, id, layerArn, layerName, licenseInfo, signingJobArn, signingProfileVersionArn, sourceCodeHash, sourceCodeSize, version);
        }
    }
}
