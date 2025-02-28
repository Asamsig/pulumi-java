// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigAdditionalExtensionArgs;
import com.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigCaOptionsArgs;
import com.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigKeyUsageArgs;
import com.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigPolicyIdArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateConfigX509ConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateConfigX509ConfigArgs Empty = new CertificateConfigX509ConfigArgs();

    /**
     * Specifies an X.509 extension, which may be used in different parts of X.509 objects like certificates, CSRs, and CRLs.
     * Structure is documented below.
     * 
     */
    @Import(name="additionalExtensions")
    private @Nullable Output<List<CertificateConfigX509ConfigAdditionalExtensionArgs>> additionalExtensions;

    /**
     * @return Specifies an X.509 extension, which may be used in different parts of X.509 objects like certificates, CSRs, and CRLs.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<CertificateConfigX509ConfigAdditionalExtensionArgs>>> additionalExtensions() {
        return Optional.ofNullable(this.additionalExtensions);
    }

    /**
     * Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the
     * &#34;Authority Information Access&#34; extension in the certificate.
     * 
     */
    @Import(name="aiaOcspServers")
    private @Nullable Output<List<String>> aiaOcspServers;

    /**
     * @return Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the
     * &#34;Authority Information Access&#34; extension in the certificate.
     * 
     */
    public Optional<Output<List<String>>> aiaOcspServers() {
        return Optional.ofNullable(this.aiaOcspServers);
    }

    /**
     * Describes values that are relevant in a CA certificate.
     * Structure is documented below.
     * 
     */
    @Import(name="caOptions")
    private @Nullable Output<CertificateConfigX509ConfigCaOptionsArgs> caOptions;

    /**
     * @return Describes values that are relevant in a CA certificate.
     * Structure is documented below.
     * 
     */
    public Optional<Output<CertificateConfigX509ConfigCaOptionsArgs>> caOptions() {
        return Optional.ofNullable(this.caOptions);
    }

    /**
     * Indicates the intended use for keys that correspond to a certificate.
     * Structure is documented below.
     * 
     */
    @Import(name="keyUsage", required=true)
    private Output<CertificateConfigX509ConfigKeyUsageArgs> keyUsage;

    /**
     * @return Indicates the intended use for keys that correspond to a certificate.
     * Structure is documented below.
     * 
     */
    public Output<CertificateConfigX509ConfigKeyUsageArgs> keyUsage() {
        return this.keyUsage;
    }

    /**
     * Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
     * Structure is documented below.
     * 
     */
    @Import(name="policyIds")
    private @Nullable Output<List<CertificateConfigX509ConfigPolicyIdArgs>> policyIds;

    /**
     * @return Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<CertificateConfigX509ConfigPolicyIdArgs>>> policyIds() {
        return Optional.ofNullable(this.policyIds);
    }

    private CertificateConfigX509ConfigArgs() {}

    private CertificateConfigX509ConfigArgs(CertificateConfigX509ConfigArgs $) {
        this.additionalExtensions = $.additionalExtensions;
        this.aiaOcspServers = $.aiaOcspServers;
        this.caOptions = $.caOptions;
        this.keyUsage = $.keyUsage;
        this.policyIds = $.policyIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateConfigX509ConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateConfigX509ConfigArgs $;

        public Builder() {
            $ = new CertificateConfigX509ConfigArgs();
        }

        public Builder(CertificateConfigX509ConfigArgs defaults) {
            $ = new CertificateConfigX509ConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalExtensions Specifies an X.509 extension, which may be used in different parts of X.509 objects like certificates, CSRs, and CRLs.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder additionalExtensions(@Nullable Output<List<CertificateConfigX509ConfigAdditionalExtensionArgs>> additionalExtensions) {
            $.additionalExtensions = additionalExtensions;
            return this;
        }

        /**
         * @param additionalExtensions Specifies an X.509 extension, which may be used in different parts of X.509 objects like certificates, CSRs, and CRLs.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder additionalExtensions(List<CertificateConfigX509ConfigAdditionalExtensionArgs> additionalExtensions) {
            return additionalExtensions(Output.of(additionalExtensions));
        }

        /**
         * @param additionalExtensions Specifies an X.509 extension, which may be used in different parts of X.509 objects like certificates, CSRs, and CRLs.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder additionalExtensions(CertificateConfigX509ConfigAdditionalExtensionArgs... additionalExtensions) {
            return additionalExtensions(List.of(additionalExtensions));
        }

        /**
         * @param aiaOcspServers Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the
         * &#34;Authority Information Access&#34; extension in the certificate.
         * 
         * @return builder
         * 
         */
        public Builder aiaOcspServers(@Nullable Output<List<String>> aiaOcspServers) {
            $.aiaOcspServers = aiaOcspServers;
            return this;
        }

        /**
         * @param aiaOcspServers Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the
         * &#34;Authority Information Access&#34; extension in the certificate.
         * 
         * @return builder
         * 
         */
        public Builder aiaOcspServers(List<String> aiaOcspServers) {
            return aiaOcspServers(Output.of(aiaOcspServers));
        }

        /**
         * @param aiaOcspServers Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the
         * &#34;Authority Information Access&#34; extension in the certificate.
         * 
         * @return builder
         * 
         */
        public Builder aiaOcspServers(String... aiaOcspServers) {
            return aiaOcspServers(List.of(aiaOcspServers));
        }

        /**
         * @param caOptions Describes values that are relevant in a CA certificate.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder caOptions(@Nullable Output<CertificateConfigX509ConfigCaOptionsArgs> caOptions) {
            $.caOptions = caOptions;
            return this;
        }

        /**
         * @param caOptions Describes values that are relevant in a CA certificate.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder caOptions(CertificateConfigX509ConfigCaOptionsArgs caOptions) {
            return caOptions(Output.of(caOptions));
        }

        /**
         * @param keyUsage Indicates the intended use for keys that correspond to a certificate.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder keyUsage(Output<CertificateConfigX509ConfigKeyUsageArgs> keyUsage) {
            $.keyUsage = keyUsage;
            return this;
        }

        /**
         * @param keyUsage Indicates the intended use for keys that correspond to a certificate.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder keyUsage(CertificateConfigX509ConfigKeyUsageArgs keyUsage) {
            return keyUsage(Output.of(keyUsage));
        }

        /**
         * @param policyIds Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder policyIds(@Nullable Output<List<CertificateConfigX509ConfigPolicyIdArgs>> policyIds) {
            $.policyIds = policyIds;
            return this;
        }

        /**
         * @param policyIds Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder policyIds(List<CertificateConfigX509ConfigPolicyIdArgs> policyIds) {
            return policyIds(Output.of(policyIds));
        }

        /**
         * @param policyIds Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder policyIds(CertificateConfigX509ConfigPolicyIdArgs... policyIds) {
            return policyIds(List.of(policyIds));
        }

        public CertificateConfigX509ConfigArgs build() {
            $.keyUsage = Objects.requireNonNull($.keyUsage, "expected parameter 'keyUsage' to be non-null");
            return $;
        }
    }

}
