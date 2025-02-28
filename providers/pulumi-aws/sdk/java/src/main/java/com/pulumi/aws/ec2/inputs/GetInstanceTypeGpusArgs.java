// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetInstanceTypeGpusArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetInstanceTypeGpusArgs Empty = new GetInstanceTypeGpusArgs();

    @Import(name="count", required=true)
    private Output<Integer> count;

    public Output<Integer> count() {
        return this.count;
    }

    @Import(name="manufacturer", required=true)
    private Output<String> manufacturer;

    public Output<String> manufacturer() {
        return this.manufacturer;
    }

    /**
     * Size of the instance memory, in MiB.
     * 
     */
    @Import(name="memorySize", required=true)
    private Output<Integer> memorySize;

    /**
     * @return Size of the instance memory, in MiB.
     * 
     */
    public Output<Integer> memorySize() {
        return this.memorySize;
    }

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    private GetInstanceTypeGpusArgs() {}

    private GetInstanceTypeGpusArgs(GetInstanceTypeGpusArgs $) {
        this.count = $.count;
        this.manufacturer = $.manufacturer;
        this.memorySize = $.memorySize;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceTypeGpusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceTypeGpusArgs $;

        public Builder() {
            $ = new GetInstanceTypeGpusArgs();
        }

        public Builder(GetInstanceTypeGpusArgs defaults) {
            $ = new GetInstanceTypeGpusArgs(Objects.requireNonNull(defaults));
        }

        public Builder count(Output<Integer> count) {
            $.count = count;
            return this;
        }

        public Builder count(Integer count) {
            return count(Output.of(count));
        }

        public Builder manufacturer(Output<String> manufacturer) {
            $.manufacturer = manufacturer;
            return this;
        }

        public Builder manufacturer(String manufacturer) {
            return manufacturer(Output.of(manufacturer));
        }

        /**
         * @param memorySize Size of the instance memory, in MiB.
         * 
         * @return builder
         * 
         */
        public Builder memorySize(Output<Integer> memorySize) {
            $.memorySize = memorySize;
            return this;
        }

        /**
         * @param memorySize Size of the instance memory, in MiB.
         * 
         * @return builder
         * 
         */
        public Builder memorySize(Integer memorySize) {
            return memorySize(Output.of(memorySize));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetInstanceTypeGpusArgs build() {
            $.count = Objects.requireNonNull($.count, "expected parameter 'count' to be non-null");
            $.manufacturer = Objects.requireNonNull($.manufacturer, "expected parameter 'manufacturer' to be non-null");
            $.memorySize = Objects.requireNonNull($.memorySize, "expected parameter 'memorySize' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
