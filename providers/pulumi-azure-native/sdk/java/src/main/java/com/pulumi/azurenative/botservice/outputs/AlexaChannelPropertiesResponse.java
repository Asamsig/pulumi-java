// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.botservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AlexaChannelPropertiesResponse {
    /**
     * @return The Alexa skill Id
     * 
     */
    private final String alexaSkillId;
    /**
     * @return Whether this channel is enabled for the bot
     * 
     */
    private final Boolean isEnabled;
    /**
     * @return Full Uri used to configured the skill in Alexa
     * 
     */
    private final String serviceEndpointUri;
    /**
     * @return Url fragment used in part of the Uri configured in Alexa
     * 
     */
    private final String urlFragment;

    @CustomType.Constructor
    private AlexaChannelPropertiesResponse(
        @CustomType.Parameter("alexaSkillId") String alexaSkillId,
        @CustomType.Parameter("isEnabled") Boolean isEnabled,
        @CustomType.Parameter("serviceEndpointUri") String serviceEndpointUri,
        @CustomType.Parameter("urlFragment") String urlFragment) {
        this.alexaSkillId = alexaSkillId;
        this.isEnabled = isEnabled;
        this.serviceEndpointUri = serviceEndpointUri;
        this.urlFragment = urlFragment;
    }

    /**
     * @return The Alexa skill Id
     * 
     */
    public String alexaSkillId() {
        return this.alexaSkillId;
    }
    /**
     * @return Whether this channel is enabled for the bot
     * 
     */
    public Boolean isEnabled() {
        return this.isEnabled;
    }
    /**
     * @return Full Uri used to configured the skill in Alexa
     * 
     */
    public String serviceEndpointUri() {
        return this.serviceEndpointUri;
    }
    /**
     * @return Url fragment used in part of the Uri configured in Alexa
     * 
     */
    public String urlFragment() {
        return this.urlFragment;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlexaChannelPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String alexaSkillId;
        private Boolean isEnabled;
        private String serviceEndpointUri;
        private String urlFragment;

        public Builder() {
    	      // Empty
        }

        public Builder(AlexaChannelPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alexaSkillId = defaults.alexaSkillId;
    	      this.isEnabled = defaults.isEnabled;
    	      this.serviceEndpointUri = defaults.serviceEndpointUri;
    	      this.urlFragment = defaults.urlFragment;
        }

        public Builder alexaSkillId(String alexaSkillId) {
            this.alexaSkillId = Objects.requireNonNull(alexaSkillId);
            return this;
        }
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }
        public Builder serviceEndpointUri(String serviceEndpointUri) {
            this.serviceEndpointUri = Objects.requireNonNull(serviceEndpointUri);
            return this;
        }
        public Builder urlFragment(String urlFragment) {
            this.urlFragment = Objects.requireNonNull(urlFragment);
            return this;
        }        public AlexaChannelPropertiesResponse build() {
            return new AlexaChannelPropertiesResponse(alexaSkillId, isEnabled, serviceEndpointUri, urlFragment);
        }
    }
}
