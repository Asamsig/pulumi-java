// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetKeyResult {
    /**
     * @return The EC Curve name of this Key Vault Key.
     * 
     */
    private final String curve;
    /**
     * @return The RSA public exponent of this Key Vault Key.
     * 
     */
    private final String e;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return A list of JSON web key operations assigned to this Key Vault Key
     * 
     */
    private final List<String> keyOpts;
    /**
     * @return Specifies the Size of this Key Vault Key.
     * 
     */
    private final Integer keySize;
    /**
     * @return Specifies the Key Type of this Key Vault Key
     * 
     */
    private final String keyType;
    private final String keyVaultId;
    /**
     * @return The RSA modulus of this Key Vault Key.
     * 
     */
    private final String n;
    private final String name;
    /**
     * @return The OpenSSH encoded public key of this Key Vault Key.
     * 
     */
    private final String publicKeyOpenssh;
    /**
     * @return The PEM encoded public key of this Key Vault Key.
     * 
     */
    private final String publicKeyPem;
    /**
     * @return A mapping of tags assigned to this Key Vault Key.
     * 
     */
    private final Map<String,String> tags;
    /**
     * @return The current version of the Key Vault Key.
     * 
     */
    private final String version;
    /**
     * @return The Base ID of the Key Vault Key.
     * 
     */
    private final String versionlessId;
    /**
     * @return The EC X component of this Key Vault Key.
     * 
     */
    private final String x;
    /**
     * @return The EC Y component of this Key Vault Key.
     * 
     */
    private final String y;

    @CustomType.Constructor
    private GetKeyResult(
        @CustomType.Parameter("curve") String curve,
        @CustomType.Parameter("e") String e,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("keyOpts") List<String> keyOpts,
        @CustomType.Parameter("keySize") Integer keySize,
        @CustomType.Parameter("keyType") String keyType,
        @CustomType.Parameter("keyVaultId") String keyVaultId,
        @CustomType.Parameter("n") String n,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("publicKeyOpenssh") String publicKeyOpenssh,
        @CustomType.Parameter("publicKeyPem") String publicKeyPem,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("version") String version,
        @CustomType.Parameter("versionlessId") String versionlessId,
        @CustomType.Parameter("x") String x,
        @CustomType.Parameter("y") String y) {
        this.curve = curve;
        this.e = e;
        this.id = id;
        this.keyOpts = keyOpts;
        this.keySize = keySize;
        this.keyType = keyType;
        this.keyVaultId = keyVaultId;
        this.n = n;
        this.name = name;
        this.publicKeyOpenssh = publicKeyOpenssh;
        this.publicKeyPem = publicKeyPem;
        this.tags = tags;
        this.version = version;
        this.versionlessId = versionlessId;
        this.x = x;
        this.y = y;
    }

    /**
     * @return The EC Curve name of this Key Vault Key.
     * 
     */
    public String curve() {
        return this.curve;
    }
    /**
     * @return The RSA public exponent of this Key Vault Key.
     * 
     */
    public String e() {
        return this.e;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of JSON web key operations assigned to this Key Vault Key
     * 
     */
    public List<String> keyOpts() {
        return this.keyOpts;
    }
    /**
     * @return Specifies the Size of this Key Vault Key.
     * 
     */
    public Integer keySize() {
        return this.keySize;
    }
    /**
     * @return Specifies the Key Type of this Key Vault Key
     * 
     */
    public String keyType() {
        return this.keyType;
    }
    public String keyVaultId() {
        return this.keyVaultId;
    }
    /**
     * @return The RSA modulus of this Key Vault Key.
     * 
     */
    public String n() {
        return this.n;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return The OpenSSH encoded public key of this Key Vault Key.
     * 
     */
    public String publicKeyOpenssh() {
        return this.publicKeyOpenssh;
    }
    /**
     * @return The PEM encoded public key of this Key Vault Key.
     * 
     */
    public String publicKeyPem() {
        return this.publicKeyPem;
    }
    /**
     * @return A mapping of tags assigned to this Key Vault Key.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return The current version of the Key Vault Key.
     * 
     */
    public String version() {
        return this.version;
    }
    /**
     * @return The Base ID of the Key Vault Key.
     * 
     */
    public String versionlessId() {
        return this.versionlessId;
    }
    /**
     * @return The EC X component of this Key Vault Key.
     * 
     */
    public String x() {
        return this.x;
    }
    /**
     * @return The EC Y component of this Key Vault Key.
     * 
     */
    public String y() {
        return this.y;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKeyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String curve;
        private String e;
        private String id;
        private List<String> keyOpts;
        private Integer keySize;
        private String keyType;
        private String keyVaultId;
        private String n;
        private String name;
        private String publicKeyOpenssh;
        private String publicKeyPem;
        private Map<String,String> tags;
        private String version;
        private String versionlessId;
        private String x;
        private String y;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKeyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.curve = defaults.curve;
    	      this.e = defaults.e;
    	      this.id = defaults.id;
    	      this.keyOpts = defaults.keyOpts;
    	      this.keySize = defaults.keySize;
    	      this.keyType = defaults.keyType;
    	      this.keyVaultId = defaults.keyVaultId;
    	      this.n = defaults.n;
    	      this.name = defaults.name;
    	      this.publicKeyOpenssh = defaults.publicKeyOpenssh;
    	      this.publicKeyPem = defaults.publicKeyPem;
    	      this.tags = defaults.tags;
    	      this.version = defaults.version;
    	      this.versionlessId = defaults.versionlessId;
    	      this.x = defaults.x;
    	      this.y = defaults.y;
        }

        public Builder curve(String curve) {
            this.curve = Objects.requireNonNull(curve);
            return this;
        }
        public Builder e(String e) {
            this.e = Objects.requireNonNull(e);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder keyOpts(List<String> keyOpts) {
            this.keyOpts = Objects.requireNonNull(keyOpts);
            return this;
        }
        public Builder keyOpts(String... keyOpts) {
            return keyOpts(List.of(keyOpts));
        }
        public Builder keySize(Integer keySize) {
            this.keySize = Objects.requireNonNull(keySize);
            return this;
        }
        public Builder keyType(String keyType) {
            this.keyType = Objects.requireNonNull(keyType);
            return this;
        }
        public Builder keyVaultId(String keyVaultId) {
            this.keyVaultId = Objects.requireNonNull(keyVaultId);
            return this;
        }
        public Builder n(String n) {
            this.n = Objects.requireNonNull(n);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder publicKeyOpenssh(String publicKeyOpenssh) {
            this.publicKeyOpenssh = Objects.requireNonNull(publicKeyOpenssh);
            return this;
        }
        public Builder publicKeyPem(String publicKeyPem) {
            this.publicKeyPem = Objects.requireNonNull(publicKeyPem);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public Builder versionlessId(String versionlessId) {
            this.versionlessId = Objects.requireNonNull(versionlessId);
            return this;
        }
        public Builder x(String x) {
            this.x = Objects.requireNonNull(x);
            return this;
        }
        public Builder y(String y) {
            this.y = Objects.requireNonNull(y);
            return this;
        }        public GetKeyResult build() {
            return new GetKeyResult(curve, e, id, keyOpts, keySize, keyType, keyVaultId, n, name, publicKeyOpenssh, publicKeyPem, tags, version, versionlessId, x, y);
        }
    }
}
