package com.narendra.checkout.Controller;

import com.flipkart.databuilderframework.engine.*;
import com.flipkart.databuilderframework.model.Data;
import com.flipkart.databuilderframework.model.DataDelta;
import com.flipkart.databuilderframework.model.DataExecutionResponse;
import com.flipkart.databuilderframework.model.DataFlow;
import com.narendra.checkout.Data.PaymentData;
import com.narendra.checkout.Data.ProductData;
import com.narendra.checkout.Data.TempData;
import com.narendra.checkout.Data.TerminalData;
import com.narendra.checkout.DataBuilders.AddressDataBuilder;
import com.narendra.checkout.DataBuilders.PaymentDataBuilder;
import com.narendra.checkout.DataBuilders.TerminalDataBuilder;
import com.narendra.checkout.DataBuilders.UserDataBuilder;

public class Executor {
    private final DataFlow dataFlow;

    public Executor() throws DataBuilderFrameworkException {
        dataFlow = new DataFlowBuilder()
                .withDataBuilder(new UserDataBuilder())
                .withDataBuilder(new AddressDataBuilder())
                .withDataBuilder(new PaymentDataBuilder())
                .withDataBuilder(new TerminalDataBuilder())
                .withTargetData(TerminalData.class)
                .build();
        dataFlow.setName("Basic Checkout!");
        dataFlow.setDescription("Basic Checkout Description!");
        System.out.println(dataFlow.toString());
    }

    public static void main(String args[]) throws DataBuilderFrameworkException, DataValidationException {
        Executor executor = new Executor();
        DataFlowExecutor dataFlowExecutor = new SimpleDataFlowExecutor();
        DataExecutionResponse response = dataFlowExecutor.run(executor.dataFlow, new ProductData("Whirlpool Washing Machine!"));
        DataDelta delta = new DataDelta();
        delta.add(new ProductData("Whirlpool Washing Machine!"));

        for (String builderName: response.getResponses().keySet()) {
            System.out.println("BuilderName: " + builderName);
            delta.add(response.getResponses().get(builderName));
        }
        System.out.println();
        delta.add(new TempData());

        System.out.println("Printing delta info:");
        for (Data data: delta.getDelta()){
            System.out.println(data.toString());
        }

        response = dataFlowExecutor.run(executor.dataFlow, delta);
        for (String builderName: response.getResponses().keySet()) {
            System.out.println("BuilderName: " + builderName);
        }

    }
}
