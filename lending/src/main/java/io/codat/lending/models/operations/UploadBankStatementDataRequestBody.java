/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.operations;


import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.codat.lending.models.shared.BankingAccount;
import io.codat.lending.models.shared.BankingTransactions;
import io.codat.lending.utils.OneOfDeserializer;
import io.codat.lending.utils.TypedObject;
import io.codat.lending.utils.Utils.JsonShape;
import io.codat.lending.utils.Utils.TypeReferenceWithShape;
import io.codat.lending.utils.Utils;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;


@JsonDeserialize(using = UploadBankStatementDataRequestBody._Deserializer.class)
public class UploadBankStatementDataRequestBody {

    @JsonValue
    private TypedObject value;
    
    private UploadBankStatementDataRequestBody(TypedObject value) {
        this.value = value;
    }

    public static UploadBankStatementDataRequestBody of(BankingAccount value) {
        Utils.checkNotNull(value, "value");
        return new UploadBankStatementDataRequestBody(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<BankingAccount>(){}));
    }

    public static UploadBankStatementDataRequestBody of(BankingTransactions value) {
        Utils.checkNotNull(value, "value");
        return new UploadBankStatementDataRequestBody(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<BankingTransactions>(){}));
    }

    public static UploadBankStatementDataRequestBody of(Object value) {
        Utils.checkNotNull(value, "value");
        return new UploadBankStatementDataRequestBody(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Object>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code io.codat.lending.models.shared.BankingAccount}</li>
     * <li>{@code io.codat.lending.models.shared.BankingTransactions}</li>
     * <li>{@code java.lang.Object}</li>
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
        UploadBankStatementDataRequestBody other = (UploadBankStatementDataRequestBody) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<UploadBankStatementDataRequestBody> {

        public _Deserializer() {
            super(UploadBankStatementDataRequestBody.class, false,
                  TypeReferenceWithShape.of(new TypeReference<Object>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<BankingAccount>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<BankingTransactions>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(UploadBankStatementDataRequestBody.class,
                "value", value);
    }
 
}
