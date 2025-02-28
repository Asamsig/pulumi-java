// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCapacityReservationGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCapacityReservationGroupArgs Empty = new GetCapacityReservationGroupArgs();

    /**
     * The name of the capacity reservation group.
     * 
     */
    @Import(name="capacityReservationGroupName", required=true)
    private Output<String> capacityReservationGroupName;

    /**
     * @return The name of the capacity reservation group.
     * 
     */
    public Output<String> capacityReservationGroupName() {
        return this.capacityReservationGroupName;
    }

    /**
     * The expand expression to apply on the operation. &#39;InstanceView&#39; will retrieve the list of instance views of the capacity reservations under the capacity reservation group which is a snapshot of the runtime properties of a capacity reservation that is managed by the platform and can change outside of control plane operations.
     * 
     */
    @Import(name="expand")
    private @Nullable Output<String> expand;

    /**
     * @return The expand expression to apply on the operation. &#39;InstanceView&#39; will retrieve the list of instance views of the capacity reservations under the capacity reservation group which is a snapshot of the runtime properties of a capacity reservation that is managed by the platform and can change outside of control plane operations.
     * 
     */
    public Optional<Output<String>> expand() {
        return Optional.ofNullable(this.expand);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetCapacityReservationGroupArgs() {}

    private GetCapacityReservationGroupArgs(GetCapacityReservationGroupArgs $) {
        this.capacityReservationGroupName = $.capacityReservationGroupName;
        this.expand = $.expand;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCapacityReservationGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCapacityReservationGroupArgs $;

        public Builder() {
            $ = new GetCapacityReservationGroupArgs();
        }

        public Builder(GetCapacityReservationGroupArgs defaults) {
            $ = new GetCapacityReservationGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param capacityReservationGroupName The name of the capacity reservation group.
         * 
         * @return builder
         * 
         */
        public Builder capacityReservationGroupName(Output<String> capacityReservationGroupName) {
            $.capacityReservationGroupName = capacityReservationGroupName;
            return this;
        }

        /**
         * @param capacityReservationGroupName The name of the capacity reservation group.
         * 
         * @return builder
         * 
         */
        public Builder capacityReservationGroupName(String capacityReservationGroupName) {
            return capacityReservationGroupName(Output.of(capacityReservationGroupName));
        }

        /**
         * @param expand The expand expression to apply on the operation. &#39;InstanceView&#39; will retrieve the list of instance views of the capacity reservations under the capacity reservation group which is a snapshot of the runtime properties of a capacity reservation that is managed by the platform and can change outside of control plane operations.
         * 
         * @return builder
         * 
         */
        public Builder expand(@Nullable Output<String> expand) {
            $.expand = expand;
            return this;
        }

        /**
         * @param expand The expand expression to apply on the operation. &#39;InstanceView&#39; will retrieve the list of instance views of the capacity reservations under the capacity reservation group which is a snapshot of the runtime properties of a capacity reservation that is managed by the platform and can change outside of control plane operations.
         * 
         * @return builder
         * 
         */
        public Builder expand(String expand) {
            return expand(Output.of(expand));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetCapacityReservationGroupArgs build() {
            $.capacityReservationGroupName = Objects.requireNonNull($.capacityReservationGroupName, "expected parameter 'capacityReservationGroupName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
