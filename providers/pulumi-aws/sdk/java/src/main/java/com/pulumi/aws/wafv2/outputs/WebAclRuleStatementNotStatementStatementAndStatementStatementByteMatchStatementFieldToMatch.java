// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchAllQueryArguments;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchBody;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchMethod;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchQueryString;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleHeader;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleQueryArgument;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchUriPath;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatch {
    /**
     * @return Inspect all query arguments.
     * 
     */
    private final @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchAllQueryArguments allQueryArguments;
    /**
     * @return Inspect the request body, which immediately follows the request headers.
     * 
     */
    private final @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchBody body;
    /**
     * @return Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    private final @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchMethod method;
    /**
     * @return Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    private final @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchQueryString queryString;
    /**
     * @return Inspect a single header. See Single Header below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleHeader singleHeader;
    /**
     * @return Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument;
    /**
     * @return Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    private final @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchUriPath uriPath;

    @CustomType.Constructor
    private WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatch(
        @CustomType.Parameter("allQueryArguments") @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchAllQueryArguments allQueryArguments,
        @CustomType.Parameter("body") @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchBody body,
        @CustomType.Parameter("method") @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchMethod method,
        @CustomType.Parameter("queryString") @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchQueryString queryString,
        @CustomType.Parameter("singleHeader") @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleHeader singleHeader,
        @CustomType.Parameter("singleQueryArgument") @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument,
        @CustomType.Parameter("uriPath") @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchUriPath uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    /**
     * @return Inspect all query arguments.
     * 
     */
    public Optional<WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchAllQueryArguments> allQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }
    /**
     * @return Inspect the request body, which immediately follows the request headers.
     * 
     */
    public Optional<WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchBody> body() {
        return Optional.ofNullable(this.body);
    }
    /**
     * @return Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    public Optional<WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchMethod> method() {
        return Optional.ofNullable(this.method);
    }
    /**
     * @return Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    public Optional<WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchQueryString> queryString() {
        return Optional.ofNullable(this.queryString);
    }
    /**
     * @return Inspect a single header. See Single Header below for details.
     * 
     */
    public Optional<WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleHeader> singleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }
    /**
     * @return Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    public Optional<WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleQueryArgument> singleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }
    /**
     * @return Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    public Optional<WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchUriPath> uriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchAllQueryArguments allQueryArguments;
        private @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchBody body;
        private @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchMethod method;
        private @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchQueryString queryString;
        private @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleHeader singleHeader;
        private @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument;
        private @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchUriPath uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder allQueryArguments(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchAllQueryArguments allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }
        public Builder body(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchBody body) {
            this.body = body;
            return this;
        }
        public Builder method(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchMethod method) {
            this.method = method;
            return this;
        }
        public Builder queryString(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchQueryString queryString) {
            this.queryString = queryString;
            return this;
        }
        public Builder singleHeader(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleHeader singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }
        public Builder singleQueryArgument(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }
        public Builder uriPath(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchUriPath uriPath) {
            this.uriPath = uriPath;
            return this;
        }        public WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatch build() {
            return new WebAclRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatch(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
