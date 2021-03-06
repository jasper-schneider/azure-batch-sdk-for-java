/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for DeleteFromTask operation.
 */
public class FileDeleteFromTaskHeaders {
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
     * @return the FileDeleteFromTaskHeaders object itself.
     */
    public FileDeleteFromTaskHeaders withClientRequestId(String clientRequestId) {
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
     * @return the FileDeleteFromTaskHeaders object itself.
     */
    public FileDeleteFromTaskHeaders withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

}
