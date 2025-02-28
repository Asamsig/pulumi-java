// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.customerprofiles.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetObjectTypePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetObjectTypePlainArgs Empty = new GetObjectTypePlainArgs();

    /**
     * The unique name of the domain.
     * 
     */
    @Import(name="domainName", required=true)
    private String domainName;

    /**
     * @return The unique name of the domain.
     * 
     */
    public String domainName() {
        return this.domainName;
    }

    /**
     * The name of the profile object type.
     * 
     */
    @Import(name="objectTypeName", required=true)
    private String objectTypeName;

    /**
     * @return The name of the profile object type.
     * 
     */
    public String objectTypeName() {
        return this.objectTypeName;
    }

    private GetObjectTypePlainArgs() {}

    private GetObjectTypePlainArgs(GetObjectTypePlainArgs $) {
        this.domainName = $.domainName;
        this.objectTypeName = $.objectTypeName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetObjectTypePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetObjectTypePlainArgs $;

        public Builder() {
            $ = new GetObjectTypePlainArgs();
        }

        public Builder(GetObjectTypePlainArgs defaults) {
            $ = new GetObjectTypePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domainName The unique name of the domain.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param objectTypeName The name of the profile object type.
         * 
         * @return builder
         * 
         */
        public Builder objectTypeName(String objectTypeName) {
            $.objectTypeName = objectTypeName;
            return this;
        }

        public GetObjectTypePlainArgs build() {
            $.domainName = Objects.requireNonNull($.domainName, "expected parameter 'domainName' to be non-null");
            $.objectTypeName = Objects.requireNonNull($.objectTypeName, "expected parameter 'objectTypeName' to be non-null");
            return $;
        }
    }

}
