// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datamigration_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.datamigration_v1beta1.outputs.DatabaseTypeResponse;
import com.pulumi.googlenative.datamigration_v1beta1.outputs.ReverseSshConnectivityResponse;
import com.pulumi.googlenative.datamigration_v1beta1.outputs.StaticIpConnectivityResponse;
import com.pulumi.googlenative.datamigration_v1beta1.outputs.StatusResponse;
import com.pulumi.googlenative.datamigration_v1beta1.outputs.VpcPeeringConnectivityResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetMigrationJobResult {
    /**
     * @return The timestamp when the migration job resource was created. A timestamp in RFC3339 UTC &#34;Zulu&#34; format, accurate to nanoseconds. Example: &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    private final String createTime;
    /**
     * @return The resource name (URI) of the destination connection profile.
     * 
     */
    private final String destination;
    /**
     * @return The database engine type and provider of the destination.
     * 
     */
    private final DatabaseTypeResponse destinationDatabase;
    /**
     * @return The migration job display name.
     * 
     */
    private final String displayName;
    /**
     * @return The path to the dump file in Google Cloud Storage, in the format: (gs://[BUCKET_NAME]/[OBJECT_NAME]).
     * 
     */
    private final String dumpPath;
    /**
     * @return The duration of the migration job (in seconds). A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    private final String duration;
    /**
     * @return If the migration job is completed, the time when it was completed.
     * 
     */
    private final String endTime;
    /**
     * @return The error details in case of state FAILED.
     * 
     */
    private final StatusResponse error;
    /**
     * @return The resource labels for migration job to use to annotate any related underlying resources such as Compute Engine VMs. An object containing a list of &#34;key&#34;: &#34;value&#34; pairs. Example: `{ &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }`.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return The name (URI) of this migration job resource, in the form of: projects/{project}/locations/{location}/migrationJobs/{migrationJob}.
     * 
     */
    private final String name;
    /**
     * @return The current migration job phase.
     * 
     */
    private final String phase;
    /**
     * @return The details needed to communicate to the source over Reverse SSH tunnel connectivity.
     * 
     */
    private final ReverseSshConnectivityResponse reverseSshConnectivity;
    /**
     * @return The resource name (URI) of the source connection profile.
     * 
     */
    private final String source;
    /**
     * @return The database engine type and provider of the source.
     * 
     */
    private final DatabaseTypeResponse sourceDatabase;
    /**
     * @return The current migration job state.
     * 
     */
    private final String state;
    /**
     * @return static ip connectivity data (default, no additional details needed).
     * 
     */
    private final StaticIpConnectivityResponse staticIpConnectivity;
    /**
     * @return The migration job type.
     * 
     */
    private final String type;
    /**
     * @return The timestamp when the migration job resource was last updated. A timestamp in RFC3339 UTC &#34;Zulu&#34; format, accurate to nanoseconds. Example: &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    private final String updateTime;
    /**
     * @return The details of the VPC network that the source database is located in.
     * 
     */
    private final VpcPeeringConnectivityResponse vpcPeeringConnectivity;

    @CustomType.Constructor
    private GetMigrationJobResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("destination") String destination,
        @CustomType.Parameter("destinationDatabase") DatabaseTypeResponse destinationDatabase,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("dumpPath") String dumpPath,
        @CustomType.Parameter("duration") String duration,
        @CustomType.Parameter("endTime") String endTime,
        @CustomType.Parameter("error") StatusResponse error,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("phase") String phase,
        @CustomType.Parameter("reverseSshConnectivity") ReverseSshConnectivityResponse reverseSshConnectivity,
        @CustomType.Parameter("source") String source,
        @CustomType.Parameter("sourceDatabase") DatabaseTypeResponse sourceDatabase,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("staticIpConnectivity") StaticIpConnectivityResponse staticIpConnectivity,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("updateTime") String updateTime,
        @CustomType.Parameter("vpcPeeringConnectivity") VpcPeeringConnectivityResponse vpcPeeringConnectivity) {
        this.createTime = createTime;
        this.destination = destination;
        this.destinationDatabase = destinationDatabase;
        this.displayName = displayName;
        this.dumpPath = dumpPath;
        this.duration = duration;
        this.endTime = endTime;
        this.error = error;
        this.labels = labels;
        this.name = name;
        this.phase = phase;
        this.reverseSshConnectivity = reverseSshConnectivity;
        this.source = source;
        this.sourceDatabase = sourceDatabase;
        this.state = state;
        this.staticIpConnectivity = staticIpConnectivity;
        this.type = type;
        this.updateTime = updateTime;
        this.vpcPeeringConnectivity = vpcPeeringConnectivity;
    }

    /**
     * @return The timestamp when the migration job resource was created. A timestamp in RFC3339 UTC &#34;Zulu&#34; format, accurate to nanoseconds. Example: &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The resource name (URI) of the destination connection profile.
     * 
     */
    public String destination() {
        return this.destination;
    }
    /**
     * @return The database engine type and provider of the destination.
     * 
     */
    public DatabaseTypeResponse destinationDatabase() {
        return this.destinationDatabase;
    }
    /**
     * @return The migration job display name.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return The path to the dump file in Google Cloud Storage, in the format: (gs://[BUCKET_NAME]/[OBJECT_NAME]).
     * 
     */
    public String dumpPath() {
        return this.dumpPath;
    }
    /**
     * @return The duration of the migration job (in seconds). A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    public String duration() {
        return this.duration;
    }
    /**
     * @return If the migration job is completed, the time when it was completed.
     * 
     */
    public String endTime() {
        return this.endTime;
    }
    /**
     * @return The error details in case of state FAILED.
     * 
     */
    public StatusResponse error() {
        return this.error;
    }
    /**
     * @return The resource labels for migration job to use to annotate any related underlying resources such as Compute Engine VMs. An object containing a list of &#34;key&#34;: &#34;value&#34; pairs. Example: `{ &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }`.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return The name (URI) of this migration job resource, in the form of: projects/{project}/locations/{location}/migrationJobs/{migrationJob}.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The current migration job phase.
     * 
     */
    public String phase() {
        return this.phase;
    }
    /**
     * @return The details needed to communicate to the source over Reverse SSH tunnel connectivity.
     * 
     */
    public ReverseSshConnectivityResponse reverseSshConnectivity() {
        return this.reverseSshConnectivity;
    }
    /**
     * @return The resource name (URI) of the source connection profile.
     * 
     */
    public String source() {
        return this.source;
    }
    /**
     * @return The database engine type and provider of the source.
     * 
     */
    public DatabaseTypeResponse sourceDatabase() {
        return this.sourceDatabase;
    }
    /**
     * @return The current migration job state.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return static ip connectivity data (default, no additional details needed).
     * 
     */
    public StaticIpConnectivityResponse staticIpConnectivity() {
        return this.staticIpConnectivity;
    }
    /**
     * @return The migration job type.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The timestamp when the migration job resource was last updated. A timestamp in RFC3339 UTC &#34;Zulu&#34; format, accurate to nanoseconds. Example: &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }
    /**
     * @return The details of the VPC network that the source database is located in.
     * 
     */
    public VpcPeeringConnectivityResponse vpcPeeringConnectivity() {
        return this.vpcPeeringConnectivity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMigrationJobResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String destination;
        private DatabaseTypeResponse destinationDatabase;
        private String displayName;
        private String dumpPath;
        private String duration;
        private String endTime;
        private StatusResponse error;
        private Map<String,String> labels;
        private String name;
        private String phase;
        private ReverseSshConnectivityResponse reverseSshConnectivity;
        private String source;
        private DatabaseTypeResponse sourceDatabase;
        private String state;
        private StaticIpConnectivityResponse staticIpConnectivity;
        private String type;
        private String updateTime;
        private VpcPeeringConnectivityResponse vpcPeeringConnectivity;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMigrationJobResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.destination = defaults.destination;
    	      this.destinationDatabase = defaults.destinationDatabase;
    	      this.displayName = defaults.displayName;
    	      this.dumpPath = defaults.dumpPath;
    	      this.duration = defaults.duration;
    	      this.endTime = defaults.endTime;
    	      this.error = defaults.error;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.phase = defaults.phase;
    	      this.reverseSshConnectivity = defaults.reverseSshConnectivity;
    	      this.source = defaults.source;
    	      this.sourceDatabase = defaults.sourceDatabase;
    	      this.state = defaults.state;
    	      this.staticIpConnectivity = defaults.staticIpConnectivity;
    	      this.type = defaults.type;
    	      this.updateTime = defaults.updateTime;
    	      this.vpcPeeringConnectivity = defaults.vpcPeeringConnectivity;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder destination(String destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }
        public Builder destinationDatabase(DatabaseTypeResponse destinationDatabase) {
            this.destinationDatabase = Objects.requireNonNull(destinationDatabase);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder dumpPath(String dumpPath) {
            this.dumpPath = Objects.requireNonNull(dumpPath);
            return this;
        }
        public Builder duration(String duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }
        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        public Builder error(StatusResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder phase(String phase) {
            this.phase = Objects.requireNonNull(phase);
            return this;
        }
        public Builder reverseSshConnectivity(ReverseSshConnectivityResponse reverseSshConnectivity) {
            this.reverseSshConnectivity = Objects.requireNonNull(reverseSshConnectivity);
            return this;
        }
        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public Builder sourceDatabase(DatabaseTypeResponse sourceDatabase) {
            this.sourceDatabase = Objects.requireNonNull(sourceDatabase);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder staticIpConnectivity(StaticIpConnectivityResponse staticIpConnectivity) {
            this.staticIpConnectivity = Objects.requireNonNull(staticIpConnectivity);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public Builder vpcPeeringConnectivity(VpcPeeringConnectivityResponse vpcPeeringConnectivity) {
            this.vpcPeeringConnectivity = Objects.requireNonNull(vpcPeeringConnectivity);
            return this;
        }        public GetMigrationJobResult build() {
            return new GetMigrationJobResult(createTime, destination, destinationDatabase, displayName, dumpPath, duration, endTime, error, labels, name, phase, reverseSshConnectivity, source, sourceDatabase, state, staticIpConnectivity, type, updateTime, vpcPeeringConnectivity);
        }
    }
}
