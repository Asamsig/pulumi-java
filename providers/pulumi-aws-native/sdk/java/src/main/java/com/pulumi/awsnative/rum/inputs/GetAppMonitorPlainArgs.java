// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.rum.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAppMonitorPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppMonitorPlainArgs Empty = new GetAppMonitorPlainArgs();

    /**
     * A name for the app monitor
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return A name for the app monitor
     * 
     */
    public String name() {
        return this.name;
    }

    private GetAppMonitorPlainArgs() {}

    private GetAppMonitorPlainArgs(GetAppMonitorPlainArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppMonitorPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppMonitorPlainArgs $;

        public Builder() {
            $ = new GetAppMonitorPlainArgs();
        }

        public Builder(GetAppMonitorPlainArgs defaults) {
            $ = new GetAppMonitorPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name A name for the app monitor
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetAppMonitorPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
