package com.narendra.checkout.Data;

import com.flipkart.databuilderframework.model.DataAdapter;


public class UserData extends DataAdapter<UserData> {
    final String customerName;

    public UserData(final String customerName) {
        super(UserData.class);
        this.customerName = customerName;
    }

    public String toString() {
        return "customerName " + customerName;
    }
}
