// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ServiceTemplateSpecContainerVolumeMount {
    /**
     * @return Path within the container at which the volume should be mounted.  Must
     * not contain &#39;:&#39;.
     * 
     */
    private final String mountPath;
    /**
     * @return Volume&#39;s name.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private ServiceTemplateSpecContainerVolumeMount(
        @CustomType.Parameter("mountPath") String mountPath,
        @CustomType.Parameter("name") String name) {
        this.mountPath = mountPath;
        this.name = name;
    }

    /**
     * @return Path within the container at which the volume should be mounted.  Must
     * not contain &#39;:&#39;.
     * 
     */
    public String mountPath() {
        return this.mountPath;
    }
    /**
     * @return Volume&#39;s name.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplateSpecContainerVolumeMount defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String mountPath;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTemplateSpecContainerVolumeMount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mountPath = defaults.mountPath;
    	      this.name = defaults.name;
        }

        public Builder mountPath(String mountPath) {
            this.mountPath = Objects.requireNonNull(mountPath);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public ServiceTemplateSpecContainerVolumeMount build() {
            return new ServiceTemplateSpecContainerVolumeMount(mountPath, name);
        }
    }
}
