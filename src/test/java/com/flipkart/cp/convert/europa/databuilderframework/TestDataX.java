package com.flipkart.cp.convert.europa.databuilderframework;

import com.flipkart.cp.convert.europa.databuilderframework.model.Data;

public class TestDataX extends Data {
    private String value;

    public TestDataX(String value) {
        super("X");
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
