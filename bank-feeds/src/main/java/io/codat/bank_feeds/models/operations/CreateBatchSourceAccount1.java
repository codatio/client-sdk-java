/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.bank_feeds.models.operations;


import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.codat.bank_feeds.models.components.SourceAccountBatchCreateResponse;
import io.codat.bank_feeds.models.components.SourceAccountBatchErrorResponse;
import io.codat.bank_feeds.models.components.SourceAccountV2BatchCreateResponse;
import io.codat.bank_feeds.utils.OneOfDeserializer;
import io.codat.bank_feeds.utils.TypedObject;
import io.codat.bank_feeds.utils.Utils.JsonShape;
import io.codat.bank_feeds.utils.Utils.TypeReferenceWithShape;
import io.codat.bank_feeds.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;


@JsonDeserialize(using = CreateBatchSourceAccount1._Deserializer.class)
public class CreateBatchSourceAccount1 {

    @JsonValue
    private TypedObject value;
    
    private CreateBatchSourceAccount1(TypedObject value) {
        this.value = value;
    }

    public static CreateBatchSourceAccount1 of(SourceAccountV2BatchCreateResponse value) {
        Utils.checkNotNull(value, "value");
        return new CreateBatchSourceAccount1(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceAccountV2BatchCreateResponse>(){}));
    }

    public static CreateBatchSourceAccount1 of(SourceAccountBatchCreateResponse value) {
        Utils.checkNotNull(value, "value");
        return new CreateBatchSourceAccount1(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceAccountBatchCreateResponse>(){}));
    }

    public static CreateBatchSourceAccount1 of(SourceAccountBatchErrorResponse value) {
        Utils.checkNotNull(value, "value");
        return new CreateBatchSourceAccount1(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceAccountBatchErrorResponse>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code io.codat.bank_feeds.models.components.SourceAccountV2BatchCreateResponse}</li>
     * <li>{@code io.codat.bank_feeds.models.components.SourceAccountBatchCreateResponse}</li>
     * <li>{@code io.codat.bank_feeds.models.components.SourceAccountBatchErrorResponse}</li>
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
        CreateBatchSourceAccount1 other = (CreateBatchSourceAccount1) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<CreateBatchSourceAccount1> {

        public _Deserializer() {
            super(CreateBatchSourceAccount1.class, false,
                  TypeReferenceWithShape.of(new TypeReference<SourceAccountBatchErrorResponse>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<SourceAccountBatchCreateResponse>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<SourceAccountV2BatchCreateResponse>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateBatchSourceAccount1.class,
                "value", value);
    }
 
}