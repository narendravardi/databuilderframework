package com.narendra.checkout.Data;

import com.flipkart.databuilderframework.model.DataAdapter;


public class AddressData extends DataAdapter<AddressData> {
    final String customerAddress;

    public AddressData(final String customerAddress) {
        super(AddressData.class);
        this.customerAddress = customerAddress;
    }

    public String toString(){
        return "customerAddress: " + customerAddress;
    }
}
