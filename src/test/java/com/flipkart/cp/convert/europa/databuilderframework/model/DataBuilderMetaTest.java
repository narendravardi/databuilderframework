package com.flipkart.cp.convert.europa.databuilderframework.model;

import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;

public class DataBuilderMetaTest {
    @Test
    public void testEquals() {
        DataBuilderMeta lhs = new DataBuilderMeta(Lists.newArrayList("A", "B"), "C", "test");
        DataBuilderMeta rhs = new DataBuilderMeta(Lists.newArrayList("A", "B"), "C", "test");
        Assert.assertEquals(lhs, rhs);
        Assert.assertEquals(lhs.hashCode(), rhs.hashCode());
    }

    @Test
    public void testNotEquals1() {
        DataBuilderMeta lhs = new DataBuilderMeta(Lists.newArrayList("A", "B"), "C", "test");
        DataBuilderMeta rhs = new DataBuilderMeta(Lists.newArrayList("A", "B"), "C", "test1");
        Assert.assertFalse(lhs.equals(rhs));
    }

    @Test
    public void testNotEquals2() {
        DataBuilderMeta lhs = new DataBuilderMeta(Lists.newArrayList("A", "B"), "C", "test");
        DataBuilderMeta rhs = new DataBuilderMeta(Lists.newArrayList("A", "B"), "D", "test");
        Assert.assertFalse(lhs.equals(rhs));
    }

    @Test
    public void testNotEquals3() {
        DataBuilderMeta lhs = new DataBuilderMeta(Lists.newArrayList("A", "B"), "C", "test");
        DataBuilderMeta rhs = new DataBuilderMeta(Lists.newArrayList("A", "X"), "C", "test");
        Assert.assertFalse(lhs.equals(rhs));
    }

    @Test
    public void testNotEquals4() {
        DataBuilderMeta lhs = new DataBuilderMeta(Lists.newArrayList("A", "B"), "C", "test");
        DataBuilderMeta rhs = new DataBuilderMeta(Lists.newArrayList("A"), "D", "test");
        Assert.assertFalse(lhs.equals(rhs));
    }

    @Test
    public void testNotEquals5() {
        DataBuilderMeta lhs = new DataBuilderMeta(Lists.newArrayList("A", "B"), "C", "test", true);
        DataBuilderMeta rhs = new DataBuilderMeta(Lists.newArrayList("A", "X"), "D", "test");
        Assert.assertFalse(lhs.equals(rhs));
        Assert.assertFalse(lhs.hashCode() == rhs.hashCode());
    }

    @Test
    public void testNotEquals6() {
        DataBuilderMeta lhs = new DataBuilderMeta(Lists.newArrayList("A", "B"), "C", "test");
        Assert.assertTrue(lhs.equals(lhs));
    }

    @Test
    public void testNotEquals7() {
        DataBuilderMeta lhs = new DataBuilderMeta(Lists.newArrayList("A", "B"), "C", "test");
        Assert.assertFalse(lhs.equals(null));
    }

    @Test
    public void testNotEquals8() {
        DataBuilderMeta lhs = new DataBuilderMeta(Lists.newArrayList("A", "B"), "C", "test");
        Assert.assertFalse(lhs.equals(new Integer(100)));
    }

}
