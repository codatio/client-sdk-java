/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.platform.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import io.codat.platform.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;

/**
 * PathParamDataType - Data types that support supplemental data
 */
public enum PathParamDataType {
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

    private PathParamDataType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}