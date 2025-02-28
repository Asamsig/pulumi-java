// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FailoverPolicyResponse {
    /**
     * @return The failover priority of the region. A failover priority of 0 indicates a write region. The maximum value for a failover priority = (total number of regions - 1). Failover priority values must be unique for each of the regions in which the database account exists.
     * 
     */
    private final @Nullable Integer failoverPriority;
    /**
     * @return The unique identifier of the region in which the database account replicates to. Example: &amp;lt;accountName&amp;gt;-&amp;lt;locationName&amp;gt;.
     * 
     */
    private final String id;
    /**
     * @return The name of the region in which the database account exists.
     * 
     */
    private final @Nullable String locationName;

    @CustomType.Constructor
    private FailoverPolicyResponse(
        @CustomType.Parameter("failoverPriority") @Nullable Integer failoverPriority,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("locationName") @Nullable String locationName) {
        this.failoverPriority = failoverPriority;
        this.id = id;
        this.locationName = locationName;
    }

    /**
     * @return The failover priority of the region. A failover priority of 0 indicates a write region. The maximum value for a failover priority = (total number of regions - 1). Failover priority values must be unique for each of the regions in which the database account exists.
     * 
     */
    public Optional<Integer> failoverPriority() {
        return Optional.ofNullable(this.failoverPriority);
    }
    /**
     * @return The unique identifier of the region in which the database account replicates to. Example: &amp;lt;accountName&amp;gt;-&amp;lt;locationName&amp;gt;.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the region in which the database account exists.
     * 
     */
    public Optional<String> locationName() {
        return Optional.ofNullable(this.locationName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FailoverPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer failoverPriority;
        private String id;
        private @Nullable String locationName;

        public Builder() {
    	      // Empty
        }

        public Builder(FailoverPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failoverPriority = defaults.failoverPriority;
    	      this.id = defaults.id;
    	      this.locationName = defaults.locationName;
        }

        public Builder failoverPriority(@Nullable Integer failoverPriority) {
            this.failoverPriority = failoverPriority;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder locationName(@Nullable String locationName) {
            this.locationName = locationName;
            return this;
        }        public FailoverPolicyResponse build() {
            return new FailoverPolicyResponse(failoverPriority, id, locationName);
        }
    }
}
