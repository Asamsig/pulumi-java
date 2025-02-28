// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kendra.outputs;

import com.pulumi.awsnative.kendra.enums.DataSourceSharePointConfigurationSharePointVersion;
import com.pulumi.awsnative.kendra.outputs.DataSourceS3Path;
import com.pulumi.awsnative.kendra.outputs.DataSourceToIndexFieldMapping;
import com.pulumi.awsnative.kendra.outputs.DataSourceVpcConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataSourceSharePointConfiguration {
    private final @Nullable Boolean crawlAttachments;
    private final @Nullable Boolean disableLocalGroups;
    private final @Nullable String documentTitleFieldName;
    private final @Nullable List<String> exclusionPatterns;
    private final @Nullable List<DataSourceToIndexFieldMapping> fieldMappings;
    private final @Nullable List<String> inclusionPatterns;
    private final String secretArn;
    private final DataSourceSharePointConfigurationSharePointVersion sharePointVersion;
    private final @Nullable DataSourceS3Path sslCertificateS3Path;
    private final List<String> urls;
    private final @Nullable Boolean useChangeLog;
    private final @Nullable DataSourceVpcConfiguration vpcConfiguration;

    @CustomType.Constructor
    private DataSourceSharePointConfiguration(
        @CustomType.Parameter("crawlAttachments") @Nullable Boolean crawlAttachments,
        @CustomType.Parameter("disableLocalGroups") @Nullable Boolean disableLocalGroups,
        @CustomType.Parameter("documentTitleFieldName") @Nullable String documentTitleFieldName,
        @CustomType.Parameter("exclusionPatterns") @Nullable List<String> exclusionPatterns,
        @CustomType.Parameter("fieldMappings") @Nullable List<DataSourceToIndexFieldMapping> fieldMappings,
        @CustomType.Parameter("inclusionPatterns") @Nullable List<String> inclusionPatterns,
        @CustomType.Parameter("secretArn") String secretArn,
        @CustomType.Parameter("sharePointVersion") DataSourceSharePointConfigurationSharePointVersion sharePointVersion,
        @CustomType.Parameter("sslCertificateS3Path") @Nullable DataSourceS3Path sslCertificateS3Path,
        @CustomType.Parameter("urls") List<String> urls,
        @CustomType.Parameter("useChangeLog") @Nullable Boolean useChangeLog,
        @CustomType.Parameter("vpcConfiguration") @Nullable DataSourceVpcConfiguration vpcConfiguration) {
        this.crawlAttachments = crawlAttachments;
        this.disableLocalGroups = disableLocalGroups;
        this.documentTitleFieldName = documentTitleFieldName;
        this.exclusionPatterns = exclusionPatterns;
        this.fieldMappings = fieldMappings;
        this.inclusionPatterns = inclusionPatterns;
        this.secretArn = secretArn;
        this.sharePointVersion = sharePointVersion;
        this.sslCertificateS3Path = sslCertificateS3Path;
        this.urls = urls;
        this.useChangeLog = useChangeLog;
        this.vpcConfiguration = vpcConfiguration;
    }

    public Optional<Boolean> crawlAttachments() {
        return Optional.ofNullable(this.crawlAttachments);
    }
    public Optional<Boolean> disableLocalGroups() {
        return Optional.ofNullable(this.disableLocalGroups);
    }
    public Optional<String> documentTitleFieldName() {
        return Optional.ofNullable(this.documentTitleFieldName);
    }
    public List<String> exclusionPatterns() {
        return this.exclusionPatterns == null ? List.of() : this.exclusionPatterns;
    }
    public List<DataSourceToIndexFieldMapping> fieldMappings() {
        return this.fieldMappings == null ? List.of() : this.fieldMappings;
    }
    public List<String> inclusionPatterns() {
        return this.inclusionPatterns == null ? List.of() : this.inclusionPatterns;
    }
    public String secretArn() {
        return this.secretArn;
    }
    public DataSourceSharePointConfigurationSharePointVersion sharePointVersion() {
        return this.sharePointVersion;
    }
    public Optional<DataSourceS3Path> sslCertificateS3Path() {
        return Optional.ofNullable(this.sslCertificateS3Path);
    }
    public List<String> urls() {
        return this.urls;
    }
    public Optional<Boolean> useChangeLog() {
        return Optional.ofNullable(this.useChangeLog);
    }
    public Optional<DataSourceVpcConfiguration> vpcConfiguration() {
        return Optional.ofNullable(this.vpcConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceSharePointConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean crawlAttachments;
        private @Nullable Boolean disableLocalGroups;
        private @Nullable String documentTitleFieldName;
        private @Nullable List<String> exclusionPatterns;
        private @Nullable List<DataSourceToIndexFieldMapping> fieldMappings;
        private @Nullable List<String> inclusionPatterns;
        private String secretArn;
        private DataSourceSharePointConfigurationSharePointVersion sharePointVersion;
        private @Nullable DataSourceS3Path sslCertificateS3Path;
        private List<String> urls;
        private @Nullable Boolean useChangeLog;
        private @Nullable DataSourceVpcConfiguration vpcConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceSharePointConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crawlAttachments = defaults.crawlAttachments;
    	      this.disableLocalGroups = defaults.disableLocalGroups;
    	      this.documentTitleFieldName = defaults.documentTitleFieldName;
    	      this.exclusionPatterns = defaults.exclusionPatterns;
    	      this.fieldMappings = defaults.fieldMappings;
    	      this.inclusionPatterns = defaults.inclusionPatterns;
    	      this.secretArn = defaults.secretArn;
    	      this.sharePointVersion = defaults.sharePointVersion;
    	      this.sslCertificateS3Path = defaults.sslCertificateS3Path;
    	      this.urls = defaults.urls;
    	      this.useChangeLog = defaults.useChangeLog;
    	      this.vpcConfiguration = defaults.vpcConfiguration;
        }

        public Builder crawlAttachments(@Nullable Boolean crawlAttachments) {
            this.crawlAttachments = crawlAttachments;
            return this;
        }
        public Builder disableLocalGroups(@Nullable Boolean disableLocalGroups) {
            this.disableLocalGroups = disableLocalGroups;
            return this;
        }
        public Builder documentTitleFieldName(@Nullable String documentTitleFieldName) {
            this.documentTitleFieldName = documentTitleFieldName;
            return this;
        }
        public Builder exclusionPatterns(@Nullable List<String> exclusionPatterns) {
            this.exclusionPatterns = exclusionPatterns;
            return this;
        }
        public Builder exclusionPatterns(String... exclusionPatterns) {
            return exclusionPatterns(List.of(exclusionPatterns));
        }
        public Builder fieldMappings(@Nullable List<DataSourceToIndexFieldMapping> fieldMappings) {
            this.fieldMappings = fieldMappings;
            return this;
        }
        public Builder fieldMappings(DataSourceToIndexFieldMapping... fieldMappings) {
            return fieldMappings(List.of(fieldMappings));
        }
        public Builder inclusionPatterns(@Nullable List<String> inclusionPatterns) {
            this.inclusionPatterns = inclusionPatterns;
            return this;
        }
        public Builder inclusionPatterns(String... inclusionPatterns) {
            return inclusionPatterns(List.of(inclusionPatterns));
        }
        public Builder secretArn(String secretArn) {
            this.secretArn = Objects.requireNonNull(secretArn);
            return this;
        }
        public Builder sharePointVersion(DataSourceSharePointConfigurationSharePointVersion sharePointVersion) {
            this.sharePointVersion = Objects.requireNonNull(sharePointVersion);
            return this;
        }
        public Builder sslCertificateS3Path(@Nullable DataSourceS3Path sslCertificateS3Path) {
            this.sslCertificateS3Path = sslCertificateS3Path;
            return this;
        }
        public Builder urls(List<String> urls) {
            this.urls = Objects.requireNonNull(urls);
            return this;
        }
        public Builder urls(String... urls) {
            return urls(List.of(urls));
        }
        public Builder useChangeLog(@Nullable Boolean useChangeLog) {
            this.useChangeLog = useChangeLog;
            return this;
        }
        public Builder vpcConfiguration(@Nullable DataSourceVpcConfiguration vpcConfiguration) {
            this.vpcConfiguration = vpcConfiguration;
            return this;
        }        public DataSourceSharePointConfiguration build() {
            return new DataSourceSharePointConfiguration(crawlAttachments, disableLocalGroups, documentTitleFieldName, exclusionPatterns, fieldMappings, inclusionPatterns, secretArn, sharePointVersion, sslCertificateS3Path, urls, useChangeLog, vpcConfiguration);
        }
    }
}
