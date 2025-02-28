// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.logicapps.inputs;

import com.pulumi.azure.logicapps.inputs.GetStandardSiteConfigCorsArgs;
import com.pulumi.azure.logicapps.inputs.GetStandardSiteConfigIpRestrictionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetStandardSiteConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetStandardSiteConfigArgs Empty = new GetStandardSiteConfigArgs();

    @Import(name="alwaysOn")
    private @Nullable Output<Boolean> alwaysOn;

    public Optional<Output<Boolean>> alwaysOn() {
        return Optional.ofNullable(this.alwaysOn);
    }

    @Import(name="appScaleLimit", required=true)
    private Output<Integer> appScaleLimit;

    public Output<Integer> appScaleLimit() {
        return this.appScaleLimit;
    }

    @Import(name="cors", required=true)
    private Output<GetStandardSiteConfigCorsArgs> cors;

    public Output<GetStandardSiteConfigCorsArgs> cors() {
        return this.cors;
    }

    @Import(name="dotnetFrameworkVersion")
    private @Nullable Output<String> dotnetFrameworkVersion;

    public Optional<Output<String>> dotnetFrameworkVersion() {
        return Optional.ofNullable(this.dotnetFrameworkVersion);
    }

    @Import(name="elasticInstanceMinimum", required=true)
    private Output<Integer> elasticInstanceMinimum;

    public Output<Integer> elasticInstanceMinimum() {
        return this.elasticInstanceMinimum;
    }

    @Import(name="ftpsState", required=true)
    private Output<String> ftpsState;

    public Output<String> ftpsState() {
        return this.ftpsState;
    }

    @Import(name="healthCheckPath")
    private @Nullable Output<String> healthCheckPath;

    public Optional<Output<String>> healthCheckPath() {
        return Optional.ofNullable(this.healthCheckPath);
    }

    @Import(name="http2Enabled")
    private @Nullable Output<Boolean> http2Enabled;

    public Optional<Output<Boolean>> http2Enabled() {
        return Optional.ofNullable(this.http2Enabled);
    }

    @Import(name="ipRestrictions", required=true)
    private Output<List<GetStandardSiteConfigIpRestrictionArgs>> ipRestrictions;

    public Output<List<GetStandardSiteConfigIpRestrictionArgs>> ipRestrictions() {
        return this.ipRestrictions;
    }

    @Import(name="linuxFxVersion", required=true)
    private Output<String> linuxFxVersion;

    public Output<String> linuxFxVersion() {
        return this.linuxFxVersion;
    }

    @Import(name="minTlsVersion", required=true)
    private Output<String> minTlsVersion;

    public Output<String> minTlsVersion() {
        return this.minTlsVersion;
    }

    @Import(name="preWarmedInstanceCount", required=true)
    private Output<Integer> preWarmedInstanceCount;

    public Output<Integer> preWarmedInstanceCount() {
        return this.preWarmedInstanceCount;
    }

    @Import(name="runtimeScaleMonitoringEnabled")
    private @Nullable Output<Boolean> runtimeScaleMonitoringEnabled;

    public Optional<Output<Boolean>> runtimeScaleMonitoringEnabled() {
        return Optional.ofNullable(this.runtimeScaleMonitoringEnabled);
    }

    @Import(name="use32BitWorkerProcess")
    private @Nullable Output<Boolean> use32BitWorkerProcess;

    public Optional<Output<Boolean>> use32BitWorkerProcess() {
        return Optional.ofNullable(this.use32BitWorkerProcess);
    }

    @Import(name="vnetRouteAllEnabled", required=true)
    private Output<Boolean> vnetRouteAllEnabled;

    public Output<Boolean> vnetRouteAllEnabled() {
        return this.vnetRouteAllEnabled;
    }

    @Import(name="websocketsEnabled")
    private @Nullable Output<Boolean> websocketsEnabled;

    public Optional<Output<Boolean>> websocketsEnabled() {
        return Optional.ofNullable(this.websocketsEnabled);
    }

    private GetStandardSiteConfigArgs() {}

    private GetStandardSiteConfigArgs(GetStandardSiteConfigArgs $) {
        this.alwaysOn = $.alwaysOn;
        this.appScaleLimit = $.appScaleLimit;
        this.cors = $.cors;
        this.dotnetFrameworkVersion = $.dotnetFrameworkVersion;
        this.elasticInstanceMinimum = $.elasticInstanceMinimum;
        this.ftpsState = $.ftpsState;
        this.healthCheckPath = $.healthCheckPath;
        this.http2Enabled = $.http2Enabled;
        this.ipRestrictions = $.ipRestrictions;
        this.linuxFxVersion = $.linuxFxVersion;
        this.minTlsVersion = $.minTlsVersion;
        this.preWarmedInstanceCount = $.preWarmedInstanceCount;
        this.runtimeScaleMonitoringEnabled = $.runtimeScaleMonitoringEnabled;
        this.use32BitWorkerProcess = $.use32BitWorkerProcess;
        this.vnetRouteAllEnabled = $.vnetRouteAllEnabled;
        this.websocketsEnabled = $.websocketsEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStandardSiteConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStandardSiteConfigArgs $;

        public Builder() {
            $ = new GetStandardSiteConfigArgs();
        }

        public Builder(GetStandardSiteConfigArgs defaults) {
            $ = new GetStandardSiteConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder alwaysOn(@Nullable Output<Boolean> alwaysOn) {
            $.alwaysOn = alwaysOn;
            return this;
        }

        public Builder alwaysOn(Boolean alwaysOn) {
            return alwaysOn(Output.of(alwaysOn));
        }

        public Builder appScaleLimit(Output<Integer> appScaleLimit) {
            $.appScaleLimit = appScaleLimit;
            return this;
        }

        public Builder appScaleLimit(Integer appScaleLimit) {
            return appScaleLimit(Output.of(appScaleLimit));
        }

        public Builder cors(Output<GetStandardSiteConfigCorsArgs> cors) {
            $.cors = cors;
            return this;
        }

        public Builder cors(GetStandardSiteConfigCorsArgs cors) {
            return cors(Output.of(cors));
        }

        public Builder dotnetFrameworkVersion(@Nullable Output<String> dotnetFrameworkVersion) {
            $.dotnetFrameworkVersion = dotnetFrameworkVersion;
            return this;
        }

        public Builder dotnetFrameworkVersion(String dotnetFrameworkVersion) {
            return dotnetFrameworkVersion(Output.of(dotnetFrameworkVersion));
        }

        public Builder elasticInstanceMinimum(Output<Integer> elasticInstanceMinimum) {
            $.elasticInstanceMinimum = elasticInstanceMinimum;
            return this;
        }

        public Builder elasticInstanceMinimum(Integer elasticInstanceMinimum) {
            return elasticInstanceMinimum(Output.of(elasticInstanceMinimum));
        }

        public Builder ftpsState(Output<String> ftpsState) {
            $.ftpsState = ftpsState;
            return this;
        }

        public Builder ftpsState(String ftpsState) {
            return ftpsState(Output.of(ftpsState));
        }

        public Builder healthCheckPath(@Nullable Output<String> healthCheckPath) {
            $.healthCheckPath = healthCheckPath;
            return this;
        }

        public Builder healthCheckPath(String healthCheckPath) {
            return healthCheckPath(Output.of(healthCheckPath));
        }

        public Builder http2Enabled(@Nullable Output<Boolean> http2Enabled) {
            $.http2Enabled = http2Enabled;
            return this;
        }

        public Builder http2Enabled(Boolean http2Enabled) {
            return http2Enabled(Output.of(http2Enabled));
        }

        public Builder ipRestrictions(Output<List<GetStandardSiteConfigIpRestrictionArgs>> ipRestrictions) {
            $.ipRestrictions = ipRestrictions;
            return this;
        }

        public Builder ipRestrictions(List<GetStandardSiteConfigIpRestrictionArgs> ipRestrictions) {
            return ipRestrictions(Output.of(ipRestrictions));
        }

        public Builder ipRestrictions(GetStandardSiteConfigIpRestrictionArgs... ipRestrictions) {
            return ipRestrictions(List.of(ipRestrictions));
        }

        public Builder linuxFxVersion(Output<String> linuxFxVersion) {
            $.linuxFxVersion = linuxFxVersion;
            return this;
        }

        public Builder linuxFxVersion(String linuxFxVersion) {
            return linuxFxVersion(Output.of(linuxFxVersion));
        }

        public Builder minTlsVersion(Output<String> minTlsVersion) {
            $.minTlsVersion = minTlsVersion;
            return this;
        }

        public Builder minTlsVersion(String minTlsVersion) {
            return minTlsVersion(Output.of(minTlsVersion));
        }

        public Builder preWarmedInstanceCount(Output<Integer> preWarmedInstanceCount) {
            $.preWarmedInstanceCount = preWarmedInstanceCount;
            return this;
        }

        public Builder preWarmedInstanceCount(Integer preWarmedInstanceCount) {
            return preWarmedInstanceCount(Output.of(preWarmedInstanceCount));
        }

        public Builder runtimeScaleMonitoringEnabled(@Nullable Output<Boolean> runtimeScaleMonitoringEnabled) {
            $.runtimeScaleMonitoringEnabled = runtimeScaleMonitoringEnabled;
            return this;
        }

        public Builder runtimeScaleMonitoringEnabled(Boolean runtimeScaleMonitoringEnabled) {
            return runtimeScaleMonitoringEnabled(Output.of(runtimeScaleMonitoringEnabled));
        }

        public Builder use32BitWorkerProcess(@Nullable Output<Boolean> use32BitWorkerProcess) {
            $.use32BitWorkerProcess = use32BitWorkerProcess;
            return this;
        }

        public Builder use32BitWorkerProcess(Boolean use32BitWorkerProcess) {
            return use32BitWorkerProcess(Output.of(use32BitWorkerProcess));
        }

        public Builder vnetRouteAllEnabled(Output<Boolean> vnetRouteAllEnabled) {
            $.vnetRouteAllEnabled = vnetRouteAllEnabled;
            return this;
        }

        public Builder vnetRouteAllEnabled(Boolean vnetRouteAllEnabled) {
            return vnetRouteAllEnabled(Output.of(vnetRouteAllEnabled));
        }

        public Builder websocketsEnabled(@Nullable Output<Boolean> websocketsEnabled) {
            $.websocketsEnabled = websocketsEnabled;
            return this;
        }

        public Builder websocketsEnabled(Boolean websocketsEnabled) {
            return websocketsEnabled(Output.of(websocketsEnabled));
        }

        public GetStandardSiteConfigArgs build() {
            $.appScaleLimit = Objects.requireNonNull($.appScaleLimit, "expected parameter 'appScaleLimit' to be non-null");
            $.cors = Objects.requireNonNull($.cors, "expected parameter 'cors' to be non-null");
            $.elasticInstanceMinimum = Objects.requireNonNull($.elasticInstanceMinimum, "expected parameter 'elasticInstanceMinimum' to be non-null");
            $.ftpsState = Objects.requireNonNull($.ftpsState, "expected parameter 'ftpsState' to be non-null");
            $.ipRestrictions = Objects.requireNonNull($.ipRestrictions, "expected parameter 'ipRestrictions' to be non-null");
            $.linuxFxVersion = Objects.requireNonNull($.linuxFxVersion, "expected parameter 'linuxFxVersion' to be non-null");
            $.minTlsVersion = Objects.requireNonNull($.minTlsVersion, "expected parameter 'minTlsVersion' to be non-null");
            $.preWarmedInstanceCount = Objects.requireNonNull($.preWarmedInstanceCount, "expected parameter 'preWarmedInstanceCount' to be non-null");
            $.vnetRouteAllEnabled = Objects.requireNonNull($.vnetRouteAllEnabled, "expected parameter 'vnetRouteAllEnabled' to be non-null");
            return $;
        }
    }

}
