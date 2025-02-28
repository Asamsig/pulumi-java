// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.machinelearningservices.MachineLearningDatastoreArgs;
import com.pulumi.azurenative.machinelearningservices.outputs.DatastoreResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.IdentityResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.SkuResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Machine Learning datastore object wrapped into ARM resource envelope.
 * API Version: 2020-05-01-preview.
 * 
 * ## Example Usage
 * ### Create ADLS  Datastore
 * 
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
 *         var machineLearningDatastore = new MachineLearningDatastore(&#34;machineLearningDatastore&#34;, MachineLearningDatastoreArgs.builder()        
 *             .clientId(&#34;233d7008-b157-4354-88d1-ba191f06a900&#34;)
 *             .clientSecret(&#34;vdvgdvdvdv&#34;)
 *             .dataStoreType(&#34;adls&#34;)
 *             .datastoreName(&#34;adlsDatastore&#34;)
 *             .resourceGroupName(&#34;acjain-mleastUS2&#34;)
 *             .storeName(&#34;stanley&#34;)
 *             .tenantId(&#34;72f988bf-86f1-41af-91ab-2d7cd011db47&#34;)
 *             .workspaceName(&#34;acjain-mleastUS2&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Create ADLS Gen2 Datastore
 * 
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
 *         var machineLearningDatastore = new MachineLearningDatastore(&#34;machineLearningDatastore&#34;, MachineLearningDatastoreArgs.builder()        
 *             .accountName(&#34;nicksadlsgen2storage&#34;)
 *             .clientId(&#34;233d7008-b157-4354-88d1-ba191f06a900&#34;)
 *             .clientSecret(&#34;vdegbvedgeg&#34;)
 *             .dataStoreType(&#34;adls-gen2&#34;)
 *             .datastoreName(&#34;adlsgen2Datastore&#34;)
 *             .fileSystem(&#34;testfs1&#34;)
 *             .resourceGroupName(&#34;acjain-mleastUS2&#34;)
 *             .tenantId(&#34;72f988bf-86f1-41af-91ab-2d7cd011db47&#34;)
 *             .workspaceName(&#34;acjain-mleastUS2&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Create Blob Datastore
 * 
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
 *         var machineLearningDatastore = new MachineLearningDatastore(&#34;machineLearningDatastore&#34;, MachineLearningDatastoreArgs.builder()        
 *             .accountKey(&#34;wddrfewfewsgewgrrwegwreg&#34;)
 *             .accountName(&#34;acjainmleastus9484093746&#34;)
 *             .containerName(&#34;azureml-blobstore-5da947c5-53aa-41a5-bb2b-074074e73b7&#34;)
 *             .dataStoreType(&#34;blob&#34;)
 *             .datastoreName(&#34;blobDatastore&#34;)
 *             .resourceGroupName(&#34;acjain-mleastUS2&#34;)
 *             .workspaceName(&#34;acjain-mleastUS2&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Create Databricks File System Datastore
 * 
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
 *         var machineLearningDatastore = new MachineLearningDatastore(&#34;machineLearningDatastore&#34;, MachineLearningDatastoreArgs.builder()        
 *             .dataStoreType(&#34;dbfs&#34;)
 *             .datastoreName(&#34;blobDatastore&#34;)
 *             .resourceGroupName(&#34;acjain-mleastUS2&#34;)
 *             .workspaceName(&#34;acjain-mleastUS2&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Create File Datastore
 * 
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
 *         var machineLearningDatastore = new MachineLearningDatastore(&#34;machineLearningDatastore&#34;, MachineLearningDatastoreArgs.builder()        
 *             .accountKey(&#34;wddrfewfewsgewgrrwegwreg&#34;)
 *             .accountName(&#34;acjainmleastus9484093746&#34;)
 *             .dataStoreType(&#34;file&#34;)
 *             .datastoreName(&#34;fileDatastore&#34;)
 *             .resourceGroupName(&#34;acjain-mleastUS2&#34;)
 *             .shareName(&#34;azureml-filestore-5da947c5-53aa-41a5-bb2b-074074e73b76&#34;)
 *             .workspaceName(&#34;acjain-mleastUS2&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Create MySQL Datastore
 * 
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
 *         var machineLearningDatastore = new MachineLearningDatastore(&#34;machineLearningDatastore&#34;, MachineLearningDatastoreArgs.builder()        
 *             .dataStoreType(&#34;mysqldb&#34;)
 *             .databaseName(&#34;dataset&#34;)
 *             .datastoreName(&#34;mySqlDatastore&#34;)
 *             .password(&#34;&lt;password&gt;&#34;)
 *             .resourceGroupName(&#34;acjain-mleastUS2&#34;)
 *             .serverName(&#34;dataset-mysql-srv&#34;)
 *             .userId(&#34;demo_user@dataset-mysql-srv&#34;)
 *             .workspaceName(&#34;acjain-mleastUS2&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Create PostgreSQL Datastore
 * 
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
 *         var machineLearningDatastore = new MachineLearningDatastore(&#34;machineLearningDatastore&#34;, MachineLearningDatastoreArgs.builder()        
 *             .dataStoreType(&#34;psqldb&#34;)
 *             .databaseName(&#34;dataset&#34;)
 *             .datastoreName(&#34;postgreSqlDatastore&#34;)
 *             .password(&#34;&lt;password&gt;&#34;)
 *             .resourceGroupName(&#34;acjain-mleastUS2&#34;)
 *             .serverName(&#34;dataset-pgsql-srv&#34;)
 *             .userId(&#34;demo_user@dataset-pgsql-srv&#34;)
 *             .workspaceName(&#34;acjain-mleastUS2&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Create SQL Datastore
 * 
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
 *         var machineLearningDatastore = new MachineLearningDatastore(&#34;machineLearningDatastore&#34;, MachineLearningDatastoreArgs.builder()        
 *             .dataStoreType(&#34;sqldb&#34;)
 *             .databaseName(&#34;dataset&#34;)
 *             .datastoreName(&#34;sqlDatastore&#34;)
 *             .password(&#34;&lt;password&gt;&#34;)
 *             .resourceGroupName(&#34;acjain-mleastUS2&#34;)
 *             .serverName(&#34;dataset-azsql-srv&#34;)
 *             .userName(&#34;demo_user&#34;)
 *             .workspaceName(&#34;acjain-mleastUS2&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:machinelearningservices:MachineLearningDatastore sqlDatastore /subscriptions/35f16a99-532a-4a47-9e93-00305f6c40f2/resourceGroups/acjain-mleastUS2/providers/Microsoft.MachineLearningServices/workspaces/acjain-mleastUS2/datastores/sqlDatastore 
 * ```
 * 
 */
@ResourceType(type="azure-native:machinelearningservices:MachineLearningDatastore")
public class MachineLearningDatastore extends com.pulumi.resources.CustomResource {
    /**
     * The identity of the resource.
     * 
     */
    @Export(name="identity", type=IdentityResponse.class, parameters={})
    private Output</* @Nullable */ IdentityResponse> identity;

    /**
     * @return The identity of the resource.
     * 
     */
    public Output<Optional<IdentityResponse>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * Specifies the location of the resource.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Specifies the location of the resource.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * Specifies the name of the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Datastore properties
     * 
     */
    @Export(name="properties", type=DatastoreResponse.class, parameters={})
    private Output<DatastoreResponse> properties;

    /**
     * @return Datastore properties
     * 
     */
    public Output<DatastoreResponse> properties() {
        return this.properties;
    }
    /**
     * The sku of the workspace.
     * 
     */
    @Export(name="sku", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> sku;

    /**
     * @return The sku of the workspace.
     * 
     */
    public Output<Optional<SkuResponse>> sku() {
        return Codegen.optional(this.sku);
    }
    /**
     * Contains resource tags defined as key/value pairs.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Contains resource tags defined as key/value pairs.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Specifies the type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Specifies the type of the resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MachineLearningDatastore(String name) {
        this(name, MachineLearningDatastoreArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MachineLearningDatastore(String name, MachineLearningDatastoreArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MachineLearningDatastore(String name, MachineLearningDatastoreArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:machinelearningservices:MachineLearningDatastore", name, args == null ? MachineLearningDatastoreArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MachineLearningDatastore(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:machinelearningservices:MachineLearningDatastore", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:machinelearningservices/v20200501preview:MachineLearningDatastore").build()),
                Output.of(Alias.builder().type("azure-native:machinelearningservices/v20210301preview:MachineLearningDatastore").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static MachineLearningDatastore get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MachineLearningDatastore(name, id, options);
    }
}
