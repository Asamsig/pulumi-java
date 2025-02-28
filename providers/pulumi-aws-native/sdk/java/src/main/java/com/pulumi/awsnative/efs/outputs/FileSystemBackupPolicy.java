// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.efs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FileSystemBackupPolicy {
    private final String status;

    @CustomType.Constructor
    private FileSystemBackupPolicy(@CustomType.Parameter("status") String status) {
        this.status = status;
    }

    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileSystemBackupPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(FileSystemBackupPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
        }

        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public FileSystemBackupPolicy build() {
            return new FileSystemBackupPolicy(status);
        }
    }
}
