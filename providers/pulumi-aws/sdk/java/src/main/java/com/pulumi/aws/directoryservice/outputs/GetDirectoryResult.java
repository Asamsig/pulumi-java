// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.directoryservice.outputs;

import com.pulumi.aws.directoryservice.outputs.GetDirectoryConnectSetting;
import com.pulumi.aws.directoryservice.outputs.GetDirectoryVpcSetting;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetDirectoryResult {
    /**
     * @return The access URL for the directory/connector, such as http://alias.awsapps.com.
     * 
     */
    private final String accessUrl;
    /**
     * @return The alias for the directory/connector, such as `d-991708b282.awsapps.com`.
     * 
     */
    private final String alias;
    private final List<GetDirectoryConnectSetting> connectSettings;
    /**
     * @return A textual description for the directory/connector.
     * 
     */
    private final String description;
    private final String directoryId;
    /**
     * @return A list of IP addresses of the DNS servers for the directory/connector.
     * 
     */
    private final List<String> dnsIpAddresses;
    /**
     * @return (for `MicrosoftAD`) The Microsoft AD edition (`Standard` or `Enterprise`).
     * 
     */
    private final String edition;
    /**
     * @return The directory/connector single-sign on status.
     * 
     */
    private final Boolean enableSso;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The fully qualified name for the directory/connector.
     * 
     */
    private final String name;
    /**
     * @return The ID of the security group created by the directory/connector.
     * 
     */
    private final String securityGroupId;
    /**
     * @return The short name of the directory/connector, such as `CORP`.
     * 
     */
    private final String shortName;
    /**
     * @return (for `SimpleAD` and `ADConnector`) The size of the directory/connector (`Small` or `Large`).
     * 
     */
    private final String size;
    /**
     * @return A map of tags assigned to the directory/connector.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return The directory type (`SimpleAD`, `ADConnector` or `MicrosoftAD`).
     * 
     */
    private final String type;
    private final List<GetDirectoryVpcSetting> vpcSettings;

    @CustomType.Constructor
    private GetDirectoryResult(
        @CustomType.Parameter("accessUrl") String accessUrl,
        @CustomType.Parameter("alias") String alias,
        @CustomType.Parameter("connectSettings") List<GetDirectoryConnectSetting> connectSettings,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("directoryId") String directoryId,
        @CustomType.Parameter("dnsIpAddresses") List<String> dnsIpAddresses,
        @CustomType.Parameter("edition") String edition,
        @CustomType.Parameter("enableSso") Boolean enableSso,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("securityGroupId") String securityGroupId,
        @CustomType.Parameter("shortName") String shortName,
        @CustomType.Parameter("size") String size,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("vpcSettings") List<GetDirectoryVpcSetting> vpcSettings) {
        this.accessUrl = accessUrl;
        this.alias = alias;
        this.connectSettings = connectSettings;
        this.description = description;
        this.directoryId = directoryId;
        this.dnsIpAddresses = dnsIpAddresses;
        this.edition = edition;
        this.enableSso = enableSso;
        this.id = id;
        this.name = name;
        this.securityGroupId = securityGroupId;
        this.shortName = shortName;
        this.size = size;
        this.tags = tags;
        this.type = type;
        this.vpcSettings = vpcSettings;
    }

    /**
     * @return The access URL for the directory/connector, such as http://alias.awsapps.com.
     * 
     */
    public String accessUrl() {
        return this.accessUrl;
    }
    /**
     * @return The alias for the directory/connector, such as `d-991708b282.awsapps.com`.
     * 
     */
    public String alias() {
        return this.alias;
    }
    public List<GetDirectoryConnectSetting> connectSettings() {
        return this.connectSettings;
    }
    /**
     * @return A textual description for the directory/connector.
     * 
     */
    public String description() {
        return this.description;
    }
    public String directoryId() {
        return this.directoryId;
    }
    /**
     * @return A list of IP addresses of the DNS servers for the directory/connector.
     * 
     */
    public List<String> dnsIpAddresses() {
        return this.dnsIpAddresses;
    }
    /**
     * @return (for `MicrosoftAD`) The Microsoft AD edition (`Standard` or `Enterprise`).
     * 
     */
    public String edition() {
        return this.edition;
    }
    /**
     * @return The directory/connector single-sign on status.
     * 
     */
    public Boolean enableSso() {
        return this.enableSso;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The fully qualified name for the directory/connector.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The ID of the security group created by the directory/connector.
     * 
     */
    public String securityGroupId() {
        return this.securityGroupId;
    }
    /**
     * @return The short name of the directory/connector, such as `CORP`.
     * 
     */
    public String shortName() {
        return this.shortName;
    }
    /**
     * @return (for `SimpleAD` and `ADConnector`) The size of the directory/connector (`Small` or `Large`).
     * 
     */
    public String size() {
        return this.size;
    }
    /**
     * @return A map of tags assigned to the directory/connector.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return The directory type (`SimpleAD`, `ADConnector` or `MicrosoftAD`).
     * 
     */
    public String type() {
        return this.type;
    }
    public List<GetDirectoryVpcSetting> vpcSettings() {
        return this.vpcSettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDirectoryResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessUrl;
        private String alias;
        private List<GetDirectoryConnectSetting> connectSettings;
        private String description;
        private String directoryId;
        private List<String> dnsIpAddresses;
        private String edition;
        private Boolean enableSso;
        private String id;
        private String name;
        private String securityGroupId;
        private String shortName;
        private String size;
        private @Nullable Map<String,String> tags;
        private String type;
        private List<GetDirectoryVpcSetting> vpcSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDirectoryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessUrl = defaults.accessUrl;
    	      this.alias = defaults.alias;
    	      this.connectSettings = defaults.connectSettings;
    	      this.description = defaults.description;
    	      this.directoryId = defaults.directoryId;
    	      this.dnsIpAddresses = defaults.dnsIpAddresses;
    	      this.edition = defaults.edition;
    	      this.enableSso = defaults.enableSso;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.securityGroupId = defaults.securityGroupId;
    	      this.shortName = defaults.shortName;
    	      this.size = defaults.size;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.vpcSettings = defaults.vpcSettings;
        }

        public Builder accessUrl(String accessUrl) {
            this.accessUrl = Objects.requireNonNull(accessUrl);
            return this;
        }
        public Builder alias(String alias) {
            this.alias = Objects.requireNonNull(alias);
            return this;
        }
        public Builder connectSettings(List<GetDirectoryConnectSetting> connectSettings) {
            this.connectSettings = Objects.requireNonNull(connectSettings);
            return this;
        }
        public Builder connectSettings(GetDirectoryConnectSetting... connectSettings) {
            return connectSettings(List.of(connectSettings));
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder directoryId(String directoryId) {
            this.directoryId = Objects.requireNonNull(directoryId);
            return this;
        }
        public Builder dnsIpAddresses(List<String> dnsIpAddresses) {
            this.dnsIpAddresses = Objects.requireNonNull(dnsIpAddresses);
            return this;
        }
        public Builder dnsIpAddresses(String... dnsIpAddresses) {
            return dnsIpAddresses(List.of(dnsIpAddresses));
        }
        public Builder edition(String edition) {
            this.edition = Objects.requireNonNull(edition);
            return this;
        }
        public Builder enableSso(Boolean enableSso) {
            this.enableSso = Objects.requireNonNull(enableSso);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = Objects.requireNonNull(securityGroupId);
            return this;
        }
        public Builder shortName(String shortName) {
            this.shortName = Objects.requireNonNull(shortName);
            return this;
        }
        public Builder size(String size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder vpcSettings(List<GetDirectoryVpcSetting> vpcSettings) {
            this.vpcSettings = Objects.requireNonNull(vpcSettings);
            return this;
        }
        public Builder vpcSettings(GetDirectoryVpcSetting... vpcSettings) {
            return vpcSettings(List.of(vpcSettings));
        }        public GetDirectoryResult build() {
            return new GetDirectoryResult(accessUrl, alias, connectSettings, description, directoryId, dnsIpAddresses, edition, enableSso, id, name, securityGroupId, shortName, size, tags, type, vpcSettings);
        }
    }
}
