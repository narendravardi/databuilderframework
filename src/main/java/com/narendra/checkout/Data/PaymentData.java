package com.narendra.checkout.Data;

import com.flipkart.databuilderframework.model.DataAdapter;


public class PaymentData  extends DataAdapter<PaymentData > {
    final String gatewayDetails;

    public PaymentData (final String gatewayDetails) {
        super(PaymentData .class);
        this.gatewayDetails = gatewayDetails;
    }

    public String toString() {
        return "getewayDetails: " + gatewayDetails;
    }
}
