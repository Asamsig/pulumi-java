// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.azure.appservice.outputs.GetFunctionAppSiteConfigCors;
import com.pulumi.azure.appservice.outputs.GetFunctionAppSiteConfigIpRestriction;
import com.pulumi.azure.appservice.outputs.GetFunctionAppSiteConfigScmIpRestriction;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFunctionAppSiteConfig {
    /**
     * @return Is the app loaded at all times?
     * 
     */
    private final Boolean alwaysOn;
    /**
     * @return The number of workers this function app can scale out to. Only applicable to apps on the Consumption and Premium plan.
     * 
     */
    private final Integer appScaleLimit;
    private final String autoSwapSlotName;
    /**
     * @return A `cors` block as defined above.
     * 
     */
    private final GetFunctionAppSiteConfigCors cors;
    /**
     * @return The version of the .NET framework&#39;s CLR used in this App Service.
     * 
     */
    private final String dotnetFrameworkVersion;
    /**
     * @return The number of minimum instances for this function app. Only applicable to apps on the Premium plan.
     * 
     */
    private final Integer elasticInstanceMinimum;
    /**
     * @return State of FTP / FTPS service for this AppService.
     * 
     */
    private final String ftpsState;
    private final String healthCheckPath;
    /**
     * @return Is HTTP2 Enabled on this App Service?
     * 
     */
    private final Boolean http2Enabled;
    /**
     * @return One or more `ip_restriction` blocks as defined above.
     * 
     */
    private final List<GetFunctionAppSiteConfigIpRestriction> ipRestrictions;
    /**
     * @return Java version hosted by the function app in Azure.
     * 
     */
    private final String javaVersion;
    /**
     * @return Linux App Framework and version for the AppService.
     * 
     */
    private final String linuxFxVersion;
    /**
     * @return The minimum supported TLS version for this App Service.
     * 
     */
    private final String minTlsVersion;
    /**
     * @return The number of pre-warmed instances for this function app. Only applicable to apps on the Premium plan.
     * 
     */
    private final Integer preWarmedInstanceCount;
    /**
     * @return Is Runtime Scale Monitoring Enabled on this function app?
     * 
     */
    private final Boolean runtimeScaleMonitoringEnabled;
    /**
     * @return One or more `scm_ip_restriction` blocks as defined above.
     * 
     */
    private final List<GetFunctionAppSiteConfigScmIpRestriction> scmIpRestrictions;
    /**
     * @return The type of Source Control enabled for this App Service.
     * 
     */
    private final String scmType;
    /**
     * @return IP security restrictions for scm to use main.
     * 
     */
    private final Boolean scmUseMainIpRestriction;
    /**
     * @return Does the App Service run in 32 bit mode, rather than 64 bit mode?
     * 
     */
    private final Boolean use32BitWorkerProcess;
    /**
     * @return (Optional) Should all outbound traffic to have Virtual Network Security Groups and User Defined Routes applied?
     * 
     */
    private final Boolean vnetRouteAllEnabled;
    /**
     * @return Are WebSockets enabled for this App Service?
     * 
     */
    private final Boolean websocketsEnabled;

    @CustomType.Constructor
    private GetFunctionAppSiteConfig(
        @CustomType.Parameter("alwaysOn") Boolean alwaysOn,
        @CustomType.Parameter("appScaleLimit") Integer appScaleLimit,
        @CustomType.Parameter("autoSwapSlotName") String autoSwapSlotName,
        @CustomType.Parameter("cors") GetFunctionAppSiteConfigCors cors,
        @CustomType.Parameter("dotnetFrameworkVersion") String dotnetFrameworkVersion,
        @CustomType.Parameter("elasticInstanceMinimum") Integer elasticInstanceMinimum,
        @CustomType.Parameter("ftpsState") String ftpsState,
        @CustomType.Parameter("healthCheckPath") String healthCheckPath,
        @CustomType.Parameter("http2Enabled") Boolean http2Enabled,
        @CustomType.Parameter("ipRestrictions") List<GetFunctionAppSiteConfigIpRestriction> ipRestrictions,
        @CustomType.Parameter("javaVersion") String javaVersion,
        @CustomType.Parameter("linuxFxVersion") String linuxFxVersion,
        @CustomType.Parameter("minTlsVersion") String minTlsVersion,
        @CustomType.Parameter("preWarmedInstanceCount") Integer preWarmedInstanceCount,
        @CustomType.Parameter("runtimeScaleMonitoringEnabled") Boolean runtimeScaleMonitoringEnabled,
        @CustomType.Parameter("scmIpRestrictions") List<GetFunctionAppSiteConfigScmIpRestriction> scmIpRestrictions,
        @CustomType.Parameter("scmType") String scmType,
        @CustomType.Parameter("scmUseMainIpRestriction") Boolean scmUseMainIpRestriction,
        @CustomType.Parameter("use32BitWorkerProcess") Boolean use32BitWorkerProcess,
        @CustomType.Parameter("vnetRouteAllEnabled") Boolean vnetRouteAllEnabled,
        @CustomType.Parameter("websocketsEnabled") Boolean websocketsEnabled) {
        this.alwaysOn = alwaysOn;
        this.appScaleLimit = appScaleLimit;
        this.autoSwapSlotName = autoSwapSlotName;
        this.cors = cors;
        this.dotnetFrameworkVersion = dotnetFrameworkVersion;
        this.elasticInstanceMinimum = elasticInstanceMinimum;
        this.ftpsState = ftpsState;
        this.healthCheckPath = healthCheckPath;
        this.http2Enabled = http2Enabled;
        this.ipRestrictions = ipRestrictions;
        this.javaVersion = javaVersion;
        this.linuxFxVersion = linuxFxVersion;
        this.minTlsVersion = minTlsVersion;
        this.preWarmedInstanceCount = preWarmedInstanceCount;
        this.runtimeScaleMonitoringEnabled = runtimeScaleMonitoringEnabled;
        this.scmIpRestrictions = scmIpRestrictions;
        this.scmType = scmType;
        this.scmUseMainIpRestriction = scmUseMainIpRestriction;
        this.use32BitWorkerProcess = use32BitWorkerProcess;
        this.vnetRouteAllEnabled = vnetRouteAllEnabled;
        this.websocketsEnabled = websocketsEnabled;
    }

    /**
     * @return Is the app loaded at all times?
     * 
     */
    public Boolean alwaysOn() {
        return this.alwaysOn;
    }
    /**
     * @return The number of workers this function app can scale out to. Only applicable to apps on the Consumption and Premium plan.
     * 
     */
    public Integer appScaleLimit() {
        return this.appScaleLimit;
    }
    public String autoSwapSlotName() {
        return this.autoSwapSlotName;
    }
    /**
     * @return A `cors` block as defined above.
     * 
     */
    public GetFunctionAppSiteConfigCors cors() {
        return this.cors;
    }
    /**
     * @return The version of the .NET framework&#39;s CLR used in this App Service.
     * 
     */
    public String dotnetFrameworkVersion() {
        return this.dotnetFrameworkVersion;
    }
    /**
     * @return The number of minimum instances for this function app. Only applicable to apps on the Premium plan.
     * 
     */
    public Integer elasticInstanceMinimum() {
        return this.elasticInstanceMinimum;
    }
    /**
     * @return State of FTP / FTPS service for this AppService.
     * 
     */
    public String ftpsState() {
        return this.ftpsState;
    }
    public String healthCheckPath() {
        return this.healthCheckPath;
    }
    /**
     * @return Is HTTP2 Enabled on this App Service?
     * 
     */
    public Boolean http2Enabled() {
        return this.http2Enabled;
    }
    /**
     * @return One or more `ip_restriction` blocks as defined above.
     * 
     */
    public List<GetFunctionAppSiteConfigIpRestriction> ipRestrictions() {
        return this.ipRestrictions;
    }
    /**
     * @return Java version hosted by the function app in Azure.
     * 
     */
    public String javaVersion() {
        return this.javaVersion;
    }
    /**
     * @return Linux App Framework and version for the AppService.
     * 
     */
    public String linuxFxVersion() {
        return this.linuxFxVersion;
    }
    /**
     * @return The minimum supported TLS version for this App Service.
     * 
     */
    public String minTlsVersion() {
        return this.minTlsVersion;
    }
    /**
     * @return The number of pre-warmed instances for this function app. Only applicable to apps on the Premium plan.
     * 
     */
    public Integer preWarmedInstanceCount() {
        return this.preWarmedInstanceCount;
    }
    /**
     * @return Is Runtime Scale Monitoring Enabled on this function app?
     * 
     */
    public Boolean runtimeScaleMonitoringEnabled() {
        return this.runtimeScaleMonitoringEnabled;
    }
    /**
     * @return One or more `scm_ip_restriction` blocks as defined above.
     * 
     */
    public List<GetFunctionAppSiteConfigScmIpRestriction> scmIpRestrictions() {
        return this.scmIpRestrictions;
    }
    /**
     * @return The type of Source Control enabled for this App Service.
     * 
     */
    public String scmType() {
        return this.scmType;
    }
    /**
     * @return IP security restrictions for scm to use main.
     * 
     */
    public Boolean scmUseMainIpRestriction() {
        return this.scmUseMainIpRestriction;
    }
    /**
     * @return Does the App Service run in 32 bit mode, rather than 64 bit mode?
     * 
     */
    public Boolean use32BitWorkerProcess() {
        return this.use32BitWorkerProcess;
    }
    /**
     * @return (Optional) Should all outbound traffic to have Virtual Network Security Groups and User Defined Routes applied?
     * 
     */
    public Boolean vnetRouteAllEnabled() {
        return this.vnetRouteAllEnabled;
    }
    /**
     * @return Are WebSockets enabled for this App Service?
     * 
     */
    public Boolean websocketsEnabled() {
        return this.websocketsEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionAppSiteConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean alwaysOn;
        private Integer appScaleLimit;
        private String autoSwapSlotName;
        private GetFunctionAppSiteConfigCors cors;
        private String dotnetFrameworkVersion;
        private Integer elasticInstanceMinimum;
        private String ftpsState;
        private String healthCheckPath;
        private Boolean http2Enabled;
        private List<GetFunctionAppSiteConfigIpRestriction> ipRestrictions;
        private String javaVersion;
        private String linuxFxVersion;
        private String minTlsVersion;
        private Integer preWarmedInstanceCount;
        private Boolean runtimeScaleMonitoringEnabled;
        private List<GetFunctionAppSiteConfigScmIpRestriction> scmIpRestrictions;
        private String scmType;
        private Boolean scmUseMainIpRestriction;
        private Boolean use32BitWorkerProcess;
        private Boolean vnetRouteAllEnabled;
        private Boolean websocketsEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFunctionAppSiteConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alwaysOn = defaults.alwaysOn;
    	      this.appScaleLimit = defaults.appScaleLimit;
    	      this.autoSwapSlotName = defaults.autoSwapSlotName;
    	      this.cors = defaults.cors;
    	      this.dotnetFrameworkVersion = defaults.dotnetFrameworkVersion;
    	      this.elasticInstanceMinimum = defaults.elasticInstanceMinimum;
    	      this.ftpsState = defaults.ftpsState;
    	      this.healthCheckPath = defaults.healthCheckPath;
    	      this.http2Enabled = defaults.http2Enabled;
    	      this.ipRestrictions = defaults.ipRestrictions;
    	      this.javaVersion = defaults.javaVersion;
    	      this.linuxFxVersion = defaults.linuxFxVersion;
    	      this.minTlsVersion = defaults.minTlsVersion;
    	      this.preWarmedInstanceCount = defaults.preWarmedInstanceCount;
    	      this.runtimeScaleMonitoringEnabled = defaults.runtimeScaleMonitoringEnabled;
    	      this.scmIpRestrictions = defaults.scmIpRestrictions;
    	      this.scmType = defaults.scmType;
    	      this.scmUseMainIpRestriction = defaults.scmUseMainIpRestriction;
    	      this.use32BitWorkerProcess = defaults.use32BitWorkerProcess;
    	      this.vnetRouteAllEnabled = defaults.vnetRouteAllEnabled;
    	      this.websocketsEnabled = defaults.websocketsEnabled;
        }

        public Builder alwaysOn(Boolean alwaysOn) {
            this.alwaysOn = Objects.requireNonNull(alwaysOn);
            return this;
        }
        public Builder appScaleLimit(Integer appScaleLimit) {
            this.appScaleLimit = Objects.requireNonNull(appScaleLimit);
            return this;
        }
        public Builder autoSwapSlotName(String autoSwapSlotName) {
            this.autoSwapSlotName = Objects.requireNonNull(autoSwapSlotName);
            return this;
        }
        public Builder cors(GetFunctionAppSiteConfigCors cors) {
            this.cors = Objects.requireNonNull(cors);
            return this;
        }
        public Builder dotnetFrameworkVersion(String dotnetFrameworkVersion) {
            this.dotnetFrameworkVersion = Objects.requireNonNull(dotnetFrameworkVersion);
            return this;
        }
        public Builder elasticInstanceMinimum(Integer elasticInstanceMinimum) {
            this.elasticInstanceMinimum = Objects.requireNonNull(elasticInstanceMinimum);
            return this;
        }
        public Builder ftpsState(String ftpsState) {
            this.ftpsState = Objects.requireNonNull(ftpsState);
            return this;
        }
        public Builder healthCheckPath(String healthCheckPath) {
            this.healthCheckPath = Objects.requireNonNull(healthCheckPath);
            return this;
        }
        public Builder http2Enabled(Boolean http2Enabled) {
            this.http2Enabled = Objects.requireNonNull(http2Enabled);
            return this;
        }
        public Builder ipRestrictions(List<GetFunctionAppSiteConfigIpRestriction> ipRestrictions) {
            this.ipRestrictions = Objects.requireNonNull(ipRestrictions);
            return this;
        }
        public Builder ipRestrictions(GetFunctionAppSiteConfigIpRestriction... ipRestrictions) {
            return ipRestrictions(List.of(ipRestrictions));
        }
        public Builder javaVersion(String javaVersion) {
            this.javaVersion = Objects.requireNonNull(javaVersion);
            return this;
        }
        public Builder linuxFxVersion(String linuxFxVersion) {
            this.linuxFxVersion = Objects.requireNonNull(linuxFxVersion);
            return this;
        }
        public Builder minTlsVersion(String minTlsVersion) {
            this.minTlsVersion = Objects.requireNonNull(minTlsVersion);
            return this;
        }
        public Builder preWarmedInstanceCount(Integer preWarmedInstanceCount) {
            this.preWarmedInstanceCount = Objects.requireNonNull(preWarmedInstanceCount);
            return this;
        }
        public Builder runtimeScaleMonitoringEnabled(Boolean runtimeScaleMonitoringEnabled) {
            this.runtimeScaleMonitoringEnabled = Objects.requireNonNull(runtimeScaleMonitoringEnabled);
            return this;
        }
        public Builder scmIpRestrictions(List<GetFunctionAppSiteConfigScmIpRestriction> scmIpRestrictions) {
            this.scmIpRestrictions = Objects.requireNonNull(scmIpRestrictions);
            return this;
        }
        public Builder scmIpRestrictions(GetFunctionAppSiteConfigScmIpRestriction... scmIpRestrictions) {
            return scmIpRestrictions(List.of(scmIpRestrictions));
        }
        public Builder scmType(String scmType) {
            this.scmType = Objects.requireNonNull(scmType);
            return this;
        }
        public Builder scmUseMainIpRestriction(Boolean scmUseMainIpRestriction) {
            this.scmUseMainIpRestriction = Objects.requireNonNull(scmUseMainIpRestriction);
            return this;
        }
        public Builder use32BitWorkerProcess(Boolean use32BitWorkerProcess) {
            this.use32BitWorkerProcess = Objects.requireNonNull(use32BitWorkerProcess);
            return this;
        }
        public Builder vnetRouteAllEnabled(Boolean vnetRouteAllEnabled) {
            this.vnetRouteAllEnabled = Objects.requireNonNull(vnetRouteAllEnabled);
            return this;
        }
        public Builder websocketsEnabled(Boolean websocketsEnabled) {
            this.websocketsEnabled = Objects.requireNonNull(websocketsEnabled);
            return this;
        }        public GetFunctionAppSiteConfig build() {
            return new GetFunctionAppSiteConfig(alwaysOn, appScaleLimit, autoSwapSlotName, cors, dotnetFrameworkVersion, elasticInstanceMinimum, ftpsState, healthCheckPath, http2Enabled, ipRestrictions, javaVersion, linuxFxVersion, minTlsVersion, preWarmedInstanceCount, runtimeScaleMonitoringEnabled, scmIpRestrictions, scmType, scmUseMainIpRestriction, use32BitWorkerProcess, vnetRouteAllEnabled, websocketsEnabled);
        }
    }
}
