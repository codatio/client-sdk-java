/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.platform.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * DataType - Available data types
 */
public enum DataType {
    ACCOUNT_TRANSACTIONS("accountTransactions"),
    BALANCE_SHEET("balanceSheet"),
    BANK_ACCOUNTS("bankAccounts"),
    BANK_TRANSACTIONS("bankTransactions"),
    BILL_CREDIT_NOTES("billCreditNotes"),
    BILL_PAYMENTS("billPayments"),
    BILLS("bills"),
    CASH_FLOW_STATEMENT("cashFlowStatement"),
    CHART_OF_ACCOUNTS("chartOfAccounts"),
    COMPANY("company"),
    CREDIT_NOTES("creditNotes"),
    CUSTOMERS("customers"),
    DIRECT_COSTS("directCosts"),
    DIRECT_INCOMES("directIncomes"),
    INVOICES("invoices"),
    ITEM_RECEIPTS("itemReceipts"),
    ITEMS("items"),
    JOURNAL_ENTRIES("journalEntries"),
    JOURNALS("journals"),
    PAYMENT_METHODS("paymentMethods"),
    PAYMENTS("payments"),
    PROFIT_AND_LOSS("profitAndLoss"),
    PURCHASE_ORDERS("purchaseOrders"),
    SALES_ORDERS("salesOrders"),
    SUPPLIERS("suppliers"),
    TAX_RATES("taxRates"),
    TRACKING_CATEGORIES("trackingCategories"),
    TRANSFERS("transfers"),
    BANKING_ACCOUNT_BALANCES("banking-accountBalances"),
    BANKING_ACCOUNTS("banking-accounts"),
    BANKING_TRANSACTION_CATEGORIES("banking-transactionCategories"),
    BANKING_TRANSACTIONS("banking-transactions"),
    COMMERCE_COMPANY_INFO("commerce-companyInfo"),
    COMMERCE_CUSTOMERS("commerce-customers"),
    COMMERCE_DISPUTES("commerce-disputes"),
    COMMERCE_LOCATIONS("commerce-locations"),
    COMMERCE_ORDERS("commerce-orders"),
    COMMERCE_PAYMENT_METHODS("commerce-paymentMethods"),
    COMMERCE_PAYMENTS("commerce-payments"),
    COMMERCE_PRODUCT_CATEGORIES("commerce-productCategories"),
    COMMERCE_PRODUCTS("commerce-products"),
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
