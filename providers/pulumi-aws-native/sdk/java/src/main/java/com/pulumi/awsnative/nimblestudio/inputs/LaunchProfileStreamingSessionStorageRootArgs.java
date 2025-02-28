// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.nimblestudio.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * &lt;p&gt;The upload storage root location (folder) on streaming workstations where files are
 *             uploaded.&lt;/p&gt;
 * 
 */
public final class LaunchProfileStreamingSessionStorageRootArgs extends com.pulumi.resources.ResourceArgs {

    public static final LaunchProfileStreamingSessionStorageRootArgs Empty = new LaunchProfileStreamingSessionStorageRootArgs();

    /**
     * &lt;p&gt;The folder path in Linux workstations where files are uploaded.&lt;/p&gt;
     * 
     */
    @Import(name="linux")
    private @Nullable Output<String> linux;

    /**
     * @return &lt;p&gt;The folder path in Linux workstations where files are uploaded.&lt;/p&gt;
     * 
     */
    public Optional<Output<String>> linux() {
        return Optional.ofNullable(this.linux);
    }

    /**
     * &lt;p&gt;The folder path in Windows workstations where files are uploaded.&lt;/p&gt;
     * 
     */
    @Import(name="windows")
    private @Nullable Output<String> windows;

    /**
     * @return &lt;p&gt;The folder path in Windows workstations where files are uploaded.&lt;/p&gt;
     * 
     */
    public Optional<Output<String>> windows() {
        return Optional.ofNullable(this.windows);
    }

    private LaunchProfileStreamingSessionStorageRootArgs() {}

    private LaunchProfileStreamingSessionStorageRootArgs(LaunchProfileStreamingSessionStorageRootArgs $) {
        this.linux = $.linux;
        this.windows = $.windows;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LaunchProfileStreamingSessionStorageRootArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LaunchProfileStreamingSessionStorageRootArgs $;

        public Builder() {
            $ = new LaunchProfileStreamingSessionStorageRootArgs();
        }

        public Builder(LaunchProfileStreamingSessionStorageRootArgs defaults) {
            $ = new LaunchProfileStreamingSessionStorageRootArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param linux &lt;p&gt;The folder path in Linux workstations where files are uploaded.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder linux(@Nullable Output<String> linux) {
            $.linux = linux;
            return this;
        }

        /**
         * @param linux &lt;p&gt;The folder path in Linux workstations where files are uploaded.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder linux(String linux) {
            return linux(Output.of(linux));
        }

        /**
         * @param windows &lt;p&gt;The folder path in Windows workstations where files are uploaded.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder windows(@Nullable Output<String> windows) {
            $.windows = windows;
            return this;
        }

        /**
         * @param windows &lt;p&gt;The folder path in Windows workstations where files are uploaded.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder windows(String windows) {
            return windows(Output.of(windows));
        }

        public LaunchProfileStreamingSessionStorageRootArgs build() {
            return $;
        }
    }

}
