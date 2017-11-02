package com.narendra.checkout.DataBuilders;

import com.flipkart.databuilderframework.annotations.DataBuilderClassInfo;
import com.flipkart.databuilderframework.engine.DataBuilder;
import com.flipkart.databuilderframework.engine.DataBuilderContext;
import com.flipkart.databuilderframework.engine.DataBuilderException;
import com.flipkart.databuilderframework.model.Data;
import com.narendra.checkout.Data.AddressData;
import com.narendra.checkout.Data.UserData;


@DataBuilderClassInfo(produces = AddressData.class, consumes = UserData.class)
public class AddressDataBuilder extends DataBuilder {
    @Override
    public Data process(DataBuilderContext context) throws DataBuilderException {
        return new AddressData("Flipkart Office, Cessna Business Park, Bangalore");
    }
}
