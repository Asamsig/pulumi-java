// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.cloudrun.outputs.ServiceTemplateSpecVolumeSecretItem;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceTemplateSpecVolumeSecret {
    /**
     * @return Mode bits to use on created files by default. Must be a value between 0000
     * and 0777. Defaults to 0644. Directories within the path are not affected by
     * this setting. This might be in conflict with other options that affect the
     * file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    private final @Nullable Integer defaultMode;
    /**
     * @return If unspecified, the volume will expose a file whose name is the
     * secret_name.
     * If specified, the key will be used as the version to fetch from Cloud
     * Secret Manager and the path will be the name of the file exposed in the
     * volume. When items are defined, they must specify a key and a path.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<ServiceTemplateSpecVolumeSecretItem> items;
    /**
     * @return The name of the secret in Cloud Secret Manager. By default, the secret
     * is assumed to be in the same project.
     * If the secret is in another project, you must define an alias.
     * An alias definition has the form:
     * &lt;alias&gt;:projects/&lt;project-id|project-number&gt;/secrets/&lt;secret-name&gt;.
     * If multiple alias definitions are needed, they must be separated by
     * commas.
     * The alias definitions must be set on the run.googleapis.com/secrets
     * annotation.
     * 
     */
    private final String secretName;

    @CustomType.Constructor
    private ServiceTemplateSpecVolumeSecret(
        @CustomType.Parameter("defaultMode") @Nullable Integer defaultMode,
        @CustomType.Parameter("items") @Nullable List<ServiceTemplateSpecVolumeSecretItem> items,
        @CustomType.Parameter("secretName") String secretName) {
        this.defaultMode = defaultMode;
        this.items = items;
        this.secretName = secretName;
    }

    /**
     * @return Mode bits to use on created files by default. Must be a value between 0000
     * and 0777. Defaults to 0644. Directories within the path are not affected by
     * this setting. This might be in conflict with other options that affect the
     * file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    public Optional<Integer> defaultMode() {
        return Optional.ofNullable(this.defaultMode);
    }
    /**
     * @return If unspecified, the volume will expose a file whose name is the
     * secret_name.
     * If specified, the key will be used as the version to fetch from Cloud
     * Secret Manager and the path will be the name of the file exposed in the
     * volume. When items are defined, they must specify a key and a path.
     * Structure is documented below.
     * 
     */
    public List<ServiceTemplateSpecVolumeSecretItem> items() {
        return this.items == null ? List.of() : this.items;
    }
    /**
     * @return The name of the secret in Cloud Secret Manager. By default, the secret
     * is assumed to be in the same project.
     * If the secret is in another project, you must define an alias.
     * An alias definition has the form:
     * &lt;alias&gt;:projects/&lt;project-id|project-number&gt;/secrets/&lt;secret-name&gt;.
     * If multiple alias definitions are needed, they must be separated by
     * commas.
     * The alias definitions must be set on the run.googleapis.com/secrets
     * annotation.
     * 
     */
    public String secretName() {
        return this.secretName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplateSpecVolumeSecret defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer defaultMode;
        private @Nullable List<ServiceTemplateSpecVolumeSecretItem> items;
        private String secretName;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTemplateSpecVolumeSecret defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultMode = defaults.defaultMode;
    	      this.items = defaults.items;
    	      this.secretName = defaults.secretName;
        }

        public Builder defaultMode(@Nullable Integer defaultMode) {
            this.defaultMode = defaultMode;
            return this;
        }
        public Builder items(@Nullable List<ServiceTemplateSpecVolumeSecretItem> items) {
            this.items = items;
            return this;
        }
        public Builder items(ServiceTemplateSpecVolumeSecretItem... items) {
            return items(List.of(items));
        }
        public Builder secretName(String secretName) {
            this.secretName = Objects.requireNonNull(secretName);
            return this;
        }        public ServiceTemplateSpecVolumeSecret build() {
            return new ServiceTemplateSpecVolumeSecret(defaultMode, items, secretName);
        }
    }
}
