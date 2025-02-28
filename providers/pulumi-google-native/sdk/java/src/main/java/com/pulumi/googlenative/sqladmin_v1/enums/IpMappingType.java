// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of this IP address. A `PRIMARY` address is a public address that can accept incoming connections. A `PRIVATE` address is a private address that can accept incoming connections. An `OUTGOING` address is the source address of connections originating from the instance, if supported.
     * 
     */
    @EnumType
    public enum IpMappingType {
        /**
         * This is an unknown IP address type.
         * 
         */
        SqlIpAddressTypeUnspecified("SQL_IP_ADDRESS_TYPE_UNSPECIFIED"),
        /**
         * IP address the customer is supposed to connect to. Usually this is the load balancer&#39;s IP address
         * 
         */
        Primary("PRIMARY"),
        /**
         * Source IP address of the connection a read replica establishes to its external primary instance. This IP address can be allowlisted by the customer in case it has a firewall that filters incoming connection to its on premises primary instance.
         * 
         */
        Outgoing("OUTGOING"),
        /**
         * Private IP used when using private IPs and network peering.
         * 
         */
        Private("PRIVATE"),
        /**
         * V1 IP of a migrated instance. We want the user to decommission this IP as soon as the migration is complete. Note: V1 instances with V1 ip addresses will be counted as PRIMARY.
         * 
         */
        Migrated1stGen("MIGRATED_1ST_GEN");

        private final String value;

        IpMappingType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "IpMappingType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
