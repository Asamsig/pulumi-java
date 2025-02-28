// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kendra.inputs;

import com.pulumi.awsnative.kendra.inputs.DataSourceConfluenceBlogToIndexFieldMappingArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceConfluenceBlogConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSourceConfluenceBlogConfigurationArgs Empty = new DataSourceConfluenceBlogConfigurationArgs();

    @Import(name="blogFieldMappings")
    private @Nullable Output<List<DataSourceConfluenceBlogToIndexFieldMappingArgs>> blogFieldMappings;

    public Optional<Output<List<DataSourceConfluenceBlogToIndexFieldMappingArgs>>> blogFieldMappings() {
        return Optional.ofNullable(this.blogFieldMappings);
    }

    private DataSourceConfluenceBlogConfigurationArgs() {}

    private DataSourceConfluenceBlogConfigurationArgs(DataSourceConfluenceBlogConfigurationArgs $) {
        this.blogFieldMappings = $.blogFieldMappings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceConfluenceBlogConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceConfluenceBlogConfigurationArgs $;

        public Builder() {
            $ = new DataSourceConfluenceBlogConfigurationArgs();
        }

        public Builder(DataSourceConfluenceBlogConfigurationArgs defaults) {
            $ = new DataSourceConfluenceBlogConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder blogFieldMappings(@Nullable Output<List<DataSourceConfluenceBlogToIndexFieldMappingArgs>> blogFieldMappings) {
            $.blogFieldMappings = blogFieldMappings;
            return this;
        }

        public Builder blogFieldMappings(List<DataSourceConfluenceBlogToIndexFieldMappingArgs> blogFieldMappings) {
            return blogFieldMappings(Output.of(blogFieldMappings));
        }

        public Builder blogFieldMappings(DataSourceConfluenceBlogToIndexFieldMappingArgs... blogFieldMappings) {
            return blogFieldMappings(List.of(blogFieldMappings));
        }

        public DataSourceConfluenceBlogConfigurationArgs build() {
            return $;
        }
    }

}
