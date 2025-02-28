// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.datasync.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLocationFSxWindowsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLocationFSxWindowsPlainArgs Empty = new GetLocationFSxWindowsPlainArgs();

    /**
     * The Amazon Resource Name (ARN) of the Amazon FSx for Windows file system location that is created.
     * 
     */
    @Import(name="locationArn", required=true)
    private String locationArn;

    /**
     * @return The Amazon Resource Name (ARN) of the Amazon FSx for Windows file system location that is created.
     * 
     */
    public String locationArn() {
        return this.locationArn;
    }

    private GetLocationFSxWindowsPlainArgs() {}

    private GetLocationFSxWindowsPlainArgs(GetLocationFSxWindowsPlainArgs $) {
        this.locationArn = $.locationArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLocationFSxWindowsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLocationFSxWindowsPlainArgs $;

        public Builder() {
            $ = new GetLocationFSxWindowsPlainArgs();
        }

        public Builder(GetLocationFSxWindowsPlainArgs defaults) {
            $ = new GetLocationFSxWindowsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param locationArn The Amazon Resource Name (ARN) of the Amazon FSx for Windows file system location that is created.
         * 
         * @return builder
         * 
         */
        public Builder locationArn(String locationArn) {
            $.locationArn = locationArn;
            return this;
        }

        public GetLocationFSxWindowsPlainArgs build() {
            $.locationArn = Objects.requireNonNull($.locationArn, "expected parameter 'locationArn' to be non-null");
            return $;
        }
    }

}
