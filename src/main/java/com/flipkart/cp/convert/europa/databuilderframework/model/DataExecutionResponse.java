package com.flipkart.cp.convert.europa.databuilderframework.model;

import java.util.Map;

/**
 * Response from the system, once the {@link com.flipkart.cp.convert.europa.databuilderframework.model.DataFlow} is executed by a
 * {@link com.flipkart.cp.convert.europa.databuilderframework.engine.DataFlowExecutor}.
 */
public class DataExecutionResponse {
    /**
     * A map of responses from the different {@link com.flipkart.cp.convert.europa.databuilderframework.engine.DataBuilder} executions.
     * Key: Builder name
     * Value: Data generated by them.
     */
    private Map<String,Data> responses;

    public DataExecutionResponse(Map<String, Data> responses) {
        this.responses = responses;
    }

    public DataExecutionResponse() {
    }

    public Map<String, Data> getResponses() {
        return responses;
    }

    public void setResponses(Map<String, Data> responses) {
        this.responses = responses;
    }
}
