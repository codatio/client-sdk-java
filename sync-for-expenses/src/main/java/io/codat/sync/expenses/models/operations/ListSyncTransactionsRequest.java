/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.sync.expenses.utils.LazySingletonValue;
import io.codat.sync.expenses.utils.SpeakeasyMetadata;
import io.codat.sync.expenses.utils.Utils;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class ListSyncTransactionsRequest {

    /**
     * Unique identifier for a company.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=companyId")
    private String companyId;

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
     * Unique identifier for a sync.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=syncId")
    private String syncId;

    @JsonCreator
    public ListSyncTransactionsRequest(
            String companyId,
            Optional<Integer> page,
            Optional<Integer> pageSize,
            String syncId) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(page, "page");
        Utils.checkNotNull(pageSize, "pageSize");
        Utils.checkNotNull(syncId, "syncId");
        this.companyId = companyId;
        this.page = page;
        this.pageSize = pageSize;
        this.syncId = syncId;
    }
    
    public ListSyncTransactionsRequest(
            String companyId,
            String syncId) {
        this(companyId, Optional.empty(), Optional.empty(), syncId);
    }

    /**
     * Unique identifier for a company.
     */
    @JsonIgnore
    public String companyId() {
        return companyId;
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
     * Unique identifier for a sync.
     */
    @JsonIgnore
    public String syncId() {
        return syncId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a company.
     */
    public ListSyncTransactionsRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Page number. [Read more](https://docs.codat.io/using-the-api/paging).
     */
    public ListSyncTransactionsRequest withPage(int page) {
        Utils.checkNotNull(page, "page");
        this.page = Optional.ofNullable(page);
        return this;
    }

    /**
     * Page number. [Read more](https://docs.codat.io/using-the-api/paging).
     */
    public ListSyncTransactionsRequest withPage(Optional<Integer> page) {
        Utils.checkNotNull(page, "page");
        this.page = page;
        return this;
    }

    /**
     * Number of records to return in a page. [Read more](https://docs.codat.io/using-the-api/paging).
     */
    public ListSyncTransactionsRequest withPageSize(int pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = Optional.ofNullable(pageSize);
        return this;
    }

    /**
     * Number of records to return in a page. [Read more](https://docs.codat.io/using-the-api/paging).
     */
    public ListSyncTransactionsRequest withPageSize(Optional<Integer> pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = pageSize;
        return this;
    }

    /**
     * Unique identifier for a sync.
     */
    public ListSyncTransactionsRequest withSyncId(String syncId) {
        Utils.checkNotNull(syncId, "syncId");
        this.syncId = syncId;
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
        ListSyncTransactionsRequest other = (ListSyncTransactionsRequest) o;
        return 
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.page, other.page) &&
            Objects.deepEquals(this.pageSize, other.pageSize) &&
            Objects.deepEquals(this.syncId, other.syncId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyId,
            page,
            pageSize,
            syncId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListSyncTransactionsRequest.class,
                "companyId", companyId,
                "page", page,
                "pageSize", pageSize,
                "syncId", syncId);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private Optional<Integer> page;
 
        private Optional<Integer> pageSize;
 
        private String syncId;  
        
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
         * Unique identifier for a sync.
         */
        public Builder syncId(String syncId) {
            Utils.checkNotNull(syncId, "syncId");
            this.syncId = syncId;
            return this;
        }
        
        public ListSyncTransactionsRequest build() {
            if (page == null) {
                page = _SINGLETON_VALUE_Page.value();
            }
            if (pageSize == null) {
                pageSize = _SINGLETON_VALUE_PageSize.value();
            }            return new ListSyncTransactionsRequest(
                companyId,
                page,
                pageSize,
                syncId);
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

