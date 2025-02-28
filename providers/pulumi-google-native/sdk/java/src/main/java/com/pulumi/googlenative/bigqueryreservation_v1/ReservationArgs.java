// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigqueryreservation_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReservationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReservationArgs Empty = new ReservationArgs();

    /**
     * Maximum number of queries that are allowed to run concurrently in this reservation. This is a soft limit due to asynchronous nature of the system and various optimizations for small queries. Default value is 0 which means that concurrency will be automatically set based on the reservation size.
     * 
     */
    @Import(name="concurrency")
    private @Nullable Output<String> concurrency;

    /**
     * @return Maximum number of queries that are allowed to run concurrently in this reservation. This is a soft limit due to asynchronous nature of the system and various optimizations for small queries. Default value is 0 which means that concurrency will be automatically set based on the reservation size.
     * 
     */
    public Optional<Output<String>> concurrency() {
        return Optional.ofNullable(this.concurrency);
    }

    /**
     * If false, any query or pipeline job using this reservation will use idle slots from other reservations within the same admin project. If true, a query or pipeline job using this reservation will execute with the slot capacity specified in the slot_capacity field at most.
     * 
     */
    @Import(name="ignoreIdleSlots")
    private @Nullable Output<Boolean> ignoreIdleSlots;

    /**
     * @return If false, any query or pipeline job using this reservation will use idle slots from other reservations within the same admin project. If true, a query or pipeline job using this reservation will execute with the slot capacity specified in the slot_capacity field at most.
     * 
     */
    public Optional<Output<Boolean>> ignoreIdleSlots() {
        return Optional.ofNullable(this.ignoreIdleSlots);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Applicable only for reservations located within one of the BigQuery multi-regions (US or EU). If set to true, this reservation is placed in the organization&#39;s secondary region which is designated for disaster recovery purposes. If false, this reservation is placed in the organization&#39;s default region.
     * 
     */
    @Import(name="multiRegionAuxiliary")
    private @Nullable Output<Boolean> multiRegionAuxiliary;

    /**
     * @return Applicable only for reservations located within one of the BigQuery multi-regions (US or EU). If set to true, this reservation is placed in the organization&#39;s secondary region which is designated for disaster recovery purposes. If false, this reservation is placed in the organization&#39;s default region.
     * 
     */
    public Optional<Output<Boolean>> multiRegionAuxiliary() {
        return Optional.ofNullable(this.multiRegionAuxiliary);
    }

    /**
     * The resource name of the reservation, e.g., `projects/*{@literal /}locations/*{@literal /}reservations/team1-prod`. The reservation_id must only contain lower case alphanumeric characters or dashes. It must start with a letter and must not end with a dash. Its maximum length is 64 characters.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The resource name of the reservation, e.g., `projects/*{@literal /}locations/*{@literal /}reservations/team1-prod`. The reservation_id must only contain lower case alphanumeric characters or dashes. It must start with a letter and must not end with a dash. Its maximum length is 64 characters.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The reservation ID. It must only contain lower case alphanumeric characters or dashes. It must start with a letter and must not end with a dash. Its maximum length is 64 characters.
     * 
     */
    @Import(name="reservationId")
    private @Nullable Output<String> reservationId;

    /**
     * @return The reservation ID. It must only contain lower case alphanumeric characters or dashes. It must start with a letter and must not end with a dash. Its maximum length is 64 characters.
     * 
     */
    public Optional<Output<String>> reservationId() {
        return Optional.ofNullable(this.reservationId);
    }

    /**
     * Minimum slots available to this reservation. A slot is a unit of computational power in BigQuery, and serves as the unit of parallelism. Queries using this reservation might use more slots during runtime if ignore_idle_slots is set to false. If the new reservation&#39;s slot capacity exceeds the project&#39;s slot capacity or if total slot capacity of the new reservation and its siblings exceeds the project&#39;s slot capacity, the request will fail with `google.rpc.Code.RESOURCE_EXHAUSTED`. NOTE: for reservations in US or EU multi-regions, slot capacity constraints are checked separately for default and auxiliary regions. See multi_region_auxiliary flag for more details.
     * 
     */
    @Import(name="slotCapacity")
    private @Nullable Output<String> slotCapacity;

    /**
     * @return Minimum slots available to this reservation. A slot is a unit of computational power in BigQuery, and serves as the unit of parallelism. Queries using this reservation might use more slots during runtime if ignore_idle_slots is set to false. If the new reservation&#39;s slot capacity exceeds the project&#39;s slot capacity or if total slot capacity of the new reservation and its siblings exceeds the project&#39;s slot capacity, the request will fail with `google.rpc.Code.RESOURCE_EXHAUSTED`. NOTE: for reservations in US or EU multi-regions, slot capacity constraints are checked separately for default and auxiliary regions. See multi_region_auxiliary flag for more details.
     * 
     */
    public Optional<Output<String>> slotCapacity() {
        return Optional.ofNullable(this.slotCapacity);
    }

    private ReservationArgs() {}

    private ReservationArgs(ReservationArgs $) {
        this.concurrency = $.concurrency;
        this.ignoreIdleSlots = $.ignoreIdleSlots;
        this.location = $.location;
        this.multiRegionAuxiliary = $.multiRegionAuxiliary;
        this.name = $.name;
        this.project = $.project;
        this.reservationId = $.reservationId;
        this.slotCapacity = $.slotCapacity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReservationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReservationArgs $;

        public Builder() {
            $ = new ReservationArgs();
        }

        public Builder(ReservationArgs defaults) {
            $ = new ReservationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param concurrency Maximum number of queries that are allowed to run concurrently in this reservation. This is a soft limit due to asynchronous nature of the system and various optimizations for small queries. Default value is 0 which means that concurrency will be automatically set based on the reservation size.
         * 
         * @return builder
         * 
         */
        public Builder concurrency(@Nullable Output<String> concurrency) {
            $.concurrency = concurrency;
            return this;
        }

        /**
         * @param concurrency Maximum number of queries that are allowed to run concurrently in this reservation. This is a soft limit due to asynchronous nature of the system and various optimizations for small queries. Default value is 0 which means that concurrency will be automatically set based on the reservation size.
         * 
         * @return builder
         * 
         */
        public Builder concurrency(String concurrency) {
            return concurrency(Output.of(concurrency));
        }

        /**
         * @param ignoreIdleSlots If false, any query or pipeline job using this reservation will use idle slots from other reservations within the same admin project. If true, a query or pipeline job using this reservation will execute with the slot capacity specified in the slot_capacity field at most.
         * 
         * @return builder
         * 
         */
        public Builder ignoreIdleSlots(@Nullable Output<Boolean> ignoreIdleSlots) {
            $.ignoreIdleSlots = ignoreIdleSlots;
            return this;
        }

        /**
         * @param ignoreIdleSlots If false, any query or pipeline job using this reservation will use idle slots from other reservations within the same admin project. If true, a query or pipeline job using this reservation will execute with the slot capacity specified in the slot_capacity field at most.
         * 
         * @return builder
         * 
         */
        public Builder ignoreIdleSlots(Boolean ignoreIdleSlots) {
            return ignoreIdleSlots(Output.of(ignoreIdleSlots));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param multiRegionAuxiliary Applicable only for reservations located within one of the BigQuery multi-regions (US or EU). If set to true, this reservation is placed in the organization&#39;s secondary region which is designated for disaster recovery purposes. If false, this reservation is placed in the organization&#39;s default region.
         * 
         * @return builder
         * 
         */
        public Builder multiRegionAuxiliary(@Nullable Output<Boolean> multiRegionAuxiliary) {
            $.multiRegionAuxiliary = multiRegionAuxiliary;
            return this;
        }

        /**
         * @param multiRegionAuxiliary Applicable only for reservations located within one of the BigQuery multi-regions (US or EU). If set to true, this reservation is placed in the organization&#39;s secondary region which is designated for disaster recovery purposes. If false, this reservation is placed in the organization&#39;s default region.
         * 
         * @return builder
         * 
         */
        public Builder multiRegionAuxiliary(Boolean multiRegionAuxiliary) {
            return multiRegionAuxiliary(Output.of(multiRegionAuxiliary));
        }

        /**
         * @param name The resource name of the reservation, e.g., `projects/*{@literal /}locations/*{@literal /}reservations/team1-prod`. The reservation_id must only contain lower case alphanumeric characters or dashes. It must start with a letter and must not end with a dash. Its maximum length is 64 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The resource name of the reservation, e.g., `projects/*{@literal /}locations/*{@literal /}reservations/team1-prod`. The reservation_id must only contain lower case alphanumeric characters or dashes. It must start with a letter and must not end with a dash. Its maximum length is 64 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param reservationId The reservation ID. It must only contain lower case alphanumeric characters or dashes. It must start with a letter and must not end with a dash. Its maximum length is 64 characters.
         * 
         * @return builder
         * 
         */
        public Builder reservationId(@Nullable Output<String> reservationId) {
            $.reservationId = reservationId;
            return this;
        }

        /**
         * @param reservationId The reservation ID. It must only contain lower case alphanumeric characters or dashes. It must start with a letter and must not end with a dash. Its maximum length is 64 characters.
         * 
         * @return builder
         * 
         */
        public Builder reservationId(String reservationId) {
            return reservationId(Output.of(reservationId));
        }

        /**
         * @param slotCapacity Minimum slots available to this reservation. A slot is a unit of computational power in BigQuery, and serves as the unit of parallelism. Queries using this reservation might use more slots during runtime if ignore_idle_slots is set to false. If the new reservation&#39;s slot capacity exceeds the project&#39;s slot capacity or if total slot capacity of the new reservation and its siblings exceeds the project&#39;s slot capacity, the request will fail with `google.rpc.Code.RESOURCE_EXHAUSTED`. NOTE: for reservations in US or EU multi-regions, slot capacity constraints are checked separately for default and auxiliary regions. See multi_region_auxiliary flag for more details.
         * 
         * @return builder
         * 
         */
        public Builder slotCapacity(@Nullable Output<String> slotCapacity) {
            $.slotCapacity = slotCapacity;
            return this;
        }

        /**
         * @param slotCapacity Minimum slots available to this reservation. A slot is a unit of computational power in BigQuery, and serves as the unit of parallelism. Queries using this reservation might use more slots during runtime if ignore_idle_slots is set to false. If the new reservation&#39;s slot capacity exceeds the project&#39;s slot capacity or if total slot capacity of the new reservation and its siblings exceeds the project&#39;s slot capacity, the request will fail with `google.rpc.Code.RESOURCE_EXHAUSTED`. NOTE: for reservations in US or EU multi-regions, slot capacity constraints are checked separately for default and auxiliary regions. See multi_region_auxiliary flag for more details.
         * 
         * @return builder
         * 
         */
        public Builder slotCapacity(String slotCapacity) {
            return slotCapacity(Output.of(slotCapacity));
        }

        public ReservationArgs build() {
            return $;
        }
    }

}
