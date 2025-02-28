// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core_v1.outputs.LocalObjectReference;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CSIVolumeSource {
    /**
     * @return driver is the name of the CSI driver that handles this volume. Consult with your admin for the correct name as registered in the cluster.
     * 
     */
    private final String driver;
    /**
     * @return fsType to mount. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. If not provided, the empty value is passed to the associated CSI driver which will determine the default filesystem to apply.
     * 
     */
    private final @Nullable String fsType;
    /**
     * @return nodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume calls. This field is optional, and  may be empty if no secret is required. If the secret object contains more than one secret, all secret references are passed.
     * 
     */
    private final @Nullable LocalObjectReference nodePublishSecretRef;
    /**
     * @return readOnly specifies a read-only configuration for the volume. Defaults to false (read/write).
     * 
     */
    private final @Nullable Boolean readOnly;
    /**
     * @return volumeAttributes stores driver-specific properties that are passed to the CSI driver. Consult your driver&#39;s documentation for supported values.
     * 
     */
    private final @Nullable Map<String,String> volumeAttributes;

    @CustomType.Constructor
    private CSIVolumeSource(
        @CustomType.Parameter("driver") String driver,
        @CustomType.Parameter("fsType") @Nullable String fsType,
        @CustomType.Parameter("nodePublishSecretRef") @Nullable LocalObjectReference nodePublishSecretRef,
        @CustomType.Parameter("readOnly") @Nullable Boolean readOnly,
        @CustomType.Parameter("volumeAttributes") @Nullable Map<String,String> volumeAttributes) {
        this.driver = driver;
        this.fsType = fsType;
        this.nodePublishSecretRef = nodePublishSecretRef;
        this.readOnly = readOnly;
        this.volumeAttributes = volumeAttributes;
    }

    /**
     * @return driver is the name of the CSI driver that handles this volume. Consult with your admin for the correct name as registered in the cluster.
     * 
     */
    public String driver() {
        return this.driver;
    }
    /**
     * @return fsType to mount. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. If not provided, the empty value is passed to the associated CSI driver which will determine the default filesystem to apply.
     * 
     */
    public Optional<String> fsType() {
        return Optional.ofNullable(this.fsType);
    }
    /**
     * @return nodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume calls. This field is optional, and  may be empty if no secret is required. If the secret object contains more than one secret, all secret references are passed.
     * 
     */
    public Optional<LocalObjectReference> nodePublishSecretRef() {
        return Optional.ofNullable(this.nodePublishSecretRef);
    }
    /**
     * @return readOnly specifies a read-only configuration for the volume. Defaults to false (read/write).
     * 
     */
    public Optional<Boolean> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    /**
     * @return volumeAttributes stores driver-specific properties that are passed to the CSI driver. Consult your driver&#39;s documentation for supported values.
     * 
     */
    public Map<String,String> volumeAttributes() {
        return this.volumeAttributes == null ? Map.of() : this.volumeAttributes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CSIVolumeSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String driver;
        private @Nullable String fsType;
        private @Nullable LocalObjectReference nodePublishSecretRef;
        private @Nullable Boolean readOnly;
        private @Nullable Map<String,String> volumeAttributes;

        public Builder() {
    	      // Empty
        }

        public Builder(CSIVolumeSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.driver = defaults.driver;
    	      this.fsType = defaults.fsType;
    	      this.nodePublishSecretRef = defaults.nodePublishSecretRef;
    	      this.readOnly = defaults.readOnly;
    	      this.volumeAttributes = defaults.volumeAttributes;
        }

        public Builder driver(String driver) {
            this.driver = Objects.requireNonNull(driver);
            return this;
        }
        public Builder fsType(@Nullable String fsType) {
            this.fsType = fsType;
            return this;
        }
        public Builder nodePublishSecretRef(@Nullable LocalObjectReference nodePublishSecretRef) {
            this.nodePublishSecretRef = nodePublishSecretRef;
            return this;
        }
        public Builder readOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Builder volumeAttributes(@Nullable Map<String,String> volumeAttributes) {
            this.volumeAttributes = volumeAttributes;
            return this;
        }        public CSIVolumeSource build() {
            return new CSIVolumeSource(driver, fsType, nodePublishSecretRef, readOnly, volumeAttributes);
        }
    }
}
