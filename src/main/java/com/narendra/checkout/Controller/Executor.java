package com.narendra.checkout.Controller;

import com.flipkart.databuilderframework.engine.*;
import com.flipkart.databuilderframework.model.Data;
import com.flipkart.databuilderframework.model.DataExecutionResponse;
import com.flipkart.databuilderframework.model.DataFlow;
import com.narendra.checkout.Data.PaymentData;
import com.narendra.checkout.Data.ProductData;
import com.narendra.checkout.DataBuilders.AddressDataBuilder;
import com.narendra.checkout.DataBuilders.PaymentDataBuilder;
import com.narendra.checkout.DataBuilders.UserDataBuilder;

public class Executor {
    private final DataFlow dataFlow;

    public Executor() throws DataBuilderFrameworkException {
        dataFlow = new DataFlowBuilder()
                .withDataBuilder(new UserDataBuilder())
                .withDataBuilder(new AddressDataBuilder())
                .withDataBuilder(new PaymentDataBuilder())
                .withTargetData(PaymentData.class)
                .build();
        dataFlow.setName("Basic Checkout!");
        dataFlow.setDescription("Basic Checkout Description!");
        System.out.println(dataFlow.toString());
    }

    public static void main(String args[]) throws DataBuilderFrameworkException, DataValidationException {
        Executor executor = new Executor();
        DataFlowExecutor dataFlowExecutor = new SimpleDataFlowExecutor();
        DataExecutionResponse response = dataFlowExecutor.run(executor.dataFlow, new ProductData("Whirlpool Washing Machine!"));

        for (String builderName: response.getResponses().keySet()) {
            System.out.println("BuilderName: " + builderName + " DataBuilt: " + response.getResponses().get(builderName));
            final Data data = response.getResponses().get(builderName);
            System.out.println(data.toString());
        }
    }
}
