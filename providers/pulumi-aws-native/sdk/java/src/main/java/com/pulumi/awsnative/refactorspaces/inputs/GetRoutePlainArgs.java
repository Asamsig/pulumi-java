// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.refactorspaces.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRoutePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRoutePlainArgs Empty = new GetRoutePlainArgs();

    @Import(name="applicationIdentifier", required=true)
    private String applicationIdentifier;

    public String applicationIdentifier() {
        return this.applicationIdentifier;
    }

    @Import(name="environmentIdentifier", required=true)
    private String environmentIdentifier;

    public String environmentIdentifier() {
        return this.environmentIdentifier;
    }

    @Import(name="routeIdentifier", required=true)
    private String routeIdentifier;

    public String routeIdentifier() {
        return this.routeIdentifier;
    }

    private GetRoutePlainArgs() {}

    private GetRoutePlainArgs(GetRoutePlainArgs $) {
        this.applicationIdentifier = $.applicationIdentifier;
        this.environmentIdentifier = $.environmentIdentifier;
        this.routeIdentifier = $.routeIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRoutePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRoutePlainArgs $;

        public Builder() {
            $ = new GetRoutePlainArgs();
        }

        public Builder(GetRoutePlainArgs defaults) {
            $ = new GetRoutePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder applicationIdentifier(String applicationIdentifier) {
            $.applicationIdentifier = applicationIdentifier;
            return this;
        }

        public Builder environmentIdentifier(String environmentIdentifier) {
            $.environmentIdentifier = environmentIdentifier;
            return this;
        }

        public Builder routeIdentifier(String routeIdentifier) {
            $.routeIdentifier = routeIdentifier;
            return this;
        }

        public GetRoutePlainArgs build() {
            $.applicationIdentifier = Objects.requireNonNull($.applicationIdentifier, "expected parameter 'applicationIdentifier' to be non-null");
            $.environmentIdentifier = Objects.requireNonNull($.environmentIdentifier, "expected parameter 'environmentIdentifier' to be non-null");
            $.routeIdentifier = Objects.requireNonNull($.routeIdentifier, "expected parameter 'routeIdentifier' to be non-null");
            return $;
        }
    }

}
