/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.bank_feeds.models.operations;


import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.codat.bank_feeds.models.components.SourceAccount;
import io.codat.bank_feeds.models.components.SourceAccountV2;
import io.codat.bank_feeds.utils.OneOfDeserializer;
import io.codat.bank_feeds.utils.TypedObject;
import io.codat.bank_feeds.utils.Utils.JsonShape;
import io.codat.bank_feeds.utils.Utils.TypeReferenceWithShape;
import io.codat.bank_feeds.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * CreateSourceAccountResponseBody - Success
 */

@JsonDeserialize(using = CreateSourceAccountResponseBody._Deserializer.class)
public class CreateSourceAccountResponseBody {

    @JsonValue
    private TypedObject value;
    
    private CreateSourceAccountResponseBody(TypedObject value) {
        this.value = value;
    }

    public static CreateSourceAccountResponseBody of(SourceAccountV2 value) {
        Utils.checkNotNull(value, "value");
        return new CreateSourceAccountResponseBody(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceAccountV2>(){}));
    }

    public static CreateSourceAccountResponseBody of(SourceAccount value) {
        Utils.checkNotNull(value, "value");
        return new CreateSourceAccountResponseBody(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceAccount>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code io.codat.bank_feeds.models.components.SourceAccountV2}</li>
     * <li>{@code io.codat.bank_feeds.models.components.SourceAccount}</li>
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
        CreateSourceAccountResponseBody other = (CreateSourceAccountResponseBody) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<CreateSourceAccountResponseBody> {

        public _Deserializer() {
            super(CreateSourceAccountResponseBody.class, false,
                  TypeReferenceWithShape.of(new TypeReference<io.codat.bank_feeds.models.components.SourceAccountV2>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<io.codat.bank_feeds.models.components.SourceAccount>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateSourceAccountResponseBody.class,
                "value", value);
    }
 
}
