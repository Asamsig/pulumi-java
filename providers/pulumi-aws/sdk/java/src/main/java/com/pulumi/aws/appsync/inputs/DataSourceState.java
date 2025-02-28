// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appsync.inputs;

import com.pulumi.aws.appsync.inputs.DataSourceDynamodbConfigArgs;
import com.pulumi.aws.appsync.inputs.DataSourceElasticsearchConfigArgs;
import com.pulumi.aws.appsync.inputs.DataSourceHttpConfigArgs;
import com.pulumi.aws.appsync.inputs.DataSourceLambdaConfigArgs;
import com.pulumi.aws.appsync.inputs.DataSourceRelationalDatabaseConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceState extends com.pulumi.resources.ResourceArgs {

    public static final DataSourceState Empty = new DataSourceState();

    /**
     * The API ID for the GraphQL API for the DataSource.
     * 
     */
    @Import(name="apiId")
    private @Nullable Output<String> apiId;

    /**
     * @return The API ID for the GraphQL API for the DataSource.
     * 
     */
    public Optional<Output<String>> apiId() {
        return Optional.ofNullable(this.apiId);
    }

    /**
     * The ARN
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The ARN
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * A description of the DataSource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of the DataSource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * DynamoDB settings. See below
     * 
     */
    @Import(name="dynamodbConfig")
    private @Nullable Output<DataSourceDynamodbConfigArgs> dynamodbConfig;

    /**
     * @return DynamoDB settings. See below
     * 
     */
    public Optional<Output<DataSourceDynamodbConfigArgs>> dynamodbConfig() {
        return Optional.ofNullable(this.dynamodbConfig);
    }

    /**
     * Amazon Elasticsearch settings. See below
     * 
     */
    @Import(name="elasticsearchConfig")
    private @Nullable Output<DataSourceElasticsearchConfigArgs> elasticsearchConfig;

    /**
     * @return Amazon Elasticsearch settings. See below
     * 
     */
    public Optional<Output<DataSourceElasticsearchConfigArgs>> elasticsearchConfig() {
        return Optional.ofNullable(this.elasticsearchConfig);
    }

    /**
     * HTTP settings. See below
     * 
     */
    @Import(name="httpConfig")
    private @Nullable Output<DataSourceHttpConfigArgs> httpConfig;

    /**
     * @return HTTP settings. See below
     * 
     */
    public Optional<Output<DataSourceHttpConfigArgs>> httpConfig() {
        return Optional.ofNullable(this.httpConfig);
    }

    /**
     * AWS Lambda settings. See below
     * 
     */
    @Import(name="lambdaConfig")
    private @Nullable Output<DataSourceLambdaConfigArgs> lambdaConfig;

    /**
     * @return AWS Lambda settings. See below
     * 
     */
    public Optional<Output<DataSourceLambdaConfigArgs>> lambdaConfig() {
        return Optional.ofNullable(this.lambdaConfig);
    }

    /**
     * A user-supplied name for the DataSource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A user-supplied name for the DataSource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * AWS RDS settings. See Relational Database Config
     * 
     */
    @Import(name="relationalDatabaseConfig")
    private @Nullable Output<DataSourceRelationalDatabaseConfigArgs> relationalDatabaseConfig;

    /**
     * @return AWS RDS settings. See Relational Database Config
     * 
     */
    public Optional<Output<DataSourceRelationalDatabaseConfigArgs>> relationalDatabaseConfig() {
        return Optional.ofNullable(this.relationalDatabaseConfig);
    }

    /**
     * The IAM service role ARN for the data source.
     * 
     */
    @Import(name="serviceRoleArn")
    private @Nullable Output<String> serviceRoleArn;

    /**
     * @return The IAM service role ARN for the data source.
     * 
     */
    public Optional<Output<String>> serviceRoleArn() {
        return Optional.ofNullable(this.serviceRoleArn);
    }

    /**
     * The type of the DataSource. Valid values: `AWS_LAMBDA`, `AMAZON_DYNAMODB`, `AMAZON_ELASTICSEARCH`, `HTTP`, `NONE`, `RELATIONAL_DATABASE`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of the DataSource. Valid values: `AWS_LAMBDA`, `AMAZON_DYNAMODB`, `AMAZON_ELASTICSEARCH`, `HTTP`, `NONE`, `RELATIONAL_DATABASE`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private DataSourceState() {}

    private DataSourceState(DataSourceState $) {
        this.apiId = $.apiId;
        this.arn = $.arn;
        this.description = $.description;
        this.dynamodbConfig = $.dynamodbConfig;
        this.elasticsearchConfig = $.elasticsearchConfig;
        this.httpConfig = $.httpConfig;
        this.lambdaConfig = $.lambdaConfig;
        this.name = $.name;
        this.relationalDatabaseConfig = $.relationalDatabaseConfig;
        this.serviceRoleArn = $.serviceRoleArn;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceState $;

        public Builder() {
            $ = new DataSourceState();
        }

        public Builder(DataSourceState defaults) {
            $ = new DataSourceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiId The API ID for the GraphQL API for the DataSource.
         * 
         * @return builder
         * 
         */
        public Builder apiId(@Nullable Output<String> apiId) {
            $.apiId = apiId;
            return this;
        }

        /**
         * @param apiId The API ID for the GraphQL API for the DataSource.
         * 
         * @return builder
         * 
         */
        public Builder apiId(String apiId) {
            return apiId(Output.of(apiId));
        }

        /**
         * @param arn The ARN
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The ARN
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param description A description of the DataSource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of the DataSource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param dynamodbConfig DynamoDB settings. See below
         * 
         * @return builder
         * 
         */
        public Builder dynamodbConfig(@Nullable Output<DataSourceDynamodbConfigArgs> dynamodbConfig) {
            $.dynamodbConfig = dynamodbConfig;
            return this;
        }

        /**
         * @param dynamodbConfig DynamoDB settings. See below
         * 
         * @return builder
         * 
         */
        public Builder dynamodbConfig(DataSourceDynamodbConfigArgs dynamodbConfig) {
            return dynamodbConfig(Output.of(dynamodbConfig));
        }

        /**
         * @param elasticsearchConfig Amazon Elasticsearch settings. See below
         * 
         * @return builder
         * 
         */
        public Builder elasticsearchConfig(@Nullable Output<DataSourceElasticsearchConfigArgs> elasticsearchConfig) {
            $.elasticsearchConfig = elasticsearchConfig;
            return this;
        }

        /**
         * @param elasticsearchConfig Amazon Elasticsearch settings. See below
         * 
         * @return builder
         * 
         */
        public Builder elasticsearchConfig(DataSourceElasticsearchConfigArgs elasticsearchConfig) {
            return elasticsearchConfig(Output.of(elasticsearchConfig));
        }

        /**
         * @param httpConfig HTTP settings. See below
         * 
         * @return builder
         * 
         */
        public Builder httpConfig(@Nullable Output<DataSourceHttpConfigArgs> httpConfig) {
            $.httpConfig = httpConfig;
            return this;
        }

        /**
         * @param httpConfig HTTP settings. See below
         * 
         * @return builder
         * 
         */
        public Builder httpConfig(DataSourceHttpConfigArgs httpConfig) {
            return httpConfig(Output.of(httpConfig));
        }

        /**
         * @param lambdaConfig AWS Lambda settings. See below
         * 
         * @return builder
         * 
         */
        public Builder lambdaConfig(@Nullable Output<DataSourceLambdaConfigArgs> lambdaConfig) {
            $.lambdaConfig = lambdaConfig;
            return this;
        }

        /**
         * @param lambdaConfig AWS Lambda settings. See below
         * 
         * @return builder
         * 
         */
        public Builder lambdaConfig(DataSourceLambdaConfigArgs lambdaConfig) {
            return lambdaConfig(Output.of(lambdaConfig));
        }

        /**
         * @param name A user-supplied name for the DataSource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A user-supplied name for the DataSource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param relationalDatabaseConfig AWS RDS settings. See Relational Database Config
         * 
         * @return builder
         * 
         */
        public Builder relationalDatabaseConfig(@Nullable Output<DataSourceRelationalDatabaseConfigArgs> relationalDatabaseConfig) {
            $.relationalDatabaseConfig = relationalDatabaseConfig;
            return this;
        }

        /**
         * @param relationalDatabaseConfig AWS RDS settings. See Relational Database Config
         * 
         * @return builder
         * 
         */
        public Builder relationalDatabaseConfig(DataSourceRelationalDatabaseConfigArgs relationalDatabaseConfig) {
            return relationalDatabaseConfig(Output.of(relationalDatabaseConfig));
        }

        /**
         * @param serviceRoleArn The IAM service role ARN for the data source.
         * 
         * @return builder
         * 
         */
        public Builder serviceRoleArn(@Nullable Output<String> serviceRoleArn) {
            $.serviceRoleArn = serviceRoleArn;
            return this;
        }

        /**
         * @param serviceRoleArn The IAM service role ARN for the data source.
         * 
         * @return builder
         * 
         */
        public Builder serviceRoleArn(String serviceRoleArn) {
            return serviceRoleArn(Output.of(serviceRoleArn));
        }

        /**
         * @param type The type of the DataSource. Valid values: `AWS_LAMBDA`, `AMAZON_DYNAMODB`, `AMAZON_ELASTICSEARCH`, `HTTP`, `NONE`, `RELATIONAL_DATABASE`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the DataSource. Valid values: `AWS_LAMBDA`, `AMAZON_DYNAMODB`, `AMAZON_ELASTICSEARCH`, `HTTP`, `NONE`, `RELATIONAL_DATABASE`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public DataSourceState build() {
            return $;
        }
    }

}
