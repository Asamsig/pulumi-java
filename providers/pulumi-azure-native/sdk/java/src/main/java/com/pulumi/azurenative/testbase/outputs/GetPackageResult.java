// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.testbase.outputs;

import com.pulumi.azurenative.testbase.outputs.PackageValidationResultResponse;
import com.pulumi.azurenative.testbase.outputs.SystemDataResponse;
import com.pulumi.azurenative.testbase.outputs.TargetOSInfoResponse;
import com.pulumi.azurenative.testbase.outputs.TestResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetPackageResult {
    /**
     * @return Application name
     * 
     */
    private final String applicationName;
    /**
     * @return The file path of the package.
     * 
     */
    private final String blobPath;
    /**
     * @return Resource Etag.
     * 
     */
    private final String etag;
    /**
     * @return The flighting ring for feature update.
     * 
     */
    private final String flightingRing;
    /**
     * @return Resource ID.
     * 
     */
    private final String id;
    /**
     * @return Flag showing that whether the package is enabled. It doesn&#39;t schedule test for package which is not enabled.
     * 
     */
    private final Boolean isEnabled;
    /**
     * @return The UTC timestamp when the package was last modified.
     * 
     */
    private final String lastModifiedTime;
    /**
     * @return The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * @return Resource name.
     * 
     */
    private final String name;
    /**
     * @return The status of the package.
     * 
     */
    private final String packageStatus;
    /**
     * @return The provisioning state of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * @return The system metadata relating to this resource
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * @return The tags of the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return Specifies the target OSs of specific OS Update types.
     * 
     */
    private final List<TargetOSInfoResponse> targetOSList;
    /**
     * @return OOB, functional or both. Mapped to the data in &#39;tests&#39; property.
     * 
     */
    private final List<String> testTypes;
    /**
     * @return The detailed test information.
     * 
     */
    private final List<TestResponse> tests;
    /**
     * @return Resource type.
     * 
     */
    private final String type;
    /**
     * @return The validation results. There&#39;s validation on package when it&#39;s created or updated.
     * 
     */
    private final List<PackageValidationResultResponse> validationResults;
    /**
     * @return Application version
     * 
     */
    private final String version;

    @CustomType.Constructor
    private GetPackageResult(
        @CustomType.Parameter("applicationName") String applicationName,
        @CustomType.Parameter("blobPath") String blobPath,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("flightingRing") String flightingRing,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isEnabled") Boolean isEnabled,
        @CustomType.Parameter("lastModifiedTime") String lastModifiedTime,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("packageStatus") String packageStatus,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("targetOSList") List<TargetOSInfoResponse> targetOSList,
        @CustomType.Parameter("testTypes") List<String> testTypes,
        @CustomType.Parameter("tests") List<TestResponse> tests,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("validationResults") List<PackageValidationResultResponse> validationResults,
        @CustomType.Parameter("version") String version) {
        this.applicationName = applicationName;
        this.blobPath = blobPath;
        this.etag = etag;
        this.flightingRing = flightingRing;
        this.id = id;
        this.isEnabled = isEnabled;
        this.lastModifiedTime = lastModifiedTime;
        this.location = location;
        this.name = name;
        this.packageStatus = packageStatus;
        this.provisioningState = provisioningState;
        this.systemData = systemData;
        this.tags = tags;
        this.targetOSList = targetOSList;
        this.testTypes = testTypes;
        this.tests = tests;
        this.type = type;
        this.validationResults = validationResults;
        this.version = version;
    }

    /**
     * @return Application name
     * 
     */
    public String applicationName() {
        return this.applicationName;
    }
    /**
     * @return The file path of the package.
     * 
     */
    public String blobPath() {
        return this.blobPath;
    }
    /**
     * @return Resource Etag.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return The flighting ring for feature update.
     * 
     */
    public String flightingRing() {
        return this.flightingRing;
    }
    /**
     * @return Resource ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Flag showing that whether the package is enabled. It doesn&#39;t schedule test for package which is not enabled.
     * 
     */
    public Boolean isEnabled() {
        return this.isEnabled;
    }
    /**
     * @return The UTC timestamp when the package was last modified.
     * 
     */
    public String lastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * @return The geo-location where the resource lives
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The status of the package.
     * 
     */
    public String packageStatus() {
        return this.packageStatus;
    }
    /**
     * @return The provisioning state of the resource.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return The system metadata relating to this resource
     * 
     */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * @return The tags of the resource.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Specifies the target OSs of specific OS Update types.
     * 
     */
    public List<TargetOSInfoResponse> targetOSList() {
        return this.targetOSList;
    }
    /**
     * @return OOB, functional or both. Mapped to the data in &#39;tests&#39; property.
     * 
     */
    public List<String> testTypes() {
        return this.testTypes;
    }
    /**
     * @return The detailed test information.
     * 
     */
    public List<TestResponse> tests() {
        return this.tests;
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The validation results. There&#39;s validation on package when it&#39;s created or updated.
     * 
     */
    public List<PackageValidationResultResponse> validationResults() {
        return this.validationResults;
    }
    /**
     * @return Application version
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPackageResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String applicationName;
        private String blobPath;
        private String etag;
        private String flightingRing;
        private String id;
        private Boolean isEnabled;
        private String lastModifiedTime;
        private String location;
        private String name;
        private String packageStatus;
        private String provisioningState;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private List<TargetOSInfoResponse> targetOSList;
        private List<String> testTypes;
        private List<TestResponse> tests;
        private String type;
        private List<PackageValidationResultResponse> validationResults;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPackageResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationName = defaults.applicationName;
    	      this.blobPath = defaults.blobPath;
    	      this.etag = defaults.etag;
    	      this.flightingRing = defaults.flightingRing;
    	      this.id = defaults.id;
    	      this.isEnabled = defaults.isEnabled;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.packageStatus = defaults.packageStatus;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.targetOSList = defaults.targetOSList;
    	      this.testTypes = defaults.testTypes;
    	      this.tests = defaults.tests;
    	      this.type = defaults.type;
    	      this.validationResults = defaults.validationResults;
    	      this.version = defaults.version;
        }

        public Builder applicationName(String applicationName) {
            this.applicationName = Objects.requireNonNull(applicationName);
            return this;
        }
        public Builder blobPath(String blobPath) {
            this.blobPath = Objects.requireNonNull(blobPath);
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder flightingRing(String flightingRing) {
            this.flightingRing = Objects.requireNonNull(flightingRing);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder packageStatus(String packageStatus) {
            this.packageStatus = Objects.requireNonNull(packageStatus);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder targetOSList(List<TargetOSInfoResponse> targetOSList) {
            this.targetOSList = Objects.requireNonNull(targetOSList);
            return this;
        }
        public Builder targetOSList(TargetOSInfoResponse... targetOSList) {
            return targetOSList(List.of(targetOSList));
        }
        public Builder testTypes(List<String> testTypes) {
            this.testTypes = Objects.requireNonNull(testTypes);
            return this;
        }
        public Builder testTypes(String... testTypes) {
            return testTypes(List.of(testTypes));
        }
        public Builder tests(List<TestResponse> tests) {
            this.tests = Objects.requireNonNull(tests);
            return this;
        }
        public Builder tests(TestResponse... tests) {
            return tests(List.of(tests));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder validationResults(List<PackageValidationResultResponse> validationResults) {
            this.validationResults = Objects.requireNonNull(validationResults);
            return this;
        }
        public Builder validationResults(PackageValidationResultResponse... validationResults) {
            return validationResults(List.of(validationResults));
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public GetPackageResult build() {
            return new GetPackageResult(applicationName, blobPath, etag, flightingRing, id, isEnabled, lastModifiedTime, location, name, packageStatus, provisioningState, systemData, tags, targetOSList, testTypes, tests, type, validationResults, version);
        }
    }
}
