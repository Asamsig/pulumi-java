// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vision_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.vision_v1.outputs.NormalizedVertexResponse;
import com.pulumi.googlenative.vision_v1.outputs.VertexResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class BoundingPolyResponse {
    /**
     * @return The bounding polygon normalized vertices.
     * 
     */
    private final List<NormalizedVertexResponse> normalizedVertices;
    /**
     * @return The bounding polygon vertices.
     * 
     */
    private final List<VertexResponse> vertices;

    @CustomType.Constructor
    private BoundingPolyResponse(
        @CustomType.Parameter("normalizedVertices") List<NormalizedVertexResponse> normalizedVertices,
        @CustomType.Parameter("vertices") List<VertexResponse> vertices) {
        this.normalizedVertices = normalizedVertices;
        this.vertices = vertices;
    }

    /**
     * @return The bounding polygon normalized vertices.
     * 
     */
    public List<NormalizedVertexResponse> normalizedVertices() {
        return this.normalizedVertices;
    }
    /**
     * @return The bounding polygon vertices.
     * 
     */
    public List<VertexResponse> vertices() {
        return this.vertices;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BoundingPolyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<NormalizedVertexResponse> normalizedVertices;
        private List<VertexResponse> vertices;

        public Builder() {
    	      // Empty
        }

        public Builder(BoundingPolyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.normalizedVertices = defaults.normalizedVertices;
    	      this.vertices = defaults.vertices;
        }

        public Builder normalizedVertices(List<NormalizedVertexResponse> normalizedVertices) {
            this.normalizedVertices = Objects.requireNonNull(normalizedVertices);
            return this;
        }
        public Builder normalizedVertices(NormalizedVertexResponse... normalizedVertices) {
            return normalizedVertices(List.of(normalizedVertices));
        }
        public Builder vertices(List<VertexResponse> vertices) {
            this.vertices = Objects.requireNonNull(vertices);
            return this;
        }
        public Builder vertices(VertexResponse... vertices) {
            return vertices(List.of(vertices));
        }        public BoundingPolyResponse build() {
            return new BoundingPolyResponse(normalizedVertices, vertices);
        }
    }
}
