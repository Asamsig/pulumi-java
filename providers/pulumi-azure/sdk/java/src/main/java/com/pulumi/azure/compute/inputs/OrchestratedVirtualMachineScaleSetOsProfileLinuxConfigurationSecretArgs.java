// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecretCertificateArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecretArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecretArgs Empty = new OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecretArgs();

    @Import(name="certificates", required=true)
    private Output<List<OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecretCertificateArgs>> certificates;

    public Output<List<OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecretCertificateArgs>> certificates() {
        return this.certificates;
    }

    @Import(name="keyVaultId", required=true)
    private Output<String> keyVaultId;

    public Output<String> keyVaultId() {
        return this.keyVaultId;
    }

    private OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecretArgs() {}

    private OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecretArgs(OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecretArgs $) {
        this.certificates = $.certificates;
        this.keyVaultId = $.keyVaultId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecretArgs $;

        public Builder() {
            $ = new OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecretArgs();
        }

        public Builder(OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecretArgs defaults) {
            $ = new OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecretArgs(Objects.requireNonNull(defaults));
        }

        public Builder certificates(Output<List<OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecretCertificateArgs>> certificates) {
            $.certificates = certificates;
            return this;
        }

        public Builder certificates(List<OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecretCertificateArgs> certificates) {
            return certificates(Output.of(certificates));
        }

        public Builder certificates(OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecretCertificateArgs... certificates) {
            return certificates(List.of(certificates));
        }

        public Builder keyVaultId(Output<String> keyVaultId) {
            $.keyVaultId = keyVaultId;
            return this;
        }

        public Builder keyVaultId(String keyVaultId) {
            return keyVaultId(Output.of(keyVaultId));
        }

        public OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecretArgs build() {
            $.certificates = Objects.requireNonNull($.certificates, "expected parameter 'certificates' to be non-null");
            $.keyVaultId = Objects.requireNonNull($.keyVaultId, "expected parameter 'keyVaultId' to be non-null");
            return $;
        }
    }

}
