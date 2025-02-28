// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.attestation.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JSONWebKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final JSONWebKeyArgs Empty = new JSONWebKeyArgs();

    /**
     * The &#34;alg&#34; (algorithm) parameter identifies the algorithm intended for
     * use with the key.  The values used should either be registered in the
     * IANA &#34;JSON Web Signature and Encryption Algorithms&#34; registry
     * established by [JWA] or be a value that contains a Collision-
     * Resistant Name.
     * 
     */
    @Import(name="alg")
    private @Nullable Output<String> alg;

    /**
     * @return The &#34;alg&#34; (algorithm) parameter identifies the algorithm intended for
     * use with the key.  The values used should either be registered in the
     * IANA &#34;JSON Web Signature and Encryption Algorithms&#34; registry
     * established by [JWA] or be a value that contains a Collision-
     * Resistant Name.
     * 
     */
    public Optional<Output<String>> alg() {
        return Optional.ofNullable(this.alg);
    }

    /**
     * The &#34;crv&#34; (curve) parameter identifies the curve type
     * 
     */
    @Import(name="crv")
    private @Nullable Output<String> crv;

    /**
     * @return The &#34;crv&#34; (curve) parameter identifies the curve type
     * 
     */
    public Optional<Output<String>> crv() {
        return Optional.ofNullable(this.crv);
    }

    /**
     * RSA private exponent or ECC private key
     * 
     */
    @Import(name="d")
    private @Nullable Output<String> d;

    /**
     * @return RSA private exponent or ECC private key
     * 
     */
    public Optional<Output<String>> d() {
        return Optional.ofNullable(this.d);
    }

    /**
     * RSA Private Key Parameter
     * 
     */
    @Import(name="dp")
    private @Nullable Output<String> dp;

    /**
     * @return RSA Private Key Parameter
     * 
     */
    public Optional<Output<String>> dp() {
        return Optional.ofNullable(this.dp);
    }

    /**
     * RSA Private Key Parameter
     * 
     */
    @Import(name="dq")
    private @Nullable Output<String> dq;

    /**
     * @return RSA Private Key Parameter
     * 
     */
    public Optional<Output<String>> dq() {
        return Optional.ofNullable(this.dq);
    }

    /**
     * RSA public exponent, in Base64
     * 
     */
    @Import(name="e")
    private @Nullable Output<String> e;

    /**
     * @return RSA public exponent, in Base64
     * 
     */
    public Optional<Output<String>> e() {
        return Optional.ofNullable(this.e);
    }

    /**
     * Symmetric key
     * 
     */
    @Import(name="k")
    private @Nullable Output<String> k;

    /**
     * @return Symmetric key
     * 
     */
    public Optional<Output<String>> k() {
        return Optional.ofNullable(this.k);
    }

    /**
     * The &#34;kid&#34; (key ID) parameter is used to match a specific key.  This
     * is used, for instance, to choose among a set of keys within a JWK Set
     * during key rollover.  The structure of the &#34;kid&#34; value is
     * unspecified.  When &#34;kid&#34; values are used within a JWK Set, different
     * keys within the JWK Set SHOULD use distinct &#34;kid&#34; values.  (One
     * example in which different keys might use the same &#34;kid&#34; value is if
     * they have different &#34;kty&#34; (key type) values but are considered to be
     * equivalent alternatives by the application using them.)  The &#34;kid&#34;
     * value is a case-sensitive string.
     * 
     */
    @Import(name="kid")
    private @Nullable Output<String> kid;

    /**
     * @return The &#34;kid&#34; (key ID) parameter is used to match a specific key.  This
     * is used, for instance, to choose among a set of keys within a JWK Set
     * during key rollover.  The structure of the &#34;kid&#34; value is
     * unspecified.  When &#34;kid&#34; values are used within a JWK Set, different
     * keys within the JWK Set SHOULD use distinct &#34;kid&#34; values.  (One
     * example in which different keys might use the same &#34;kid&#34; value is if
     * they have different &#34;kty&#34; (key type) values but are considered to be
     * equivalent alternatives by the application using them.)  The &#34;kid&#34;
     * value is a case-sensitive string.
     * 
     */
    public Optional<Output<String>> kid() {
        return Optional.ofNullable(this.kid);
    }

    /**
     * The &#34;kty&#34; (key type) parameter identifies the cryptographic algorithm
     * family used with the key, such as &#34;RSA&#34; or &#34;EC&#34;. &#34;kty&#34; values should
     * either be registered in the IANA &#34;JSON Web Key Types&#34; registry
     * established by [JWA] or be a value that contains a Collision-
     * Resistant Name.  The &#34;kty&#34; value is a case-sensitive string.
     * 
     */
    @Import(name="kty", required=true)
    private Output<String> kty;

    /**
     * @return The &#34;kty&#34; (key type) parameter identifies the cryptographic algorithm
     * family used with the key, such as &#34;RSA&#34; or &#34;EC&#34;. &#34;kty&#34; values should
     * either be registered in the IANA &#34;JSON Web Key Types&#34; registry
     * established by [JWA] or be a value that contains a Collision-
     * Resistant Name.  The &#34;kty&#34; value is a case-sensitive string.
     * 
     */
    public Output<String> kty() {
        return this.kty;
    }

    /**
     * RSA modulus, in Base64
     * 
     */
    @Import(name="n")
    private @Nullable Output<String> n;

    /**
     * @return RSA modulus, in Base64
     * 
     */
    public Optional<Output<String>> n() {
        return Optional.ofNullable(this.n);
    }

    /**
     * RSA secret prime
     * 
     */
    @Import(name="p")
    private @Nullable Output<String> p;

    /**
     * @return RSA secret prime
     * 
     */
    public Optional<Output<String>> p() {
        return Optional.ofNullable(this.p);
    }

    /**
     * RSA secret prime, with p &lt; q
     * 
     */
    @Import(name="q")
    private @Nullable Output<String> q;

    /**
     * @return RSA secret prime, with p &lt; q
     * 
     */
    public Optional<Output<String>> q() {
        return Optional.ofNullable(this.q);
    }

    /**
     * RSA Private Key Parameter
     * 
     */
    @Import(name="qi")
    private @Nullable Output<String> qi;

    /**
     * @return RSA Private Key Parameter
     * 
     */
    public Optional<Output<String>> qi() {
        return Optional.ofNullable(this.qi);
    }

    /**
     * Use (&#34;public key use&#34;) identifies the intended use of
     * the public key. The &#34;use&#34; parameter is employed to indicate whether
     * a public key is used for encrypting data or verifying the signature
     * on data. Values are commonly &#34;sig&#34; (signature) or &#34;enc&#34; (encryption).
     * 
     */
    @Import(name="use")
    private @Nullable Output<String> use;

    /**
     * @return Use (&#34;public key use&#34;) identifies the intended use of
     * the public key. The &#34;use&#34; parameter is employed to indicate whether
     * a public key is used for encrypting data or verifying the signature
     * on data. Values are commonly &#34;sig&#34; (signature) or &#34;enc&#34; (encryption).
     * 
     */
    public Optional<Output<String>> use() {
        return Optional.ofNullable(this.use);
    }

    /**
     * X coordinate for the Elliptic Curve point
     * 
     */
    @Import(name="x")
    private @Nullable Output<String> x;

    /**
     * @return X coordinate for the Elliptic Curve point
     * 
     */
    public Optional<Output<String>> x() {
        return Optional.ofNullable(this.x);
    }

    /**
     * The &#34;x5c&#34; (X.509 certificate chain) parameter contains a chain of one
     * or more PKIX certificates [RFC5280].  The certificate chain is
     * represented as a JSON array of certificate value strings.  Each
     * string in the array is a base64-encoded (Section 4 of [RFC4648] --
     * not base64url-encoded) DER [ITU.X690.1994] PKIX certificate value.
     * The PKIX certificate containing the key value MUST be the first
     * certificate.
     * 
     */
    @Import(name="x5c")
    private @Nullable Output<List<String>> x5c;

    /**
     * @return The &#34;x5c&#34; (X.509 certificate chain) parameter contains a chain of one
     * or more PKIX certificates [RFC5280].  The certificate chain is
     * represented as a JSON array of certificate value strings.  Each
     * string in the array is a base64-encoded (Section 4 of [RFC4648] --
     * not base64url-encoded) DER [ITU.X690.1994] PKIX certificate value.
     * The PKIX certificate containing the key value MUST be the first
     * certificate.
     * 
     */
    public Optional<Output<List<String>>> x5c() {
        return Optional.ofNullable(this.x5c);
    }

    /**
     * Y coordinate for the Elliptic Curve point
     * 
     */
    @Import(name="y")
    private @Nullable Output<String> y;

    /**
     * @return Y coordinate for the Elliptic Curve point
     * 
     */
    public Optional<Output<String>> y() {
        return Optional.ofNullable(this.y);
    }

    private JSONWebKeyArgs() {}

    private JSONWebKeyArgs(JSONWebKeyArgs $) {
        this.alg = $.alg;
        this.crv = $.crv;
        this.d = $.d;
        this.dp = $.dp;
        this.dq = $.dq;
        this.e = $.e;
        this.k = $.k;
        this.kid = $.kid;
        this.kty = $.kty;
        this.n = $.n;
        this.p = $.p;
        this.q = $.q;
        this.qi = $.qi;
        this.use = $.use;
        this.x = $.x;
        this.x5c = $.x5c;
        this.y = $.y;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JSONWebKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JSONWebKeyArgs $;

        public Builder() {
            $ = new JSONWebKeyArgs();
        }

        public Builder(JSONWebKeyArgs defaults) {
            $ = new JSONWebKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alg The &#34;alg&#34; (algorithm) parameter identifies the algorithm intended for
         * use with the key.  The values used should either be registered in the
         * IANA &#34;JSON Web Signature and Encryption Algorithms&#34; registry
         * established by [JWA] or be a value that contains a Collision-
         * Resistant Name.
         * 
         * @return builder
         * 
         */
        public Builder alg(@Nullable Output<String> alg) {
            $.alg = alg;
            return this;
        }

        /**
         * @param alg The &#34;alg&#34; (algorithm) parameter identifies the algorithm intended for
         * use with the key.  The values used should either be registered in the
         * IANA &#34;JSON Web Signature and Encryption Algorithms&#34; registry
         * established by [JWA] or be a value that contains a Collision-
         * Resistant Name.
         * 
         * @return builder
         * 
         */
        public Builder alg(String alg) {
            return alg(Output.of(alg));
        }

        /**
         * @param crv The &#34;crv&#34; (curve) parameter identifies the curve type
         * 
         * @return builder
         * 
         */
        public Builder crv(@Nullable Output<String> crv) {
            $.crv = crv;
            return this;
        }

        /**
         * @param crv The &#34;crv&#34; (curve) parameter identifies the curve type
         * 
         * @return builder
         * 
         */
        public Builder crv(String crv) {
            return crv(Output.of(crv));
        }

        /**
         * @param d RSA private exponent or ECC private key
         * 
         * @return builder
         * 
         */
        public Builder d(@Nullable Output<String> d) {
            $.d = d;
            return this;
        }

        /**
         * @param d RSA private exponent or ECC private key
         * 
         * @return builder
         * 
         */
        public Builder d(String d) {
            return d(Output.of(d));
        }

        /**
         * @param dp RSA Private Key Parameter
         * 
         * @return builder
         * 
         */
        public Builder dp(@Nullable Output<String> dp) {
            $.dp = dp;
            return this;
        }

        /**
         * @param dp RSA Private Key Parameter
         * 
         * @return builder
         * 
         */
        public Builder dp(String dp) {
            return dp(Output.of(dp));
        }

        /**
         * @param dq RSA Private Key Parameter
         * 
         * @return builder
         * 
         */
        public Builder dq(@Nullable Output<String> dq) {
            $.dq = dq;
            return this;
        }

        /**
         * @param dq RSA Private Key Parameter
         * 
         * @return builder
         * 
         */
        public Builder dq(String dq) {
            return dq(Output.of(dq));
        }

        /**
         * @param e RSA public exponent, in Base64
         * 
         * @return builder
         * 
         */
        public Builder e(@Nullable Output<String> e) {
            $.e = e;
            return this;
        }

        /**
         * @param e RSA public exponent, in Base64
         * 
         * @return builder
         * 
         */
        public Builder e(String e) {
            return e(Output.of(e));
        }

        /**
         * @param k Symmetric key
         * 
         * @return builder
         * 
         */
        public Builder k(@Nullable Output<String> k) {
            $.k = k;
            return this;
        }

        /**
         * @param k Symmetric key
         * 
         * @return builder
         * 
         */
        public Builder k(String k) {
            return k(Output.of(k));
        }

        /**
         * @param kid The &#34;kid&#34; (key ID) parameter is used to match a specific key.  This
         * is used, for instance, to choose among a set of keys within a JWK Set
         * during key rollover.  The structure of the &#34;kid&#34; value is
         * unspecified.  When &#34;kid&#34; values are used within a JWK Set, different
         * keys within the JWK Set SHOULD use distinct &#34;kid&#34; values.  (One
         * example in which different keys might use the same &#34;kid&#34; value is if
         * they have different &#34;kty&#34; (key type) values but are considered to be
         * equivalent alternatives by the application using them.)  The &#34;kid&#34;
         * value is a case-sensitive string.
         * 
         * @return builder
         * 
         */
        public Builder kid(@Nullable Output<String> kid) {
            $.kid = kid;
            return this;
        }

        /**
         * @param kid The &#34;kid&#34; (key ID) parameter is used to match a specific key.  This
         * is used, for instance, to choose among a set of keys within a JWK Set
         * during key rollover.  The structure of the &#34;kid&#34; value is
         * unspecified.  When &#34;kid&#34; values are used within a JWK Set, different
         * keys within the JWK Set SHOULD use distinct &#34;kid&#34; values.  (One
         * example in which different keys might use the same &#34;kid&#34; value is if
         * they have different &#34;kty&#34; (key type) values but are considered to be
         * equivalent alternatives by the application using them.)  The &#34;kid&#34;
         * value is a case-sensitive string.
         * 
         * @return builder
         * 
         */
        public Builder kid(String kid) {
            return kid(Output.of(kid));
        }

        /**
         * @param kty The &#34;kty&#34; (key type) parameter identifies the cryptographic algorithm
         * family used with the key, such as &#34;RSA&#34; or &#34;EC&#34;. &#34;kty&#34; values should
         * either be registered in the IANA &#34;JSON Web Key Types&#34; registry
         * established by [JWA] or be a value that contains a Collision-
         * Resistant Name.  The &#34;kty&#34; value is a case-sensitive string.
         * 
         * @return builder
         * 
         */
        public Builder kty(Output<String> kty) {
            $.kty = kty;
            return this;
        }

        /**
         * @param kty The &#34;kty&#34; (key type) parameter identifies the cryptographic algorithm
         * family used with the key, such as &#34;RSA&#34; or &#34;EC&#34;. &#34;kty&#34; values should
         * either be registered in the IANA &#34;JSON Web Key Types&#34; registry
         * established by [JWA] or be a value that contains a Collision-
         * Resistant Name.  The &#34;kty&#34; value is a case-sensitive string.
         * 
         * @return builder
         * 
         */
        public Builder kty(String kty) {
            return kty(Output.of(kty));
        }

        /**
         * @param n RSA modulus, in Base64
         * 
         * @return builder
         * 
         */
        public Builder n(@Nullable Output<String> n) {
            $.n = n;
            return this;
        }

        /**
         * @param n RSA modulus, in Base64
         * 
         * @return builder
         * 
         */
        public Builder n(String n) {
            return n(Output.of(n));
        }

        /**
         * @param p RSA secret prime
         * 
         * @return builder
         * 
         */
        public Builder p(@Nullable Output<String> p) {
            $.p = p;
            return this;
        }

        /**
         * @param p RSA secret prime
         * 
         * @return builder
         * 
         */
        public Builder p(String p) {
            return p(Output.of(p));
        }

        /**
         * @param q RSA secret prime, with p &lt; q
         * 
         * @return builder
         * 
         */
        public Builder q(@Nullable Output<String> q) {
            $.q = q;
            return this;
        }

        /**
         * @param q RSA secret prime, with p &lt; q
         * 
         * @return builder
         * 
         */
        public Builder q(String q) {
            return q(Output.of(q));
        }

        /**
         * @param qi RSA Private Key Parameter
         * 
         * @return builder
         * 
         */
        public Builder qi(@Nullable Output<String> qi) {
            $.qi = qi;
            return this;
        }

        /**
         * @param qi RSA Private Key Parameter
         * 
         * @return builder
         * 
         */
        public Builder qi(String qi) {
            return qi(Output.of(qi));
        }

        /**
         * @param use Use (&#34;public key use&#34;) identifies the intended use of
         * the public key. The &#34;use&#34; parameter is employed to indicate whether
         * a public key is used for encrypting data or verifying the signature
         * on data. Values are commonly &#34;sig&#34; (signature) or &#34;enc&#34; (encryption).
         * 
         * @return builder
         * 
         */
        public Builder use(@Nullable Output<String> use) {
            $.use = use;
            return this;
        }

        /**
         * @param use Use (&#34;public key use&#34;) identifies the intended use of
         * the public key. The &#34;use&#34; parameter is employed to indicate whether
         * a public key is used for encrypting data or verifying the signature
         * on data. Values are commonly &#34;sig&#34; (signature) or &#34;enc&#34; (encryption).
         * 
         * @return builder
         * 
         */
        public Builder use(String use) {
            return use(Output.of(use));
        }

        /**
         * @param x X coordinate for the Elliptic Curve point
         * 
         * @return builder
         * 
         */
        public Builder x(@Nullable Output<String> x) {
            $.x = x;
            return this;
        }

        /**
         * @param x X coordinate for the Elliptic Curve point
         * 
         * @return builder
         * 
         */
        public Builder x(String x) {
            return x(Output.of(x));
        }

        /**
         * @param x5c The &#34;x5c&#34; (X.509 certificate chain) parameter contains a chain of one
         * or more PKIX certificates [RFC5280].  The certificate chain is
         * represented as a JSON array of certificate value strings.  Each
         * string in the array is a base64-encoded (Section 4 of [RFC4648] --
         * not base64url-encoded) DER [ITU.X690.1994] PKIX certificate value.
         * The PKIX certificate containing the key value MUST be the first
         * certificate.
         * 
         * @return builder
         * 
         */
        public Builder x5c(@Nullable Output<List<String>> x5c) {
            $.x5c = x5c;
            return this;
        }

        /**
         * @param x5c The &#34;x5c&#34; (X.509 certificate chain) parameter contains a chain of one
         * or more PKIX certificates [RFC5280].  The certificate chain is
         * represented as a JSON array of certificate value strings.  Each
         * string in the array is a base64-encoded (Section 4 of [RFC4648] --
         * not base64url-encoded) DER [ITU.X690.1994] PKIX certificate value.
         * The PKIX certificate containing the key value MUST be the first
         * certificate.
         * 
         * @return builder
         * 
         */
        public Builder x5c(List<String> x5c) {
            return x5c(Output.of(x5c));
        }

        /**
         * @param x5c The &#34;x5c&#34; (X.509 certificate chain) parameter contains a chain of one
         * or more PKIX certificates [RFC5280].  The certificate chain is
         * represented as a JSON array of certificate value strings.  Each
         * string in the array is a base64-encoded (Section 4 of [RFC4648] --
         * not base64url-encoded) DER [ITU.X690.1994] PKIX certificate value.
         * The PKIX certificate containing the key value MUST be the first
         * certificate.
         * 
         * @return builder
         * 
         */
        public Builder x5c(String... x5c) {
            return x5c(List.of(x5c));
        }

        /**
         * @param y Y coordinate for the Elliptic Curve point
         * 
         * @return builder
         * 
         */
        public Builder y(@Nullable Output<String> y) {
            $.y = y;
            return this;
        }

        /**
         * @param y Y coordinate for the Elliptic Curve point
         * 
         * @return builder
         * 
         */
        public Builder y(String y) {
            return y(Output.of(y));
        }

        public JSONWebKeyArgs build() {
            $.kty = Objects.requireNonNull($.kty, "expected parameter 'kty' to be non-null");
            return $;
        }
    }

}
