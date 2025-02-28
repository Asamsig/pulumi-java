// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.outputs;

import com.pulumi.awsnative.s3.enums.BucketAccessControl;
import com.pulumi.awsnative.s3.outputs.BucketAccelerateConfiguration;
import com.pulumi.awsnative.s3.outputs.BucketAnalyticsConfiguration;
import com.pulumi.awsnative.s3.outputs.BucketCorsConfiguration;
import com.pulumi.awsnative.s3.outputs.BucketEncryption;
import com.pulumi.awsnative.s3.outputs.BucketIntelligentTieringConfiguration;
import com.pulumi.awsnative.s3.outputs.BucketInventoryConfiguration;
import com.pulumi.awsnative.s3.outputs.BucketLifecycleConfiguration;
import com.pulumi.awsnative.s3.outputs.BucketLoggingConfiguration;
import com.pulumi.awsnative.s3.outputs.BucketMetricsConfiguration;
import com.pulumi.awsnative.s3.outputs.BucketNotificationConfiguration;
import com.pulumi.awsnative.s3.outputs.BucketObjectLockConfiguration;
import com.pulumi.awsnative.s3.outputs.BucketOwnershipControls;
import com.pulumi.awsnative.s3.outputs.BucketPublicAccessBlockConfiguration;
import com.pulumi.awsnative.s3.outputs.BucketReplicationConfiguration;
import com.pulumi.awsnative.s3.outputs.BucketTag;
import com.pulumi.awsnative.s3.outputs.BucketVersioningConfiguration;
import com.pulumi.awsnative.s3.outputs.BucketWebsiteConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetBucketResult {
    /**
     * @return Configuration for the transfer acceleration state.
     * 
     */
    private final @Nullable BucketAccelerateConfiguration accelerateConfiguration;
    /**
     * @return A canned access control list (ACL) that grants predefined permissions to the bucket.
     * 
     */
    private final @Nullable BucketAccessControl accessControl;
    /**
     * @return The configuration and any analyses for the analytics filter of an Amazon S3 bucket.
     * 
     */
    private final @Nullable List<BucketAnalyticsConfiguration> analyticsConfigurations;
    /**
     * @return The Amazon Resource Name (ARN) of the specified bucket.
     * 
     */
    private final @Nullable String arn;
    private final @Nullable BucketEncryption bucketEncryption;
    /**
     * @return Rules that define cross-origin resource sharing of objects in this bucket.
     * 
     */
    private final @Nullable BucketCorsConfiguration corsConfiguration;
    /**
     * @return The IPv4 DNS name of the specified bucket.
     * 
     */
    private final @Nullable String domainName;
    /**
     * @return The IPv6 DNS name of the specified bucket. For more information about dual-stack endpoints, see [Using Amazon S3 Dual-Stack Endpoints](https://docs.aws.amazon.com/AmazonS3/latest/dev/dual-stack-endpoints.html).
     * 
     */
    private final @Nullable String dualStackDomainName;
    /**
     * @return Specifies the S3 Intelligent-Tiering configuration for an Amazon S3 bucket.
     * 
     */
    private final @Nullable List<BucketIntelligentTieringConfiguration> intelligentTieringConfigurations;
    /**
     * @return The inventory configuration for an Amazon S3 bucket.
     * 
     */
    private final @Nullable List<BucketInventoryConfiguration> inventoryConfigurations;
    /**
     * @return Rules that define how Amazon S3 manages objects during their lifetime.
     * 
     */
    private final @Nullable BucketLifecycleConfiguration lifecycleConfiguration;
    /**
     * @return Settings that define where logs are stored.
     * 
     */
    private final @Nullable BucketLoggingConfiguration loggingConfiguration;
    /**
     * @return Settings that define a metrics configuration for the CloudWatch request metrics from the bucket.
     * 
     */
    private final @Nullable List<BucketMetricsConfiguration> metricsConfigurations;
    /**
     * @return Configuration that defines how Amazon S3 handles bucket notifications.
     * 
     */
    private final @Nullable BucketNotificationConfiguration notificationConfiguration;
    /**
     * @return Places an Object Lock configuration on the specified bucket.
     * 
     */
    private final @Nullable BucketObjectLockConfiguration objectLockConfiguration;
    /**
     * @return Specifies the container element for object ownership rules.
     * 
     */
    private final @Nullable BucketOwnershipControls ownershipControls;
    private final @Nullable BucketPublicAccessBlockConfiguration publicAccessBlockConfiguration;
    /**
     * @return Returns the regional domain name of the specified bucket.
     * 
     */
    private final @Nullable String regionalDomainName;
    /**
     * @return Configuration for replicating objects in an S3 bucket.
     * 
     */
    private final @Nullable BucketReplicationConfiguration replicationConfiguration;
    /**
     * @return An arbitrary set of tags (key-value pairs) for this S3 bucket.
     * 
     */
    private final @Nullable List<BucketTag> tags;
    private final @Nullable BucketVersioningConfiguration versioningConfiguration;
    private final @Nullable BucketWebsiteConfiguration websiteConfiguration;
    /**
     * @return The Amazon S3 website endpoint for the specified bucket.
     * 
     */
    private final @Nullable String websiteURL;

    @CustomType.Constructor
    private GetBucketResult(
        @CustomType.Parameter("accelerateConfiguration") @Nullable BucketAccelerateConfiguration accelerateConfiguration,
        @CustomType.Parameter("accessControl") @Nullable BucketAccessControl accessControl,
        @CustomType.Parameter("analyticsConfigurations") @Nullable List<BucketAnalyticsConfiguration> analyticsConfigurations,
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("bucketEncryption") @Nullable BucketEncryption bucketEncryption,
        @CustomType.Parameter("corsConfiguration") @Nullable BucketCorsConfiguration corsConfiguration,
        @CustomType.Parameter("domainName") @Nullable String domainName,
        @CustomType.Parameter("dualStackDomainName") @Nullable String dualStackDomainName,
        @CustomType.Parameter("intelligentTieringConfigurations") @Nullable List<BucketIntelligentTieringConfiguration> intelligentTieringConfigurations,
        @CustomType.Parameter("inventoryConfigurations") @Nullable List<BucketInventoryConfiguration> inventoryConfigurations,
        @CustomType.Parameter("lifecycleConfiguration") @Nullable BucketLifecycleConfiguration lifecycleConfiguration,
        @CustomType.Parameter("loggingConfiguration") @Nullable BucketLoggingConfiguration loggingConfiguration,
        @CustomType.Parameter("metricsConfigurations") @Nullable List<BucketMetricsConfiguration> metricsConfigurations,
        @CustomType.Parameter("notificationConfiguration") @Nullable BucketNotificationConfiguration notificationConfiguration,
        @CustomType.Parameter("objectLockConfiguration") @Nullable BucketObjectLockConfiguration objectLockConfiguration,
        @CustomType.Parameter("ownershipControls") @Nullable BucketOwnershipControls ownershipControls,
        @CustomType.Parameter("publicAccessBlockConfiguration") @Nullable BucketPublicAccessBlockConfiguration publicAccessBlockConfiguration,
        @CustomType.Parameter("regionalDomainName") @Nullable String regionalDomainName,
        @CustomType.Parameter("replicationConfiguration") @Nullable BucketReplicationConfiguration replicationConfiguration,
        @CustomType.Parameter("tags") @Nullable List<BucketTag> tags,
        @CustomType.Parameter("versioningConfiguration") @Nullable BucketVersioningConfiguration versioningConfiguration,
        @CustomType.Parameter("websiteConfiguration") @Nullable BucketWebsiteConfiguration websiteConfiguration,
        @CustomType.Parameter("websiteURL") @Nullable String websiteURL) {
        this.accelerateConfiguration = accelerateConfiguration;
        this.accessControl = accessControl;
        this.analyticsConfigurations = analyticsConfigurations;
        this.arn = arn;
        this.bucketEncryption = bucketEncryption;
        this.corsConfiguration = corsConfiguration;
        this.domainName = domainName;
        this.dualStackDomainName = dualStackDomainName;
        this.intelligentTieringConfigurations = intelligentTieringConfigurations;
        this.inventoryConfigurations = inventoryConfigurations;
        this.lifecycleConfiguration = lifecycleConfiguration;
        this.loggingConfiguration = loggingConfiguration;
        this.metricsConfigurations = metricsConfigurations;
        this.notificationConfiguration = notificationConfiguration;
        this.objectLockConfiguration = objectLockConfiguration;
        this.ownershipControls = ownershipControls;
        this.publicAccessBlockConfiguration = publicAccessBlockConfiguration;
        this.regionalDomainName = regionalDomainName;
        this.replicationConfiguration = replicationConfiguration;
        this.tags = tags;
        this.versioningConfiguration = versioningConfiguration;
        this.websiteConfiguration = websiteConfiguration;
        this.websiteURL = websiteURL;
    }

    /**
     * @return Configuration for the transfer acceleration state.
     * 
     */
    public Optional<BucketAccelerateConfiguration> accelerateConfiguration() {
        return Optional.ofNullable(this.accelerateConfiguration);
    }
    /**
     * @return A canned access control list (ACL) that grants predefined permissions to the bucket.
     * 
     */
    public Optional<BucketAccessControl> accessControl() {
        return Optional.ofNullable(this.accessControl);
    }
    /**
     * @return The configuration and any analyses for the analytics filter of an Amazon S3 bucket.
     * 
     */
    public List<BucketAnalyticsConfiguration> analyticsConfigurations() {
        return this.analyticsConfigurations == null ? List.of() : this.analyticsConfigurations;
    }
    /**
     * @return The Amazon Resource Name (ARN) of the specified bucket.
     * 
     */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<BucketEncryption> bucketEncryption() {
        return Optional.ofNullable(this.bucketEncryption);
    }
    /**
     * @return Rules that define cross-origin resource sharing of objects in this bucket.
     * 
     */
    public Optional<BucketCorsConfiguration> corsConfiguration() {
        return Optional.ofNullable(this.corsConfiguration);
    }
    /**
     * @return The IPv4 DNS name of the specified bucket.
     * 
     */
    public Optional<String> domainName() {
        return Optional.ofNullable(this.domainName);
    }
    /**
     * @return The IPv6 DNS name of the specified bucket. For more information about dual-stack endpoints, see [Using Amazon S3 Dual-Stack Endpoints](https://docs.aws.amazon.com/AmazonS3/latest/dev/dual-stack-endpoints.html).
     * 
     */
    public Optional<String> dualStackDomainName() {
        return Optional.ofNullable(this.dualStackDomainName);
    }
    /**
     * @return Specifies the S3 Intelligent-Tiering configuration for an Amazon S3 bucket.
     * 
     */
    public List<BucketIntelligentTieringConfiguration> intelligentTieringConfigurations() {
        return this.intelligentTieringConfigurations == null ? List.of() : this.intelligentTieringConfigurations;
    }
    /**
     * @return The inventory configuration for an Amazon S3 bucket.
     * 
     */
    public List<BucketInventoryConfiguration> inventoryConfigurations() {
        return this.inventoryConfigurations == null ? List.of() : this.inventoryConfigurations;
    }
    /**
     * @return Rules that define how Amazon S3 manages objects during their lifetime.
     * 
     */
    public Optional<BucketLifecycleConfiguration> lifecycleConfiguration() {
        return Optional.ofNullable(this.lifecycleConfiguration);
    }
    /**
     * @return Settings that define where logs are stored.
     * 
     */
    public Optional<BucketLoggingConfiguration> loggingConfiguration() {
        return Optional.ofNullable(this.loggingConfiguration);
    }
    /**
     * @return Settings that define a metrics configuration for the CloudWatch request metrics from the bucket.
     * 
     */
    public List<BucketMetricsConfiguration> metricsConfigurations() {
        return this.metricsConfigurations == null ? List.of() : this.metricsConfigurations;
    }
    /**
     * @return Configuration that defines how Amazon S3 handles bucket notifications.
     * 
     */
    public Optional<BucketNotificationConfiguration> notificationConfiguration() {
        return Optional.ofNullable(this.notificationConfiguration);
    }
    /**
     * @return Places an Object Lock configuration on the specified bucket.
     * 
     */
    public Optional<BucketObjectLockConfiguration> objectLockConfiguration() {
        return Optional.ofNullable(this.objectLockConfiguration);
    }
    /**
     * @return Specifies the container element for object ownership rules.
     * 
     */
    public Optional<BucketOwnershipControls> ownershipControls() {
        return Optional.ofNullable(this.ownershipControls);
    }
    public Optional<BucketPublicAccessBlockConfiguration> publicAccessBlockConfiguration() {
        return Optional.ofNullable(this.publicAccessBlockConfiguration);
    }
    /**
     * @return Returns the regional domain name of the specified bucket.
     * 
     */
    public Optional<String> regionalDomainName() {
        return Optional.ofNullable(this.regionalDomainName);
    }
    /**
     * @return Configuration for replicating objects in an S3 bucket.
     * 
     */
    public Optional<BucketReplicationConfiguration> replicationConfiguration() {
        return Optional.ofNullable(this.replicationConfiguration);
    }
    /**
     * @return An arbitrary set of tags (key-value pairs) for this S3 bucket.
     * 
     */
    public List<BucketTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    public Optional<BucketVersioningConfiguration> versioningConfiguration() {
        return Optional.ofNullable(this.versioningConfiguration);
    }
    public Optional<BucketWebsiteConfiguration> websiteConfiguration() {
        return Optional.ofNullable(this.websiteConfiguration);
    }
    /**
     * @return The Amazon S3 website endpoint for the specified bucket.
     * 
     */
    public Optional<String> websiteURL() {
        return Optional.ofNullable(this.websiteURL);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBucketResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BucketAccelerateConfiguration accelerateConfiguration;
        private @Nullable BucketAccessControl accessControl;
        private @Nullable List<BucketAnalyticsConfiguration> analyticsConfigurations;
        private @Nullable String arn;
        private @Nullable BucketEncryption bucketEncryption;
        private @Nullable BucketCorsConfiguration corsConfiguration;
        private @Nullable String domainName;
        private @Nullable String dualStackDomainName;
        private @Nullable List<BucketIntelligentTieringConfiguration> intelligentTieringConfigurations;
        private @Nullable List<BucketInventoryConfiguration> inventoryConfigurations;
        private @Nullable BucketLifecycleConfiguration lifecycleConfiguration;
        private @Nullable BucketLoggingConfiguration loggingConfiguration;
        private @Nullable List<BucketMetricsConfiguration> metricsConfigurations;
        private @Nullable BucketNotificationConfiguration notificationConfiguration;
        private @Nullable BucketObjectLockConfiguration objectLockConfiguration;
        private @Nullable BucketOwnershipControls ownershipControls;
        private @Nullable BucketPublicAccessBlockConfiguration publicAccessBlockConfiguration;
        private @Nullable String regionalDomainName;
        private @Nullable BucketReplicationConfiguration replicationConfiguration;
        private @Nullable List<BucketTag> tags;
        private @Nullable BucketVersioningConfiguration versioningConfiguration;
        private @Nullable BucketWebsiteConfiguration websiteConfiguration;
        private @Nullable String websiteURL;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBucketResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accelerateConfiguration = defaults.accelerateConfiguration;
    	      this.accessControl = defaults.accessControl;
    	      this.analyticsConfigurations = defaults.analyticsConfigurations;
    	      this.arn = defaults.arn;
    	      this.bucketEncryption = defaults.bucketEncryption;
    	      this.corsConfiguration = defaults.corsConfiguration;
    	      this.domainName = defaults.domainName;
    	      this.dualStackDomainName = defaults.dualStackDomainName;
    	      this.intelligentTieringConfigurations = defaults.intelligentTieringConfigurations;
    	      this.inventoryConfigurations = defaults.inventoryConfigurations;
    	      this.lifecycleConfiguration = defaults.lifecycleConfiguration;
    	      this.loggingConfiguration = defaults.loggingConfiguration;
    	      this.metricsConfigurations = defaults.metricsConfigurations;
    	      this.notificationConfiguration = defaults.notificationConfiguration;
    	      this.objectLockConfiguration = defaults.objectLockConfiguration;
    	      this.ownershipControls = defaults.ownershipControls;
    	      this.publicAccessBlockConfiguration = defaults.publicAccessBlockConfiguration;
    	      this.regionalDomainName = defaults.regionalDomainName;
    	      this.replicationConfiguration = defaults.replicationConfiguration;
    	      this.tags = defaults.tags;
    	      this.versioningConfiguration = defaults.versioningConfiguration;
    	      this.websiteConfiguration = defaults.websiteConfiguration;
    	      this.websiteURL = defaults.websiteURL;
        }

        public Builder accelerateConfiguration(@Nullable BucketAccelerateConfiguration accelerateConfiguration) {
            this.accelerateConfiguration = accelerateConfiguration;
            return this;
        }
        public Builder accessControl(@Nullable BucketAccessControl accessControl) {
            this.accessControl = accessControl;
            return this;
        }
        public Builder analyticsConfigurations(@Nullable List<BucketAnalyticsConfiguration> analyticsConfigurations) {
            this.analyticsConfigurations = analyticsConfigurations;
            return this;
        }
        public Builder analyticsConfigurations(BucketAnalyticsConfiguration... analyticsConfigurations) {
            return analyticsConfigurations(List.of(analyticsConfigurations));
        }
        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder bucketEncryption(@Nullable BucketEncryption bucketEncryption) {
            this.bucketEncryption = bucketEncryption;
            return this;
        }
        public Builder corsConfiguration(@Nullable BucketCorsConfiguration corsConfiguration) {
            this.corsConfiguration = corsConfiguration;
            return this;
        }
        public Builder domainName(@Nullable String domainName) {
            this.domainName = domainName;
            return this;
        }
        public Builder dualStackDomainName(@Nullable String dualStackDomainName) {
            this.dualStackDomainName = dualStackDomainName;
            return this;
        }
        public Builder intelligentTieringConfigurations(@Nullable List<BucketIntelligentTieringConfiguration> intelligentTieringConfigurations) {
            this.intelligentTieringConfigurations = intelligentTieringConfigurations;
            return this;
        }
        public Builder intelligentTieringConfigurations(BucketIntelligentTieringConfiguration... intelligentTieringConfigurations) {
            return intelligentTieringConfigurations(List.of(intelligentTieringConfigurations));
        }
        public Builder inventoryConfigurations(@Nullable List<BucketInventoryConfiguration> inventoryConfigurations) {
            this.inventoryConfigurations = inventoryConfigurations;
            return this;
        }
        public Builder inventoryConfigurations(BucketInventoryConfiguration... inventoryConfigurations) {
            return inventoryConfigurations(List.of(inventoryConfigurations));
        }
        public Builder lifecycleConfiguration(@Nullable BucketLifecycleConfiguration lifecycleConfiguration) {
            this.lifecycleConfiguration = lifecycleConfiguration;
            return this;
        }
        public Builder loggingConfiguration(@Nullable BucketLoggingConfiguration loggingConfiguration) {
            this.loggingConfiguration = loggingConfiguration;
            return this;
        }
        public Builder metricsConfigurations(@Nullable List<BucketMetricsConfiguration> metricsConfigurations) {
            this.metricsConfigurations = metricsConfigurations;
            return this;
        }
        public Builder metricsConfigurations(BucketMetricsConfiguration... metricsConfigurations) {
            return metricsConfigurations(List.of(metricsConfigurations));
        }
        public Builder notificationConfiguration(@Nullable BucketNotificationConfiguration notificationConfiguration) {
            this.notificationConfiguration = notificationConfiguration;
            return this;
        }
        public Builder objectLockConfiguration(@Nullable BucketObjectLockConfiguration objectLockConfiguration) {
            this.objectLockConfiguration = objectLockConfiguration;
            return this;
        }
        public Builder ownershipControls(@Nullable BucketOwnershipControls ownershipControls) {
            this.ownershipControls = ownershipControls;
            return this;
        }
        public Builder publicAccessBlockConfiguration(@Nullable BucketPublicAccessBlockConfiguration publicAccessBlockConfiguration) {
            this.publicAccessBlockConfiguration = publicAccessBlockConfiguration;
            return this;
        }
        public Builder regionalDomainName(@Nullable String regionalDomainName) {
            this.regionalDomainName = regionalDomainName;
            return this;
        }
        public Builder replicationConfiguration(@Nullable BucketReplicationConfiguration replicationConfiguration) {
            this.replicationConfiguration = replicationConfiguration;
            return this;
        }
        public Builder tags(@Nullable List<BucketTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(BucketTag... tags) {
            return tags(List.of(tags));
        }
        public Builder versioningConfiguration(@Nullable BucketVersioningConfiguration versioningConfiguration) {
            this.versioningConfiguration = versioningConfiguration;
            return this;
        }
        public Builder websiteConfiguration(@Nullable BucketWebsiteConfiguration websiteConfiguration) {
            this.websiteConfiguration = websiteConfiguration;
            return this;
        }
        public Builder websiteURL(@Nullable String websiteURL) {
            this.websiteURL = websiteURL;
            return this;
        }        public GetBucketResult build() {
            return new GetBucketResult(accelerateConfiguration, accessControl, analyticsConfigurations, arn, bucketEncryption, corsConfiguration, domainName, dualStackDomainName, intelligentTieringConfigurations, inventoryConfigurations, lifecycleConfiguration, loggingConfiguration, metricsConfigurations, notificationConfiguration, objectLockConfiguration, ownershipControls, publicAccessBlockConfiguration, regionalDomainName, replicationConfiguration, tags, versioningConfiguration, websiteConfiguration, websiteURL);
        }
    }
}
