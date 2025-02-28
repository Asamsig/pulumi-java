// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.outputs;

import com.pulumi.azurenative.machinelearningservices.outputs.ListNotebookKeysResultResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.RegistryListCredentialsResultResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ListWorkspaceKeysResult {
    private final String appInsightsInstrumentationKey;
    private final RegistryListCredentialsResultResponse containerRegistryCredentials;
    private final ListNotebookKeysResultResponse notebookAccessKeys;
    private final String userStorageKey;
    private final String userStorageResourceId;

    @CustomType.Constructor
    private ListWorkspaceKeysResult(
        @CustomType.Parameter("appInsightsInstrumentationKey") String appInsightsInstrumentationKey,
        @CustomType.Parameter("containerRegistryCredentials") RegistryListCredentialsResultResponse containerRegistryCredentials,
        @CustomType.Parameter("notebookAccessKeys") ListNotebookKeysResultResponse notebookAccessKeys,
        @CustomType.Parameter("userStorageKey") String userStorageKey,
        @CustomType.Parameter("userStorageResourceId") String userStorageResourceId) {
        this.appInsightsInstrumentationKey = appInsightsInstrumentationKey;
        this.containerRegistryCredentials = containerRegistryCredentials;
        this.notebookAccessKeys = notebookAccessKeys;
        this.userStorageKey = userStorageKey;
        this.userStorageResourceId = userStorageResourceId;
    }

    public String appInsightsInstrumentationKey() {
        return this.appInsightsInstrumentationKey;
    }
    public RegistryListCredentialsResultResponse containerRegistryCredentials() {
        return this.containerRegistryCredentials;
    }
    public ListNotebookKeysResultResponse notebookAccessKeys() {
        return this.notebookAccessKeys;
    }
    public String userStorageKey() {
        return this.userStorageKey;
    }
    public String userStorageResourceId() {
        return this.userStorageResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListWorkspaceKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appInsightsInstrumentationKey;
        private RegistryListCredentialsResultResponse containerRegistryCredentials;
        private ListNotebookKeysResultResponse notebookAccessKeys;
        private String userStorageKey;
        private String userStorageResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ListWorkspaceKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appInsightsInstrumentationKey = defaults.appInsightsInstrumentationKey;
    	      this.containerRegistryCredentials = defaults.containerRegistryCredentials;
    	      this.notebookAccessKeys = defaults.notebookAccessKeys;
    	      this.userStorageKey = defaults.userStorageKey;
    	      this.userStorageResourceId = defaults.userStorageResourceId;
        }

        public Builder appInsightsInstrumentationKey(String appInsightsInstrumentationKey) {
            this.appInsightsInstrumentationKey = Objects.requireNonNull(appInsightsInstrumentationKey);
            return this;
        }
        public Builder containerRegistryCredentials(RegistryListCredentialsResultResponse containerRegistryCredentials) {
            this.containerRegistryCredentials = Objects.requireNonNull(containerRegistryCredentials);
            return this;
        }
        public Builder notebookAccessKeys(ListNotebookKeysResultResponse notebookAccessKeys) {
            this.notebookAccessKeys = Objects.requireNonNull(notebookAccessKeys);
            return this;
        }
        public Builder userStorageKey(String userStorageKey) {
            this.userStorageKey = Objects.requireNonNull(userStorageKey);
            return this;
        }
        public Builder userStorageResourceId(String userStorageResourceId) {
            this.userStorageResourceId = Objects.requireNonNull(userStorageResourceId);
            return this;
        }        public ListWorkspaceKeysResult build() {
            return new ListWorkspaceKeysResult(appInsightsInstrumentationKey, containerRegistryCredentials, notebookAccessKeys, userStorageKey, userStorageResourceId);
        }
    }
}
