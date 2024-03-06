/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.platform.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.platform.utils.LazySingletonValue;
import io.codat.platform.utils.SpeakeasyMetadata;
import io.codat.platform.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class ListCustomDataTypeRecordsRequest {

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
     * Unique identifier for a custom data type.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=customDataIdentifier")
    private String customDataIdentifier;

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

    public ListCustomDataTypeRecordsRequest(
            String companyId,
            String connectionId,
            String customDataIdentifier,
            Optional<? extends Integer> page,
            Optional<? extends Integer> pageSize) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(customDataIdentifier, "customDataIdentifier");
        Utils.checkNotNull(page, "page");
        Utils.checkNotNull(pageSize, "pageSize");
        this.companyId = companyId;
        this.connectionId = connectionId;
        this.customDataIdentifier = customDataIdentifier;
        this.page = page;
        this.pageSize = pageSize;
    }

    /**
     * Unique identifier for a company.
     */
    public String companyId() {
        return companyId;
    }

    /**
     * Unique identifier for a connection.
     */
    public String connectionId() {
        return connectionId;
    }

    /**
     * Unique identifier for a custom data type.
     */
    public String customDataIdentifier() {
        return customDataIdentifier;
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

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a company.
     */
    public ListCustomDataTypeRecordsRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public ListCustomDataTypeRecordsRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Unique identifier for a custom data type.
     */
    public ListCustomDataTypeRecordsRequest withCustomDataIdentifier(String customDataIdentifier) {
        Utils.checkNotNull(customDataIdentifier, "customDataIdentifier");
        this.customDataIdentifier = customDataIdentifier;
        return this;
    }

    /**
     * Page number. [Read more](https://docs.codat.io/using-the-api/paging).
     */
    public ListCustomDataTypeRecordsRequest withPage(int page) {
        Utils.checkNotNull(page, "page");
        this.page = Optional.ofNullable(page);
        return this;
    }

    /**
     * Page number. [Read more](https://docs.codat.io/using-the-api/paging).
     */
    public ListCustomDataTypeRecordsRequest withPage(Optional<? extends Integer> page) {
        Utils.checkNotNull(page, "page");
        this.page = page;
        return this;
    }

    /**
     * Number of records to return in a page. [Read more](https://docs.codat.io/using-the-api/paging).
     */
    public ListCustomDataTypeRecordsRequest withPageSize(int pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = Optional.ofNullable(pageSize);
        return this;
    }

    /**
     * Number of records to return in a page. [Read more](https://docs.codat.io/using-the-api/paging).
     */
    public ListCustomDataTypeRecordsRequest withPageSize(Optional<? extends Integer> pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = pageSize;
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
        ListCustomDataTypeRecordsRequest other = (ListCustomDataTypeRecordsRequest) o;
        return 
            java.util.Objects.deepEquals(this.companyId, other.companyId) &&
            java.util.Objects.deepEquals(this.connectionId, other.connectionId) &&
            java.util.Objects.deepEquals(this.customDataIdentifier, other.customDataIdentifier) &&
            java.util.Objects.deepEquals(this.page, other.page) &&
            java.util.Objects.deepEquals(this.pageSize, other.pageSize);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            companyId,
            connectionId,
            customDataIdentifier,
            page,
            pageSize);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListCustomDataTypeRecordsRequest.class,
                "companyId", companyId,
                "connectionId", connectionId,
                "customDataIdentifier", customDataIdentifier,
                "page", page,
                "pageSize", pageSize);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private String connectionId;
 
        private String customDataIdentifier;
 
        private Optional<? extends Integer> page;
 
        private Optional<? extends Integer> pageSize;  
        
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
         * Unique identifier for a custom data type.
         */
        public Builder customDataIdentifier(String customDataIdentifier) {
            Utils.checkNotNull(customDataIdentifier, "customDataIdentifier");
            this.customDataIdentifier = customDataIdentifier;
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
        
        public ListCustomDataTypeRecordsRequest build() {
            if (page == null) {
                page = _SINGLETON_VALUE_Page.value();
            }
            if (pageSize == null) {
                pageSize = _SINGLETON_VALUE_PageSize.value();
            }
            return new ListCustomDataTypeRecordsRequest(
                companyId,
                connectionId,
                customDataIdentifier,
                page,
                pageSize);
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

