// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.frontdoor.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RulesEngineRuleMatchConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulesEngineRuleMatchConditionArgs Empty = new RulesEngineRuleMatchConditionArgs();

    /**
     * can be set to `true` or `false` to negate the given condition. Defaults to `true`.
     * 
     */
    @Import(name="negateCondition")
    private @Nullable Output<Boolean> negateCondition;

    /**
     * @return can be set to `true` or `false` to negate the given condition. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> negateCondition() {
        return Optional.ofNullable(this.negateCondition);
    }

    /**
     * can be set to `Any`, `IPMatch`, `GeoMatch`, `Equal`, `Contains`, `LessThan`, `GreaterThan`, `LessThanOrEqual`, `GreaterThanOrEqual`, `BeginsWith` or `EndsWith`
     * 
     */
    @Import(name="operator", required=true)
    private Output<String> operator;

    /**
     * @return can be set to `Any`, `IPMatch`, `GeoMatch`, `Equal`, `Contains`, `LessThan`, `GreaterThan`, `LessThanOrEqual`, `GreaterThanOrEqual`, `BeginsWith` or `EndsWith`
     * 
     */
    public Output<String> operator() {
        return this.operator;
    }

    /**
     * match against a specific key when `variable` is set to `PostArgs` or `RequestHeader`. It cannot be used with `QueryString` and `RequestMethod`. Defaults to `null`.
     * 
     */
    @Import(name="selector")
    private @Nullable Output<String> selector;

    /**
     * @return match against a specific key when `variable` is set to `PostArgs` or `RequestHeader`. It cannot be used with `QueryString` and `RequestMethod`. Defaults to `null`.
     * 
     */
    public Optional<Output<String>> selector() {
        return Optional.ofNullable(this.selector);
    }

    /**
     * can be set to one or more values out of `Lowercase`, `RemoveNulls`, `Trim`, `Uppercase`, `UrlDecode` and `UrlEncode`
     * 
     */
    @Import(name="transforms")
    private @Nullable Output<List<String>> transforms;

    /**
     * @return can be set to one or more values out of `Lowercase`, `RemoveNulls`, `Trim`, `Uppercase`, `UrlDecode` and `UrlEncode`
     * 
     */
    public Optional<Output<List<String>>> transforms() {
        return Optional.ofNullable(this.transforms);
    }

    /**
     * can contain one or more strings.
     * 
     */
    @Import(name="values")
    private @Nullable Output<List<String>> values;

    /**
     * @return can contain one or more strings.
     * 
     */
    public Optional<Output<List<String>>> values() {
        return Optional.ofNullable(this.values);
    }

    /**
     * can be set to `IsMobile`, `RemoteAddr`, `RequestMethod`, `QueryString`, `PostArgs`, `RequestURI`, `RequestPath`, `RequestFilename`, `RequestFilenameExtension`,`RequestHeader`,`RequestBody` or `RequestScheme`.
     * 
     */
    @Import(name="variable")
    private @Nullable Output<String> variable;

    /**
     * @return can be set to `IsMobile`, `RemoteAddr`, `RequestMethod`, `QueryString`, `PostArgs`, `RequestURI`, `RequestPath`, `RequestFilename`, `RequestFilenameExtension`,`RequestHeader`,`RequestBody` or `RequestScheme`.
     * 
     */
    public Optional<Output<String>> variable() {
        return Optional.ofNullable(this.variable);
    }

    private RulesEngineRuleMatchConditionArgs() {}

    private RulesEngineRuleMatchConditionArgs(RulesEngineRuleMatchConditionArgs $) {
        this.negateCondition = $.negateCondition;
        this.operator = $.operator;
        this.selector = $.selector;
        this.transforms = $.transforms;
        this.values = $.values;
        this.variable = $.variable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesEngineRuleMatchConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesEngineRuleMatchConditionArgs $;

        public Builder() {
            $ = new RulesEngineRuleMatchConditionArgs();
        }

        public Builder(RulesEngineRuleMatchConditionArgs defaults) {
            $ = new RulesEngineRuleMatchConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param negateCondition can be set to `true` or `false` to negate the given condition. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder negateCondition(@Nullable Output<Boolean> negateCondition) {
            $.negateCondition = negateCondition;
            return this;
        }

        /**
         * @param negateCondition can be set to `true` or `false` to negate the given condition. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder negateCondition(Boolean negateCondition) {
            return negateCondition(Output.of(negateCondition));
        }

        /**
         * @param operator can be set to `Any`, `IPMatch`, `GeoMatch`, `Equal`, `Contains`, `LessThan`, `GreaterThan`, `LessThanOrEqual`, `GreaterThanOrEqual`, `BeginsWith` or `EndsWith`
         * 
         * @return builder
         * 
         */
        public Builder operator(Output<String> operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param operator can be set to `Any`, `IPMatch`, `GeoMatch`, `Equal`, `Contains`, `LessThan`, `GreaterThan`, `LessThanOrEqual`, `GreaterThanOrEqual`, `BeginsWith` or `EndsWith`
         * 
         * @return builder
         * 
         */
        public Builder operator(String operator) {
            return operator(Output.of(operator));
        }

        /**
         * @param selector match against a specific key when `variable` is set to `PostArgs` or `RequestHeader`. It cannot be used with `QueryString` and `RequestMethod`. Defaults to `null`.
         * 
         * @return builder
         * 
         */
        public Builder selector(@Nullable Output<String> selector) {
            $.selector = selector;
            return this;
        }

        /**
         * @param selector match against a specific key when `variable` is set to `PostArgs` or `RequestHeader`. It cannot be used with `QueryString` and `RequestMethod`. Defaults to `null`.
         * 
         * @return builder
         * 
         */
        public Builder selector(String selector) {
            return selector(Output.of(selector));
        }

        /**
         * @param transforms can be set to one or more values out of `Lowercase`, `RemoveNulls`, `Trim`, `Uppercase`, `UrlDecode` and `UrlEncode`
         * 
         * @return builder
         * 
         */
        public Builder transforms(@Nullable Output<List<String>> transforms) {
            $.transforms = transforms;
            return this;
        }

        /**
         * @param transforms can be set to one or more values out of `Lowercase`, `RemoveNulls`, `Trim`, `Uppercase`, `UrlDecode` and `UrlEncode`
         * 
         * @return builder
         * 
         */
        public Builder transforms(List<String> transforms) {
            return transforms(Output.of(transforms));
        }

        /**
         * @param transforms can be set to one or more values out of `Lowercase`, `RemoveNulls`, `Trim`, `Uppercase`, `UrlDecode` and `UrlEncode`
         * 
         * @return builder
         * 
         */
        public Builder transforms(String... transforms) {
            return transforms(List.of(transforms));
        }

        /**
         * @param values can contain one or more strings.
         * 
         * @return builder
         * 
         */
        public Builder values(@Nullable Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values can contain one or more strings.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values can contain one or more strings.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        /**
         * @param variable can be set to `IsMobile`, `RemoteAddr`, `RequestMethod`, `QueryString`, `PostArgs`, `RequestURI`, `RequestPath`, `RequestFilename`, `RequestFilenameExtension`,`RequestHeader`,`RequestBody` or `RequestScheme`.
         * 
         * @return builder
         * 
         */
        public Builder variable(@Nullable Output<String> variable) {
            $.variable = variable;
            return this;
        }

        /**
         * @param variable can be set to `IsMobile`, `RemoteAddr`, `RequestMethod`, `QueryString`, `PostArgs`, `RequestURI`, `RequestPath`, `RequestFilename`, `RequestFilenameExtension`,`RequestHeader`,`RequestBody` or `RequestScheme`.
         * 
         * @return builder
         * 
         */
        public Builder variable(String variable) {
            return variable(Output.of(variable));
        }

        public RulesEngineRuleMatchConditionArgs build() {
            $.operator = Objects.requireNonNull($.operator, "expected parameter 'operator' to be non-null");
            return $;
        }
    }

}
