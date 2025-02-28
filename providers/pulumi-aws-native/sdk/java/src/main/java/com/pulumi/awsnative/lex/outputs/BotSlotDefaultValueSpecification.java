// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.outputs;

import com.pulumi.awsnative.lex.outputs.BotSlotDefaultValue;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class BotSlotDefaultValueSpecification {
    /**
     * @return A list of slot default values
     * 
     */
    private final List<BotSlotDefaultValue> defaultValueList;

    @CustomType.Constructor
    private BotSlotDefaultValueSpecification(@CustomType.Parameter("defaultValueList") List<BotSlotDefaultValue> defaultValueList) {
        this.defaultValueList = defaultValueList;
    }

    /**
     * @return A list of slot default values
     * 
     */
    public List<BotSlotDefaultValue> defaultValueList() {
        return this.defaultValueList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotSlotDefaultValueSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<BotSlotDefaultValue> defaultValueList;

        public Builder() {
    	      // Empty
        }

        public Builder(BotSlotDefaultValueSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultValueList = defaults.defaultValueList;
        }

        public Builder defaultValueList(List<BotSlotDefaultValue> defaultValueList) {
            this.defaultValueList = Objects.requireNonNull(defaultValueList);
            return this;
        }
        public Builder defaultValueList(BotSlotDefaultValue... defaultValueList) {
            return defaultValueList(List.of(defaultValueList));
        }        public BotSlotDefaultValueSpecification build() {
            return new BotSlotDefaultValueSpecification(defaultValueList);
        }
    }
}
