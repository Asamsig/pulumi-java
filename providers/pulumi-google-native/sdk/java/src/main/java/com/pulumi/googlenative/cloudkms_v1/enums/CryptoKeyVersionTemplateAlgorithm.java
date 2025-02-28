// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudkms_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Required. Algorithm to use when creating a CryptoKeyVersion based on this template. For backwards compatibility, GOOGLE_SYMMETRIC_ENCRYPTION is implied if both this field is omitted and CryptoKey.purpose is ENCRYPT_DECRYPT.
     * 
     */
    @EnumType
    public enum CryptoKeyVersionTemplateAlgorithm {
        /**
         * Not specified.
         * 
         */
        CryptoKeyVersionAlgorithmUnspecified("CRYPTO_KEY_VERSION_ALGORITHM_UNSPECIFIED"),
        /**
         * Creates symmetric encryption keys.
         * 
         */
        GoogleSymmetricEncryption("GOOGLE_SYMMETRIC_ENCRYPTION"),
        /**
         * RSASSA-PSS 2048 bit key with a SHA256 digest.
         * 
         */
        RsaSignPss2048Sha256("RSA_SIGN_PSS_2048_SHA256"),
        /**
         * RSASSA-PSS 3072 bit key with a SHA256 digest.
         * 
         */
        RsaSignPss3072Sha256("RSA_SIGN_PSS_3072_SHA256"),
        /**
         * RSASSA-PSS 4096 bit key with a SHA256 digest.
         * 
         */
        RsaSignPss4096Sha256("RSA_SIGN_PSS_4096_SHA256"),
        /**
         * RSASSA-PSS 4096 bit key with a SHA512 digest.
         * 
         */
        RsaSignPss4096Sha512("RSA_SIGN_PSS_4096_SHA512"),
        /**
         * RSASSA-PKCS1-v1_5 with a 2048 bit key and a SHA256 digest.
         * 
         */
        RsaSignPkcs12048Sha256("RSA_SIGN_PKCS1_2048_SHA256"),
        /**
         * RSASSA-PKCS1-v1_5 with a 3072 bit key and a SHA256 digest.
         * 
         */
        RsaSignPkcs13072Sha256("RSA_SIGN_PKCS1_3072_SHA256"),
        /**
         * RSASSA-PKCS1-v1_5 with a 4096 bit key and a SHA256 digest.
         * 
         */
        RsaSignPkcs14096Sha256("RSA_SIGN_PKCS1_4096_SHA256"),
        /**
         * RSASSA-PKCS1-v1_5 with a 4096 bit key and a SHA512 digest.
         * 
         */
        RsaSignPkcs14096Sha512("RSA_SIGN_PKCS1_4096_SHA512"),
        /**
         * RSASSA-PKCS1-v1_5 signing without encoding, with a 2048 bit key.
         * 
         */
        RsaSignRawPkcs12048("RSA_SIGN_RAW_PKCS1_2048"),
        /**
         * RSASSA-PKCS1-v1_5 signing without encoding, with a 3072 bit key.
         * 
         */
        RsaSignRawPkcs13072("RSA_SIGN_RAW_PKCS1_3072"),
        /**
         * RSASSA-PKCS1-v1_5 signing without encoding, with a 4096 bit key.
         * 
         */
        RsaSignRawPkcs14096("RSA_SIGN_RAW_PKCS1_4096"),
        /**
         * RSAES-OAEP 2048 bit key with a SHA256 digest.
         * 
         */
        RsaDecryptOaep2048Sha256("RSA_DECRYPT_OAEP_2048_SHA256"),
        /**
         * RSAES-OAEP 3072 bit key with a SHA256 digest.
         * 
         */
        RsaDecryptOaep3072Sha256("RSA_DECRYPT_OAEP_3072_SHA256"),
        /**
         * RSAES-OAEP 4096 bit key with a SHA256 digest.
         * 
         */
        RsaDecryptOaep4096Sha256("RSA_DECRYPT_OAEP_4096_SHA256"),
        /**
         * RSAES-OAEP 4096 bit key with a SHA512 digest.
         * 
         */
        RsaDecryptOaep4096Sha512("RSA_DECRYPT_OAEP_4096_SHA512"),
        /**
         * RSAES-OAEP 2048 bit key with a SHA1 digest.
         * 
         */
        RsaDecryptOaep2048Sha1("RSA_DECRYPT_OAEP_2048_SHA1"),
        /**
         * RSAES-OAEP 3072 bit key with a SHA1 digest.
         * 
         */
        RsaDecryptOaep3072Sha1("RSA_DECRYPT_OAEP_3072_SHA1"),
        /**
         * RSAES-OAEP 4096 bit key with a SHA1 digest.
         * 
         */
        RsaDecryptOaep4096Sha1("RSA_DECRYPT_OAEP_4096_SHA1"),
        /**
         * ECDSA on the NIST P-256 curve with a SHA256 digest.
         * 
         */
        EcSignP256Sha256("EC_SIGN_P256_SHA256"),
        /**
         * ECDSA on the NIST P-384 curve with a SHA384 digest.
         * 
         */
        EcSignP384Sha384("EC_SIGN_P384_SHA384"),
        /**
         * ECDSA on the non-NIST secp256k1 curve. This curve is only supported for HSM protection level.
         * 
         */
        EcSignSecp256k1Sha256("EC_SIGN_SECP256K1_SHA256"),
        /**
         * HMAC-SHA256 signing with a 256 bit key.
         * 
         */
        HmacSha256("HMAC_SHA256"),
        /**
         * Algorithm representing symmetric encryption by an external key manager.
         * 
         */
        ExternalSymmetricEncryption("EXTERNAL_SYMMETRIC_ENCRYPTION");

        private final String value;

        CryptoKeyVersionTemplateAlgorithm(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "CryptoKeyVersionTemplateAlgorithm[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
