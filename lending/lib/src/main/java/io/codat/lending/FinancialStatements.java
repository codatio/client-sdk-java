/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending;

import io.codat.lending.models.operations.SDKMethodInterfaces.*;
import io.codat.lending.utils.Utils;
import java.io.InputStream;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

public class FinancialStatements {
    
    private final SDKConfiguration sdkConfiguration;
    private final CodatLendingFinancialStatementsAccounts accounts;
    private final BalanceSheet balanceSheet;
    private final CashFlow cashFlow;
    private final ProfitAndLoss profitAndLoss;

    FinancialStatements(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
        this.accounts = new CodatLendingFinancialStatementsAccounts(this.sdkConfiguration);
        this.balanceSheet = new BalanceSheet(this.sdkConfiguration);
        this.cashFlow = new CashFlow(this.sdkConfiguration);
        this.profitAndLoss = new ProfitAndLoss(this.sdkConfiguration);
    }

    public final CodatLendingFinancialStatementsAccounts accounts() {
        return accounts;
    }

    public final BalanceSheet balanceSheet() {
        return balanceSheet;
    }

    public final CashFlow cashFlow() {
        return cashFlow;
    }

    public final ProfitAndLoss profitAndLoss() {
        return profitAndLoss;
    }
}
