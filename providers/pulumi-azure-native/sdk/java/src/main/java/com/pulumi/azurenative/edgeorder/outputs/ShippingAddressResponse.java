// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.edgeorder.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ShippingAddressResponse {
    /**
     * @return Type of address.
     * 
     */
    private final @Nullable String addressType;
    /**
     * @return Name of the City.
     * 
     */
    private final @Nullable String city;
    /**
     * @return Name of the company.
     * 
     */
    private final @Nullable String companyName;
    /**
     * @return Name of the Country.
     * 
     */
    private final String country;
    /**
     * @return Postal code.
     * 
     */
    private final @Nullable String postalCode;
    /**
     * @return Name of the State or Province.
     * 
     */
    private final @Nullable String stateOrProvince;
    /**
     * @return Street Address line 1.
     * 
     */
    private final String streetAddress1;
    /**
     * @return Street Address line 2.
     * 
     */
    private final @Nullable String streetAddress2;
    /**
     * @return Street Address line 3.
     * 
     */
    private final @Nullable String streetAddress3;
    /**
     * @return Extended Zip Code.
     * 
     */
    private final @Nullable String zipExtendedCode;

    @CustomType.Constructor
    private ShippingAddressResponse(
        @CustomType.Parameter("addressType") @Nullable String addressType,
        @CustomType.Parameter("city") @Nullable String city,
        @CustomType.Parameter("companyName") @Nullable String companyName,
        @CustomType.Parameter("country") String country,
        @CustomType.Parameter("postalCode") @Nullable String postalCode,
        @CustomType.Parameter("stateOrProvince") @Nullable String stateOrProvince,
        @CustomType.Parameter("streetAddress1") String streetAddress1,
        @CustomType.Parameter("streetAddress2") @Nullable String streetAddress2,
        @CustomType.Parameter("streetAddress3") @Nullable String streetAddress3,
        @CustomType.Parameter("zipExtendedCode") @Nullable String zipExtendedCode) {
        this.addressType = addressType;
        this.city = city;
        this.companyName = companyName;
        this.country = country;
        this.postalCode = postalCode;
        this.stateOrProvince = stateOrProvince;
        this.streetAddress1 = streetAddress1;
        this.streetAddress2 = streetAddress2;
        this.streetAddress3 = streetAddress3;
        this.zipExtendedCode = zipExtendedCode;
    }

    /**
     * @return Type of address.
     * 
     */
    public Optional<String> addressType() {
        return Optional.ofNullable(this.addressType);
    }
    /**
     * @return Name of the City.
     * 
     */
    public Optional<String> city() {
        return Optional.ofNullable(this.city);
    }
    /**
     * @return Name of the company.
     * 
     */
    public Optional<String> companyName() {
        return Optional.ofNullable(this.companyName);
    }
    /**
     * @return Name of the Country.
     * 
     */
    public String country() {
        return this.country;
    }
    /**
     * @return Postal code.
     * 
     */
    public Optional<String> postalCode() {
        return Optional.ofNullable(this.postalCode);
    }
    /**
     * @return Name of the State or Province.
     * 
     */
    public Optional<String> stateOrProvince() {
        return Optional.ofNullable(this.stateOrProvince);
    }
    /**
     * @return Street Address line 1.
     * 
     */
    public String streetAddress1() {
        return this.streetAddress1;
    }
    /**
     * @return Street Address line 2.
     * 
     */
    public Optional<String> streetAddress2() {
        return Optional.ofNullable(this.streetAddress2);
    }
    /**
     * @return Street Address line 3.
     * 
     */
    public Optional<String> streetAddress3() {
        return Optional.ofNullable(this.streetAddress3);
    }
    /**
     * @return Extended Zip Code.
     * 
     */
    public Optional<String> zipExtendedCode() {
        return Optional.ofNullable(this.zipExtendedCode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ShippingAddressResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String addressType;
        private @Nullable String city;
        private @Nullable String companyName;
        private String country;
        private @Nullable String postalCode;
        private @Nullable String stateOrProvince;
        private String streetAddress1;
        private @Nullable String streetAddress2;
        private @Nullable String streetAddress3;
        private @Nullable String zipExtendedCode;

        public Builder() {
    	      // Empty
        }

        public Builder(ShippingAddressResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressType = defaults.addressType;
    	      this.city = defaults.city;
    	      this.companyName = defaults.companyName;
    	      this.country = defaults.country;
    	      this.postalCode = defaults.postalCode;
    	      this.stateOrProvince = defaults.stateOrProvince;
    	      this.streetAddress1 = defaults.streetAddress1;
    	      this.streetAddress2 = defaults.streetAddress2;
    	      this.streetAddress3 = defaults.streetAddress3;
    	      this.zipExtendedCode = defaults.zipExtendedCode;
        }

        public Builder addressType(@Nullable String addressType) {
            this.addressType = addressType;
            return this;
        }
        public Builder city(@Nullable String city) {
            this.city = city;
            return this;
        }
        public Builder companyName(@Nullable String companyName) {
            this.companyName = companyName;
            return this;
        }
        public Builder country(String country) {
            this.country = Objects.requireNonNull(country);
            return this;
        }
        public Builder postalCode(@Nullable String postalCode) {
            this.postalCode = postalCode;
            return this;
        }
        public Builder stateOrProvince(@Nullable String stateOrProvince) {
            this.stateOrProvince = stateOrProvince;
            return this;
        }
        public Builder streetAddress1(String streetAddress1) {
            this.streetAddress1 = Objects.requireNonNull(streetAddress1);
            return this;
        }
        public Builder streetAddress2(@Nullable String streetAddress2) {
            this.streetAddress2 = streetAddress2;
            return this;
        }
        public Builder streetAddress3(@Nullable String streetAddress3) {
            this.streetAddress3 = streetAddress3;
            return this;
        }
        public Builder zipExtendedCode(@Nullable String zipExtendedCode) {
            this.zipExtendedCode = zipExtendedCode;
            return this;
        }        public ShippingAddressResponse build() {
            return new ShippingAddressResponse(addressType, city, companyName, country, postalCode, stateOrProvince, streetAddress1, streetAddress2, streetAddress3, zipExtendedCode);
        }
    }
}
