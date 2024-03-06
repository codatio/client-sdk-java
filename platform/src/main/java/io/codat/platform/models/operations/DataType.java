/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.platform.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.platform.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * DataType - Data types that support supplemental data
 */
public enum DataType {
    CHART_OF_ACCOUNTS("chartOfAccounts"),
    BILLS("bills"),
    COMPANY("company"),
    CREDIT_NOTES("creditNotes"),
    CUSTOMERS("customers"),
    INVOICES("invoices"),
    ITEMS("items"),
    JOURNAL_ENTRIES("journalEntries"),
    SUPPLIERS("suppliers"),
    TAX_RATES("taxRates"),
    COMMERCE_COMPANY_INFO("commerce-companyInfo"),
    COMMERCE_CUSTOMERS("commerce-customers"),
    COMMERCE_DISPUTES("commerce-disputes"),
    COMMERCE_LOCATIONS("commerce-locations"),
    COMMERCE_ORDERS("commerce-orders"),
    COMMERCE_PAYMENTS("commerce-payments"),
    COMMERCE_PAYMENT_METHODS("commerce-paymentMethods"),
    COMMERCE_PRODUCTS("commerce-products"),
    COMMERCE_PRODUCT_CATEGORIES("commerce-productCategories"),
    COMMERCE_TAX_COMPONENTS("commerce-taxComponents"),
    COMMERCE_TRANSACTIONS("commerce-transactions");

    @JsonValue
    private final String value;

    private DataType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
