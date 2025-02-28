// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.webpubsub.outputs;

import com.pulumi.azurenative.webpubsub.outputs.EventHandlerTemplateResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class EventHandlerSettingsResponse {
    /**
     * @return Get or set the EventHandler items. The key is the hub name and the value is the corresponding EventHandlerTemplate.
     * 
     */
    private final @Nullable Map<String,List<EventHandlerTemplateResponse>> items;

    @CustomType.Constructor
    private EventHandlerSettingsResponse(@CustomType.Parameter("items") @Nullable Map<String,List<EventHandlerTemplateResponse>> items) {
        this.items = items;
    }

    /**
     * @return Get or set the EventHandler items. The key is the hub name and the value is the corresponding EventHandlerTemplate.
     * 
     */
    public Map<String,List<EventHandlerTemplateResponse>> items() {
        return this.items == null ? Map.of() : this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventHandlerSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,List<EventHandlerTemplateResponse>> items;

        public Builder() {
    	      // Empty
        }

        public Builder(EventHandlerSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(@Nullable Map<String,List<EventHandlerTemplateResponse>> items) {
            this.items = items;
            return this;
        }        public EventHandlerSettingsResponse build() {
            return new EventHandlerSettingsResponse(items);
        }
    }
}
