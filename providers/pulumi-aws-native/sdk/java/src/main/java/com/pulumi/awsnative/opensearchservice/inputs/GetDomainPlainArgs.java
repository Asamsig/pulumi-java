// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.opensearchservice.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDomainPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDomainPlainArgs Empty = new GetDomainPlainArgs();

    @Import(name="domainName", required=true)
    private String domainName;

    public String domainName() {
        return this.domainName;
    }

    private GetDomainPlainArgs() {}

    private GetDomainPlainArgs(GetDomainPlainArgs $) {
        this.domainName = $.domainName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDomainPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDomainPlainArgs $;

        public Builder() {
            $ = new GetDomainPlainArgs();
        }

        public Builder(GetDomainPlainArgs defaults) {
            $ = new GetDomainPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder domainName(String domainName) {
            $.domainName = domainName;
            return this;
        }

        public GetDomainPlainArgs build() {
            $.domainName = Objects.requireNonNull($.domainName, "expected parameter 'domainName' to be non-null");
            return $;
        }
    }

}
