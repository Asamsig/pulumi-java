// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.appengine_v1.enums.AppDatabaseType;
import com.pulumi.googlenative.appengine_v1.enums.AppServingStatus;
import com.pulumi.googlenative.appengine_v1.inputs.FeatureSettingsArgs;
import com.pulumi.googlenative.appengine_v1.inputs.IdentityAwareProxyArgs;
import com.pulumi.googlenative.appengine_v1.inputs.UrlDispatchRuleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppArgs Empty = new AppArgs();

    /**
     * Google Apps authentication domain that controls which users can access this application.Defaults to open access for any Google Account.
     * 
     */
    @Import(name="authDomain")
    private @Nullable Output<String> authDomain;

    /**
     * @return Google Apps authentication domain that controls which users can access this application.Defaults to open access for any Google Account.
     * 
     */
    public Optional<Output<String>> authDomain() {
        return Optional.ofNullable(this.authDomain);
    }

    /**
     * The type of the Cloud Firestore or Cloud Datastore database associated with this application.
     * 
     */
    @Import(name="databaseType")
    private @Nullable Output<AppDatabaseType> databaseType;

    /**
     * @return The type of the Cloud Firestore or Cloud Datastore database associated with this application.
     * 
     */
    public Optional<Output<AppDatabaseType>> databaseType() {
        return Optional.ofNullable(this.databaseType);
    }

    /**
     * Cookie expiration policy for this application.
     * 
     */
    @Import(name="defaultCookieExpiration")
    private @Nullable Output<String> defaultCookieExpiration;

    /**
     * @return Cookie expiration policy for this application.
     * 
     */
    public Optional<Output<String>> defaultCookieExpiration() {
        return Optional.ofNullable(this.defaultCookieExpiration);
    }

    /**
     * HTTP path dispatch rules for requests to the application that do not explicitly target a service or version. Rules are order-dependent. Up to 20 dispatch rules can be supported.
     * 
     */
    @Import(name="dispatchRules")
    private @Nullable Output<List<UrlDispatchRuleArgs>> dispatchRules;

    /**
     * @return HTTP path dispatch rules for requests to the application that do not explicitly target a service or version. Rules are order-dependent. Up to 20 dispatch rules can be supported.
     * 
     */
    public Optional<Output<List<UrlDispatchRuleArgs>>> dispatchRules() {
        return Optional.ofNullable(this.dispatchRules);
    }

    /**
     * The feature specific settings to be used in the application.
     * 
     */
    @Import(name="featureSettings")
    private @Nullable Output<FeatureSettingsArgs> featureSettings;

    /**
     * @return The feature specific settings to be used in the application.
     * 
     */
    public Optional<Output<FeatureSettingsArgs>> featureSettings() {
        return Optional.ofNullable(this.featureSettings);
    }

    /**
     * The Google Container Registry domain used for storing managed build docker images for this application.
     * 
     */
    @Import(name="gcrDomain")
    private @Nullable Output<String> gcrDomain;

    /**
     * @return The Google Container Registry domain used for storing managed build docker images for this application.
     * 
     */
    public Optional<Output<String>> gcrDomain() {
        return Optional.ofNullable(this.gcrDomain);
    }

    @Import(name="iap")
    private @Nullable Output<IdentityAwareProxyArgs> iap;

    public Optional<Output<IdentityAwareProxyArgs>> iap() {
        return Optional.ofNullable(this.iap);
    }

    /**
     * Identifier of the Application resource. This identifier is equivalent to the project ID of the Google Cloud Platform project where you want to deploy your application. Example: myapp.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Identifier of the Application resource. This identifier is equivalent to the project ID of the Google Cloud Platform project where you want to deploy your application. Example: myapp.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Location from which this application runs. Application instances run out of the data centers in the specified location, which is also where all of the application&#39;s end user content is stored.Defaults to us-central.View the list of supported locations (https://cloud.google.com/appengine/docs/locations).
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Location from which this application runs. Application instances run out of the data centers in the specified location, which is also where all of the application&#39;s end user content is stored.Defaults to us-central.View the list of supported locations (https://cloud.google.com/appengine/docs/locations).
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The service account associated with the application. This is the app-level default identity. If no identity provided during create version, Admin API will fallback to this one.
     * 
     */
    @Import(name="serviceAccount")
    private @Nullable Output<String> serviceAccount;

    /**
     * @return The service account associated with the application. This is the app-level default identity. If no identity provided during create version, Admin API will fallback to this one.
     * 
     */
    public Optional<Output<String>> serviceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }

    /**
     * Serving status of this application.
     * 
     */
    @Import(name="servingStatus")
    private @Nullable Output<AppServingStatus> servingStatus;

    /**
     * @return Serving status of this application.
     * 
     */
    public Optional<Output<AppServingStatus>> servingStatus() {
        return Optional.ofNullable(this.servingStatus);
    }

    private AppArgs() {}

    private AppArgs(AppArgs $) {
        this.authDomain = $.authDomain;
        this.databaseType = $.databaseType;
        this.defaultCookieExpiration = $.defaultCookieExpiration;
        this.dispatchRules = $.dispatchRules;
        this.featureSettings = $.featureSettings;
        this.gcrDomain = $.gcrDomain;
        this.iap = $.iap;
        this.id = $.id;
        this.location = $.location;
        this.serviceAccount = $.serviceAccount;
        this.servingStatus = $.servingStatus;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppArgs $;

        public Builder() {
            $ = new AppArgs();
        }

        public Builder(AppArgs defaults) {
            $ = new AppArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authDomain Google Apps authentication domain that controls which users can access this application.Defaults to open access for any Google Account.
         * 
         * @return builder
         * 
         */
        public Builder authDomain(@Nullable Output<String> authDomain) {
            $.authDomain = authDomain;
            return this;
        }

        /**
         * @param authDomain Google Apps authentication domain that controls which users can access this application.Defaults to open access for any Google Account.
         * 
         * @return builder
         * 
         */
        public Builder authDomain(String authDomain) {
            return authDomain(Output.of(authDomain));
        }

        /**
         * @param databaseType The type of the Cloud Firestore or Cloud Datastore database associated with this application.
         * 
         * @return builder
         * 
         */
        public Builder databaseType(@Nullable Output<AppDatabaseType> databaseType) {
            $.databaseType = databaseType;
            return this;
        }

        /**
         * @param databaseType The type of the Cloud Firestore or Cloud Datastore database associated with this application.
         * 
         * @return builder
         * 
         */
        public Builder databaseType(AppDatabaseType databaseType) {
            return databaseType(Output.of(databaseType));
        }

        /**
         * @param defaultCookieExpiration Cookie expiration policy for this application.
         * 
         * @return builder
         * 
         */
        public Builder defaultCookieExpiration(@Nullable Output<String> defaultCookieExpiration) {
            $.defaultCookieExpiration = defaultCookieExpiration;
            return this;
        }

        /**
         * @param defaultCookieExpiration Cookie expiration policy for this application.
         * 
         * @return builder
         * 
         */
        public Builder defaultCookieExpiration(String defaultCookieExpiration) {
            return defaultCookieExpiration(Output.of(defaultCookieExpiration));
        }

        /**
         * @param dispatchRules HTTP path dispatch rules for requests to the application that do not explicitly target a service or version. Rules are order-dependent. Up to 20 dispatch rules can be supported.
         * 
         * @return builder
         * 
         */
        public Builder dispatchRules(@Nullable Output<List<UrlDispatchRuleArgs>> dispatchRules) {
            $.dispatchRules = dispatchRules;
            return this;
        }

        /**
         * @param dispatchRules HTTP path dispatch rules for requests to the application that do not explicitly target a service or version. Rules are order-dependent. Up to 20 dispatch rules can be supported.
         * 
         * @return builder
         * 
         */
        public Builder dispatchRules(List<UrlDispatchRuleArgs> dispatchRules) {
            return dispatchRules(Output.of(dispatchRules));
        }

        /**
         * @param dispatchRules HTTP path dispatch rules for requests to the application that do not explicitly target a service or version. Rules are order-dependent. Up to 20 dispatch rules can be supported.
         * 
         * @return builder
         * 
         */
        public Builder dispatchRules(UrlDispatchRuleArgs... dispatchRules) {
            return dispatchRules(List.of(dispatchRules));
        }

        /**
         * @param featureSettings The feature specific settings to be used in the application.
         * 
         * @return builder
         * 
         */
        public Builder featureSettings(@Nullable Output<FeatureSettingsArgs> featureSettings) {
            $.featureSettings = featureSettings;
            return this;
        }

        /**
         * @param featureSettings The feature specific settings to be used in the application.
         * 
         * @return builder
         * 
         */
        public Builder featureSettings(FeatureSettingsArgs featureSettings) {
            return featureSettings(Output.of(featureSettings));
        }

        /**
         * @param gcrDomain The Google Container Registry domain used for storing managed build docker images for this application.
         * 
         * @return builder
         * 
         */
        public Builder gcrDomain(@Nullable Output<String> gcrDomain) {
            $.gcrDomain = gcrDomain;
            return this;
        }

        /**
         * @param gcrDomain The Google Container Registry domain used for storing managed build docker images for this application.
         * 
         * @return builder
         * 
         */
        public Builder gcrDomain(String gcrDomain) {
            return gcrDomain(Output.of(gcrDomain));
        }

        public Builder iap(@Nullable Output<IdentityAwareProxyArgs> iap) {
            $.iap = iap;
            return this;
        }

        public Builder iap(IdentityAwareProxyArgs iap) {
            return iap(Output.of(iap));
        }

        /**
         * @param id Identifier of the Application resource. This identifier is equivalent to the project ID of the Google Cloud Platform project where you want to deploy your application. Example: myapp.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Identifier of the Application resource. This identifier is equivalent to the project ID of the Google Cloud Platform project where you want to deploy your application. Example: myapp.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param location Location from which this application runs. Application instances run out of the data centers in the specified location, which is also where all of the application&#39;s end user content is stored.Defaults to us-central.View the list of supported locations (https://cloud.google.com/appengine/docs/locations).
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Location from which this application runs. Application instances run out of the data centers in the specified location, which is also where all of the application&#39;s end user content is stored.Defaults to us-central.View the list of supported locations (https://cloud.google.com/appengine/docs/locations).
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param serviceAccount The service account associated with the application. This is the app-level default identity. If no identity provided during create version, Admin API will fallback to this one.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            $.serviceAccount = serviceAccount;
            return this;
        }

        /**
         * @param serviceAccount The service account associated with the application. This is the app-level default identity. If no identity provided during create version, Admin API will fallback to this one.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(String serviceAccount) {
            return serviceAccount(Output.of(serviceAccount));
        }

        /**
         * @param servingStatus Serving status of this application.
         * 
         * @return builder
         * 
         */
        public Builder servingStatus(@Nullable Output<AppServingStatus> servingStatus) {
            $.servingStatus = servingStatus;
            return this;
        }

        /**
         * @param servingStatus Serving status of this application.
         * 
         * @return builder
         * 
         */
        public Builder servingStatus(AppServingStatus servingStatus) {
            return servingStatus(Output.of(servingStatus));
        }

        public AppArgs build() {
            return $;
        }
    }

}
