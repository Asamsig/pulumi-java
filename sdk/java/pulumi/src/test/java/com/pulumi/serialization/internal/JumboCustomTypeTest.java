package com.pulumi.serialization.internal;

import com.google.protobuf.Struct;
import com.google.protobuf.Value;
import com.pulumi.Log;
import com.pulumi.test.internal.PulumiTestInternal;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class JumboCustomTypeTest {

    private final static Log log = PulumiTestInternal.mockLog();

    @Test
    void testJumboCustomTypeDeserialization() {
        var deserializer = new Deserializer(log);
        var converter = new Converter(log, deserializer);
        var value = Value.newBuilder()
                .setStructValue(Struct.newBuilder()
                        .putFields("bar1", Value.newBuilder().setStringValue("bar1").build())
                        .build())
                .build();
        var data = converter.convertValue(
            "testJumboCustomType", value, JumboCustomType.class
        );
        var o = data.getValueNullable();
        assertThat(o).isNotNull();
        assertThat(o.bar1()).hasValue("bar1");
    }

}
