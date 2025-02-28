// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hdinsight.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SparkClusterComponentVersion {
    /**
     * @return The version of Spark which should be used for this HDInsight Spark Cluster. Changing this forces a new resource to be created.
     * 
     */
    private final String spark;

    @CustomType.Constructor
    private SparkClusterComponentVersion(@CustomType.Parameter("spark") String spark) {
        this.spark = spark;
    }

    /**
     * @return The version of Spark which should be used for this HDInsight Spark Cluster. Changing this forces a new resource to be created.
     * 
     */
    public String spark() {
        return this.spark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SparkClusterComponentVersion defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String spark;

        public Builder() {
    	      // Empty
        }

        public Builder(SparkClusterComponentVersion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.spark = defaults.spark;
        }

        public Builder spark(String spark) {
            this.spark = Objects.requireNonNull(spark);
            return this;
        }        public SparkClusterComponentVersion build() {
            return new SparkClusterComponentVersion(spark);
        }
    }
}
