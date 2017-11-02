package com.narendra.checkout.Data;

import com.flipkart.databuilderframework.model.DataAdapter;


public class ProductData extends DataAdapter<ProductData> {
    final String productName;

    public ProductData(final String productName) {
        super(ProductData.class);
        this.productName = productName;
    }

    public String toString() {
        return "productName " + productName;
    }
}
