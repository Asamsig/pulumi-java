// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataflow_v1b3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Description of an input or output of an execution stage.
 * 
 */
public final class StageSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final StageSourceArgs Empty = new StageSourceArgs();

    /**
     * Dataflow service generated name for this source.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Dataflow service generated name for this source.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * User name for the original user transform or collection with which this source is most closely associated.
     * 
     */
    @Import(name="originalTransformOrCollection")
    private @Nullable Output<String> originalTransformOrCollection;

    /**
     * @return User name for the original user transform or collection with which this source is most closely associated.
     * 
     */
    public Optional<Output<String>> originalTransformOrCollection() {
        return Optional.ofNullable(this.originalTransformOrCollection);
    }

    /**
     * Size of the source, if measurable.
     * 
     */
    @Import(name="sizeBytes")
    private @Nullable Output<String> sizeBytes;

    /**
     * @return Size of the source, if measurable.
     * 
     */
    public Optional<Output<String>> sizeBytes() {
        return Optional.ofNullable(this.sizeBytes);
    }

    /**
     * Human-readable name for this source; may be user or system generated.
     * 
     */
    @Import(name="userName")
    private @Nullable Output<String> userName;

    /**
     * @return Human-readable name for this source; may be user or system generated.
     * 
     */
    public Optional<Output<String>> userName() {
        return Optional.ofNullable(this.userName);
    }

    private StageSourceArgs() {}

    private StageSourceArgs(StageSourceArgs $) {
        this.name = $.name;
        this.originalTransformOrCollection = $.originalTransformOrCollection;
        this.sizeBytes = $.sizeBytes;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StageSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StageSourceArgs $;

        public Builder() {
            $ = new StageSourceArgs();
        }

        public Builder(StageSourceArgs defaults) {
            $ = new StageSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Dataflow service generated name for this source.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Dataflow service generated name for this source.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param originalTransformOrCollection User name for the original user transform or collection with which this source is most closely associated.
         * 
         * @return builder
         * 
         */
        public Builder originalTransformOrCollection(@Nullable Output<String> originalTransformOrCollection) {
            $.originalTransformOrCollection = originalTransformOrCollection;
            return this;
        }

        /**
         * @param originalTransformOrCollection User name for the original user transform or collection with which this source is most closely associated.
         * 
         * @return builder
         * 
         */
        public Builder originalTransformOrCollection(String originalTransformOrCollection) {
            return originalTransformOrCollection(Output.of(originalTransformOrCollection));
        }

        /**
         * @param sizeBytes Size of the source, if measurable.
         * 
         * @return builder
         * 
         */
        public Builder sizeBytes(@Nullable Output<String> sizeBytes) {
            $.sizeBytes = sizeBytes;
            return this;
        }

        /**
         * @param sizeBytes Size of the source, if measurable.
         * 
         * @return builder
         * 
         */
        public Builder sizeBytes(String sizeBytes) {
            return sizeBytes(Output.of(sizeBytes));
        }

        /**
         * @param userName Human-readable name for this source; may be user or system generated.
         * 
         * @return builder
         * 
         */
        public Builder userName(@Nullable Output<String> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName Human-readable name for this source; may be user or system generated.
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        public StageSourceArgs build() {
            return $;
        }
    }

}
