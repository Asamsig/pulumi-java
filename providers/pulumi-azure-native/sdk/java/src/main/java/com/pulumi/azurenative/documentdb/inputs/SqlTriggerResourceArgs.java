// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.azurenative.documentdb.enums.TriggerOperation;
import com.pulumi.azurenative.documentdb.enums.TriggerType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Cosmos DB SQL trigger resource object
 * 
 */
public final class SqlTriggerResourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlTriggerResourceArgs Empty = new SqlTriggerResourceArgs();

    /**
     * Body of the Trigger
     * 
     */
    @Import(name="body")
    private @Nullable Output<String> body;

    /**
     * @return Body of the Trigger
     * 
     */
    public Optional<Output<String>> body() {
        return Optional.ofNullable(this.body);
    }

    /**
     * Name of the Cosmos DB SQL trigger
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return Name of the Cosmos DB SQL trigger
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * The operation the trigger is associated with
     * 
     */
    @Import(name="triggerOperation")
    private @Nullable Output<Either<String,TriggerOperation>> triggerOperation;

    /**
     * @return The operation the trigger is associated with
     * 
     */
    public Optional<Output<Either<String,TriggerOperation>>> triggerOperation() {
        return Optional.ofNullable(this.triggerOperation);
    }

    /**
     * Type of the Trigger
     * 
     */
    @Import(name="triggerType")
    private @Nullable Output<Either<String,TriggerType>> triggerType;

    /**
     * @return Type of the Trigger
     * 
     */
    public Optional<Output<Either<String,TriggerType>>> triggerType() {
        return Optional.ofNullable(this.triggerType);
    }

    private SqlTriggerResourceArgs() {}

    private SqlTriggerResourceArgs(SqlTriggerResourceArgs $) {
        this.body = $.body;
        this.id = $.id;
        this.triggerOperation = $.triggerOperation;
        this.triggerType = $.triggerType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlTriggerResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlTriggerResourceArgs $;

        public Builder() {
            $ = new SqlTriggerResourceArgs();
        }

        public Builder(SqlTriggerResourceArgs defaults) {
            $ = new SqlTriggerResourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param body Body of the Trigger
         * 
         * @return builder
         * 
         */
        public Builder body(@Nullable Output<String> body) {
            $.body = body;
            return this;
        }

        /**
         * @param body Body of the Trigger
         * 
         * @return builder
         * 
         */
        public Builder body(String body) {
            return body(Output.of(body));
        }

        /**
         * @param id Name of the Cosmos DB SQL trigger
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Name of the Cosmos DB SQL trigger
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param triggerOperation The operation the trigger is associated with
         * 
         * @return builder
         * 
         */
        public Builder triggerOperation(@Nullable Output<Either<String,TriggerOperation>> triggerOperation) {
            $.triggerOperation = triggerOperation;
            return this;
        }

        /**
         * @param triggerOperation The operation the trigger is associated with
         * 
         * @return builder
         * 
         */
        public Builder triggerOperation(Either<String,TriggerOperation> triggerOperation) {
            return triggerOperation(Output.of(triggerOperation));
        }

        /**
         * @param triggerOperation The operation the trigger is associated with
         * 
         * @return builder
         * 
         */
        public Builder triggerOperation(String triggerOperation) {
            return triggerOperation(Either.ofLeft(triggerOperation));
        }

        /**
         * @param triggerOperation The operation the trigger is associated with
         * 
         * @return builder
         * 
         */
        public Builder triggerOperation(TriggerOperation triggerOperation) {
            return triggerOperation(Either.ofRight(triggerOperation));
        }

        /**
         * @param triggerType Type of the Trigger
         * 
         * @return builder
         * 
         */
        public Builder triggerType(@Nullable Output<Either<String,TriggerType>> triggerType) {
            $.triggerType = triggerType;
            return this;
        }

        /**
         * @param triggerType Type of the Trigger
         * 
         * @return builder
         * 
         */
        public Builder triggerType(Either<String,TriggerType> triggerType) {
            return triggerType(Output.of(triggerType));
        }

        /**
         * @param triggerType Type of the Trigger
         * 
         * @return builder
         * 
         */
        public Builder triggerType(String triggerType) {
            return triggerType(Either.ofLeft(triggerType));
        }

        /**
         * @param triggerType Type of the Trigger
         * 
         * @return builder
         * 
         */
        public Builder triggerType(TriggerType triggerType) {
            return triggerType(Either.ofRight(triggerType));
        }

        public SqlTriggerResourceArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
