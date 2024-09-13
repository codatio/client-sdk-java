/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.lending.utils.LazySingletonValue;
import io.codat.lending.utils.SpeakeasyMetadata;
import io.codat.lending.utils.Utils;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class ListAccountingBankAccountTransactionsRequest {

    /**
     * Unique identifier for an account.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=accountId")
    private String accountId;

    /**
     * Unique identifier for a company.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=companyId")
    private String companyId;

    /**
     * Unique identifier for a connection.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connectionId")
    private String connectionId;

    /**
     * Field to order results by. [Read more](https://docs.codat.io/using-the-api/ordering-results).
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=orderBy")
    private Optional<String> orderBy;

    /**
     * Page number. [Read more](https://docs.codat.io/using-the-api/paging).
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page")
    private Optional<Integer> page;

    /**
     * Number of records to return in a page. [Read more](https://docs.codat.io/using-the-api/paging).
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=pageSize")
    private Optional<Integer> pageSize;

    /**
     * Codat query string. [Read more](https://docs.codat.io/using-the-api/querying).
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=query")
    private Optional<String> query;

    @JsonCreator
    public ListAccountingBankAccountTransactionsRequest(
            String accountId,
            String companyId,
            String connectionId,
            Optional<String> orderBy,
            Optional<Integer> page,
            Optional<Integer> pageSize,
            Optional<String> query) {
        Utils.checkNotNull(accountId, "accountId");
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(orderBy, "orderBy");
        Utils.checkNotNull(page, "page");
        Utils.checkNotNull(pageSize, "pageSize");
        Utils.checkNotNull(query, "query");
        this.accountId = accountId;
        this.companyId = companyId;
        this.connectionId = connectionId;
        this.orderBy = orderBy;
        this.page = page;
        this.pageSize = pageSize;
        this.query = query;
    }
    
    public ListAccountingBankAccountTransactionsRequest(
            String accountId,
            String companyId,
            String connectionId) {
        this(accountId, companyId, connectionId, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Unique identifier for an account.
     */
    @JsonIgnore
    public String accountId() {
        return accountId;
    }

    /**
     * Unique identifier for a company.
     */
    @JsonIgnore
    public String companyId() {
        return companyId;
    }

    /**
     * Unique identifier for a connection.
     */
    @JsonIgnore
    public String connectionId() {
        return connectionId;
    }

    /**
     * Field to order results by. [Read more](https://docs.codat.io/using-the-api/ordering-results).
     */
    @JsonIgnore
    public Optional<String> orderBy() {
        return orderBy;
    }

    /**
     * Page number. [Read more](https://docs.codat.io/using-the-api/paging).
     */
    @JsonIgnore
    public Optional<Integer> page() {
        return page;
    }

    /**
     * Number of records to return in a page. [Read more](https://docs.codat.io/using-the-api/paging).
     */
    @JsonIgnore
    public Optional<Integer> pageSize() {
        return pageSize;
    }

    /**
     * Codat query string. [Read more](https://docs.codat.io/using-the-api/querying).
     */
    @JsonIgnore
    public Optional<String> query() {
        return query;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for an account.
     */
    public ListAccountingBankAccountTransactionsRequest withAccountId(String accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = accountId;
        return this;
    }

    /**
     * Unique identifier for a company.
     */
    public ListAccountingBankAccountTransactionsRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public ListAccountingBankAccountTransactionsRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Field to order results by. [Read more](https://docs.codat.io/using-the-api/ordering-results).
     */
    public ListAccountingBankAccountTransactionsRequest withOrderBy(String orderBy) {
        Utils.checkNotNull(orderBy, "orderBy");
        this.orderBy = Optional.ofNullable(orderBy);
        return this;
    }

    /**
     * Field to order results by. [Read more](https://docs.codat.io/using-the-api/ordering-results).
     */
    public ListAccountingBankAccountTransactionsRequest withOrderBy(Optional<String> orderBy) {
        Utils.checkNotNull(orderBy, "orderBy");
        this.orderBy = orderBy;
        return this;
    }

    /**
     * Page number. [Read more](https://docs.codat.io/using-the-api/paging).
     */
    public ListAccountingBankAccountTransactionsRequest withPage(int page) {
        Utils.checkNotNull(page, "page");
        this.page = Optional.ofNullable(page);
        return this;
    }

    /**
     * Page number. [Read more](https://docs.codat.io/using-the-api/paging).
     */
    public ListAccountingBankAccountTransactionsRequest withPage(Optional<Integer> page) {
        Utils.checkNotNull(page, "page");
        this.page = page;
        return this;
    }

    /**
     * Number of records to return in a page. [Read more](https://docs.codat.io/using-the-api/paging).
     */
    public ListAccountingBankAccountTransactionsRequest withPageSize(int pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = Optional.ofNullable(pageSize);
        return this;
    }

    /**
     * Number of records to return in a page. [Read more](https://docs.codat.io/using-the-api/paging).
     */
    public ListAccountingBankAccountTransactionsRequest withPageSize(Optional<Integer> pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = pageSize;
        return this;
    }

    /**
     * Codat query string. [Read more](https://docs.codat.io/using-the-api/querying).
     */
    public ListAccountingBankAccountTransactionsRequest withQuery(String query) {
        Utils.checkNotNull(query, "query");
        this.query = Optional.ofNullable(query);
        return this;
    }

    /**
     * Codat query string. [Read more](https://docs.codat.io/using-the-api/querying).
     */
    public ListAccountingBankAccountTransactionsRequest withQuery(Optional<String> query) {
        Utils.checkNotNull(query, "query");
        this.query = query;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAccountingBankAccountTransactionsRequest other = (ListAccountingBankAccountTransactionsRequest) o;
        return 
            Objects.deepEquals(this.accountId, other.accountId) &&
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.orderBy, other.orderBy) &&
            Objects.deepEquals(this.page, other.page) &&
            Objects.deepEquals(this.pageSize, other.pageSize) &&
            Objects.deepEquals(this.query, other.query);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accountId,
            companyId,
            connectionId,
            orderBy,
            page,
            pageSize,
            query);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListAccountingBankAccountTransactionsRequest.class,
                "accountId", accountId,
                "companyId", companyId,
                "connectionId", connectionId,
                "orderBy", orderBy,
                "page", page,
                "pageSize", pageSize,
                "query", query);
    }
    
    public final static class Builder {
 
        private String accountId;
 
        private String companyId;
 
        private String connectionId;
 
        private Optional<String> orderBy = Optional.empty();
 
        private Optional<Integer> page;
 
        private Optional<Integer> pageSize;
 
        private Optional<String> query = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique identifier for an account.
         */
        public Builder accountId(String accountId) {
            Utils.checkNotNull(accountId, "accountId");
            this.accountId = accountId;
            return this;
        }

        /**
         * Unique identifier for a company.
         */
        public Builder companyId(String companyId) {
            Utils.checkNotNull(companyId, "companyId");
            this.companyId = companyId;
            return this;
        }

        /**
         * Unique identifier for a connection.
         */
        public Builder connectionId(String connectionId) {
            Utils.checkNotNull(connectionId, "connectionId");
            this.connectionId = connectionId;
            return this;
        }

        /**
         * Field to order results by. [Read more](https://docs.codat.io/using-the-api/ordering-results).
         */
        public Builder orderBy(String orderBy) {
            Utils.checkNotNull(orderBy, "orderBy");
            this.orderBy = Optional.ofNullable(orderBy);
            return this;
        }

        /**
         * Field to order results by. [Read more](https://docs.codat.io/using-the-api/ordering-results).
         */
        public Builder orderBy(Optional<String> orderBy) {
            Utils.checkNotNull(orderBy, "orderBy");
            this.orderBy = orderBy;
            return this;
        }

        /**
         * Page number. [Read more](https://docs.codat.io/using-the-api/paging).
         */
        public Builder page(int page) {
            Utils.checkNotNull(page, "page");
            this.page = Optional.ofNullable(page);
            return this;
        }

        /**
         * Page number. [Read more](https://docs.codat.io/using-the-api/paging).
         */
        public Builder page(Optional<Integer> page) {
            Utils.checkNotNull(page, "page");
            this.page = page;
            return this;
        }

        /**
         * Number of records to return in a page. [Read more](https://docs.codat.io/using-the-api/paging).
         */
        public Builder pageSize(int pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = Optional.ofNullable(pageSize);
            return this;
        }

        /**
         * Number of records to return in a page. [Read more](https://docs.codat.io/using-the-api/paging).
         */
        public Builder pageSize(Optional<Integer> pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Codat query string. [Read more](https://docs.codat.io/using-the-api/querying).
         */
        public Builder query(String query) {
            Utils.checkNotNull(query, "query");
            this.query = Optional.ofNullable(query);
            return this;
        }

        /**
         * Codat query string. [Read more](https://docs.codat.io/using-the-api/querying).
         */
        public Builder query(Optional<String> query) {
            Utils.checkNotNull(query, "query");
            this.query = query;
            return this;
        }
        
        public ListAccountingBankAccountTransactionsRequest build() {
            if (page == null) {
                page = _SINGLETON_VALUE_Page.value();
            }
            if (pageSize == null) {
                pageSize = _SINGLETON_VALUE_PageSize.value();
            }            return new ListAccountingBankAccountTransactionsRequest(
                accountId,
                companyId,
                connectionId,
                orderBy,
                page,
                pageSize,
                query);
        }

        private static final LazySingletonValue<Optional<Integer>> _SINGLETON_VALUE_Page =
                new LazySingletonValue<>(
                        "page",
                        "1",
                        new TypeReference<Optional<Integer>>() {});

        private static final LazySingletonValue<Optional<Integer>> _SINGLETON_VALUE_PageSize =
                new LazySingletonValue<>(
                        "pageSize",
                        "100",
                        new TypeReference<Optional<Integer>>() {});
    }
}

