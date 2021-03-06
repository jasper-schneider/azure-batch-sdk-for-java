/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import com.microsoft.rest.DateTimeRfc1123;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for GetAllJobsLifetimeStatistics operation.
 */
public class JobGetAllJobsLifetimeStatisticsHeaders {
    /**
     * The client-request-id provided by the client during the request. This
     * will be returned only if the return-client-request-id parameter was
     * set to true.
     */
    @JsonProperty(value = "client-request-id")
    private String clientRequestId;

    /**
     * This header uniquely identifies the request that was made and can be
     * used for troubleshooting the request. If a request is consistently
     * failing and you have verified that the request is properly formulated,
     * you may use this value to report the error to Microsoft. In your
     * report, include the value of this header, the approximate time that
     * the request was made, the Batch account against which the request was
     * made, and the region that account resides in.
     */
    @JsonProperty(value = "request-id")
    private String requestId;

    /**
     * The ETag HTTP response header. This is an opaque string. You can use it
     * to detect whether the resource has changed between requests. In
     * particular, you can pass the ETag to one of the If-Modified-Since,
     * If-Unmodified-Since, If-Match or If-None-Match headers.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /**
     * The time at which the resource was last modified.
     */
    @JsonProperty(value = "Last-Modified")
    private DateTimeRfc1123 lastModified;

    /**
     * Get the clientRequestId value.
     *
     * @return the clientRequestId value
     */
    public String clientRequestId() {
        return this.clientRequestId;
    }

    /**
     * Set the clientRequestId value.
     *
     * @param clientRequestId the clientRequestId value to set
     * @return the JobGetAllJobsLifetimeStatisticsHeaders object itself.
     */
    public JobGetAllJobsLifetimeStatisticsHeaders withClientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
        return this;
    }

    /**
     * Get the requestId value.
     *
     * @return the requestId value
     */
    public String requestId() {
        return this.requestId;
    }

    /**
     * Set the requestId value.
     *
     * @param requestId the requestId value to set
     * @return the JobGetAllJobsLifetimeStatisticsHeaders object itself.
     */
    public JobGetAllJobsLifetimeStatisticsHeaders withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the eTag value.
     *
     * @return the eTag value
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Set the eTag value.
     *
     * @param eTag the eTag value to set
     * @return the JobGetAllJobsLifetimeStatisticsHeaders object itself.
     */
    public JobGetAllJobsLifetimeStatisticsHeaders withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the lastModified value.
     *
     * @return the lastModified value
     */
    public DateTime lastModified() {
        if (this.lastModified == null) {
            return null;
        }
        return this.lastModified.getDateTime();
    }

    /**
     * Set the lastModified value.
     *
     * @param lastModified the lastModified value to set
     * @return the JobGetAllJobsLifetimeStatisticsHeaders object itself.
     */
    public JobGetAllJobsLifetimeStatisticsHeaders withLastModified(DateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

}
