// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudbuild.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TriggerGithubPullRequestArgs extends com.pulumi.resources.ResourceArgs {

    public static final TriggerGithubPullRequestArgs Empty = new TriggerGithubPullRequestArgs();

    /**
     * Regex of branches to match.  Specify only one of branch or tag.
     * 
     */
    @Import(name="branch", required=true)
    private Output<String> branch;

    /**
     * @return Regex of branches to match.  Specify only one of branch or tag.
     * 
     */
    public Output<String> branch() {
        return this.branch;
    }

    /**
     * Whether to block builds on a &#34;/gcbrun&#34; comment from a repository owner or collaborator.
     * Possible values are `COMMENTS_DISABLED`, `COMMENTS_ENABLED`, and `COMMENTS_ENABLED_FOR_EXTERNAL_CONTRIBUTORS_ONLY`.
     * 
     */
    @Import(name="commentControl")
    private @Nullable Output<String> commentControl;

    /**
     * @return Whether to block builds on a &#34;/gcbrun&#34; comment from a repository owner or collaborator.
     * Possible values are `COMMENTS_DISABLED`, `COMMENTS_ENABLED`, and `COMMENTS_ENABLED_FOR_EXTERNAL_CONTRIBUTORS_ONLY`.
     * 
     */
    public Optional<Output<String>> commentControl() {
        return Optional.ofNullable(this.commentControl);
    }

    /**
     * Only trigger a build if the revision regex does NOT match the revision regex.
     * 
     */
    @Import(name="invertRegex")
    private @Nullable Output<Boolean> invertRegex;

    /**
     * @return Only trigger a build if the revision regex does NOT match the revision regex.
     * 
     */
    public Optional<Output<Boolean>> invertRegex() {
        return Optional.ofNullable(this.invertRegex);
    }

    private TriggerGithubPullRequestArgs() {}

    private TriggerGithubPullRequestArgs(TriggerGithubPullRequestArgs $) {
        this.branch = $.branch;
        this.commentControl = $.commentControl;
        this.invertRegex = $.invertRegex;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TriggerGithubPullRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TriggerGithubPullRequestArgs $;

        public Builder() {
            $ = new TriggerGithubPullRequestArgs();
        }

        public Builder(TriggerGithubPullRequestArgs defaults) {
            $ = new TriggerGithubPullRequestArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param branch Regex of branches to match.  Specify only one of branch or tag.
         * 
         * @return builder
         * 
         */
        public Builder branch(Output<String> branch) {
            $.branch = branch;
            return this;
        }

        /**
         * @param branch Regex of branches to match.  Specify only one of branch or tag.
         * 
         * @return builder
         * 
         */
        public Builder branch(String branch) {
            return branch(Output.of(branch));
        }

        /**
         * @param commentControl Whether to block builds on a &#34;/gcbrun&#34; comment from a repository owner or collaborator.
         * Possible values are `COMMENTS_DISABLED`, `COMMENTS_ENABLED`, and `COMMENTS_ENABLED_FOR_EXTERNAL_CONTRIBUTORS_ONLY`.
         * 
         * @return builder
         * 
         */
        public Builder commentControl(@Nullable Output<String> commentControl) {
            $.commentControl = commentControl;
            return this;
        }

        /**
         * @param commentControl Whether to block builds on a &#34;/gcbrun&#34; comment from a repository owner or collaborator.
         * Possible values are `COMMENTS_DISABLED`, `COMMENTS_ENABLED`, and `COMMENTS_ENABLED_FOR_EXTERNAL_CONTRIBUTORS_ONLY`.
         * 
         * @return builder
         * 
         */
        public Builder commentControl(String commentControl) {
            return commentControl(Output.of(commentControl));
        }

        /**
         * @param invertRegex Only trigger a build if the revision regex does NOT match the revision regex.
         * 
         * @return builder
         * 
         */
        public Builder invertRegex(@Nullable Output<Boolean> invertRegex) {
            $.invertRegex = invertRegex;
            return this;
        }

        /**
         * @param invertRegex Only trigger a build if the revision regex does NOT match the revision regex.
         * 
         * @return builder
         * 
         */
        public Builder invertRegex(Boolean invertRegex) {
            return invertRegex(Output.of(invertRegex));
        }

        public TriggerGithubPullRequestArgs build() {
            $.branch = Objects.requireNonNull($.branch, "expected parameter 'branch' to be non-null");
            return $;
        }
    }

}
