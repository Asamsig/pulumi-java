// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetManagedZoneArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetManagedZoneArgs Empty = new GetManagedZoneArgs();

    @Import(name="clientOperationId")
    private @Nullable Output<String> clientOperationId;

    public Optional<Output<String>> clientOperationId() {
        return Optional.ofNullable(this.clientOperationId);
    }

    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    @Import(name="managedZone", required=true)
    private Output<String> managedZone;

    public Output<String> managedZone() {
        return this.managedZone;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetManagedZoneArgs() {}

    private GetManagedZoneArgs(GetManagedZoneArgs $) {
        this.clientOperationId = $.clientOperationId;
        this.location = $.location;
        this.managedZone = $.managedZone;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetManagedZoneArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetManagedZoneArgs $;

        public Builder() {
            $ = new GetManagedZoneArgs();
        }

        public Builder(GetManagedZoneArgs defaults) {
            $ = new GetManagedZoneArgs(Objects.requireNonNull(defaults));
        }

        public Builder clientOperationId(@Nullable Output<String> clientOperationId) {
            $.clientOperationId = clientOperationId;
            return this;
        }

        public Builder clientOperationId(String clientOperationId) {
            return clientOperationId(Output.of(clientOperationId));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder managedZone(Output<String> managedZone) {
            $.managedZone = managedZone;
            return this;
        }

        public Builder managedZone(String managedZone) {
            return managedZone(Output.of(managedZone));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetManagedZoneArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.managedZone = Objects.requireNonNull($.managedZone, "expected parameter 'managedZone' to be non-null");
            return $;
        }
    }

}
