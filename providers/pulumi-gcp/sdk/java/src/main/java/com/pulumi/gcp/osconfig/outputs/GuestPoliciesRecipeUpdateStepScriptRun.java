// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GuestPoliciesRecipeUpdateStepScriptRun {
    /**
     * @return Return codes that indicate that the software installed or updated successfully. Behaviour defaults to [0]
     * 
     */
    private final @Nullable List<Integer> allowedExitCodes;
    /**
     * @return The script interpreter to use to run the script. If no interpreter is specified the script is executed directly,
     * which likely only succeed for scripts with shebang lines.
     * Possible values are `SHELL` and `POWERSHELL`.
     * 
     */
    private final @Nullable String interpreter;
    /**
     * @return The shell script to be executed.
     * 
     */
    private final String script;

    @CustomType.Constructor
    private GuestPoliciesRecipeUpdateStepScriptRun(
        @CustomType.Parameter("allowedExitCodes") @Nullable List<Integer> allowedExitCodes,
        @CustomType.Parameter("interpreter") @Nullable String interpreter,
        @CustomType.Parameter("script") String script) {
        this.allowedExitCodes = allowedExitCodes;
        this.interpreter = interpreter;
        this.script = script;
    }

    /**
     * @return Return codes that indicate that the software installed or updated successfully. Behaviour defaults to [0]
     * 
     */
    public List<Integer> allowedExitCodes() {
        return this.allowedExitCodes == null ? List.of() : this.allowedExitCodes;
    }
    /**
     * @return The script interpreter to use to run the script. If no interpreter is specified the script is executed directly,
     * which likely only succeed for scripts with shebang lines.
     * Possible values are `SHELL` and `POWERSHELL`.
     * 
     */
    public Optional<String> interpreter() {
        return Optional.ofNullable(this.interpreter);
    }
    /**
     * @return The shell script to be executed.
     * 
     */
    public String script() {
        return this.script;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesRecipeUpdateStepScriptRun defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Integer> allowedExitCodes;
        private @Nullable String interpreter;
        private String script;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesRecipeUpdateStepScriptRun defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedExitCodes = defaults.allowedExitCodes;
    	      this.interpreter = defaults.interpreter;
    	      this.script = defaults.script;
        }

        public Builder allowedExitCodes(@Nullable List<Integer> allowedExitCodes) {
            this.allowedExitCodes = allowedExitCodes;
            return this;
        }
        public Builder allowedExitCodes(Integer... allowedExitCodes) {
            return allowedExitCodes(List.of(allowedExitCodes));
        }
        public Builder interpreter(@Nullable String interpreter) {
            this.interpreter = interpreter;
            return this;
        }
        public Builder script(String script) {
            this.script = Objects.requireNonNull(script);
            return this;
        }        public GuestPoliciesRecipeUpdateStepScriptRun build() {
            return new GuestPoliciesRecipeUpdateStepScriptRun(allowedExitCodes, interpreter, script);
        }
    }
}
