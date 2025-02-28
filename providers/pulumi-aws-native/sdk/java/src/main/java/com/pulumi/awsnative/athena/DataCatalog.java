// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.athena;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.athena.DataCatalogArgs;
import com.pulumi.awsnative.athena.enums.DataCatalogType;
import com.pulumi.awsnative.athena.outputs.DataCatalogTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::Athena::DataCatalog
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:athena:DataCatalog")
public class DataCatalog extends com.pulumi.resources.CustomResource {
    /**
     * A description of the data catalog to be created.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the data catalog to be created.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name of the data catalog to create. The catalog name must be unique for the AWS account and can use a maximum of 128 alphanumeric, underscore, at sign, or hyphen characters.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the data catalog to create. The catalog name must be unique for the AWS account and can use a maximum of 128 alphanumeric, underscore, at sign, or hyphen characters.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the Lambda function or functions to use for creating the data catalog. This is a mapping whose values depend on the catalog type.
     * 
     */
    @Export(name="parameters", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> parameters;

    /**
     * @return Specifies the Lambda function or functions to use for creating the data catalog. This is a mapping whose values depend on the catalog type.
     * 
     */
    public Output<Optional<Object>> parameters() {
        return Codegen.optional(this.parameters);
    }
    /**
     * A list of comma separated tags to add to the data catalog that is created.
     * 
     */
    @Export(name="tags", type=List.class, parameters={DataCatalogTag.class})
    private Output</* @Nullable */ List<DataCatalogTag>> tags;

    /**
     * @return A list of comma separated tags to add to the data catalog that is created.
     * 
     */
    public Output<Optional<List<DataCatalogTag>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The type of data catalog to create: LAMBDA for a federated catalog, GLUE for AWS Glue Catalog, or HIVE for an external hive metastore.
     * 
     */
    @Export(name="type", type=DataCatalogType.class, parameters={})
    private Output<DataCatalogType> type;

    /**
     * @return The type of data catalog to create: LAMBDA for a federated catalog, GLUE for AWS Glue Catalog, or HIVE for an external hive metastore.
     * 
     */
    public Output<DataCatalogType> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DataCatalog(String name) {
        this(name, DataCatalogArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DataCatalog(String name, DataCatalogArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataCatalog(String name, DataCatalogArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:athena:DataCatalog", name, args == null ? DataCatalogArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DataCatalog(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:athena:DataCatalog", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static DataCatalog get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DataCatalog(name, id, options);
    }
}
