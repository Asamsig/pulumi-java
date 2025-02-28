// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BlobInventoryPolicyRuleFilter {
    /**
     * @return A set of blob types. Possible values are `blockBlob`, `appendBlob`, and `pageBlob`. The storage account with `is_hns_enabled` is `true` doesn&#39;t support `pageBlob`.
     * 
     */
    private final List<String> blobTypes;
    /**
     * @return Includes blob versions in blob inventory or not? Defaults to `false`.
     * 
     */
    private final @Nullable Boolean includeBlobVersions;
    /**
     * @return Includes blob snapshots in blob inventory or not? Defaults to `false`.
     * 
     */
    private final @Nullable Boolean includeSnapshots;
    /**
     * @return A set of strings for blob prefixes to be matched.
     * 
     */
    private final @Nullable List<String> prefixMatches;

    @CustomType.Constructor
    private BlobInventoryPolicyRuleFilter(
        @CustomType.Parameter("blobTypes") List<String> blobTypes,
        @CustomType.Parameter("includeBlobVersions") @Nullable Boolean includeBlobVersions,
        @CustomType.Parameter("includeSnapshots") @Nullable Boolean includeSnapshots,
        @CustomType.Parameter("prefixMatches") @Nullable List<String> prefixMatches) {
        this.blobTypes = blobTypes;
        this.includeBlobVersions = includeBlobVersions;
        this.includeSnapshots = includeSnapshots;
        this.prefixMatches = prefixMatches;
    }

    /**
     * @return A set of blob types. Possible values are `blockBlob`, `appendBlob`, and `pageBlob`. The storage account with `is_hns_enabled` is `true` doesn&#39;t support `pageBlob`.
     * 
     */
    public List<String> blobTypes() {
        return this.blobTypes;
    }
    /**
     * @return Includes blob versions in blob inventory or not? Defaults to `false`.
     * 
     */
    public Optional<Boolean> includeBlobVersions() {
        return Optional.ofNullable(this.includeBlobVersions);
    }
    /**
     * @return Includes blob snapshots in blob inventory or not? Defaults to `false`.
     * 
     */
    public Optional<Boolean> includeSnapshots() {
        return Optional.ofNullable(this.includeSnapshots);
    }
    /**
     * @return A set of strings for blob prefixes to be matched.
     * 
     */
    public List<String> prefixMatches() {
        return this.prefixMatches == null ? List.of() : this.prefixMatches;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobInventoryPolicyRuleFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> blobTypes;
        private @Nullable Boolean includeBlobVersions;
        private @Nullable Boolean includeSnapshots;
        private @Nullable List<String> prefixMatches;

        public Builder() {
    	      // Empty
        }

        public Builder(BlobInventoryPolicyRuleFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobTypes = defaults.blobTypes;
    	      this.includeBlobVersions = defaults.includeBlobVersions;
    	      this.includeSnapshots = defaults.includeSnapshots;
    	      this.prefixMatches = defaults.prefixMatches;
        }

        public Builder blobTypes(List<String> blobTypes) {
            this.blobTypes = Objects.requireNonNull(blobTypes);
            return this;
        }
        public Builder blobTypes(String... blobTypes) {
            return blobTypes(List.of(blobTypes));
        }
        public Builder includeBlobVersions(@Nullable Boolean includeBlobVersions) {
            this.includeBlobVersions = includeBlobVersions;
            return this;
        }
        public Builder includeSnapshots(@Nullable Boolean includeSnapshots) {
            this.includeSnapshots = includeSnapshots;
            return this;
        }
        public Builder prefixMatches(@Nullable List<String> prefixMatches) {
            this.prefixMatches = prefixMatches;
            return this;
        }
        public Builder prefixMatches(String... prefixMatches) {
            return prefixMatches(List.of(prefixMatches));
        }        public BlobInventoryPolicyRuleFilter build() {
            return new BlobInventoryPolicyRuleFilter(blobTypes, includeBlobVersions, includeSnapshots, prefixMatches);
        }
    }
}
