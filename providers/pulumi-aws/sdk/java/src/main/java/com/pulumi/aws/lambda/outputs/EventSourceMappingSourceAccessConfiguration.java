// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lambda.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EventSourceMappingSourceAccessConfiguration {
    /**
     * @return The type of this configuration.  For Self Managed Kafka you will need to supply blocks for type `VPC_SUBNET` and `VPC_SECURITY_GROUP`.
     * 
     */
    private final String type;
    /**
     * @return The URI for this configuration.  For type `VPC_SUBNET` the value should be `subnet:subnet_id` where `subnet_id` is the value you would find in an aws.ec2.Subnet resource&#39;s id attribute.  For type `VPC_SECURITY_GROUP` the value should be `security_group:security_group_id` where `security_group_id` is the value you would find in an aws.ec2.SecurityGroup resource&#39;s id attribute.
     * 
     */
    private final String uri;

    @CustomType.Constructor
    private EventSourceMappingSourceAccessConfiguration(
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("uri") String uri) {
        this.type = type;
        this.uri = uri;
    }

    /**
     * @return The type of this configuration.  For Self Managed Kafka you will need to supply blocks for type `VPC_SUBNET` and `VPC_SECURITY_GROUP`.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The URI for this configuration.  For type `VPC_SUBNET` the value should be `subnet:subnet_id` where `subnet_id` is the value you would find in an aws.ec2.Subnet resource&#39;s id attribute.  For type `VPC_SECURITY_GROUP` the value should be `security_group:security_group_id` where `security_group_id` is the value you would find in an aws.ec2.SecurityGroup resource&#39;s id attribute.
     * 
     */
    public String uri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSourceMappingSourceAccessConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSourceMappingSourceAccessConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.uri = defaults.uri;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }        public EventSourceMappingSourceAccessConfiguration build() {
            return new EventSourceMappingSourceAccessConfiguration(type, uri);
        }
    }
}
