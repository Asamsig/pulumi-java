// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.domainservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceNotifications {
    /**
     * @return A list of additional email addresses to notify when there are alerts in the managed domain.
     * 
     */
    private final @Nullable List<String> additionalRecipients;
    /**
     * @return Whether to notify members of the _AAD DC Administrators_ group when there are alerts in the managed domain.
     * 
     */
    private final @Nullable Boolean notifyDcAdmins;
    /**
     * @return Whether to notify all Global Administrators when there are alerts in the managed domain.
     * 
     */
    private final @Nullable Boolean notifyGlobalAdmins;

    @CustomType.Constructor
    private ServiceNotifications(
        @CustomType.Parameter("additionalRecipients") @Nullable List<String> additionalRecipients,
        @CustomType.Parameter("notifyDcAdmins") @Nullable Boolean notifyDcAdmins,
        @CustomType.Parameter("notifyGlobalAdmins") @Nullable Boolean notifyGlobalAdmins) {
        this.additionalRecipients = additionalRecipients;
        this.notifyDcAdmins = notifyDcAdmins;
        this.notifyGlobalAdmins = notifyGlobalAdmins;
    }

    /**
     * @return A list of additional email addresses to notify when there are alerts in the managed domain.
     * 
     */
    public List<String> additionalRecipients() {
        return this.additionalRecipients == null ? List.of() : this.additionalRecipients;
    }
    /**
     * @return Whether to notify members of the _AAD DC Administrators_ group when there are alerts in the managed domain.
     * 
     */
    public Optional<Boolean> notifyDcAdmins() {
        return Optional.ofNullable(this.notifyDcAdmins);
    }
    /**
     * @return Whether to notify all Global Administrators when there are alerts in the managed domain.
     * 
     */
    public Optional<Boolean> notifyGlobalAdmins() {
        return Optional.ofNullable(this.notifyGlobalAdmins);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceNotifications defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> additionalRecipients;
        private @Nullable Boolean notifyDcAdmins;
        private @Nullable Boolean notifyGlobalAdmins;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceNotifications defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalRecipients = defaults.additionalRecipients;
    	      this.notifyDcAdmins = defaults.notifyDcAdmins;
    	      this.notifyGlobalAdmins = defaults.notifyGlobalAdmins;
        }

        public Builder additionalRecipients(@Nullable List<String> additionalRecipients) {
            this.additionalRecipients = additionalRecipients;
            return this;
        }
        public Builder additionalRecipients(String... additionalRecipients) {
            return additionalRecipients(List.of(additionalRecipients));
        }
        public Builder notifyDcAdmins(@Nullable Boolean notifyDcAdmins) {
            this.notifyDcAdmins = notifyDcAdmins;
            return this;
        }
        public Builder notifyGlobalAdmins(@Nullable Boolean notifyGlobalAdmins) {
            this.notifyGlobalAdmins = notifyGlobalAdmins;
            return this;
        }        public ServiceNotifications build() {
            return new ServiceNotifications(additionalRecipients, notifyDcAdmins, notifyGlobalAdmins);
        }
    }
}
