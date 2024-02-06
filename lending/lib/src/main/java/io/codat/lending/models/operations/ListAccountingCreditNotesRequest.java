/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.lending.utils.LazySingletonValue;
import io.codat.lending.utils.SpeakeasyMetadata;
import io.codat.lending.utils.Utils;
import java.io.InputStream;
import java.util.Optional;


public class ListAccountingCreditNotesRequest {

    /**
     * Unique identifier for a company.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=companyId")
    private String companyId;

    /**
     * Field to order results by. [Read more](https://docs.codat.io/using-the-api/ordering-results).
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=orderBy")
    private Optional<? extends String> orderBy;

    /**
     * Page number. [Read more](https://docs.codat.io/using-the-api/paging).
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page")
    private Optional<? extends Integer> page;

    /**
     * Number of records to return in a page. [Read more](https://docs.codat.io/using-the-api/paging).
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=pageSize")
    private Optional<? extends Integer> pageSize;

    /**
     * Codat query string. [Read more](https://docs.codat.io/using-the-api/querying).
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=query")
    private Optional<? extends String> query;

    public ListAccountingCreditNotesRequest(
            String companyId,
            Optional<? extends String> orderBy,
            Optional<? extends Integer> page,
            Optional<? extends Integer> pageSize,
            Optional<? extends String> query) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(orderBy, "orderBy");
        Utils.checkNotNull(page, "page");
        Utils.checkNotNull(pageSize, "pageSize");
        Utils.checkNotNull(query, "query");
        this.companyId = companyId;
        this.orderBy = orderBy;
        this.page = page;
        this.pageSize = pageSize;
        this.query = query;
    }

    /**
     * Unique identifier for a company.
     */
    public String companyId() {
        return companyId;
    }

    /**
     * Field to order results by. [Read more](https://docs.codat.io/using-the-api/ordering-results).
     */
    public Optional<? extends String> orderBy() {
        return orderBy;
    }

    /**
     * Page number. [Read more](https://docs.codat.io/using-the-api/paging).
     */
    public Optional<? extends Integer> page() {
        return page;
    }

    /**
     * Number of records to return in a page. [Read more](https://docs.codat.io/using-the-api/paging).
     */
    public Optional<? extends Integer> pageSize() {
        return pageSize;
    }

    /**
     * Codat query string. [Read more](https://docs.codat.io/using-the-api/querying).
     */
    public Optional<? extends String> query() {
        return query;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a company.
     */
    public ListAccountingCreditNotesRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Field to order results by. [Read more](https://docs.codat.io/using-the-api/ordering-results).
     */
    public ListAccountingCreditNotesRequest withOrderBy(String orderBy) {
        Utils.checkNotNull(orderBy, "orderBy");
        this.orderBy = Optional.ofNullable(orderBy);
        return this;
    }
    
    /**
     * Field to order results by. [Read more](https://docs.codat.io/using-the-api/ordering-results).
     */
    public ListAccountingCreditNotesRequest withOrderBy(Optional<? extends String> orderBy) {
        Utils.checkNotNull(orderBy, "orderBy");
        this.orderBy = orderBy;
        return this;
    }

    /**
     * Page number. [Read more](https://docs.codat.io/using-the-api/paging).
     */
    public ListAccountingCreditNotesRequest withPage(int page) {
        Utils.checkNotNull(page, "page");
        this.page = Optional.ofNullable(page);
        return this;
    }
    
    /**
     * Page number. [Read more](https://docs.codat.io/using-the-api/paging).
     */
    public ListAccountingCreditNotesRequest withPage(Optional<? extends Integer> page) {
        Utils.checkNotNull(page, "page");
        this.page = page;
        return this;
    }

    /**
     * Number of records to return in a page. [Read more](https://docs.codat.io/using-the-api/paging).
     */
    public ListAccountingCreditNotesRequest withPageSize(int pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = Optional.ofNullable(pageSize);
        return this;
    }
    
    /**
     * Number of records to return in a page. [Read more](https://docs.codat.io/using-the-api/paging).
     */
    public ListAccountingCreditNotesRequest withPageSize(Optional<? extends Integer> pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = pageSize;
        return this;
    }

    /**
     * Codat query string. [Read more](https://docs.codat.io/using-the-api/querying).
     */
    public ListAccountingCreditNotesRequest withQuery(String query) {
        Utils.checkNotNull(query, "query");
        this.query = Optional.ofNullable(query);
        return this;
    }
    
    /**
     * Codat query string. [Read more](https://docs.codat.io/using-the-api/querying).
     */
    public ListAccountingCreditNotesRequest withQuery(Optional<? extends String> query) {
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
        ListAccountingCreditNotesRequest other = (ListAccountingCreditNotesRequest) o;
        return 
            java.util.Objects.deepEquals(this.companyId, other.companyId) &&
            java.util.Objects.deepEquals(this.orderBy, other.orderBy) &&
            java.util.Objects.deepEquals(this.page, other.page) &&
            java.util.Objects.deepEquals(this.pageSize, other.pageSize) &&
            java.util.Objects.deepEquals(this.query, other.query);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            companyId,
            orderBy,
            page,
            pageSize,
            query);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListAccountingCreditNotesRequest.class,
                "companyId", companyId,
                "orderBy", orderBy,
                "page", page,
                "pageSize", pageSize,
                "query", query);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private Optional<? extends String> orderBy = Optional.empty();
 
        private Optional<? extends Integer> page;
 
        private Optional<? extends Integer> pageSize;
 
        private Optional<? extends String> query = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
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
        public Builder orderBy(Optional<? extends String> orderBy) {
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
        public Builder page(Optional<? extends Integer> page) {
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
        public Builder pageSize(Optional<? extends Integer> pageSize) {
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
        public Builder query(Optional<? extends String> query) {
            Utils.checkNotNull(query, "query");
            this.query = query;
            return this;
        }        
        
        public ListAccountingCreditNotesRequest build() {
            if (page == null) {
                page = _SINGLETON_VALUE_Page.value();
            }
            if (pageSize == null) {
                pageSize = _SINGLETON_VALUE_PageSize.value();
            }
            return new ListAccountingCreditNotesRequest(
                companyId,
                orderBy,
                page,
                pageSize,
                query);
        }

        private static final LazySingletonValue<Optional<? extends Integer>> _SINGLETON_VALUE_Page =
                new LazySingletonValue<>(
                        "page",
                        "1",
                        new TypeReference<Optional<? extends Integer>>() {});

        private static final LazySingletonValue<Optional<? extends Integer>> _SINGLETON_VALUE_PageSize =
                new LazySingletonValue<>(
                        "pageSize",
                        "100",
                        new TypeReference<Optional<? extends Integer>>() {});
    }
}

