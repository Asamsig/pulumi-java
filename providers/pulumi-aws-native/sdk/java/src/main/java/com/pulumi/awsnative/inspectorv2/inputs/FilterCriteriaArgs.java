// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.inspectorv2.inputs;

import com.pulumi.awsnative.inspectorv2.inputs.FilterDateFilterArgs;
import com.pulumi.awsnative.inspectorv2.inputs.FilterMapFilterArgs;
import com.pulumi.awsnative.inspectorv2.inputs.FilterNumberFilterArgs;
import com.pulumi.awsnative.inspectorv2.inputs.FilterPackageFilterArgs;
import com.pulumi.awsnative.inspectorv2.inputs.FilterPortRangeFilterArgs;
import com.pulumi.awsnative.inspectorv2.inputs.FilterStringFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FilterCriteriaArgs extends com.pulumi.resources.ResourceArgs {

    public static final FilterCriteriaArgs Empty = new FilterCriteriaArgs();

    @Import(name="awsAccountId")
    private @Nullable Output<List<FilterStringFilterArgs>> awsAccountId;

    public Optional<Output<List<FilterStringFilterArgs>>> awsAccountId() {
        return Optional.ofNullable(this.awsAccountId);
    }

    @Import(name="componentId")
    private @Nullable Output<List<FilterStringFilterArgs>> componentId;

    public Optional<Output<List<FilterStringFilterArgs>>> componentId() {
        return Optional.ofNullable(this.componentId);
    }

    @Import(name="componentType")
    private @Nullable Output<List<FilterStringFilterArgs>> componentType;

    public Optional<Output<List<FilterStringFilterArgs>>> componentType() {
        return Optional.ofNullable(this.componentType);
    }

    @Import(name="ec2InstanceImageId")
    private @Nullable Output<List<FilterStringFilterArgs>> ec2InstanceImageId;

    public Optional<Output<List<FilterStringFilterArgs>>> ec2InstanceImageId() {
        return Optional.ofNullable(this.ec2InstanceImageId);
    }

    @Import(name="ec2InstanceSubnetId")
    private @Nullable Output<List<FilterStringFilterArgs>> ec2InstanceSubnetId;

    public Optional<Output<List<FilterStringFilterArgs>>> ec2InstanceSubnetId() {
        return Optional.ofNullable(this.ec2InstanceSubnetId);
    }

    @Import(name="ec2InstanceVpcId")
    private @Nullable Output<List<FilterStringFilterArgs>> ec2InstanceVpcId;

    public Optional<Output<List<FilterStringFilterArgs>>> ec2InstanceVpcId() {
        return Optional.ofNullable(this.ec2InstanceVpcId);
    }

    @Import(name="ecrImageArchitecture")
    private @Nullable Output<List<FilterStringFilterArgs>> ecrImageArchitecture;

    public Optional<Output<List<FilterStringFilterArgs>>> ecrImageArchitecture() {
        return Optional.ofNullable(this.ecrImageArchitecture);
    }

    @Import(name="ecrImageHash")
    private @Nullable Output<List<FilterStringFilterArgs>> ecrImageHash;

    public Optional<Output<List<FilterStringFilterArgs>>> ecrImageHash() {
        return Optional.ofNullable(this.ecrImageHash);
    }

    @Import(name="ecrImagePushedAt")
    private @Nullable Output<List<FilterDateFilterArgs>> ecrImagePushedAt;

    public Optional<Output<List<FilterDateFilterArgs>>> ecrImagePushedAt() {
        return Optional.ofNullable(this.ecrImagePushedAt);
    }

    @Import(name="ecrImageRegistry")
    private @Nullable Output<List<FilterStringFilterArgs>> ecrImageRegistry;

    public Optional<Output<List<FilterStringFilterArgs>>> ecrImageRegistry() {
        return Optional.ofNullable(this.ecrImageRegistry);
    }

    @Import(name="ecrImageRepositoryName")
    private @Nullable Output<List<FilterStringFilterArgs>> ecrImageRepositoryName;

    public Optional<Output<List<FilterStringFilterArgs>>> ecrImageRepositoryName() {
        return Optional.ofNullable(this.ecrImageRepositoryName);
    }

    @Import(name="ecrImageTags")
    private @Nullable Output<List<FilterStringFilterArgs>> ecrImageTags;

    public Optional<Output<List<FilterStringFilterArgs>>> ecrImageTags() {
        return Optional.ofNullable(this.ecrImageTags);
    }

    @Import(name="findingArn")
    private @Nullable Output<List<FilterStringFilterArgs>> findingArn;

    public Optional<Output<List<FilterStringFilterArgs>>> findingArn() {
        return Optional.ofNullable(this.findingArn);
    }

    @Import(name="findingStatus")
    private @Nullable Output<List<FilterStringFilterArgs>> findingStatus;

    public Optional<Output<List<FilterStringFilterArgs>>> findingStatus() {
        return Optional.ofNullable(this.findingStatus);
    }

    @Import(name="findingType")
    private @Nullable Output<List<FilterStringFilterArgs>> findingType;

    public Optional<Output<List<FilterStringFilterArgs>>> findingType() {
        return Optional.ofNullable(this.findingType);
    }

    @Import(name="firstObservedAt")
    private @Nullable Output<List<FilterDateFilterArgs>> firstObservedAt;

    public Optional<Output<List<FilterDateFilterArgs>>> firstObservedAt() {
        return Optional.ofNullable(this.firstObservedAt);
    }

    @Import(name="inspectorScore")
    private @Nullable Output<List<FilterNumberFilterArgs>> inspectorScore;

    public Optional<Output<List<FilterNumberFilterArgs>>> inspectorScore() {
        return Optional.ofNullable(this.inspectorScore);
    }

    @Import(name="lastObservedAt")
    private @Nullable Output<List<FilterDateFilterArgs>> lastObservedAt;

    public Optional<Output<List<FilterDateFilterArgs>>> lastObservedAt() {
        return Optional.ofNullable(this.lastObservedAt);
    }

    @Import(name="networkProtocol")
    private @Nullable Output<List<FilterStringFilterArgs>> networkProtocol;

    public Optional<Output<List<FilterStringFilterArgs>>> networkProtocol() {
        return Optional.ofNullable(this.networkProtocol);
    }

    @Import(name="portRange")
    private @Nullable Output<List<FilterPortRangeFilterArgs>> portRange;

    public Optional<Output<List<FilterPortRangeFilterArgs>>> portRange() {
        return Optional.ofNullable(this.portRange);
    }

    @Import(name="relatedVulnerabilities")
    private @Nullable Output<List<FilterStringFilterArgs>> relatedVulnerabilities;

    public Optional<Output<List<FilterStringFilterArgs>>> relatedVulnerabilities() {
        return Optional.ofNullable(this.relatedVulnerabilities);
    }

    @Import(name="resourceId")
    private @Nullable Output<List<FilterStringFilterArgs>> resourceId;

    public Optional<Output<List<FilterStringFilterArgs>>> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    @Import(name="resourceTags")
    private @Nullable Output<List<FilterMapFilterArgs>> resourceTags;

    public Optional<Output<List<FilterMapFilterArgs>>> resourceTags() {
        return Optional.ofNullable(this.resourceTags);
    }

    @Import(name="resourceType")
    private @Nullable Output<List<FilterStringFilterArgs>> resourceType;

    public Optional<Output<List<FilterStringFilterArgs>>> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }

    @Import(name="severity")
    private @Nullable Output<List<FilterStringFilterArgs>> severity;

    public Optional<Output<List<FilterStringFilterArgs>>> severity() {
        return Optional.ofNullable(this.severity);
    }

    @Import(name="title")
    private @Nullable Output<List<FilterStringFilterArgs>> title;

    public Optional<Output<List<FilterStringFilterArgs>>> title() {
        return Optional.ofNullable(this.title);
    }

    @Import(name="updatedAt")
    private @Nullable Output<List<FilterDateFilterArgs>> updatedAt;

    public Optional<Output<List<FilterDateFilterArgs>>> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    @Import(name="vendorSeverity")
    private @Nullable Output<List<FilterStringFilterArgs>> vendorSeverity;

    public Optional<Output<List<FilterStringFilterArgs>>> vendorSeverity() {
        return Optional.ofNullable(this.vendorSeverity);
    }

    @Import(name="vulnerabilityId")
    private @Nullable Output<List<FilterStringFilterArgs>> vulnerabilityId;

    public Optional<Output<List<FilterStringFilterArgs>>> vulnerabilityId() {
        return Optional.ofNullable(this.vulnerabilityId);
    }

    @Import(name="vulnerabilitySource")
    private @Nullable Output<List<FilterStringFilterArgs>> vulnerabilitySource;

    public Optional<Output<List<FilterStringFilterArgs>>> vulnerabilitySource() {
        return Optional.ofNullable(this.vulnerabilitySource);
    }

    @Import(name="vulnerablePackages")
    private @Nullable Output<List<FilterPackageFilterArgs>> vulnerablePackages;

    public Optional<Output<List<FilterPackageFilterArgs>>> vulnerablePackages() {
        return Optional.ofNullable(this.vulnerablePackages);
    }

    private FilterCriteriaArgs() {}

    private FilterCriteriaArgs(FilterCriteriaArgs $) {
        this.awsAccountId = $.awsAccountId;
        this.componentId = $.componentId;
        this.componentType = $.componentType;
        this.ec2InstanceImageId = $.ec2InstanceImageId;
        this.ec2InstanceSubnetId = $.ec2InstanceSubnetId;
        this.ec2InstanceVpcId = $.ec2InstanceVpcId;
        this.ecrImageArchitecture = $.ecrImageArchitecture;
        this.ecrImageHash = $.ecrImageHash;
        this.ecrImagePushedAt = $.ecrImagePushedAt;
        this.ecrImageRegistry = $.ecrImageRegistry;
        this.ecrImageRepositoryName = $.ecrImageRepositoryName;
        this.ecrImageTags = $.ecrImageTags;
        this.findingArn = $.findingArn;
        this.findingStatus = $.findingStatus;
        this.findingType = $.findingType;
        this.firstObservedAt = $.firstObservedAt;
        this.inspectorScore = $.inspectorScore;
        this.lastObservedAt = $.lastObservedAt;
        this.networkProtocol = $.networkProtocol;
        this.portRange = $.portRange;
        this.relatedVulnerabilities = $.relatedVulnerabilities;
        this.resourceId = $.resourceId;
        this.resourceTags = $.resourceTags;
        this.resourceType = $.resourceType;
        this.severity = $.severity;
        this.title = $.title;
        this.updatedAt = $.updatedAt;
        this.vendorSeverity = $.vendorSeverity;
        this.vulnerabilityId = $.vulnerabilityId;
        this.vulnerabilitySource = $.vulnerabilitySource;
        this.vulnerablePackages = $.vulnerablePackages;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FilterCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FilterCriteriaArgs $;

        public Builder() {
            $ = new FilterCriteriaArgs();
        }

        public Builder(FilterCriteriaArgs defaults) {
            $ = new FilterCriteriaArgs(Objects.requireNonNull(defaults));
        }

        public Builder awsAccountId(@Nullable Output<List<FilterStringFilterArgs>> awsAccountId) {
            $.awsAccountId = awsAccountId;
            return this;
        }

        public Builder awsAccountId(List<FilterStringFilterArgs> awsAccountId) {
            return awsAccountId(Output.of(awsAccountId));
        }

        public Builder awsAccountId(FilterStringFilterArgs... awsAccountId) {
            return awsAccountId(List.of(awsAccountId));
        }

        public Builder componentId(@Nullable Output<List<FilterStringFilterArgs>> componentId) {
            $.componentId = componentId;
            return this;
        }

        public Builder componentId(List<FilterStringFilterArgs> componentId) {
            return componentId(Output.of(componentId));
        }

        public Builder componentId(FilterStringFilterArgs... componentId) {
            return componentId(List.of(componentId));
        }

        public Builder componentType(@Nullable Output<List<FilterStringFilterArgs>> componentType) {
            $.componentType = componentType;
            return this;
        }

        public Builder componentType(List<FilterStringFilterArgs> componentType) {
            return componentType(Output.of(componentType));
        }

        public Builder componentType(FilterStringFilterArgs... componentType) {
            return componentType(List.of(componentType));
        }

        public Builder ec2InstanceImageId(@Nullable Output<List<FilterStringFilterArgs>> ec2InstanceImageId) {
            $.ec2InstanceImageId = ec2InstanceImageId;
            return this;
        }

        public Builder ec2InstanceImageId(List<FilterStringFilterArgs> ec2InstanceImageId) {
            return ec2InstanceImageId(Output.of(ec2InstanceImageId));
        }

        public Builder ec2InstanceImageId(FilterStringFilterArgs... ec2InstanceImageId) {
            return ec2InstanceImageId(List.of(ec2InstanceImageId));
        }

        public Builder ec2InstanceSubnetId(@Nullable Output<List<FilterStringFilterArgs>> ec2InstanceSubnetId) {
            $.ec2InstanceSubnetId = ec2InstanceSubnetId;
            return this;
        }

        public Builder ec2InstanceSubnetId(List<FilterStringFilterArgs> ec2InstanceSubnetId) {
            return ec2InstanceSubnetId(Output.of(ec2InstanceSubnetId));
        }

        public Builder ec2InstanceSubnetId(FilterStringFilterArgs... ec2InstanceSubnetId) {
            return ec2InstanceSubnetId(List.of(ec2InstanceSubnetId));
        }

        public Builder ec2InstanceVpcId(@Nullable Output<List<FilterStringFilterArgs>> ec2InstanceVpcId) {
            $.ec2InstanceVpcId = ec2InstanceVpcId;
            return this;
        }

        public Builder ec2InstanceVpcId(List<FilterStringFilterArgs> ec2InstanceVpcId) {
            return ec2InstanceVpcId(Output.of(ec2InstanceVpcId));
        }

        public Builder ec2InstanceVpcId(FilterStringFilterArgs... ec2InstanceVpcId) {
            return ec2InstanceVpcId(List.of(ec2InstanceVpcId));
        }

        public Builder ecrImageArchitecture(@Nullable Output<List<FilterStringFilterArgs>> ecrImageArchitecture) {
            $.ecrImageArchitecture = ecrImageArchitecture;
            return this;
        }

        public Builder ecrImageArchitecture(List<FilterStringFilterArgs> ecrImageArchitecture) {
            return ecrImageArchitecture(Output.of(ecrImageArchitecture));
        }

        public Builder ecrImageArchitecture(FilterStringFilterArgs... ecrImageArchitecture) {
            return ecrImageArchitecture(List.of(ecrImageArchitecture));
        }

        public Builder ecrImageHash(@Nullable Output<List<FilterStringFilterArgs>> ecrImageHash) {
            $.ecrImageHash = ecrImageHash;
            return this;
        }

        public Builder ecrImageHash(List<FilterStringFilterArgs> ecrImageHash) {
            return ecrImageHash(Output.of(ecrImageHash));
        }

        public Builder ecrImageHash(FilterStringFilterArgs... ecrImageHash) {
            return ecrImageHash(List.of(ecrImageHash));
        }

        public Builder ecrImagePushedAt(@Nullable Output<List<FilterDateFilterArgs>> ecrImagePushedAt) {
            $.ecrImagePushedAt = ecrImagePushedAt;
            return this;
        }

        public Builder ecrImagePushedAt(List<FilterDateFilterArgs> ecrImagePushedAt) {
            return ecrImagePushedAt(Output.of(ecrImagePushedAt));
        }

        public Builder ecrImagePushedAt(FilterDateFilterArgs... ecrImagePushedAt) {
            return ecrImagePushedAt(List.of(ecrImagePushedAt));
        }

        public Builder ecrImageRegistry(@Nullable Output<List<FilterStringFilterArgs>> ecrImageRegistry) {
            $.ecrImageRegistry = ecrImageRegistry;
            return this;
        }

        public Builder ecrImageRegistry(List<FilterStringFilterArgs> ecrImageRegistry) {
            return ecrImageRegistry(Output.of(ecrImageRegistry));
        }

        public Builder ecrImageRegistry(FilterStringFilterArgs... ecrImageRegistry) {
            return ecrImageRegistry(List.of(ecrImageRegistry));
        }

        public Builder ecrImageRepositoryName(@Nullable Output<List<FilterStringFilterArgs>> ecrImageRepositoryName) {
            $.ecrImageRepositoryName = ecrImageRepositoryName;
            return this;
        }

        public Builder ecrImageRepositoryName(List<FilterStringFilterArgs> ecrImageRepositoryName) {
            return ecrImageRepositoryName(Output.of(ecrImageRepositoryName));
        }

        public Builder ecrImageRepositoryName(FilterStringFilterArgs... ecrImageRepositoryName) {
            return ecrImageRepositoryName(List.of(ecrImageRepositoryName));
        }

        public Builder ecrImageTags(@Nullable Output<List<FilterStringFilterArgs>> ecrImageTags) {
            $.ecrImageTags = ecrImageTags;
            return this;
        }

        public Builder ecrImageTags(List<FilterStringFilterArgs> ecrImageTags) {
            return ecrImageTags(Output.of(ecrImageTags));
        }

        public Builder ecrImageTags(FilterStringFilterArgs... ecrImageTags) {
            return ecrImageTags(List.of(ecrImageTags));
        }

        public Builder findingArn(@Nullable Output<List<FilterStringFilterArgs>> findingArn) {
            $.findingArn = findingArn;
            return this;
        }

        public Builder findingArn(List<FilterStringFilterArgs> findingArn) {
            return findingArn(Output.of(findingArn));
        }

        public Builder findingArn(FilterStringFilterArgs... findingArn) {
            return findingArn(List.of(findingArn));
        }

        public Builder findingStatus(@Nullable Output<List<FilterStringFilterArgs>> findingStatus) {
            $.findingStatus = findingStatus;
            return this;
        }

        public Builder findingStatus(List<FilterStringFilterArgs> findingStatus) {
            return findingStatus(Output.of(findingStatus));
        }

        public Builder findingStatus(FilterStringFilterArgs... findingStatus) {
            return findingStatus(List.of(findingStatus));
        }

        public Builder findingType(@Nullable Output<List<FilterStringFilterArgs>> findingType) {
            $.findingType = findingType;
            return this;
        }

        public Builder findingType(List<FilterStringFilterArgs> findingType) {
            return findingType(Output.of(findingType));
        }

        public Builder findingType(FilterStringFilterArgs... findingType) {
            return findingType(List.of(findingType));
        }

        public Builder firstObservedAt(@Nullable Output<List<FilterDateFilterArgs>> firstObservedAt) {
            $.firstObservedAt = firstObservedAt;
            return this;
        }

        public Builder firstObservedAt(List<FilterDateFilterArgs> firstObservedAt) {
            return firstObservedAt(Output.of(firstObservedAt));
        }

        public Builder firstObservedAt(FilterDateFilterArgs... firstObservedAt) {
            return firstObservedAt(List.of(firstObservedAt));
        }

        public Builder inspectorScore(@Nullable Output<List<FilterNumberFilterArgs>> inspectorScore) {
            $.inspectorScore = inspectorScore;
            return this;
        }

        public Builder inspectorScore(List<FilterNumberFilterArgs> inspectorScore) {
            return inspectorScore(Output.of(inspectorScore));
        }

        public Builder inspectorScore(FilterNumberFilterArgs... inspectorScore) {
            return inspectorScore(List.of(inspectorScore));
        }

        public Builder lastObservedAt(@Nullable Output<List<FilterDateFilterArgs>> lastObservedAt) {
            $.lastObservedAt = lastObservedAt;
            return this;
        }

        public Builder lastObservedAt(List<FilterDateFilterArgs> lastObservedAt) {
            return lastObservedAt(Output.of(lastObservedAt));
        }

        public Builder lastObservedAt(FilterDateFilterArgs... lastObservedAt) {
            return lastObservedAt(List.of(lastObservedAt));
        }

        public Builder networkProtocol(@Nullable Output<List<FilterStringFilterArgs>> networkProtocol) {
            $.networkProtocol = networkProtocol;
            return this;
        }

        public Builder networkProtocol(List<FilterStringFilterArgs> networkProtocol) {
            return networkProtocol(Output.of(networkProtocol));
        }

        public Builder networkProtocol(FilterStringFilterArgs... networkProtocol) {
            return networkProtocol(List.of(networkProtocol));
        }

        public Builder portRange(@Nullable Output<List<FilterPortRangeFilterArgs>> portRange) {
            $.portRange = portRange;
            return this;
        }

        public Builder portRange(List<FilterPortRangeFilterArgs> portRange) {
            return portRange(Output.of(portRange));
        }

        public Builder portRange(FilterPortRangeFilterArgs... portRange) {
            return portRange(List.of(portRange));
        }

        public Builder relatedVulnerabilities(@Nullable Output<List<FilterStringFilterArgs>> relatedVulnerabilities) {
            $.relatedVulnerabilities = relatedVulnerabilities;
            return this;
        }

        public Builder relatedVulnerabilities(List<FilterStringFilterArgs> relatedVulnerabilities) {
            return relatedVulnerabilities(Output.of(relatedVulnerabilities));
        }

        public Builder relatedVulnerabilities(FilterStringFilterArgs... relatedVulnerabilities) {
            return relatedVulnerabilities(List.of(relatedVulnerabilities));
        }

        public Builder resourceId(@Nullable Output<List<FilterStringFilterArgs>> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        public Builder resourceId(List<FilterStringFilterArgs> resourceId) {
            return resourceId(Output.of(resourceId));
        }

        public Builder resourceId(FilterStringFilterArgs... resourceId) {
            return resourceId(List.of(resourceId));
        }

        public Builder resourceTags(@Nullable Output<List<FilterMapFilterArgs>> resourceTags) {
            $.resourceTags = resourceTags;
            return this;
        }

        public Builder resourceTags(List<FilterMapFilterArgs> resourceTags) {
            return resourceTags(Output.of(resourceTags));
        }

        public Builder resourceTags(FilterMapFilterArgs... resourceTags) {
            return resourceTags(List.of(resourceTags));
        }

        public Builder resourceType(@Nullable Output<List<FilterStringFilterArgs>> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        public Builder resourceType(List<FilterStringFilterArgs> resourceType) {
            return resourceType(Output.of(resourceType));
        }

        public Builder resourceType(FilterStringFilterArgs... resourceType) {
            return resourceType(List.of(resourceType));
        }

        public Builder severity(@Nullable Output<List<FilterStringFilterArgs>> severity) {
            $.severity = severity;
            return this;
        }

        public Builder severity(List<FilterStringFilterArgs> severity) {
            return severity(Output.of(severity));
        }

        public Builder severity(FilterStringFilterArgs... severity) {
            return severity(List.of(severity));
        }

        public Builder title(@Nullable Output<List<FilterStringFilterArgs>> title) {
            $.title = title;
            return this;
        }

        public Builder title(List<FilterStringFilterArgs> title) {
            return title(Output.of(title));
        }

        public Builder title(FilterStringFilterArgs... title) {
            return title(List.of(title));
        }

        public Builder updatedAt(@Nullable Output<List<FilterDateFilterArgs>> updatedAt) {
            $.updatedAt = updatedAt;
            return this;
        }

        public Builder updatedAt(List<FilterDateFilterArgs> updatedAt) {
            return updatedAt(Output.of(updatedAt));
        }

        public Builder updatedAt(FilterDateFilterArgs... updatedAt) {
            return updatedAt(List.of(updatedAt));
        }

        public Builder vendorSeverity(@Nullable Output<List<FilterStringFilterArgs>> vendorSeverity) {
            $.vendorSeverity = vendorSeverity;
            return this;
        }

        public Builder vendorSeverity(List<FilterStringFilterArgs> vendorSeverity) {
            return vendorSeverity(Output.of(vendorSeverity));
        }

        public Builder vendorSeverity(FilterStringFilterArgs... vendorSeverity) {
            return vendorSeverity(List.of(vendorSeverity));
        }

        public Builder vulnerabilityId(@Nullable Output<List<FilterStringFilterArgs>> vulnerabilityId) {
            $.vulnerabilityId = vulnerabilityId;
            return this;
        }

        public Builder vulnerabilityId(List<FilterStringFilterArgs> vulnerabilityId) {
            return vulnerabilityId(Output.of(vulnerabilityId));
        }

        public Builder vulnerabilityId(FilterStringFilterArgs... vulnerabilityId) {
            return vulnerabilityId(List.of(vulnerabilityId));
        }

        public Builder vulnerabilitySource(@Nullable Output<List<FilterStringFilterArgs>> vulnerabilitySource) {
            $.vulnerabilitySource = vulnerabilitySource;
            return this;
        }

        public Builder vulnerabilitySource(List<FilterStringFilterArgs> vulnerabilitySource) {
            return vulnerabilitySource(Output.of(vulnerabilitySource));
        }

        public Builder vulnerabilitySource(FilterStringFilterArgs... vulnerabilitySource) {
            return vulnerabilitySource(List.of(vulnerabilitySource));
        }

        public Builder vulnerablePackages(@Nullable Output<List<FilterPackageFilterArgs>> vulnerablePackages) {
            $.vulnerablePackages = vulnerablePackages;
            return this;
        }

        public Builder vulnerablePackages(List<FilterPackageFilterArgs> vulnerablePackages) {
            return vulnerablePackages(Output.of(vulnerablePackages));
        }

        public Builder vulnerablePackages(FilterPackageFilterArgs... vulnerablePackages) {
            return vulnerablePackages(List.of(vulnerablePackages));
        }

        public FilterCriteriaArgs build() {
            return $;
        }
    }

}
