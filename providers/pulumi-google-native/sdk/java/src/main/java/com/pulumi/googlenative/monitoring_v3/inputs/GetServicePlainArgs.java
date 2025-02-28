// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetServicePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServicePlainArgs Empty = new GetServicePlainArgs();

    @Import(name="serviceId", required=true)
    private String serviceId;

    public String serviceId() {
        return this.serviceId;
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

    private GetServicePlainArgs() {}

    private GetServicePlainArgs(GetServicePlainArgs $) {
        this.serviceId = $.serviceId;
        this.v3Id = $.v3Id;
        this.v3Id1 = $.v3Id1;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServicePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServicePlainArgs $;

        public Builder() {
            $ = new GetServicePlainArgs();
        }

        public Builder(GetServicePlainArgs defaults) {
            $ = new GetServicePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder serviceId(String serviceId) {
            $.serviceId = serviceId;
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

        public GetServicePlainArgs build() {
            $.serviceId = Objects.requireNonNull($.serviceId, "expected parameter 'serviceId' to be non-null");
            $.v3Id = Objects.requireNonNull($.v3Id, "expected parameter 'v3Id' to be non-null");
            $.v3Id1 = Objects.requireNonNull($.v3Id1, "expected parameter 'v3Id1' to be non-null");
            return $;
        }
    }

}
