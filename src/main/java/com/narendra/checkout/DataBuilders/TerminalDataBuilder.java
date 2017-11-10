package com.narendra.checkout.DataBuilders;

import com.flipkart.databuilderframework.annotations.DataBuilderClassInfo;
import com.flipkart.databuilderframework.engine.DataBuilder;
import com.flipkart.databuilderframework.engine.DataBuilderContext;
import com.flipkart.databuilderframework.engine.DataBuilderException;
import com.flipkart.databuilderframework.model.Data;
import com.narendra.checkout.Data.*;


@DataBuilderClassInfo(produces = TerminalData.class, consumes = {PaymentData.class,TempData.class})
public class TerminalDataBuilder extends DataBuilder {
    @Override
    public Data process(DataBuilderContext context) throws DataBuilderException {
        return new TerminalData();
    }
}
