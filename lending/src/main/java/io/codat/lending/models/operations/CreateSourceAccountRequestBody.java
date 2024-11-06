/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.operations;


import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.codat.lending.models.shared.SourceAccount;
import io.codat.lending.models.shared.SourceAccountV2;
import io.codat.lending.utils.OneOfDeserializer;
import io.codat.lending.utils.TypedObject;
import io.codat.lending.utils.Utils.JsonShape;
import io.codat.lending.utils.Utils.TypeReferenceWithShape;
import io.codat.lending.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;


@JsonDeserialize(using = CreateSourceAccountRequestBody._Deserializer.class)
public class CreateSourceAccountRequestBody {

    @JsonValue
    private TypedObject value;
    
    private CreateSourceAccountRequestBody(TypedObject value) {
        this.value = value;
    }

    public static CreateSourceAccountRequestBody of(SourceAccountV2 value) {
        Utils.checkNotNull(value, "value");
        return new CreateSourceAccountRequestBody(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceAccountV2>(){}));
    }

    public static CreateSourceAccountRequestBody of(SourceAccount value) {
        Utils.checkNotNull(value, "value");
        return new CreateSourceAccountRequestBody(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceAccount>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code io.codat.lending.models.shared.SourceAccountV2}</li>
     * <li>{@code io.codat.lending.models.shared.SourceAccount}</li>
     * </ul>
     * 
     * <p>Use {@code instanceof} to determine what type is returned. For example:
     * 
     * <pre>
     * if (obj.value() instanceof String) {
     *     String answer = (String) obj.value();
     *     System.out.println("answer=" + answer);
     * }
     * </pre>
     * 
     * @return value of oneOf type
     **/ 
    public java.lang.Object value() {
        return value.value();
    }    
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateSourceAccountRequestBody other = (CreateSourceAccountRequestBody) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<CreateSourceAccountRequestBody> {

        public _Deserializer() {
            super(CreateSourceAccountRequestBody.class, false,
                  TypeReferenceWithShape.of(new TypeReference<SourceAccountV2>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<SourceAccount>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateSourceAccountRequestBody.class,
                "value", value);
    }
 
}
