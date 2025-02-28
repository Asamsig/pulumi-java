// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_beta.enums.ReservationAffinityConsumeReservationType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the reservations that this instance can consume from.
 * 
 */
public final class ReservationAffinityArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReservationAffinityArgs Empty = new ReservationAffinityArgs();

    /**
     * Specifies the type of reservation from which this instance can consume resources: ANY_RESERVATION (default), SPECIFIC_RESERVATION, or NO_RESERVATION. See Consuming reserved instances for examples.
     * 
     */
    @Import(name="consumeReservationType")
    private @Nullable Output<ReservationAffinityConsumeReservationType> consumeReservationType;

    /**
     * @return Specifies the type of reservation from which this instance can consume resources: ANY_RESERVATION (default), SPECIFIC_RESERVATION, or NO_RESERVATION. See Consuming reserved instances for examples.
     * 
     */
    public Optional<Output<ReservationAffinityConsumeReservationType>> consumeReservationType() {
        return Optional.ofNullable(this.consumeReservationType);
    }

    /**
     * Corresponds to the label key of a reservation resource. To target a SPECIFIC_RESERVATION by name, specify googleapis.com/reservation-name as the key and specify the name of your reservation as its value.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return Corresponds to the label key of a reservation resource. To target a SPECIFIC_RESERVATION by name, specify googleapis.com/reservation-name as the key and specify the name of your reservation as its value.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * Corresponds to the label values of a reservation resource. This can be either a name to a reservation in the same project or &#34;projects/different-project/reservations/some-reservation-name&#34; to target a shared reservation in the same zone but in a different project.
     * 
     */
    @Import(name="values")
    private @Nullable Output<List<String>> values;

    /**
     * @return Corresponds to the label values of a reservation resource. This can be either a name to a reservation in the same project or &#34;projects/different-project/reservations/some-reservation-name&#34; to target a shared reservation in the same zone but in a different project.
     * 
     */
    public Optional<Output<List<String>>> values() {
        return Optional.ofNullable(this.values);
    }

    private ReservationAffinityArgs() {}

    private ReservationAffinityArgs(ReservationAffinityArgs $) {
        this.consumeReservationType = $.consumeReservationType;
        this.key = $.key;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReservationAffinityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReservationAffinityArgs $;

        public Builder() {
            $ = new ReservationAffinityArgs();
        }

        public Builder(ReservationAffinityArgs defaults) {
            $ = new ReservationAffinityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param consumeReservationType Specifies the type of reservation from which this instance can consume resources: ANY_RESERVATION (default), SPECIFIC_RESERVATION, or NO_RESERVATION. See Consuming reserved instances for examples.
         * 
         * @return builder
         * 
         */
        public Builder consumeReservationType(@Nullable Output<ReservationAffinityConsumeReservationType> consumeReservationType) {
            $.consumeReservationType = consumeReservationType;
            return this;
        }

        /**
         * @param consumeReservationType Specifies the type of reservation from which this instance can consume resources: ANY_RESERVATION (default), SPECIFIC_RESERVATION, or NO_RESERVATION. See Consuming reserved instances for examples.
         * 
         * @return builder
         * 
         */
        public Builder consumeReservationType(ReservationAffinityConsumeReservationType consumeReservationType) {
            return consumeReservationType(Output.of(consumeReservationType));
        }

        /**
         * @param key Corresponds to the label key of a reservation resource. To target a SPECIFIC_RESERVATION by name, specify googleapis.com/reservation-name as the key and specify the name of your reservation as its value.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Corresponds to the label key of a reservation resource. To target a SPECIFIC_RESERVATION by name, specify googleapis.com/reservation-name as the key and specify the name of your reservation as its value.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param values Corresponds to the label values of a reservation resource. This can be either a name to a reservation in the same project or &#34;projects/different-project/reservations/some-reservation-name&#34; to target a shared reservation in the same zone but in a different project.
         * 
         * @return builder
         * 
         */
        public Builder values(@Nullable Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values Corresponds to the label values of a reservation resource. This can be either a name to a reservation in the same project or &#34;projects/different-project/reservations/some-reservation-name&#34; to target a shared reservation in the same zone but in a different project.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values Corresponds to the label values of a reservation resource. This can be either a name to a reservation in the same project or &#34;projects/different-project/reservations/some-reservation-name&#34; to target a shared reservation in the same zone but in a different project.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public ReservationAffinityArgs build() {
            return $;
        }
    }

}
