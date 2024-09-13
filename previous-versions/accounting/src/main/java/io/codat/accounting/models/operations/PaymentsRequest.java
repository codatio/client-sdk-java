/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.accounting.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.accounting.utils.LazySingletonValue;
import io.codat.accounting.utils.SpeakeasyMetadata;
import io.codat.accounting.utils.Utils;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class PaymentsRequest {

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
     * The type of link on a payment's line in Codat.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=linkType")
    private String linkType;

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
    public PaymentsRequest(
            String companyId,
            String connectionId,
            String linkType,
            Optional<Integer> page,
            Optional<Integer> pageSize,
            Optional<String> query) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(linkType, "linkType");
        Utils.checkNotNull(page, "page");
        Utils.checkNotNull(pageSize, "pageSize");
        Utils.checkNotNull(query, "query");
        this.companyId = companyId;
        this.connectionId = connectionId;
        this.linkType = linkType;
        this.page = page;
        this.pageSize = pageSize;
        this.query = query;
    }
    
    public PaymentsRequest(
            String companyId,
            String connectionId,
            String linkType) {
        this(companyId, connectionId, linkType, Optional.empty(), Optional.empty(), Optional.empty());
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
     * The type of link on a payment's line in Codat.
     */
    @JsonIgnore
    public String linkType() {
        return linkType;
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
     * Unique identifier for a company.
     */
    public PaymentsRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public PaymentsRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * The type of link on a payment's line in Codat.
     */
    public PaymentsRequest withLinkType(String linkType) {
        Utils.checkNotNull(linkType, "linkType");
        this.linkType = linkType;
        return this;
    }

    /**
     * Page number. [Read more](https://docs.codat.io/using-the-api/paging).
     */
    public PaymentsRequest withPage(int page) {
        Utils.checkNotNull(page, "page");
        this.page = Optional.ofNullable(page);
        return this;
    }

    /**
     * Page number. [Read more](https://docs.codat.io/using-the-api/paging).
     */
    public PaymentsRequest withPage(Optional<Integer> page) {
        Utils.checkNotNull(page, "page");
        this.page = page;
        return this;
    }

    /**
     * Number of records to return in a page. [Read more](https://docs.codat.io/using-the-api/paging).
     */
    public PaymentsRequest withPageSize(int pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = Optional.ofNullable(pageSize);
        return this;
    }

    /**
     * Number of records to return in a page. [Read more](https://docs.codat.io/using-the-api/paging).
     */
    public PaymentsRequest withPageSize(Optional<Integer> pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = pageSize;
        return this;
    }

    /**
     * Codat query string. [Read more](https://docs.codat.io/using-the-api/querying).
     */
    public PaymentsRequest withQuery(String query) {
        Utils.checkNotNull(query, "query");
        this.query = Optional.ofNullable(query);
        return this;
    }

    /**
     * Codat query string. [Read more](https://docs.codat.io/using-the-api/querying).
     */
    public PaymentsRequest withQuery(Optional<String> query) {
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
        PaymentsRequest other = (PaymentsRequest) o;
        return 
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.linkType, other.linkType) &&
            Objects.deepEquals(this.page, other.page) &&
            Objects.deepEquals(this.pageSize, other.pageSize) &&
            Objects.deepEquals(this.query, other.query);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyId,
            connectionId,
            linkType,
            page,
            pageSize,
            query);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PaymentsRequest.class,
                "companyId", companyId,
                "connectionId", connectionId,
                "linkType", linkType,
                "page", page,
                "pageSize", pageSize,
                "query", query);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private String connectionId;
 
        private String linkType;
 
        private Optional<Integer> page;
 
        private Optional<Integer> pageSize;
 
        private Optional<String> query = Optional.empty();  
        
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
         * Unique identifier for a connection.
         */
        public Builder connectionId(String connectionId) {
            Utils.checkNotNull(connectionId, "connectionId");
            this.connectionId = connectionId;
            return this;
        }

        /**
         * The type of link on a payment's line in Codat.
         */
        public Builder linkType(String linkType) {
            Utils.checkNotNull(linkType, "linkType");
            this.linkType = linkType;
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
        
        public PaymentsRequest build() {
            if (page == null) {
                page = _SINGLETON_VALUE_Page.value();
            }
            if (pageSize == null) {
                pageSize = _SINGLETON_VALUE_PageSize.value();
            }            return new PaymentsRequest(
                companyId,
                connectionId,
                linkType,
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

