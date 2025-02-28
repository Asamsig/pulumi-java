// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServiceLevelObjectivePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceLevelObjectivePlainArgs Empty = new GetServiceLevelObjectivePlainArgs();

    @Import(name="serviceId", required=true)
    private String serviceId;

    public String serviceId() {
        return this.serviceId;
    }

    @Import(name="serviceLevelObjectiveId", required=true)
    private String serviceLevelObjectiveId;

    public String serviceLevelObjectiveId() {
        return this.serviceLevelObjectiveId;
    }

    @Import(name="v3Id", required=true)
    private String v3Id;

    public String v3Id() {
        return this.v3Id;
    }

    @Import(name="v3Id1", required=true)
    private String v3Id1;

    public String v3Id1() {
        return this.v3Id1;
    }

    @Import(name="view")
    private @Nullable String view;

    public Optional<String> view() {
        return Optional.ofNullable(this.view);
    }

    private GetServiceLevelObjectivePlainArgs() {}

    private GetServiceLevelObjectivePlainArgs(GetServiceLevelObjectivePlainArgs $) {
        this.serviceId = $.serviceId;
        this.serviceLevelObjectiveId = $.serviceLevelObjectiveId;
        this.v3Id = $.v3Id;
        this.v3Id1 = $.v3Id1;
        this.view = $.view;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceLevelObjectivePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceLevelObjectivePlainArgs $;

        public Builder() {
            $ = new GetServiceLevelObjectivePlainArgs();
        }

        public Builder(GetServiceLevelObjectivePlainArgs defaults) {
            $ = new GetServiceLevelObjectivePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder serviceId(String serviceId) {
            $.serviceId = serviceId;
            return this;
        }

        public Builder serviceLevelObjectiveId(String serviceLevelObjectiveId) {
            $.serviceLevelObjectiveId = serviceLevelObjectiveId;
            return this;
        }

        public Builder v3Id(String v3Id) {
            $.v3Id = v3Id;
            return this;
        }

        public Builder v3Id1(String v3Id1) {
            $.v3Id1 = v3Id1;
            return this;
        }

        public Builder view(@Nullable String view) {
            $.view = view;
            return this;
        }

        public GetServiceLevelObjectivePlainArgs build() {
            $.serviceId = Objects.requireNonNull($.serviceId, "expected parameter 'serviceId' to be non-null");
            $.serviceLevelObjectiveId = Objects.requireNonNull($.serviceLevelObjectiveId, "expected parameter 'serviceLevelObjectiveId' to be non-null");
            $.v3Id = Objects.requireNonNull($.v3Id, "expected parameter 'v3Id' to be non-null");
            $.v3Id1 = Objects.requireNonNull($.v3Id1, "expected parameter 'v3Id1' to be non-null");
            return $;
        }
    }

}
