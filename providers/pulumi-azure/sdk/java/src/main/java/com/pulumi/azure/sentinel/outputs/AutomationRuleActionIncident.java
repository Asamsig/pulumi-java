// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AutomationRuleActionIncident {
    /**
     * @return The classification of the incident, when closing it. Possible values are: `BenignPositive_SuspiciousButExpected`, `FalsePositive_InaccurateData`, `FalsePositive_IncorrectAlertLogic`, `TruePositive_SuspiciousActivity` and `Undetermined`.
     * 
     */
    private final @Nullable String classification;
    /**
     * @return The comment why the incident is to be closed.
     * 
     */
    private final @Nullable String classificationComment;
    /**
     * @return Specifies a list of labels to add to the incident.
     * 
     */
    private final @Nullable List<String> labels;
    /**
     * @return The execution order of this action.
     * 
     */
    private final Integer order;
    /**
     * @return The object ID of the entity this incident is assigned to.
     * 
     */
    private final @Nullable String ownerId;
    /**
     * @return The severity to add to the incident.
     * 
     */
    private final @Nullable String severity;
    /**
     * @return The status to set to the incident. Possible values are: `Active`, `Closed`, `New`.
     * 
     */
    private final @Nullable String status;

    @CustomType.Constructor
    private AutomationRuleActionIncident(
        @CustomType.Parameter("classification") @Nullable String classification,
        @CustomType.Parameter("classificationComment") @Nullable String classificationComment,
        @CustomType.Parameter("labels") @Nullable List<String> labels,
        @CustomType.Parameter("order") Integer order,
        @CustomType.Parameter("ownerId") @Nullable String ownerId,
        @CustomType.Parameter("severity") @Nullable String severity,
        @CustomType.Parameter("status") @Nullable String status) {
        this.classification = classification;
        this.classificationComment = classificationComment;
        this.labels = labels;
        this.order = order;
        this.ownerId = ownerId;
        this.severity = severity;
        this.status = status;
    }

    /**
     * @return The classification of the incident, when closing it. Possible values are: `BenignPositive_SuspiciousButExpected`, `FalsePositive_InaccurateData`, `FalsePositive_IncorrectAlertLogic`, `TruePositive_SuspiciousActivity` and `Undetermined`.
     * 
     */
    public Optional<String> classification() {
        return Optional.ofNullable(this.classification);
    }
    /**
     * @return The comment why the incident is to be closed.
     * 
     */
    public Optional<String> classificationComment() {
        return Optional.ofNullable(this.classificationComment);
    }
    /**
     * @return Specifies a list of labels to add to the incident.
     * 
     */
    public List<String> labels() {
        return this.labels == null ? List.of() : this.labels;
    }
    /**
     * @return The execution order of this action.
     * 
     */
    public Integer order() {
        return this.order;
    }
    /**
     * @return The object ID of the entity this incident is assigned to.
     * 
     */
    public Optional<String> ownerId() {
        return Optional.ofNullable(this.ownerId);
    }
    /**
     * @return The severity to add to the incident.
     * 
     */
    public Optional<String> severity() {
        return Optional.ofNullable(this.severity);
    }
    /**
     * @return The status to set to the incident. Possible values are: `Active`, `Closed`, `New`.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationRuleActionIncident defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String classification;
        private @Nullable String classificationComment;
        private @Nullable List<String> labels;
        private Integer order;
        private @Nullable String ownerId;
        private @Nullable String severity;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomationRuleActionIncident defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classification = defaults.classification;
    	      this.classificationComment = defaults.classificationComment;
    	      this.labels = defaults.labels;
    	      this.order = defaults.order;
    	      this.ownerId = defaults.ownerId;
    	      this.severity = defaults.severity;
    	      this.status = defaults.status;
        }

        public Builder classification(@Nullable String classification) {
            this.classification = classification;
            return this;
        }
        public Builder classificationComment(@Nullable String classificationComment) {
            this.classificationComment = classificationComment;
            return this;
        }
        public Builder labels(@Nullable List<String> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(String... labels) {
            return labels(List.of(labels));
        }
        public Builder order(Integer order) {
            this.order = Objects.requireNonNull(order);
            return this;
        }
        public Builder ownerId(@Nullable String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Builder severity(@Nullable String severity) {
            this.severity = severity;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }        public AutomationRuleActionIncident build() {
            return new AutomationRuleActionIncident(classification, classificationComment, labels, order, ownerId, severity, status);
        }
    }
}
