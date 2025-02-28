// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.azurenative.logic.enums.UsageIndicator;
import com.pulumi.azurenative.logic.enums.X12DateFormat;
import com.pulumi.azurenative.logic.enums.X12TimeFormat;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The X12 agreement envelope settings.
 * 
 */
public final class X12EnvelopeSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final X12EnvelopeSettingsArgs Empty = new X12EnvelopeSettingsArgs();

    /**
     * The controls standards id.
     * 
     */
    @Import(name="controlStandardsId", required=true)
    private Output<Integer> controlStandardsId;

    /**
     * @return The controls standards id.
     * 
     */
    public Output<Integer> controlStandardsId() {
        return this.controlStandardsId;
    }

    /**
     * The control version number.
     * 
     */
    @Import(name="controlVersionNumber", required=true)
    private Output<String> controlVersionNumber;

    /**
     * @return The control version number.
     * 
     */
    public Output<String> controlVersionNumber() {
        return this.controlVersionNumber;
    }

    /**
     * The value indicating whether to enable default group headers.
     * 
     */
    @Import(name="enableDefaultGroupHeaders", required=true)
    private Output<Boolean> enableDefaultGroupHeaders;

    /**
     * @return The value indicating whether to enable default group headers.
     * 
     */
    public Output<Boolean> enableDefaultGroupHeaders() {
        return this.enableDefaultGroupHeaders;
    }

    /**
     * The functional group id.
     * 
     */
    @Import(name="functionalGroupId")
    private @Nullable Output<String> functionalGroupId;

    /**
     * @return The functional group id.
     * 
     */
    public Optional<Output<String>> functionalGroupId() {
        return Optional.ofNullable(this.functionalGroupId);
    }

    /**
     * The group control number lower bound.
     * 
     */
    @Import(name="groupControlNumberLowerBound", required=true)
    private Output<Integer> groupControlNumberLowerBound;

    /**
     * @return The group control number lower bound.
     * 
     */
    public Output<Integer> groupControlNumberLowerBound() {
        return this.groupControlNumberLowerBound;
    }

    /**
     * The group control number upper bound.
     * 
     */
    @Import(name="groupControlNumberUpperBound", required=true)
    private Output<Integer> groupControlNumberUpperBound;

    /**
     * @return The group control number upper bound.
     * 
     */
    public Output<Integer> groupControlNumberUpperBound() {
        return this.groupControlNumberUpperBound;
    }

    /**
     * The group header agency code.
     * 
     */
    @Import(name="groupHeaderAgencyCode", required=true)
    private Output<String> groupHeaderAgencyCode;

    /**
     * @return The group header agency code.
     * 
     */
    public Output<String> groupHeaderAgencyCode() {
        return this.groupHeaderAgencyCode;
    }

    /**
     * The group header date format.
     * 
     */
    @Import(name="groupHeaderDateFormat", required=true)
    private Output<Either<String,X12DateFormat>> groupHeaderDateFormat;

    /**
     * @return The group header date format.
     * 
     */
    public Output<Either<String,X12DateFormat>> groupHeaderDateFormat() {
        return this.groupHeaderDateFormat;
    }

    /**
     * The group header time format.
     * 
     */
    @Import(name="groupHeaderTimeFormat", required=true)
    private Output<Either<String,X12TimeFormat>> groupHeaderTimeFormat;

    /**
     * @return The group header time format.
     * 
     */
    public Output<Either<String,X12TimeFormat>> groupHeaderTimeFormat() {
        return this.groupHeaderTimeFormat;
    }

    /**
     * The group header version.
     * 
     */
    @Import(name="groupHeaderVersion", required=true)
    private Output<String> groupHeaderVersion;

    /**
     * @return The group header version.
     * 
     */
    public Output<String> groupHeaderVersion() {
        return this.groupHeaderVersion;
    }

    /**
     * The interchange  control number lower bound.
     * 
     */
    @Import(name="interchangeControlNumberLowerBound", required=true)
    private Output<Integer> interchangeControlNumberLowerBound;

    /**
     * @return The interchange  control number lower bound.
     * 
     */
    public Output<Integer> interchangeControlNumberLowerBound() {
        return this.interchangeControlNumberLowerBound;
    }

    /**
     * The interchange  control number upper bound.
     * 
     */
    @Import(name="interchangeControlNumberUpperBound", required=true)
    private Output<Integer> interchangeControlNumberUpperBound;

    /**
     * @return The interchange  control number upper bound.
     * 
     */
    public Output<Integer> interchangeControlNumberUpperBound() {
        return this.interchangeControlNumberUpperBound;
    }

    /**
     * The value indicating whether to overwrite existing transaction set control number.
     * 
     */
    @Import(name="overwriteExistingTransactionSetControlNumber", required=true)
    private Output<Boolean> overwriteExistingTransactionSetControlNumber;

    /**
     * @return The value indicating whether to overwrite existing transaction set control number.
     * 
     */
    public Output<Boolean> overwriteExistingTransactionSetControlNumber() {
        return this.overwriteExistingTransactionSetControlNumber;
    }

    /**
     * The receiver application id.
     * 
     */
    @Import(name="receiverApplicationId", required=true)
    private Output<String> receiverApplicationId;

    /**
     * @return The receiver application id.
     * 
     */
    public Output<String> receiverApplicationId() {
        return this.receiverApplicationId;
    }

    /**
     * The value indicating whether to rollover group control number.
     * 
     */
    @Import(name="rolloverGroupControlNumber", required=true)
    private Output<Boolean> rolloverGroupControlNumber;

    /**
     * @return The value indicating whether to rollover group control number.
     * 
     */
    public Output<Boolean> rolloverGroupControlNumber() {
        return this.rolloverGroupControlNumber;
    }

    /**
     * The value indicating whether to rollover interchange control number.
     * 
     */
    @Import(name="rolloverInterchangeControlNumber", required=true)
    private Output<Boolean> rolloverInterchangeControlNumber;

    /**
     * @return The value indicating whether to rollover interchange control number.
     * 
     */
    public Output<Boolean> rolloverInterchangeControlNumber() {
        return this.rolloverInterchangeControlNumber;
    }

    /**
     * The value indicating whether to rollover transaction set control number.
     * 
     */
    @Import(name="rolloverTransactionSetControlNumber", required=true)
    private Output<Boolean> rolloverTransactionSetControlNumber;

    /**
     * @return The value indicating whether to rollover transaction set control number.
     * 
     */
    public Output<Boolean> rolloverTransactionSetControlNumber() {
        return this.rolloverTransactionSetControlNumber;
    }

    /**
     * The sender application id.
     * 
     */
    @Import(name="senderApplicationId", required=true)
    private Output<String> senderApplicationId;

    /**
     * @return The sender application id.
     * 
     */
    public Output<String> senderApplicationId() {
        return this.senderApplicationId;
    }

    /**
     * The transaction set control number lower bound.
     * 
     */
    @Import(name="transactionSetControlNumberLowerBound", required=true)
    private Output<Integer> transactionSetControlNumberLowerBound;

    /**
     * @return The transaction set control number lower bound.
     * 
     */
    public Output<Integer> transactionSetControlNumberLowerBound() {
        return this.transactionSetControlNumberLowerBound;
    }

    /**
     * The transaction set control number prefix.
     * 
     */
    @Import(name="transactionSetControlNumberPrefix")
    private @Nullable Output<String> transactionSetControlNumberPrefix;

    /**
     * @return The transaction set control number prefix.
     * 
     */
    public Optional<Output<String>> transactionSetControlNumberPrefix() {
        return Optional.ofNullable(this.transactionSetControlNumberPrefix);
    }

    /**
     * The transaction set control number suffix.
     * 
     */
    @Import(name="transactionSetControlNumberSuffix")
    private @Nullable Output<String> transactionSetControlNumberSuffix;

    /**
     * @return The transaction set control number suffix.
     * 
     */
    public Optional<Output<String>> transactionSetControlNumberSuffix() {
        return Optional.ofNullable(this.transactionSetControlNumberSuffix);
    }

    /**
     * The transaction set control number upper bound.
     * 
     */
    @Import(name="transactionSetControlNumberUpperBound", required=true)
    private Output<Integer> transactionSetControlNumberUpperBound;

    /**
     * @return The transaction set control number upper bound.
     * 
     */
    public Output<Integer> transactionSetControlNumberUpperBound() {
        return this.transactionSetControlNumberUpperBound;
    }

    /**
     * The usage indicator.
     * 
     */
    @Import(name="usageIndicator", required=true)
    private Output<Either<String,UsageIndicator>> usageIndicator;

    /**
     * @return The usage indicator.
     * 
     */
    public Output<Either<String,UsageIndicator>> usageIndicator() {
        return this.usageIndicator;
    }

    /**
     * The value indicating whether to use control standards id as repetition character.
     * 
     */
    @Import(name="useControlStandardsIdAsRepetitionCharacter", required=true)
    private Output<Boolean> useControlStandardsIdAsRepetitionCharacter;

    /**
     * @return The value indicating whether to use control standards id as repetition character.
     * 
     */
    public Output<Boolean> useControlStandardsIdAsRepetitionCharacter() {
        return this.useControlStandardsIdAsRepetitionCharacter;
    }

    private X12EnvelopeSettingsArgs() {}

    private X12EnvelopeSettingsArgs(X12EnvelopeSettingsArgs $) {
        this.controlStandardsId = $.controlStandardsId;
        this.controlVersionNumber = $.controlVersionNumber;
        this.enableDefaultGroupHeaders = $.enableDefaultGroupHeaders;
        this.functionalGroupId = $.functionalGroupId;
        this.groupControlNumberLowerBound = $.groupControlNumberLowerBound;
        this.groupControlNumberUpperBound = $.groupControlNumberUpperBound;
        this.groupHeaderAgencyCode = $.groupHeaderAgencyCode;
        this.groupHeaderDateFormat = $.groupHeaderDateFormat;
        this.groupHeaderTimeFormat = $.groupHeaderTimeFormat;
        this.groupHeaderVersion = $.groupHeaderVersion;
        this.interchangeControlNumberLowerBound = $.interchangeControlNumberLowerBound;
        this.interchangeControlNumberUpperBound = $.interchangeControlNumberUpperBound;
        this.overwriteExistingTransactionSetControlNumber = $.overwriteExistingTransactionSetControlNumber;
        this.receiverApplicationId = $.receiverApplicationId;
        this.rolloverGroupControlNumber = $.rolloverGroupControlNumber;
        this.rolloverInterchangeControlNumber = $.rolloverInterchangeControlNumber;
        this.rolloverTransactionSetControlNumber = $.rolloverTransactionSetControlNumber;
        this.senderApplicationId = $.senderApplicationId;
        this.transactionSetControlNumberLowerBound = $.transactionSetControlNumberLowerBound;
        this.transactionSetControlNumberPrefix = $.transactionSetControlNumberPrefix;
        this.transactionSetControlNumberSuffix = $.transactionSetControlNumberSuffix;
        this.transactionSetControlNumberUpperBound = $.transactionSetControlNumberUpperBound;
        this.usageIndicator = $.usageIndicator;
        this.useControlStandardsIdAsRepetitionCharacter = $.useControlStandardsIdAsRepetitionCharacter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(X12EnvelopeSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private X12EnvelopeSettingsArgs $;

        public Builder() {
            $ = new X12EnvelopeSettingsArgs();
        }

        public Builder(X12EnvelopeSettingsArgs defaults) {
            $ = new X12EnvelopeSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param controlStandardsId The controls standards id.
         * 
         * @return builder
         * 
         */
        public Builder controlStandardsId(Output<Integer> controlStandardsId) {
            $.controlStandardsId = controlStandardsId;
            return this;
        }

        /**
         * @param controlStandardsId The controls standards id.
         * 
         * @return builder
         * 
         */
        public Builder controlStandardsId(Integer controlStandardsId) {
            return controlStandardsId(Output.of(controlStandardsId));
        }

        /**
         * @param controlVersionNumber The control version number.
         * 
         * @return builder
         * 
         */
        public Builder controlVersionNumber(Output<String> controlVersionNumber) {
            $.controlVersionNumber = controlVersionNumber;
            return this;
        }

        /**
         * @param controlVersionNumber The control version number.
         * 
         * @return builder
         * 
         */
        public Builder controlVersionNumber(String controlVersionNumber) {
            return controlVersionNumber(Output.of(controlVersionNumber));
        }

        /**
         * @param enableDefaultGroupHeaders The value indicating whether to enable default group headers.
         * 
         * @return builder
         * 
         */
        public Builder enableDefaultGroupHeaders(Output<Boolean> enableDefaultGroupHeaders) {
            $.enableDefaultGroupHeaders = enableDefaultGroupHeaders;
            return this;
        }

        /**
         * @param enableDefaultGroupHeaders The value indicating whether to enable default group headers.
         * 
         * @return builder
         * 
         */
        public Builder enableDefaultGroupHeaders(Boolean enableDefaultGroupHeaders) {
            return enableDefaultGroupHeaders(Output.of(enableDefaultGroupHeaders));
        }

        /**
         * @param functionalGroupId The functional group id.
         * 
         * @return builder
         * 
         */
        public Builder functionalGroupId(@Nullable Output<String> functionalGroupId) {
            $.functionalGroupId = functionalGroupId;
            return this;
        }

        /**
         * @param functionalGroupId The functional group id.
         * 
         * @return builder
         * 
         */
        public Builder functionalGroupId(String functionalGroupId) {
            return functionalGroupId(Output.of(functionalGroupId));
        }

        /**
         * @param groupControlNumberLowerBound The group control number lower bound.
         * 
         * @return builder
         * 
         */
        public Builder groupControlNumberLowerBound(Output<Integer> groupControlNumberLowerBound) {
            $.groupControlNumberLowerBound = groupControlNumberLowerBound;
            return this;
        }

        /**
         * @param groupControlNumberLowerBound The group control number lower bound.
         * 
         * @return builder
         * 
         */
        public Builder groupControlNumberLowerBound(Integer groupControlNumberLowerBound) {
            return groupControlNumberLowerBound(Output.of(groupControlNumberLowerBound));
        }

        /**
         * @param groupControlNumberUpperBound The group control number upper bound.
         * 
         * @return builder
         * 
         */
        public Builder groupControlNumberUpperBound(Output<Integer> groupControlNumberUpperBound) {
            $.groupControlNumberUpperBound = groupControlNumberUpperBound;
            return this;
        }

        /**
         * @param groupControlNumberUpperBound The group control number upper bound.
         * 
         * @return builder
         * 
         */
        public Builder groupControlNumberUpperBound(Integer groupControlNumberUpperBound) {
            return groupControlNumberUpperBound(Output.of(groupControlNumberUpperBound));
        }

        /**
         * @param groupHeaderAgencyCode The group header agency code.
         * 
         * @return builder
         * 
         */
        public Builder groupHeaderAgencyCode(Output<String> groupHeaderAgencyCode) {
            $.groupHeaderAgencyCode = groupHeaderAgencyCode;
            return this;
        }

        /**
         * @param groupHeaderAgencyCode The group header agency code.
         * 
         * @return builder
         * 
         */
        public Builder groupHeaderAgencyCode(String groupHeaderAgencyCode) {
            return groupHeaderAgencyCode(Output.of(groupHeaderAgencyCode));
        }

        /**
         * @param groupHeaderDateFormat The group header date format.
         * 
         * @return builder
         * 
         */
        public Builder groupHeaderDateFormat(Output<Either<String,X12DateFormat>> groupHeaderDateFormat) {
            $.groupHeaderDateFormat = groupHeaderDateFormat;
            return this;
        }

        /**
         * @param groupHeaderDateFormat The group header date format.
         * 
         * @return builder
         * 
         */
        public Builder groupHeaderDateFormat(Either<String,X12DateFormat> groupHeaderDateFormat) {
            return groupHeaderDateFormat(Output.of(groupHeaderDateFormat));
        }

        /**
         * @param groupHeaderDateFormat The group header date format.
         * 
         * @return builder
         * 
         */
        public Builder groupHeaderDateFormat(String groupHeaderDateFormat) {
            return groupHeaderDateFormat(Either.ofLeft(groupHeaderDateFormat));
        }

        /**
         * @param groupHeaderDateFormat The group header date format.
         * 
         * @return builder
         * 
         */
        public Builder groupHeaderDateFormat(X12DateFormat groupHeaderDateFormat) {
            return groupHeaderDateFormat(Either.ofRight(groupHeaderDateFormat));
        }

        /**
         * @param groupHeaderTimeFormat The group header time format.
         * 
         * @return builder
         * 
         */
        public Builder groupHeaderTimeFormat(Output<Either<String,X12TimeFormat>> groupHeaderTimeFormat) {
            $.groupHeaderTimeFormat = groupHeaderTimeFormat;
            return this;
        }

        /**
         * @param groupHeaderTimeFormat The group header time format.
         * 
         * @return builder
         * 
         */
        public Builder groupHeaderTimeFormat(Either<String,X12TimeFormat> groupHeaderTimeFormat) {
            return groupHeaderTimeFormat(Output.of(groupHeaderTimeFormat));
        }

        /**
         * @param groupHeaderTimeFormat The group header time format.
         * 
         * @return builder
         * 
         */
        public Builder groupHeaderTimeFormat(String groupHeaderTimeFormat) {
            return groupHeaderTimeFormat(Either.ofLeft(groupHeaderTimeFormat));
        }

        /**
         * @param groupHeaderTimeFormat The group header time format.
         * 
         * @return builder
         * 
         */
        public Builder groupHeaderTimeFormat(X12TimeFormat groupHeaderTimeFormat) {
            return groupHeaderTimeFormat(Either.ofRight(groupHeaderTimeFormat));
        }

        /**
         * @param groupHeaderVersion The group header version.
         * 
         * @return builder
         * 
         */
        public Builder groupHeaderVersion(Output<String> groupHeaderVersion) {
            $.groupHeaderVersion = groupHeaderVersion;
            return this;
        }

        /**
         * @param groupHeaderVersion The group header version.
         * 
         * @return builder
         * 
         */
        public Builder groupHeaderVersion(String groupHeaderVersion) {
            return groupHeaderVersion(Output.of(groupHeaderVersion));
        }

        /**
         * @param interchangeControlNumberLowerBound The interchange  control number lower bound.
         * 
         * @return builder
         * 
         */
        public Builder interchangeControlNumberLowerBound(Output<Integer> interchangeControlNumberLowerBound) {
            $.interchangeControlNumberLowerBound = interchangeControlNumberLowerBound;
            return this;
        }

        /**
         * @param interchangeControlNumberLowerBound The interchange  control number lower bound.
         * 
         * @return builder
         * 
         */
        public Builder interchangeControlNumberLowerBound(Integer interchangeControlNumberLowerBound) {
            return interchangeControlNumberLowerBound(Output.of(interchangeControlNumberLowerBound));
        }

        /**
         * @param interchangeControlNumberUpperBound The interchange  control number upper bound.
         * 
         * @return builder
         * 
         */
        public Builder interchangeControlNumberUpperBound(Output<Integer> interchangeControlNumberUpperBound) {
            $.interchangeControlNumberUpperBound = interchangeControlNumberUpperBound;
            return this;
        }

        /**
         * @param interchangeControlNumberUpperBound The interchange  control number upper bound.
         * 
         * @return builder
         * 
         */
        public Builder interchangeControlNumberUpperBound(Integer interchangeControlNumberUpperBound) {
            return interchangeControlNumberUpperBound(Output.of(interchangeControlNumberUpperBound));
        }

        /**
         * @param overwriteExistingTransactionSetControlNumber The value indicating whether to overwrite existing transaction set control number.
         * 
         * @return builder
         * 
         */
        public Builder overwriteExistingTransactionSetControlNumber(Output<Boolean> overwriteExistingTransactionSetControlNumber) {
            $.overwriteExistingTransactionSetControlNumber = overwriteExistingTransactionSetControlNumber;
            return this;
        }

        /**
         * @param overwriteExistingTransactionSetControlNumber The value indicating whether to overwrite existing transaction set control number.
         * 
         * @return builder
         * 
         */
        public Builder overwriteExistingTransactionSetControlNumber(Boolean overwriteExistingTransactionSetControlNumber) {
            return overwriteExistingTransactionSetControlNumber(Output.of(overwriteExistingTransactionSetControlNumber));
        }

        /**
         * @param receiverApplicationId The receiver application id.
         * 
         * @return builder
         * 
         */
        public Builder receiverApplicationId(Output<String> receiverApplicationId) {
            $.receiverApplicationId = receiverApplicationId;
            return this;
        }

        /**
         * @param receiverApplicationId The receiver application id.
         * 
         * @return builder
         * 
         */
        public Builder receiverApplicationId(String receiverApplicationId) {
            return receiverApplicationId(Output.of(receiverApplicationId));
        }

        /**
         * @param rolloverGroupControlNumber The value indicating whether to rollover group control number.
         * 
         * @return builder
         * 
         */
        public Builder rolloverGroupControlNumber(Output<Boolean> rolloverGroupControlNumber) {
            $.rolloverGroupControlNumber = rolloverGroupControlNumber;
            return this;
        }

        /**
         * @param rolloverGroupControlNumber The value indicating whether to rollover group control number.
         * 
         * @return builder
         * 
         */
        public Builder rolloverGroupControlNumber(Boolean rolloverGroupControlNumber) {
            return rolloverGroupControlNumber(Output.of(rolloverGroupControlNumber));
        }

        /**
         * @param rolloverInterchangeControlNumber The value indicating whether to rollover interchange control number.
         * 
         * @return builder
         * 
         */
        public Builder rolloverInterchangeControlNumber(Output<Boolean> rolloverInterchangeControlNumber) {
            $.rolloverInterchangeControlNumber = rolloverInterchangeControlNumber;
            return this;
        }

        /**
         * @param rolloverInterchangeControlNumber The value indicating whether to rollover interchange control number.
         * 
         * @return builder
         * 
         */
        public Builder rolloverInterchangeControlNumber(Boolean rolloverInterchangeControlNumber) {
            return rolloverInterchangeControlNumber(Output.of(rolloverInterchangeControlNumber));
        }

        /**
         * @param rolloverTransactionSetControlNumber The value indicating whether to rollover transaction set control number.
         * 
         * @return builder
         * 
         */
        public Builder rolloverTransactionSetControlNumber(Output<Boolean> rolloverTransactionSetControlNumber) {
            $.rolloverTransactionSetControlNumber = rolloverTransactionSetControlNumber;
            return this;
        }

        /**
         * @param rolloverTransactionSetControlNumber The value indicating whether to rollover transaction set control number.
         * 
         * @return builder
         * 
         */
        public Builder rolloverTransactionSetControlNumber(Boolean rolloverTransactionSetControlNumber) {
            return rolloverTransactionSetControlNumber(Output.of(rolloverTransactionSetControlNumber));
        }

        /**
         * @param senderApplicationId The sender application id.
         * 
         * @return builder
         * 
         */
        public Builder senderApplicationId(Output<String> senderApplicationId) {
            $.senderApplicationId = senderApplicationId;
            return this;
        }

        /**
         * @param senderApplicationId The sender application id.
         * 
         * @return builder
         * 
         */
        public Builder senderApplicationId(String senderApplicationId) {
            return senderApplicationId(Output.of(senderApplicationId));
        }

        /**
         * @param transactionSetControlNumberLowerBound The transaction set control number lower bound.
         * 
         * @return builder
         * 
         */
        public Builder transactionSetControlNumberLowerBound(Output<Integer> transactionSetControlNumberLowerBound) {
            $.transactionSetControlNumberLowerBound = transactionSetControlNumberLowerBound;
            return this;
        }

        /**
         * @param transactionSetControlNumberLowerBound The transaction set control number lower bound.
         * 
         * @return builder
         * 
         */
        public Builder transactionSetControlNumberLowerBound(Integer transactionSetControlNumberLowerBound) {
            return transactionSetControlNumberLowerBound(Output.of(transactionSetControlNumberLowerBound));
        }

        /**
         * @param transactionSetControlNumberPrefix The transaction set control number prefix.
         * 
         * @return builder
         * 
         */
        public Builder transactionSetControlNumberPrefix(@Nullable Output<String> transactionSetControlNumberPrefix) {
            $.transactionSetControlNumberPrefix = transactionSetControlNumberPrefix;
            return this;
        }

        /**
         * @param transactionSetControlNumberPrefix The transaction set control number prefix.
         * 
         * @return builder
         * 
         */
        public Builder transactionSetControlNumberPrefix(String transactionSetControlNumberPrefix) {
            return transactionSetControlNumberPrefix(Output.of(transactionSetControlNumberPrefix));
        }

        /**
         * @param transactionSetControlNumberSuffix The transaction set control number suffix.
         * 
         * @return builder
         * 
         */
        public Builder transactionSetControlNumberSuffix(@Nullable Output<String> transactionSetControlNumberSuffix) {
            $.transactionSetControlNumberSuffix = transactionSetControlNumberSuffix;
            return this;
        }

        /**
         * @param transactionSetControlNumberSuffix The transaction set control number suffix.
         * 
         * @return builder
         * 
         */
        public Builder transactionSetControlNumberSuffix(String transactionSetControlNumberSuffix) {
            return transactionSetControlNumberSuffix(Output.of(transactionSetControlNumberSuffix));
        }

        /**
         * @param transactionSetControlNumberUpperBound The transaction set control number upper bound.
         * 
         * @return builder
         * 
         */
        public Builder transactionSetControlNumberUpperBound(Output<Integer> transactionSetControlNumberUpperBound) {
            $.transactionSetControlNumberUpperBound = transactionSetControlNumberUpperBound;
            return this;
        }

        /**
         * @param transactionSetControlNumberUpperBound The transaction set control number upper bound.
         * 
         * @return builder
         * 
         */
        public Builder transactionSetControlNumberUpperBound(Integer transactionSetControlNumberUpperBound) {
            return transactionSetControlNumberUpperBound(Output.of(transactionSetControlNumberUpperBound));
        }

        /**
         * @param usageIndicator The usage indicator.
         * 
         * @return builder
         * 
         */
        public Builder usageIndicator(Output<Either<String,UsageIndicator>> usageIndicator) {
            $.usageIndicator = usageIndicator;
            return this;
        }

        /**
         * @param usageIndicator The usage indicator.
         * 
         * @return builder
         * 
         */
        public Builder usageIndicator(Either<String,UsageIndicator> usageIndicator) {
            return usageIndicator(Output.of(usageIndicator));
        }

        /**
         * @param usageIndicator The usage indicator.
         * 
         * @return builder
         * 
         */
        public Builder usageIndicator(String usageIndicator) {
            return usageIndicator(Either.ofLeft(usageIndicator));
        }

        /**
         * @param usageIndicator The usage indicator.
         * 
         * @return builder
         * 
         */
        public Builder usageIndicator(UsageIndicator usageIndicator) {
            return usageIndicator(Either.ofRight(usageIndicator));
        }

        /**
         * @param useControlStandardsIdAsRepetitionCharacter The value indicating whether to use control standards id as repetition character.
         * 
         * @return builder
         * 
         */
        public Builder useControlStandardsIdAsRepetitionCharacter(Output<Boolean> useControlStandardsIdAsRepetitionCharacter) {
            $.useControlStandardsIdAsRepetitionCharacter = useControlStandardsIdAsRepetitionCharacter;
            return this;
        }

        /**
         * @param useControlStandardsIdAsRepetitionCharacter The value indicating whether to use control standards id as repetition character.
         * 
         * @return builder
         * 
         */
        public Builder useControlStandardsIdAsRepetitionCharacter(Boolean useControlStandardsIdAsRepetitionCharacter) {
            return useControlStandardsIdAsRepetitionCharacter(Output.of(useControlStandardsIdAsRepetitionCharacter));
        }

        public X12EnvelopeSettingsArgs build() {
            $.controlStandardsId = Objects.requireNonNull($.controlStandardsId, "expected parameter 'controlStandardsId' to be non-null");
            $.controlVersionNumber = Objects.requireNonNull($.controlVersionNumber, "expected parameter 'controlVersionNumber' to be non-null");
            $.enableDefaultGroupHeaders = Objects.requireNonNull($.enableDefaultGroupHeaders, "expected parameter 'enableDefaultGroupHeaders' to be non-null");
            $.groupControlNumberLowerBound = Objects.requireNonNull($.groupControlNumberLowerBound, "expected parameter 'groupControlNumberLowerBound' to be non-null");
            $.groupControlNumberUpperBound = Objects.requireNonNull($.groupControlNumberUpperBound, "expected parameter 'groupControlNumberUpperBound' to be non-null");
            $.groupHeaderAgencyCode = Objects.requireNonNull($.groupHeaderAgencyCode, "expected parameter 'groupHeaderAgencyCode' to be non-null");
            $.groupHeaderDateFormat = Objects.requireNonNull($.groupHeaderDateFormat, "expected parameter 'groupHeaderDateFormat' to be non-null");
            $.groupHeaderTimeFormat = Objects.requireNonNull($.groupHeaderTimeFormat, "expected parameter 'groupHeaderTimeFormat' to be non-null");
            $.groupHeaderVersion = Objects.requireNonNull($.groupHeaderVersion, "expected parameter 'groupHeaderVersion' to be non-null");
            $.interchangeControlNumberLowerBound = Objects.requireNonNull($.interchangeControlNumberLowerBound, "expected parameter 'interchangeControlNumberLowerBound' to be non-null");
            $.interchangeControlNumberUpperBound = Objects.requireNonNull($.interchangeControlNumberUpperBound, "expected parameter 'interchangeControlNumberUpperBound' to be non-null");
            $.overwriteExistingTransactionSetControlNumber = Objects.requireNonNull($.overwriteExistingTransactionSetControlNumber, "expected parameter 'overwriteExistingTransactionSetControlNumber' to be non-null");
            $.receiverApplicationId = Objects.requireNonNull($.receiverApplicationId, "expected parameter 'receiverApplicationId' to be non-null");
            $.rolloverGroupControlNumber = Objects.requireNonNull($.rolloverGroupControlNumber, "expected parameter 'rolloverGroupControlNumber' to be non-null");
            $.rolloverInterchangeControlNumber = Objects.requireNonNull($.rolloverInterchangeControlNumber, "expected parameter 'rolloverInterchangeControlNumber' to be non-null");
            $.rolloverTransactionSetControlNumber = Objects.requireNonNull($.rolloverTransactionSetControlNumber, "expected parameter 'rolloverTransactionSetControlNumber' to be non-null");
            $.senderApplicationId = Objects.requireNonNull($.senderApplicationId, "expected parameter 'senderApplicationId' to be non-null");
            $.transactionSetControlNumberLowerBound = Objects.requireNonNull($.transactionSetControlNumberLowerBound, "expected parameter 'transactionSetControlNumberLowerBound' to be non-null");
            $.transactionSetControlNumberUpperBound = Objects.requireNonNull($.transactionSetControlNumberUpperBound, "expected parameter 'transactionSetControlNumberUpperBound' to be non-null");
            $.usageIndicator = Objects.requireNonNull($.usageIndicator, "expected parameter 'usageIndicator' to be non-null");
            $.useControlStandardsIdAsRepetitionCharacter = Objects.requireNonNull($.useControlStandardsIdAsRepetitionCharacter, "expected parameter 'useControlStandardsIdAsRepetitionCharacter' to be non-null");
            return $;
        }
    }

}
