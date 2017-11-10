package com.narendra.checkout.Data;

import com.flipkart.databuilderframework.model.DataAdapter;


public class TerminalData extends DataAdapter<TerminalData> {
    public TerminalData() {
        super(TerminalData.class);
    }

    public String toString(){
        return "Terminal Data!";
    }
}
