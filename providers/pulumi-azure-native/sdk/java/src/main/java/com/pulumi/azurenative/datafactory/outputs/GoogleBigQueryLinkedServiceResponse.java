// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.azurenative.datafactory.outputs.AzureKeyVaultSecretReferenceResponse;
import com.pulumi.azurenative.datafactory.outputs.IntegrationRuntimeReferenceResponse;
import com.pulumi.azurenative.datafactory.outputs.ParameterSpecificationResponse;
import com.pulumi.azurenative.datafactory.outputs.SecureStringResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GoogleBigQueryLinkedServiceResponse {
    /**
     * @return A comma-separated list of public BigQuery projects to access.
     * 
     */
    private final @Nullable Object additionalProjects;
    /**
     * @return List of tags that can be used for describing the linked service.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * @return The OAuth 2.0 authentication mechanism used for authentication. ServiceAuthentication can only be used on self-hosted IR.
     * 
     */
    private final String authenticationType;
    /**
     * @return The client id of the google application used to acquire the refresh token. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object clientId;
    /**
     * @return The client secret of the google application used to acquire the refresh token.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> clientSecret;
    /**
     * @return The integration runtime reference.
     * 
     */
    private final @Nullable IntegrationRuntimeReferenceResponse connectVia;
    /**
     * @return Linked service description.
     * 
     */
    private final @Nullable String description;
    /**
     * @return The service account email ID that is used for ServiceAuthentication and can only be used on self-hosted IR.
     * 
     */
    private final @Nullable Object email;
    /**
     * @return The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object encryptedCredential;
    /**
     * @return The full path to the .p12 key file that is used to authenticate the service account email address and can only be used on self-hosted IR.
     * 
     */
    private final @Nullable Object keyFilePath;
    /**
     * @return Parameters for linked service.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    /**
     * @return The default BigQuery project to query against.
     * 
     */
    private final Object project;
    /**
     * @return The refresh token obtained from Google for authorizing access to BigQuery for UserAuthentication.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> refreshToken;
    /**
     * @return Whether to request access to Google Drive. Allowing Google Drive access enables support for federated tables that combine BigQuery data with data from Google Drive. The default value is false.
     * 
     */
    private final @Nullable Object requestGoogleDriveScope;
    /**
     * @return The full path of the .pem file containing trusted CA certificates for verifying the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default value is the cacerts.pem file installed with the IR.
     * 
     */
    private final @Nullable Object trustedCertPath;
    /**
     * @return Type of linked service.
     * Expected value is &#39;GoogleBigQuery&#39;.
     * 
     */
    private final String type;
    /**
     * @return Specifies whether to use a CA certificate from the system trust store or from a specified PEM file. The default value is false.
     * 
     */
    private final @Nullable Object useSystemTrustStore;

    @CustomType.Constructor
    private GoogleBigQueryLinkedServiceResponse(
        @CustomType.Parameter("additionalProjects") @Nullable Object additionalProjects,
        @CustomType.Parameter("annotations") @Nullable List<Object> annotations,
        @CustomType.Parameter("authenticationType") String authenticationType,
        @CustomType.Parameter("clientId") @Nullable Object clientId,
        @CustomType.Parameter("clientSecret") @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> clientSecret,
        @CustomType.Parameter("connectVia") @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("email") @Nullable Object email,
        @CustomType.Parameter("encryptedCredential") @Nullable Object encryptedCredential,
        @CustomType.Parameter("keyFilePath") @Nullable Object keyFilePath,
        @CustomType.Parameter("parameters") @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @CustomType.Parameter("project") Object project,
        @CustomType.Parameter("refreshToken") @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> refreshToken,
        @CustomType.Parameter("requestGoogleDriveScope") @Nullable Object requestGoogleDriveScope,
        @CustomType.Parameter("trustedCertPath") @Nullable Object trustedCertPath,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("useSystemTrustStore") @Nullable Object useSystemTrustStore) {
        this.additionalProjects = additionalProjects;
        this.annotations = annotations;
        this.authenticationType = authenticationType;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.connectVia = connectVia;
        this.description = description;
        this.email = email;
        this.encryptedCredential = encryptedCredential;
        this.keyFilePath = keyFilePath;
        this.parameters = parameters;
        this.project = project;
        this.refreshToken = refreshToken;
        this.requestGoogleDriveScope = requestGoogleDriveScope;
        this.trustedCertPath = trustedCertPath;
        this.type = type;
        this.useSystemTrustStore = useSystemTrustStore;
    }

    /**
     * @return A comma-separated list of public BigQuery projects to access.
     * 
     */
    public Optional<Object> additionalProjects() {
        return Optional.ofNullable(this.additionalProjects);
    }
    /**
     * @return List of tags that can be used for describing the linked service.
     * 
     */
    public List<Object> annotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * @return The OAuth 2.0 authentication mechanism used for authentication. ServiceAuthentication can only be used on self-hosted IR.
     * 
     */
    public String authenticationType() {
        return this.authenticationType;
    }
    /**
     * @return The client id of the google application used to acquire the refresh token. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> clientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * @return The client secret of the google application used to acquire the refresh token.
     * 
     */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }
    /**
     * @return The integration runtime reference.
     * 
     */
    public Optional<IntegrationRuntimeReferenceResponse> connectVia() {
        return Optional.ofNullable(this.connectVia);
    }
    /**
     * @return Linked service description.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The service account email ID that is used for ServiceAuthentication and can only be used on self-hosted IR.
     * 
     */
    public Optional<Object> email() {
        return Optional.ofNullable(this.email);
    }
    /**
     * @return The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> encryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }
    /**
     * @return The full path to the .p12 key file that is used to authenticate the service account email address and can only be used on self-hosted IR.
     * 
     */
    public Optional<Object> keyFilePath() {
        return Optional.ofNullable(this.keyFilePath);
    }
    /**
     * @return Parameters for linked service.
     * 
     */
    public Map<String,ParameterSpecificationResponse> parameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * @return The default BigQuery project to query against.
     * 
     */
    public Object project() {
        return this.project;
    }
    /**
     * @return The refresh token obtained from Google for authorizing access to BigQuery for UserAuthentication.
     * 
     */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> refreshToken() {
        return Optional.ofNullable(this.refreshToken);
    }
    /**
     * @return Whether to request access to Google Drive. Allowing Google Drive access enables support for federated tables that combine BigQuery data with data from Google Drive. The default value is false.
     * 
     */
    public Optional<Object> requestGoogleDriveScope() {
        return Optional.ofNullable(this.requestGoogleDriveScope);
    }
    /**
     * @return The full path of the .pem file containing trusted CA certificates for verifying the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default value is the cacerts.pem file installed with the IR.
     * 
     */
    public Optional<Object> trustedCertPath() {
        return Optional.ofNullable(this.trustedCertPath);
    }
    /**
     * @return Type of linked service.
     * Expected value is &#39;GoogleBigQuery&#39;.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Specifies whether to use a CA certificate from the system trust store or from a specified PEM file. The default value is false.
     * 
     */
    public Optional<Object> useSystemTrustStore() {
        return Optional.ofNullable(this.useSystemTrustStore);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleBigQueryLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object additionalProjects;
        private @Nullable List<Object> annotations;
        private String authenticationType;
        private @Nullable Object clientId;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> clientSecret;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable String description;
        private @Nullable Object email;
        private @Nullable Object encryptedCredential;
        private @Nullable Object keyFilePath;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private Object project;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> refreshToken;
        private @Nullable Object requestGoogleDriveScope;
        private @Nullable Object trustedCertPath;
        private String type;
        private @Nullable Object useSystemTrustStore;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleBigQueryLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalProjects = defaults.additionalProjects;
    	      this.annotations = defaults.annotations;
    	      this.authenticationType = defaults.authenticationType;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.email = defaults.email;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.keyFilePath = defaults.keyFilePath;
    	      this.parameters = defaults.parameters;
    	      this.project = defaults.project;
    	      this.refreshToken = defaults.refreshToken;
    	      this.requestGoogleDriveScope = defaults.requestGoogleDriveScope;
    	      this.trustedCertPath = defaults.trustedCertPath;
    	      this.type = defaults.type;
    	      this.useSystemTrustStore = defaults.useSystemTrustStore;
        }

        public Builder additionalProjects(@Nullable Object additionalProjects) {
            this.additionalProjects = additionalProjects;
            return this;
        }
        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder authenticationType(String authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
            return this;
        }
        public Builder clientId(@Nullable Object clientId) {
            this.clientId = clientId;
            return this;
        }
        public Builder clientSecret(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public Builder connectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder email(@Nullable Object email) {
            this.email = email;
            return this;
        }
        public Builder encryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }
        public Builder keyFilePath(@Nullable Object keyFilePath) {
            this.keyFilePath = keyFilePath;
            return this;
        }
        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder project(Object project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public Builder refreshToken(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }
        public Builder requestGoogleDriveScope(@Nullable Object requestGoogleDriveScope) {
            this.requestGoogleDriveScope = requestGoogleDriveScope;
            return this;
        }
        public Builder trustedCertPath(@Nullable Object trustedCertPath) {
            this.trustedCertPath = trustedCertPath;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder useSystemTrustStore(@Nullable Object useSystemTrustStore) {
            this.useSystemTrustStore = useSystemTrustStore;
            return this;
        }        public GoogleBigQueryLinkedServiceResponse build() {
            return new GoogleBigQueryLinkedServiceResponse(additionalProjects, annotations, authenticationType, clientId, clientSecret, connectVia, description, email, encryptedCredential, keyFilePath, parameters, project, refreshToken, requestGoogleDriveScope, trustedCertPath, type, useSystemTrustStore);
        }
    }
}
