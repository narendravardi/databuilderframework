package com.narendra.checkout.DataBuilders;

import com.flipkart.databuilderframework.annotations.DataBuilderClassInfo;
import com.flipkart.databuilderframework.engine.DataBuilder;
import com.flipkart.databuilderframework.engine.DataBuilderContext;
import com.flipkart.databuilderframework.engine.DataBuilderException;
import com.flipkart.databuilderframework.model.Data;
import com.narendra.checkout.Data.ProductData;
import com.narendra.checkout.Data.UserData;


@DataBuilderClassInfo(produces = UserData.class, consumes = ProductData.class)
public class UserDataBuilder extends DataBuilder {
    @Override
    public Data process(DataBuilderContext context) throws DataBuilderException {
        return new UserData("Narendra");
    }
}
