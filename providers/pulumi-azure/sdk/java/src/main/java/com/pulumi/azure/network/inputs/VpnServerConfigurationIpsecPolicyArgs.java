// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class VpnServerConfigurationIpsecPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final VpnServerConfigurationIpsecPolicyArgs Empty = new VpnServerConfigurationIpsecPolicyArgs();

    /**
     * The DH Group, used in IKE Phase 1. Possible values include `DHGroup1`, `DHGroup2`, `DHGroup14`, `DHGroup24`, `DHGroup2048`, `ECP256`, `ECP384` and `None`.
     * 
     */
    @Import(name="dhGroup", required=true)
    private Output<String> dhGroup;

    /**
     * @return The DH Group, used in IKE Phase 1. Possible values include `DHGroup1`, `DHGroup2`, `DHGroup14`, `DHGroup24`, `DHGroup2048`, `ECP256`, `ECP384` and `None`.
     * 
     */
    public Output<String> dhGroup() {
        return this.dhGroup;
    }

    /**
     * The IKE encryption algorithm, used for IKE Phase 2. Possible values include `AES128`, `AES192`, `AES256`, `DES`, `DES3`, `GCMAES128` and `GCMAES256`.
     * 
     */
    @Import(name="ikeEncryption", required=true)
    private Output<String> ikeEncryption;

    /**
     * @return The IKE encryption algorithm, used for IKE Phase 2. Possible values include `AES128`, `AES192`, `AES256`, `DES`, `DES3`, `GCMAES128` and `GCMAES256`.
     * 
     */
    public Output<String> ikeEncryption() {
        return this.ikeEncryption;
    }

    /**
     * The IKE encryption integrity algorithm, used for IKE Phase 2. Possible values include `GCMAES128`, `GCMAES256`, `MD5`, `SHA1`, `SHA256` and `SHA384`.
     * 
     */
    @Import(name="ikeIntegrity", required=true)
    private Output<String> ikeIntegrity;

    /**
     * @return The IKE encryption integrity algorithm, used for IKE Phase 2. Possible values include `GCMAES128`, `GCMAES256`, `MD5`, `SHA1`, `SHA256` and `SHA384`.
     * 
     */
    public Output<String> ikeIntegrity() {
        return this.ikeIntegrity;
    }

    /**
     * The IPSec encryption algorithm, used for IKE phase 1. Possible values include `AES128`, `AES192`, `AES256`, `DES`, `DES3`, `GCMAES128`, `GCMAES192`, `GCMAES256` and `None`.
     * 
     */
    @Import(name="ipsecEncryption", required=true)
    private Output<String> ipsecEncryption;

    /**
     * @return The IPSec encryption algorithm, used for IKE phase 1. Possible values include `AES128`, `AES192`, `AES256`, `DES`, `DES3`, `GCMAES128`, `GCMAES192`, `GCMAES256` and `None`.
     * 
     */
    public Output<String> ipsecEncryption() {
        return this.ipsecEncryption;
    }

    /**
     * The IPSec integrity algorithm, used for IKE phase 1. Possible values include `GCMAES128`, `GCMAES192`, `GCMAES256`, `MD5`, `SHA1` and `SHA256`.
     * 
     */
    @Import(name="ipsecIntegrity", required=true)
    private Output<String> ipsecIntegrity;

    /**
     * @return The IPSec integrity algorithm, used for IKE phase 1. Possible values include `GCMAES128`, `GCMAES192`, `GCMAES256`, `MD5`, `SHA1` and `SHA256`.
     * 
     */
    public Output<String> ipsecIntegrity() {
        return this.ipsecIntegrity;
    }

    /**
     * The Pfs Group, used in IKE Phase 2. Possible values include `ECP256`, `ECP384`, `PFS1`, `PFS2`, `PFS14`, `PFS24`, `PFS2048`, `PFSMM` and `None`.
     * 
     */
    @Import(name="pfsGroup", required=true)
    private Output<String> pfsGroup;

    /**
     * @return The Pfs Group, used in IKE Phase 2. Possible values include `ECP256`, `ECP384`, `PFS1`, `PFS2`, `PFS14`, `PFS24`, `PFS2048`, `PFSMM` and `None`.
     * 
     */
    public Output<String> pfsGroup() {
        return this.pfsGroup;
    }

    /**
     * The IPSec Security Association payload size in KB for a Site-to-Site VPN tunnel.
     * 
     */
    @Import(name="saDataSizeKilobytes", required=true)
    private Output<Integer> saDataSizeKilobytes;

    /**
     * @return The IPSec Security Association payload size in KB for a Site-to-Site VPN tunnel.
     * 
     */
    public Output<Integer> saDataSizeKilobytes() {
        return this.saDataSizeKilobytes;
    }

    /**
     * The IPSec Security Association lifetime in seconds for a Site-to-Site VPN tunnel.
     * 
     */
    @Import(name="saLifetimeSeconds", required=true)
    private Output<Integer> saLifetimeSeconds;

    /**
     * @return The IPSec Security Association lifetime in seconds for a Site-to-Site VPN tunnel.
     * 
     */
    public Output<Integer> saLifetimeSeconds() {
        return this.saLifetimeSeconds;
    }

    private VpnServerConfigurationIpsecPolicyArgs() {}

    private VpnServerConfigurationIpsecPolicyArgs(VpnServerConfigurationIpsecPolicyArgs $) {
        this.dhGroup = $.dhGroup;
        this.ikeEncryption = $.ikeEncryption;
        this.ikeIntegrity = $.ikeIntegrity;
        this.ipsecEncryption = $.ipsecEncryption;
        this.ipsecIntegrity = $.ipsecIntegrity;
        this.pfsGroup = $.pfsGroup;
        this.saDataSizeKilobytes = $.saDataSizeKilobytes;
        this.saLifetimeSeconds = $.saLifetimeSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpnServerConfigurationIpsecPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpnServerConfigurationIpsecPolicyArgs $;

        public Builder() {
            $ = new VpnServerConfigurationIpsecPolicyArgs();
        }

        public Builder(VpnServerConfigurationIpsecPolicyArgs defaults) {
            $ = new VpnServerConfigurationIpsecPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dhGroup The DH Group, used in IKE Phase 1. Possible values include `DHGroup1`, `DHGroup2`, `DHGroup14`, `DHGroup24`, `DHGroup2048`, `ECP256`, `ECP384` and `None`.
         * 
         * @return builder
         * 
         */
        public Builder dhGroup(Output<String> dhGroup) {
            $.dhGroup = dhGroup;
            return this;
        }

        /**
         * @param dhGroup The DH Group, used in IKE Phase 1. Possible values include `DHGroup1`, `DHGroup2`, `DHGroup14`, `DHGroup24`, `DHGroup2048`, `ECP256`, `ECP384` and `None`.
         * 
         * @return builder
         * 
         */
        public Builder dhGroup(String dhGroup) {
            return dhGroup(Output.of(dhGroup));
        }

        /**
         * @param ikeEncryption The IKE encryption algorithm, used for IKE Phase 2. Possible values include `AES128`, `AES192`, `AES256`, `DES`, `DES3`, `GCMAES128` and `GCMAES256`.
         * 
         * @return builder
         * 
         */
        public Builder ikeEncryption(Output<String> ikeEncryption) {
            $.ikeEncryption = ikeEncryption;
            return this;
        }

        /**
         * @param ikeEncryption The IKE encryption algorithm, used for IKE Phase 2. Possible values include `AES128`, `AES192`, `AES256`, `DES`, `DES3`, `GCMAES128` and `GCMAES256`.
         * 
         * @return builder
         * 
         */
        public Builder ikeEncryption(String ikeEncryption) {
            return ikeEncryption(Output.of(ikeEncryption));
        }

        /**
         * @param ikeIntegrity The IKE encryption integrity algorithm, used for IKE Phase 2. Possible values include `GCMAES128`, `GCMAES256`, `MD5`, `SHA1`, `SHA256` and `SHA384`.
         * 
         * @return builder
         * 
         */
        public Builder ikeIntegrity(Output<String> ikeIntegrity) {
            $.ikeIntegrity = ikeIntegrity;
            return this;
        }

        /**
         * @param ikeIntegrity The IKE encryption integrity algorithm, used for IKE Phase 2. Possible values include `GCMAES128`, `GCMAES256`, `MD5`, `SHA1`, `SHA256` and `SHA384`.
         * 
         * @return builder
         * 
         */
        public Builder ikeIntegrity(String ikeIntegrity) {
            return ikeIntegrity(Output.of(ikeIntegrity));
        }

        /**
         * @param ipsecEncryption The IPSec encryption algorithm, used for IKE phase 1. Possible values include `AES128`, `AES192`, `AES256`, `DES`, `DES3`, `GCMAES128`, `GCMAES192`, `GCMAES256` and `None`.
         * 
         * @return builder
         * 
         */
        public Builder ipsecEncryption(Output<String> ipsecEncryption) {
            $.ipsecEncryption = ipsecEncryption;
            return this;
        }

        /**
         * @param ipsecEncryption The IPSec encryption algorithm, used for IKE phase 1. Possible values include `AES128`, `AES192`, `AES256`, `DES`, `DES3`, `GCMAES128`, `GCMAES192`, `GCMAES256` and `None`.
         * 
         * @return builder
         * 
         */
        public Builder ipsecEncryption(String ipsecEncryption) {
            return ipsecEncryption(Output.of(ipsecEncryption));
        }

        /**
         * @param ipsecIntegrity The IPSec integrity algorithm, used for IKE phase 1. Possible values include `GCMAES128`, `GCMAES192`, `GCMAES256`, `MD5`, `SHA1` and `SHA256`.
         * 
         * @return builder
         * 
         */
        public Builder ipsecIntegrity(Output<String> ipsecIntegrity) {
            $.ipsecIntegrity = ipsecIntegrity;
            return this;
        }

        /**
         * @param ipsecIntegrity The IPSec integrity algorithm, used for IKE phase 1. Possible values include `GCMAES128`, `GCMAES192`, `GCMAES256`, `MD5`, `SHA1` and `SHA256`.
         * 
         * @return builder
         * 
         */
        public Builder ipsecIntegrity(String ipsecIntegrity) {
            return ipsecIntegrity(Output.of(ipsecIntegrity));
        }

        /**
         * @param pfsGroup The Pfs Group, used in IKE Phase 2. Possible values include `ECP256`, `ECP384`, `PFS1`, `PFS2`, `PFS14`, `PFS24`, `PFS2048`, `PFSMM` and `None`.
         * 
         * @return builder
         * 
         */
        public Builder pfsGroup(Output<String> pfsGroup) {
            $.pfsGroup = pfsGroup;
            return this;
        }

        /**
         * @param pfsGroup The Pfs Group, used in IKE Phase 2. Possible values include `ECP256`, `ECP384`, `PFS1`, `PFS2`, `PFS14`, `PFS24`, `PFS2048`, `PFSMM` and `None`.
         * 
         * @return builder
         * 
         */
        public Builder pfsGroup(String pfsGroup) {
            return pfsGroup(Output.of(pfsGroup));
        }

        /**
         * @param saDataSizeKilobytes The IPSec Security Association payload size in KB for a Site-to-Site VPN tunnel.
         * 
         * @return builder
         * 
         */
        public Builder saDataSizeKilobytes(Output<Integer> saDataSizeKilobytes) {
            $.saDataSizeKilobytes = saDataSizeKilobytes;
            return this;
        }

        /**
         * @param saDataSizeKilobytes The IPSec Security Association payload size in KB for a Site-to-Site VPN tunnel.
         * 
         * @return builder
         * 
         */
        public Builder saDataSizeKilobytes(Integer saDataSizeKilobytes) {
            return saDataSizeKilobytes(Output.of(saDataSizeKilobytes));
        }

        /**
         * @param saLifetimeSeconds The IPSec Security Association lifetime in seconds for a Site-to-Site VPN tunnel.
         * 
         * @return builder
         * 
         */
        public Builder saLifetimeSeconds(Output<Integer> saLifetimeSeconds) {
            $.saLifetimeSeconds = saLifetimeSeconds;
            return this;
        }

        /**
         * @param saLifetimeSeconds The IPSec Security Association lifetime in seconds for a Site-to-Site VPN tunnel.
         * 
         * @return builder
         * 
         */
        public Builder saLifetimeSeconds(Integer saLifetimeSeconds) {
            return saLifetimeSeconds(Output.of(saLifetimeSeconds));
        }

        public VpnServerConfigurationIpsecPolicyArgs build() {
            $.dhGroup = Objects.requireNonNull($.dhGroup, "expected parameter 'dhGroup' to be non-null");
            $.ikeEncryption = Objects.requireNonNull($.ikeEncryption, "expected parameter 'ikeEncryption' to be non-null");
            $.ikeIntegrity = Objects.requireNonNull($.ikeIntegrity, "expected parameter 'ikeIntegrity' to be non-null");
            $.ipsecEncryption = Objects.requireNonNull($.ipsecEncryption, "expected parameter 'ipsecEncryption' to be non-null");
            $.ipsecIntegrity = Objects.requireNonNull($.ipsecIntegrity, "expected parameter 'ipsecIntegrity' to be non-null");
            $.pfsGroup = Objects.requireNonNull($.pfsGroup, "expected parameter 'pfsGroup' to be non-null");
            $.saDataSizeKilobytes = Objects.requireNonNull($.saDataSizeKilobytes, "expected parameter 'saDataSizeKilobytes' to be non-null");
            $.saLifetimeSeconds = Objects.requireNonNull($.saLifetimeSeconds, "expected parameter 'saLifetimeSeconds' to be non-null");
            return $;
        }
    }

}
