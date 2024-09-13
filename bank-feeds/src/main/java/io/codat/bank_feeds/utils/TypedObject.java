/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.bank_feeds.utils;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import io.codat.bank_feeds.utils.Utils.JsonShape;

@JsonSerialize(using = TypedObject.Serializer.class)
public class TypedObject {

    private final Object value;
    private final TypeReference<?> typeReference;
    private final JsonShape shape;

    private TypedObject(Object value, JsonShape shape, TypeReference<?> typeReference) {
        this.value = value;
        this.shape = shape;
        this.typeReference = typeReference;
    }

    public Object value() {
        return value;
    }

    public TypeReference<?> typeReference() {
        return typeReference;
    }

    public JsonShape shape() {
        return shape;
    }

    public static <T> TypedObject of(T value, JsonShape shape, TypeReference<T> typeReference) {
        return new TypedObject(value, shape, typeReference);
    }

    public static final class Serializer extends StdSerializer<TypedObject> {

        private static final long serialVersionUID = -1;
        
        public Serializer() {
            super(TypedObject.class);
        }

        @Override
        public void serialize(TypedObject value, JsonGenerator gen, SerializerProvider provider) throws IOException {
            Object o = Utils.convertToShape(value.value(),value.shape(), value.typeReference());
            provider.defaultSerializeValue(o, gen);
        }

    }
}
