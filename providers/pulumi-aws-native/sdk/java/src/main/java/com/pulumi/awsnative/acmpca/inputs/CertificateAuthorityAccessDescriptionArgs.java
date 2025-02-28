// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.acmpca.inputs;

import com.pulumi.awsnative.acmpca.inputs.CertificateAuthorityAccessMethodArgs;
import com.pulumi.awsnative.acmpca.inputs.CertificateAuthorityGeneralNameArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * Structure that contains X.509 AccessDescription information.
 * 
 */
public final class CertificateAuthorityAccessDescriptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateAuthorityAccessDescriptionArgs Empty = new CertificateAuthorityAccessDescriptionArgs();

    @Import(name="accessLocation", required=true)
    private Output<CertificateAuthorityGeneralNameArgs> accessLocation;

    public Output<CertificateAuthorityGeneralNameArgs> accessLocation() {
        return this.accessLocation;
    }

    @Import(name="accessMethod", required=true)
    private Output<CertificateAuthorityAccessMethodArgs> accessMethod;

    public Output<CertificateAuthorityAccessMethodArgs> accessMethod() {
        return this.accessMethod;
    }

    private CertificateAuthorityAccessDescriptionArgs() {}

    private CertificateAuthorityAccessDescriptionArgs(CertificateAuthorityAccessDescriptionArgs $) {
        this.accessLocation = $.accessLocation;
        this.accessMethod = $.accessMethod;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateAuthorityAccessDescriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateAuthorityAccessDescriptionArgs $;

        public Builder() {
            $ = new CertificateAuthorityAccessDescriptionArgs();
        }

        public Builder(CertificateAuthorityAccessDescriptionArgs defaults) {
            $ = new CertificateAuthorityAccessDescriptionArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessLocation(Output<CertificateAuthorityGeneralNameArgs> accessLocation) {
            $.accessLocation = accessLocation;
            return this;
        }

        public Builder accessLocation(CertificateAuthorityGeneralNameArgs accessLocation) {
            return accessLocation(Output.of(accessLocation));
        }

        public Builder accessMethod(Output<CertificateAuthorityAccessMethodArgs> accessMethod) {
            $.accessMethod = accessMethod;
            return this;
        }

        public Builder accessMethod(CertificateAuthorityAccessMethodArgs accessMethod) {
            return accessMethod(Output.of(accessMethod));
        }

        public CertificateAuthorityAccessDescriptionArgs build() {
            $.accessLocation = Objects.requireNonNull($.accessLocation, "expected parameter 'accessLocation' to be non-null");
            $.accessMethod = Objects.requireNonNull($.accessMethod, "expected parameter 'accessMethod' to be non-null");
            return $;
        }
    }

}
