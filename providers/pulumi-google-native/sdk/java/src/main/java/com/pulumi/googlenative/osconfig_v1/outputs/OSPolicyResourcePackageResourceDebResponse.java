// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.osconfig_v1.outputs.OSPolicyResourceFileResponse;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class OSPolicyResourcePackageResourceDebResponse {
    /**
     * @return Whether dependencies should also be installed. - install when false: `dpkg -i package` - install when true: `apt-get update &amp;&amp; apt-get -y install package.deb`
     * 
     */
    private final Boolean pullDeps;
    /**
     * @return A deb package.
     * 
     */
    private final OSPolicyResourceFileResponse source;

    @CustomType.Constructor
    private OSPolicyResourcePackageResourceDebResponse(
        @CustomType.Parameter("pullDeps") Boolean pullDeps,
        @CustomType.Parameter("source") OSPolicyResourceFileResponse source) {
        this.pullDeps = pullDeps;
        this.source = source;
    }

    /**
     * @return Whether dependencies should also be installed. - install when false: `dpkg -i package` - install when true: `apt-get update &amp;&amp; apt-get -y install package.deb`
     * 
     */
    public Boolean pullDeps() {
        return this.pullDeps;
    }
    /**
     * @return A deb package.
     * 
     */
    public OSPolicyResourceFileResponse source() {
        return this.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourcePackageResourceDebResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean pullDeps;
        private OSPolicyResourceFileResponse source;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourcePackageResourceDebResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pullDeps = defaults.pullDeps;
    	      this.source = defaults.source;
        }

        public Builder pullDeps(Boolean pullDeps) {
            this.pullDeps = Objects.requireNonNull(pullDeps);
            return this;
        }
        public Builder source(OSPolicyResourceFileResponse source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }        public OSPolicyResourcePackageResourceDebResponse build() {
            return new OSPolicyResourcePackageResourceDebResponse(pullDeps, source);
        }
    }
}
