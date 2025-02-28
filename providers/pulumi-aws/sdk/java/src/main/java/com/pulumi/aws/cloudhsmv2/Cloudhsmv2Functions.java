// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudhsmv2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.cloudhsmv2.inputs.GetClusterArgs;
import com.pulumi.aws.cloudhsmv2.inputs.GetClusterPlainArgs;
import com.pulumi.aws.cloudhsmv2.outputs.GetClusterResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class Cloudhsmv2Functions {
    /**
     * Use this data source to get information about a CloudHSM v2 cluster
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var cluster = Output.of(Cloudhsmv2Functions.getCluster(GetClusterArgs.builder()
     *             .clusterId(&#34;cluster-testclusterid&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetClusterResult> getCluster(GetClusterArgs args) {
        return getCluster(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get information about a CloudHSM v2 cluster
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var cluster = Output.of(Cloudhsmv2Functions.getCluster(GetClusterArgs.builder()
     *             .clusterId(&#34;cluster-testclusterid&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetClusterResult> getClusterPlain(GetClusterPlainArgs args) {
        return getClusterPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get information about a CloudHSM v2 cluster
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var cluster = Output.of(Cloudhsmv2Functions.getCluster(GetClusterArgs.builder()
     *             .clusterId(&#34;cluster-testclusterid&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static Output<GetClusterResult> getCluster(GetClusterArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:cloudhsmv2/getCluster:getCluster", TypeShape.of(GetClusterResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get information about a CloudHSM v2 cluster
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var cluster = Output.of(Cloudhsmv2Functions.getCluster(GetClusterArgs.builder()
     *             .clusterId(&#34;cluster-testclusterid&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetClusterResult> getClusterPlain(GetClusterPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:cloudhsmv2/getCluster:getCluster", TypeShape.of(GetClusterResult.class), args, Utilities.withVersion(options));
    }
}
