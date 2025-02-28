// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetStreamConsumerPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetStreamConsumerPlainArgs Empty = new GetStreamConsumerPlainArgs();

    /**
     * Amazon Resource Name (ARN) of the stream consumer.
     * 
     */
    @Import(name="arn")
    private @Nullable String arn;

    /**
     * @return Amazon Resource Name (ARN) of the stream consumer.
     * 
     */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Name of the stream consumer.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Name of the stream consumer.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Amazon Resource Name (ARN) of the data stream the consumer is registered with.
     * 
     */
    @Import(name="streamArn", required=true)
    private String streamArn;

    /**
     * @return Amazon Resource Name (ARN) of the data stream the consumer is registered with.
     * 
     */
    public String streamArn() {
        return this.streamArn;
    }

    private GetStreamConsumerPlainArgs() {}

    private GetStreamConsumerPlainArgs(GetStreamConsumerPlainArgs $) {
        this.arn = $.arn;
        this.name = $.name;
        this.streamArn = $.streamArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStreamConsumerPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStreamConsumerPlainArgs $;

        public Builder() {
            $ = new GetStreamConsumerPlainArgs();
        }

        public Builder(GetStreamConsumerPlainArgs defaults) {
            $ = new GetStreamConsumerPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn Amazon Resource Name (ARN) of the stream consumer.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable String arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param name Name of the stream consumer.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param streamArn Amazon Resource Name (ARN) of the data stream the consumer is registered with.
         * 
         * @return builder
         * 
         */
        public Builder streamArn(String streamArn) {
            $.streamArn = streamArn;
            return this;
        }

        public GetStreamConsumerPlainArgs build() {
            $.streamArn = Objects.requireNonNull($.streamArn, "expected parameter 'streamArn' to be non-null");
            return $;
        }
    }

}
