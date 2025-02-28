// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.testing_v1.outputs.AndroidDeviceListResponse;
import com.pulumi.googlenative.testing_v1.outputs.AndroidMatrixResponse;
import com.pulumi.googlenative.testing_v1.outputs.IosDeviceListResponse;
import java.util.Objects;

@CustomType
public final class EnvironmentMatrixResponse {
    /**
     * @return A list of Android devices; the test will be run only on the specified devices.
     * 
     */
    private final AndroidDeviceListResponse androidDeviceList;
    /**
     * @return A matrix of Android devices.
     * 
     */
    private final AndroidMatrixResponse androidMatrix;
    /**
     * @return A list of iOS devices.
     * 
     */
    private final IosDeviceListResponse iosDeviceList;

    @CustomType.Constructor
    private EnvironmentMatrixResponse(
        @CustomType.Parameter("androidDeviceList") AndroidDeviceListResponse androidDeviceList,
        @CustomType.Parameter("androidMatrix") AndroidMatrixResponse androidMatrix,
        @CustomType.Parameter("iosDeviceList") IosDeviceListResponse iosDeviceList) {
        this.androidDeviceList = androidDeviceList;
        this.androidMatrix = androidMatrix;
        this.iosDeviceList = iosDeviceList;
    }

    /**
     * @return A list of Android devices; the test will be run only on the specified devices.
     * 
     */
    public AndroidDeviceListResponse androidDeviceList() {
        return this.androidDeviceList;
    }
    /**
     * @return A matrix of Android devices.
     * 
     */
    public AndroidMatrixResponse androidMatrix() {
        return this.androidMatrix;
    }
    /**
     * @return A list of iOS devices.
     * 
     */
    public IosDeviceListResponse iosDeviceList() {
        return this.iosDeviceList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentMatrixResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AndroidDeviceListResponse androidDeviceList;
        private AndroidMatrixResponse androidMatrix;
        private IosDeviceListResponse iosDeviceList;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentMatrixResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.androidDeviceList = defaults.androidDeviceList;
    	      this.androidMatrix = defaults.androidMatrix;
    	      this.iosDeviceList = defaults.iosDeviceList;
        }

        public Builder androidDeviceList(AndroidDeviceListResponse androidDeviceList) {
            this.androidDeviceList = Objects.requireNonNull(androidDeviceList);
            return this;
        }
        public Builder androidMatrix(AndroidMatrixResponse androidMatrix) {
            this.androidMatrix = Objects.requireNonNull(androidMatrix);
            return this;
        }
        public Builder iosDeviceList(IosDeviceListResponse iosDeviceList) {
            this.iosDeviceList = Objects.requireNonNull(iosDeviceList);
            return this;
        }        public EnvironmentMatrixResponse build() {
            return new EnvironmentMatrixResponse(androidDeviceList, androidMatrix, iosDeviceList);
        }
    }
}
