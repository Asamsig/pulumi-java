// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPolicyTagResult {
    /**
     * @return Resource names of child policy tags of this policy tag.
     * 
     */
    private final List<String> childPolicyTags;
    /**
     * @return Description of this policy tag. If not set, defaults to empty. The description must contain only Unicode characters, tabs, newlines, carriage returns and page breaks, and be at most 2000 bytes long when encoded in UTF-8.
     * 
     */
    private final String description;
    /**
     * @return User-defined name of this policy tag. The name can&#39;t start or end with spaces and must be unique within the parent taxonomy, contain only Unicode letters, numbers, underscores, dashes and spaces, and be at most 200 bytes long when encoded in UTF-8.
     * 
     */
    private final String displayName;
    /**
     * @return Resource name of this policy tag in the URL format. The policy tag manager generates unique taxonomy IDs and policy tag IDs.
     * 
     */
    private final String name;
    /**
     * @return Resource name of this policy tag&#39;s parent policy tag. If empty, this is a top level tag. If not set, defaults to an empty string. For example, for the &#34;LatLong&#34; policy tag in the example above, this field contains the resource name of the &#34;Geolocation&#34; policy tag, and, for &#34;Geolocation&#34;, this field is empty.
     * 
     */
    private final String parentPolicyTag;

    @CustomType.Constructor
    private GetPolicyTagResult(
        @CustomType.Parameter("childPolicyTags") List<String> childPolicyTags,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parentPolicyTag") String parentPolicyTag) {
        this.childPolicyTags = childPolicyTags;
        this.description = description;
        this.displayName = displayName;
        this.name = name;
        this.parentPolicyTag = parentPolicyTag;
    }

    /**
     * @return Resource names of child policy tags of this policy tag.
     * 
     */
    public List<String> childPolicyTags() {
        return this.childPolicyTags;
    }
    /**
     * @return Description of this policy tag. If not set, defaults to empty. The description must contain only Unicode characters, tabs, newlines, carriage returns and page breaks, and be at most 2000 bytes long when encoded in UTF-8.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return User-defined name of this policy tag. The name can&#39;t start or end with spaces and must be unique within the parent taxonomy, contain only Unicode letters, numbers, underscores, dashes and spaces, and be at most 200 bytes long when encoded in UTF-8.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Resource name of this policy tag in the URL format. The policy tag manager generates unique taxonomy IDs and policy tag IDs.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Resource name of this policy tag&#39;s parent policy tag. If empty, this is a top level tag. If not set, defaults to an empty string. For example, for the &#34;LatLong&#34; policy tag in the example above, this field contains the resource name of the &#34;Geolocation&#34; policy tag, and, for &#34;Geolocation&#34;, this field is empty.
     * 
     */
    public String parentPolicyTag() {
        return this.parentPolicyTag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicyTagResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> childPolicyTags;
        private String description;
        private String displayName;
        private String name;
        private String parentPolicyTag;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPolicyTagResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.childPolicyTags = defaults.childPolicyTags;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
    	      this.parentPolicyTag = defaults.parentPolicyTag;
        }

        public Builder childPolicyTags(List<String> childPolicyTags) {
            this.childPolicyTags = Objects.requireNonNull(childPolicyTags);
            return this;
        }
        public Builder childPolicyTags(String... childPolicyTags) {
            return childPolicyTags(List.of(childPolicyTags));
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parentPolicyTag(String parentPolicyTag) {
            this.parentPolicyTag = Objects.requireNonNull(parentPolicyTag);
            return this;
        }        public GetPolicyTagResult build() {
            return new GetPolicyTagResult(childPolicyTags, description, displayName, name, parentPolicyTag);
        }
    }
}
