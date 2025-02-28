// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.outputs;

import com.pulumi.azurenative.security.outputs.DefenderForContainersAwsOfferingResponseCloudWatchToKinesis;
import com.pulumi.azurenative.security.outputs.DefenderForContainersAwsOfferingResponseKinesisToS3;
import com.pulumi.azurenative.security.outputs.DefenderForContainersAwsOfferingResponseKubernetesScubaReader;
import com.pulumi.azurenative.security.outputs.DefenderForContainersAwsOfferingResponseKubernetesService;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DefenderForContainersAwsOfferingResponse {
    /**
     * @return The cloudwatch to kinesis connection configuration
     * 
     */
    private final @Nullable DefenderForContainersAwsOfferingResponseCloudWatchToKinesis cloudWatchToKinesis;
    /**
     * @return The offering description.
     * 
     */
    private final String description;
    /**
     * @return The kinesis to s3 connection configuration
     * 
     */
    private final @Nullable DefenderForContainersAwsOfferingResponseKinesisToS3 kinesisToS3;
    /**
     * @return The kubernetes to scuba connection configuration
     * 
     */
    private final @Nullable DefenderForContainersAwsOfferingResponseKubernetesScubaReader kubernetesScubaReader;
    /**
     * @return The kubernetes service connection configuration
     * 
     */
    private final @Nullable DefenderForContainersAwsOfferingResponseKubernetesService kubernetesService;
    /**
     * @return The type of the security offering.
     * Expected value is &#39;DefenderForContainersAws&#39;.
     * 
     */
    private final String offeringType;

    @CustomType.Constructor
    private DefenderForContainersAwsOfferingResponse(
        @CustomType.Parameter("cloudWatchToKinesis") @Nullable DefenderForContainersAwsOfferingResponseCloudWatchToKinesis cloudWatchToKinesis,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("kinesisToS3") @Nullable DefenderForContainersAwsOfferingResponseKinesisToS3 kinesisToS3,
        @CustomType.Parameter("kubernetesScubaReader") @Nullable DefenderForContainersAwsOfferingResponseKubernetesScubaReader kubernetesScubaReader,
        @CustomType.Parameter("kubernetesService") @Nullable DefenderForContainersAwsOfferingResponseKubernetesService kubernetesService,
        @CustomType.Parameter("offeringType") String offeringType) {
        this.cloudWatchToKinesis = cloudWatchToKinesis;
        this.description = description;
        this.kinesisToS3 = kinesisToS3;
        this.kubernetesScubaReader = kubernetesScubaReader;
        this.kubernetesService = kubernetesService;
        this.offeringType = offeringType;
    }

    /**
     * @return The cloudwatch to kinesis connection configuration
     * 
     */
    public Optional<DefenderForContainersAwsOfferingResponseCloudWatchToKinesis> cloudWatchToKinesis() {
        return Optional.ofNullable(this.cloudWatchToKinesis);
    }
    /**
     * @return The offering description.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The kinesis to s3 connection configuration
     * 
     */
    public Optional<DefenderForContainersAwsOfferingResponseKinesisToS3> kinesisToS3() {
        return Optional.ofNullable(this.kinesisToS3);
    }
    /**
     * @return The kubernetes to scuba connection configuration
     * 
     */
    public Optional<DefenderForContainersAwsOfferingResponseKubernetesScubaReader> kubernetesScubaReader() {
        return Optional.ofNullable(this.kubernetesScubaReader);
    }
    /**
     * @return The kubernetes service connection configuration
     * 
     */
    public Optional<DefenderForContainersAwsOfferingResponseKubernetesService> kubernetesService() {
        return Optional.ofNullable(this.kubernetesService);
    }
    /**
     * @return The type of the security offering.
     * Expected value is &#39;DefenderForContainersAws&#39;.
     * 
     */
    public String offeringType() {
        return this.offeringType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefenderForContainersAwsOfferingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DefenderForContainersAwsOfferingResponseCloudWatchToKinesis cloudWatchToKinesis;
        private String description;
        private @Nullable DefenderForContainersAwsOfferingResponseKinesisToS3 kinesisToS3;
        private @Nullable DefenderForContainersAwsOfferingResponseKubernetesScubaReader kubernetesScubaReader;
        private @Nullable DefenderForContainersAwsOfferingResponseKubernetesService kubernetesService;
        private String offeringType;

        public Builder() {
    	      // Empty
        }

        public Builder(DefenderForContainersAwsOfferingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudWatchToKinesis = defaults.cloudWatchToKinesis;
    	      this.description = defaults.description;
    	      this.kinesisToS3 = defaults.kinesisToS3;
    	      this.kubernetesScubaReader = defaults.kubernetesScubaReader;
    	      this.kubernetesService = defaults.kubernetesService;
    	      this.offeringType = defaults.offeringType;
        }

        public Builder cloudWatchToKinesis(@Nullable DefenderForContainersAwsOfferingResponseCloudWatchToKinesis cloudWatchToKinesis) {
            this.cloudWatchToKinesis = cloudWatchToKinesis;
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder kinesisToS3(@Nullable DefenderForContainersAwsOfferingResponseKinesisToS3 kinesisToS3) {
            this.kinesisToS3 = kinesisToS3;
            return this;
        }
        public Builder kubernetesScubaReader(@Nullable DefenderForContainersAwsOfferingResponseKubernetesScubaReader kubernetesScubaReader) {
            this.kubernetesScubaReader = kubernetesScubaReader;
            return this;
        }
        public Builder kubernetesService(@Nullable DefenderForContainersAwsOfferingResponseKubernetesService kubernetesService) {
            this.kubernetesService = kubernetesService;
            return this;
        }
        public Builder offeringType(String offeringType) {
            this.offeringType = Objects.requireNonNull(offeringType);
            return this;
        }        public DefenderForContainersAwsOfferingResponse build() {
            return new DefenderForContainersAwsOfferingResponse(cloudWatchToKinesis, description, kinesisToS3, kubernetesScubaReader, kubernetesService, offeringType);
        }
    }
}
