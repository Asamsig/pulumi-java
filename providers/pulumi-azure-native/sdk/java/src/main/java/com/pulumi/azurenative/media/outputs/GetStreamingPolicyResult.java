// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.outputs;

import com.pulumi.azurenative.media.outputs.CommonEncryptionCbcsResponse;
import com.pulumi.azurenative.media.outputs.CommonEncryptionCencResponse;
import com.pulumi.azurenative.media.outputs.EnvelopeEncryptionResponse;
import com.pulumi.azurenative.media.outputs.NoEncryptionResponse;
import com.pulumi.azurenative.media.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetStreamingPolicyResult {
    /**
     * @return Configuration of CommonEncryptionCbcs
     * 
     */
    private final @Nullable CommonEncryptionCbcsResponse commonEncryptionCbcs;
    /**
     * @return Configuration of CommonEncryptionCenc
     * 
     */
    private final @Nullable CommonEncryptionCencResponse commonEncryptionCenc;
    /**
     * @return Creation time of Streaming Policy
     * 
     */
    private final String created;
    /**
     * @return Default ContentKey used by current Streaming Policy
     * 
     */
    private final @Nullable String defaultContentKeyPolicyName;
    /**
     * @return Configuration of EnvelopeEncryption
     * 
     */
    private final @Nullable EnvelopeEncryptionResponse envelopeEncryption;
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * @return The name of the resource
     * 
     */
    private final String name;
    /**
     * @return Configurations of NoEncryption
     * 
     */
    private final @Nullable NoEncryptionResponse noEncryption;
    /**
     * @return The system metadata relating to this resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetStreamingPolicyResult(
        @CustomType.Parameter("commonEncryptionCbcs") @Nullable CommonEncryptionCbcsResponse commonEncryptionCbcs,
        @CustomType.Parameter("commonEncryptionCenc") @Nullable CommonEncryptionCencResponse commonEncryptionCenc,
        @CustomType.Parameter("created") String created,
        @CustomType.Parameter("defaultContentKeyPolicyName") @Nullable String defaultContentKeyPolicyName,
        @CustomType.Parameter("envelopeEncryption") @Nullable EnvelopeEncryptionResponse envelopeEncryption,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("noEncryption") @Nullable NoEncryptionResponse noEncryption,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("type") String type) {
        this.commonEncryptionCbcs = commonEncryptionCbcs;
        this.commonEncryptionCenc = commonEncryptionCenc;
        this.created = created;
        this.defaultContentKeyPolicyName = defaultContentKeyPolicyName;
        this.envelopeEncryption = envelopeEncryption;
        this.id = id;
        this.name = name;
        this.noEncryption = noEncryption;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * @return Configuration of CommonEncryptionCbcs
     * 
     */
    public Optional<CommonEncryptionCbcsResponse> commonEncryptionCbcs() {
        return Optional.ofNullable(this.commonEncryptionCbcs);
    }
    /**
     * @return Configuration of CommonEncryptionCenc
     * 
     */
    public Optional<CommonEncryptionCencResponse> commonEncryptionCenc() {
        return Optional.ofNullable(this.commonEncryptionCenc);
    }
    /**
     * @return Creation time of Streaming Policy
     * 
     */
    public String created() {
        return this.created;
    }
    /**
     * @return Default ContentKey used by current Streaming Policy
     * 
     */
    public Optional<String> defaultContentKeyPolicyName() {
        return Optional.ofNullable(this.defaultContentKeyPolicyName);
    }
    /**
     * @return Configuration of EnvelopeEncryption
     * 
     */
    public Optional<EnvelopeEncryptionResponse> envelopeEncryption() {
        return Optional.ofNullable(this.envelopeEncryption);
    }
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Configurations of NoEncryption
     * 
     */
    public Optional<NoEncryptionResponse> noEncryption() {
        return Optional.ofNullable(this.noEncryption);
    }
    /**
     * @return The system metadata relating to this resource.
     * 
     */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStreamingPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CommonEncryptionCbcsResponse commonEncryptionCbcs;
        private @Nullable CommonEncryptionCencResponse commonEncryptionCenc;
        private String created;
        private @Nullable String defaultContentKeyPolicyName;
        private @Nullable EnvelopeEncryptionResponse envelopeEncryption;
        private String id;
        private String name;
        private @Nullable NoEncryptionResponse noEncryption;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStreamingPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commonEncryptionCbcs = defaults.commonEncryptionCbcs;
    	      this.commonEncryptionCenc = defaults.commonEncryptionCenc;
    	      this.created = defaults.created;
    	      this.defaultContentKeyPolicyName = defaults.defaultContentKeyPolicyName;
    	      this.envelopeEncryption = defaults.envelopeEncryption;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.noEncryption = defaults.noEncryption;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder commonEncryptionCbcs(@Nullable CommonEncryptionCbcsResponse commonEncryptionCbcs) {
            this.commonEncryptionCbcs = commonEncryptionCbcs;
            return this;
        }
        public Builder commonEncryptionCenc(@Nullable CommonEncryptionCencResponse commonEncryptionCenc) {
            this.commonEncryptionCenc = commonEncryptionCenc;
            return this;
        }
        public Builder created(String created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }
        public Builder defaultContentKeyPolicyName(@Nullable String defaultContentKeyPolicyName) {
            this.defaultContentKeyPolicyName = defaultContentKeyPolicyName;
            return this;
        }
        public Builder envelopeEncryption(@Nullable EnvelopeEncryptionResponse envelopeEncryption) {
            this.envelopeEncryption = envelopeEncryption;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder noEncryption(@Nullable NoEncryptionResponse noEncryption) {
            this.noEncryption = noEncryption;
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetStreamingPolicyResult build() {
            return new GetStreamingPolicyResult(commonEncryptionCbcs, commonEncryptionCenc, created, defaultContentKeyPolicyName, envelopeEncryption, id, name, noEncryption, systemData, type);
        }
    }
}
