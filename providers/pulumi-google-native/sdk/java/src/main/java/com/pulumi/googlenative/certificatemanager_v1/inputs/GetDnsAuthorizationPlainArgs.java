// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.certificatemanager_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDnsAuthorizationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDnsAuthorizationPlainArgs Empty = new GetDnsAuthorizationPlainArgs();

    @Import(name="dnsAuthorizationId", required=true)
    private String dnsAuthorizationId;

    public String dnsAuthorizationId() {
        return this.dnsAuthorizationId;
    }

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetDnsAuthorizationPlainArgs() {}

    private GetDnsAuthorizationPlainArgs(GetDnsAuthorizationPlainArgs $) {
        this.dnsAuthorizationId = $.dnsAuthorizationId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDnsAuthorizationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDnsAuthorizationPlainArgs $;

        public Builder() {
            $ = new GetDnsAuthorizationPlainArgs();
        }

        public Builder(GetDnsAuthorizationPlainArgs defaults) {
            $ = new GetDnsAuthorizationPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder dnsAuthorizationId(String dnsAuthorizationId) {
            $.dnsAuthorizationId = dnsAuthorizationId;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetDnsAuthorizationPlainArgs build() {
            $.dnsAuthorizationId = Objects.requireNonNull($.dnsAuthorizationId, "expected parameter 'dnsAuthorizationId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
