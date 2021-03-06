/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Settings which specify how to run a multi-instance task.
 * Multi-instance tasks are commonly used to support MPI tasks.
 */
public class MultiInstanceSettings {
    /**
     * The number of compute nodes required by the task.
     */
    @JsonProperty(required = true)
    private int numberOfInstances;

    /**
     * The command line to run on all the compute nodes to enable them to
     * coordinate when the primary runs the main task command.
     * A typical coordination command line launches a background service and
     * verifies that the service is ready to process inter-node messages.
     */
    private String coordinationCommandLine;

    /**
     * A list of files that the Batch service will download before running the
     * coordination command line.
     * The difference between common resource files and task resource files is
     * that common resource files are downloaded for all subtasks including
     * the primary, whereas task resource files are downloaded only for the
     * primary.
     */
    private List<ResourceFile> commonResourceFiles;

    /**
     * Get the numberOfInstances value.
     *
     * @return the numberOfInstances value
     */
    public int numberOfInstances() {
        return this.numberOfInstances;
    }

    /**
     * Set the numberOfInstances value.
     *
     * @param numberOfInstances the numberOfInstances value to set
     * @return the MultiInstanceSettings object itself.
     */
    public MultiInstanceSettings withNumberOfInstances(int numberOfInstances) {
        this.numberOfInstances = numberOfInstances;
        return this;
    }

    /**
     * Get the coordinationCommandLine value.
     *
     * @return the coordinationCommandLine value
     */
    public String coordinationCommandLine() {
        return this.coordinationCommandLine;
    }

    /**
     * Set the coordinationCommandLine value.
     *
     * @param coordinationCommandLine the coordinationCommandLine value to set
     * @return the MultiInstanceSettings object itself.
     */
    public MultiInstanceSettings withCoordinationCommandLine(String coordinationCommandLine) {
        this.coordinationCommandLine = coordinationCommandLine;
        return this;
    }

    /**
     * Get the commonResourceFiles value.
     *
     * @return the commonResourceFiles value
     */
    public List<ResourceFile> commonResourceFiles() {
        return this.commonResourceFiles;
    }

    /**
     * Set the commonResourceFiles value.
     *
     * @param commonResourceFiles the commonResourceFiles value to set
     * @return the MultiInstanceSettings object itself.
     */
    public MultiInstanceSettings withCommonResourceFiles(List<ResourceFile> commonResourceFiles) {
        this.commonResourceFiles = commonResourceFiles;
        return this;
    }

}
