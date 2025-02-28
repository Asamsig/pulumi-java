// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb.outputs;

import com.pulumi.azure.cosmosdb.outputs.GetRestorableDatabaseAccountsAccountRestorableLocation;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRestorableDatabaseAccountsAccount {
    /**
     * @return The API type of the Cosmos DB Restorable Database Account.
     * 
     */
    private final String apiType;
    /**
     * @return The creation time of the regional Cosmos DB Restorable Database Account.
     * 
     */
    private final String creationTime;
    /**
     * @return The deletion time of the regional Cosmos DB Restorable Database Account.
     * 
     */
    private final String deletionTime;
    /**
     * @return The ID of the Cosmos DB Restorable Database Account.
     * 
     */
    private final String id;
    /**
     * @return One or more `restorable_locations` blocks as defined below.
     * 
     */
    private final List<GetRestorableDatabaseAccountsAccountRestorableLocation> restorableLocations;

    @CustomType.Constructor
    private GetRestorableDatabaseAccountsAccount(
        @CustomType.Parameter("apiType") String apiType,
        @CustomType.Parameter("creationTime") String creationTime,
        @CustomType.Parameter("deletionTime") String deletionTime,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("restorableLocations") List<GetRestorableDatabaseAccountsAccountRestorableLocation> restorableLocations) {
        this.apiType = apiType;
        this.creationTime = creationTime;
        this.deletionTime = deletionTime;
        this.id = id;
        this.restorableLocations = restorableLocations;
    }

    /**
     * @return The API type of the Cosmos DB Restorable Database Account.
     * 
     */
    public String apiType() {
        return this.apiType;
    }
    /**
     * @return The creation time of the regional Cosmos DB Restorable Database Account.
     * 
     */
    public String creationTime() {
        return this.creationTime;
    }
    /**
     * @return The deletion time of the regional Cosmos DB Restorable Database Account.
     * 
     */
    public String deletionTime() {
        return this.deletionTime;
    }
    /**
     * @return The ID of the Cosmos DB Restorable Database Account.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return One or more `restorable_locations` blocks as defined below.
     * 
     */
    public List<GetRestorableDatabaseAccountsAccountRestorableLocation> restorableLocations() {
        return this.restorableLocations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRestorableDatabaseAccountsAccount defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiType;
        private String creationTime;
        private String deletionTime;
        private String id;
        private List<GetRestorableDatabaseAccountsAccountRestorableLocation> restorableLocations;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRestorableDatabaseAccountsAccount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiType = defaults.apiType;
    	      this.creationTime = defaults.creationTime;
    	      this.deletionTime = defaults.deletionTime;
    	      this.id = defaults.id;
    	      this.restorableLocations = defaults.restorableLocations;
        }

        public Builder apiType(String apiType) {
            this.apiType = Objects.requireNonNull(apiType);
            return this;
        }
        public Builder creationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }
        public Builder deletionTime(String deletionTime) {
            this.deletionTime = Objects.requireNonNull(deletionTime);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder restorableLocations(List<GetRestorableDatabaseAccountsAccountRestorableLocation> restorableLocations) {
            this.restorableLocations = Objects.requireNonNull(restorableLocations);
            return this;
        }
        public Builder restorableLocations(GetRestorableDatabaseAccountsAccountRestorableLocation... restorableLocations) {
            return restorableLocations(List.of(restorableLocations));
        }        public GetRestorableDatabaseAccountsAccount build() {
            return new GetRestorableDatabaseAccountsAccount(apiType, creationTime, deletionTime, id, restorableLocations);
        }
    }
}
