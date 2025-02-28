// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.nimblestudio.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StudioComponentComputeFarmConfiguration {
    /**
     * @return &lt;p&gt;The name of an Active Directory user that is used on ComputeFarm worker instances.&lt;/p&gt;
     * 
     */
    private final @Nullable String activeDirectoryUser;
    /**
     * @return &lt;p&gt;The endpoint of the ComputeFarm that is accessed by the studio component resource.&lt;/p&gt;
     * 
     */
    private final @Nullable String endpoint;

    @CustomType.Constructor
    private StudioComponentComputeFarmConfiguration(
        @CustomType.Parameter("activeDirectoryUser") @Nullable String activeDirectoryUser,
        @CustomType.Parameter("endpoint") @Nullable String endpoint) {
        this.activeDirectoryUser = activeDirectoryUser;
        this.endpoint = endpoint;
    }

    /**
     * @return &lt;p&gt;The name of an Active Directory user that is used on ComputeFarm worker instances.&lt;/p&gt;
     * 
     */
    public Optional<String> activeDirectoryUser() {
        return Optional.ofNullable(this.activeDirectoryUser);
    }
    /**
     * @return &lt;p&gt;The endpoint of the ComputeFarm that is accessed by the studio component resource.&lt;/p&gt;
     * 
     */
    public Optional<String> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StudioComponentComputeFarmConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String activeDirectoryUser;
        private @Nullable String endpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(StudioComponentComputeFarmConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeDirectoryUser = defaults.activeDirectoryUser;
    	      this.endpoint = defaults.endpoint;
        }

        public Builder activeDirectoryUser(@Nullable String activeDirectoryUser) {
            this.activeDirectoryUser = activeDirectoryUser;
            return this;
        }
        public Builder endpoint(@Nullable String endpoint) {
            this.endpoint = endpoint;
            return this;
        }        public StudioComponentComputeFarmConfiguration build() {
            return new StudioComponentComputeFarmConfiguration(activeDirectoryUser, endpoint);
        }
    }
}
