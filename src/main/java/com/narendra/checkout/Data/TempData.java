package com.narendra.checkout.Data;

import com.flipkart.databuilderframework.model.DataAdapter;


public class TempData extends DataAdapter<TempData> {
    public TempData() {
        super(TempData.class);
    }

    public String toString(){
        return "Temp Data!";
    }
}
