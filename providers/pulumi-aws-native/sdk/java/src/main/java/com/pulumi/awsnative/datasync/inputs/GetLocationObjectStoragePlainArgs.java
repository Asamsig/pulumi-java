// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.datasync.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLocationObjectStoragePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLocationObjectStoragePlainArgs Empty = new GetLocationObjectStoragePlainArgs();

    /**
     * The Amazon Resource Name (ARN) of the location that is created.
     * 
     */
    @Import(name="locationArn", required=true)
    private String locationArn;

    /**
     * @return The Amazon Resource Name (ARN) of the location that is created.
     * 
     */
    public String locationArn() {
        return this.locationArn;
    }

    private GetLocationObjectStoragePlainArgs() {}

    private GetLocationObjectStoragePlainArgs(GetLocationObjectStoragePlainArgs $) {
        this.locationArn = $.locationArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLocationObjectStoragePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLocationObjectStoragePlainArgs $;

        public Builder() {
            $ = new GetLocationObjectStoragePlainArgs();
        }

        public Builder(GetLocationObjectStoragePlainArgs defaults) {
            $ = new GetLocationObjectStoragePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param locationArn The Amazon Resource Name (ARN) of the location that is created.
         * 
         * @return builder
         * 
         */
        public Builder locationArn(String locationArn) {
            $.locationArn = locationArn;
            return this;
        }

        public GetLocationObjectStoragePlainArgs build() {
            $.locationArn = Objects.requireNonNull($.locationArn, "expected parameter 'locationArn' to be non-null");
            return $;
        }
    }

}
