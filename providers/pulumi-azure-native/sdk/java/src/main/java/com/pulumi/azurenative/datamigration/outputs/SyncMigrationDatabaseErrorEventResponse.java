// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SyncMigrationDatabaseErrorEventResponse {
    /**
     * @return Event text.
     * 
     */
    private final String eventText;
    /**
     * @return Event type.
     * 
     */
    private final String eventTypeString;
    /**
     * @return String value of timestamp.
     * 
     */
    private final String timestampString;

    @CustomType.Constructor
    private SyncMigrationDatabaseErrorEventResponse(
        @CustomType.Parameter("eventText") String eventText,
        @CustomType.Parameter("eventTypeString") String eventTypeString,
        @CustomType.Parameter("timestampString") String timestampString) {
        this.eventText = eventText;
        this.eventTypeString = eventTypeString;
        this.timestampString = timestampString;
    }

    /**
     * @return Event text.
     * 
     */
    public String eventText() {
        return this.eventText;
    }
    /**
     * @return Event type.
     * 
     */
    public String eventTypeString() {
        return this.eventTypeString;
    }
    /**
     * @return String value of timestamp.
     * 
     */
    public String timestampString() {
        return this.timestampString;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SyncMigrationDatabaseErrorEventResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String eventText;
        private String eventTypeString;
        private String timestampString;

        public Builder() {
    	      // Empty
        }

        public Builder(SyncMigrationDatabaseErrorEventResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventText = defaults.eventText;
    	      this.eventTypeString = defaults.eventTypeString;
    	      this.timestampString = defaults.timestampString;
        }

        public Builder eventText(String eventText) {
            this.eventText = Objects.requireNonNull(eventText);
            return this;
        }
        public Builder eventTypeString(String eventTypeString) {
            this.eventTypeString = Objects.requireNonNull(eventTypeString);
            return this;
        }
        public Builder timestampString(String timestampString) {
            this.timestampString = Objects.requireNonNull(timestampString);
            return this;
        }        public SyncMigrationDatabaseErrorEventResponse build() {
            return new SyncMigrationDatabaseErrorEventResponse(eventText, eventTypeString, timestampString);
        }
    }
}
