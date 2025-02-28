// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSyncAgentResult {
    /**
     * @return Expiration time of the sync agent version.
     * 
     */
    private final String expiryTime;
    /**
     * @return Resource ID.
     * 
     */
    private final String id;
    /**
     * @return If the sync agent version is up to date.
     * 
     */
    private final Boolean isUpToDate;
    /**
     * @return Last alive time of the sync agent.
     * 
     */
    private final String lastAliveTime;
    /**
     * @return Resource name.
     * 
     */
    private final String name;
    /**
     * @return State of the sync agent.
     * 
     */
    private final String state;
    /**
     * @return ARM resource id of the sync database in the sync agent.
     * 
     */
    private final @Nullable String syncDatabaseId;
    /**
     * @return Resource type.
     * 
     */
    private final String type;
    /**
     * @return Version of the sync agent.
     * 
     */
    private final String version;

    @CustomType.Constructor
    private GetSyncAgentResult(
        @CustomType.Parameter("expiryTime") String expiryTime,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isUpToDate") Boolean isUpToDate,
        @CustomType.Parameter("lastAliveTime") String lastAliveTime,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("syncDatabaseId") @Nullable String syncDatabaseId,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("version") String version) {
        this.expiryTime = expiryTime;
        this.id = id;
        this.isUpToDate = isUpToDate;
        this.lastAliveTime = lastAliveTime;
        this.name = name;
        this.state = state;
        this.syncDatabaseId = syncDatabaseId;
        this.type = type;
        this.version = version;
    }

    /**
     * @return Expiration time of the sync agent version.
     * 
     */
    public String expiryTime() {
        return this.expiryTime;
    }
    /**
     * @return Resource ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return If the sync agent version is up to date.
     * 
     */
    public Boolean isUpToDate() {
        return this.isUpToDate;
    }
    /**
     * @return Last alive time of the sync agent.
     * 
     */
    public String lastAliveTime() {
        return this.lastAliveTime;
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return State of the sync agent.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return ARM resource id of the sync database in the sync agent.
     * 
     */
    public Optional<String> syncDatabaseId() {
        return Optional.ofNullable(this.syncDatabaseId);
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Version of the sync agent.
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSyncAgentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expiryTime;
        private String id;
        private Boolean isUpToDate;
        private String lastAliveTime;
        private String name;
        private String state;
        private @Nullable String syncDatabaseId;
        private String type;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSyncAgentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expiryTime = defaults.expiryTime;
    	      this.id = defaults.id;
    	      this.isUpToDate = defaults.isUpToDate;
    	      this.lastAliveTime = defaults.lastAliveTime;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.syncDatabaseId = defaults.syncDatabaseId;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder expiryTime(String expiryTime) {
            this.expiryTime = Objects.requireNonNull(expiryTime);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder isUpToDate(Boolean isUpToDate) {
            this.isUpToDate = Objects.requireNonNull(isUpToDate);
            return this;
        }
        public Builder lastAliveTime(String lastAliveTime) {
            this.lastAliveTime = Objects.requireNonNull(lastAliveTime);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder syncDatabaseId(@Nullable String syncDatabaseId) {
            this.syncDatabaseId = syncDatabaseId;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public GetSyncAgentResult build() {
            return new GetSyncAgentResult(expiryTime, id, isUpToDate, lastAliveTime, name, state, syncDatabaseId, type, version);
        }
    }
}
