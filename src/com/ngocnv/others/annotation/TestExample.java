package com.ngocnv.others.annotation;

@TestInfo(
        priority = TestInfo.Priority.HIGH,
        tags = {"test", "learning", "annotation"},
        createdBy = "nguyen.van.ngoc",
        lastModified = "14/09/2018"
)
public class TestExample {

    @Test
    public void testA() {
        if(true) {
            throw new RuntimeException("This test always failed");
        }
    }

    @Test(enabled = false)
    public void testB() {
        if(false) {
            throw new RuntimeException("This test always passed");
        }
    }

    @Test(enabled = true)
    public void testC() {
        if (10 > 1) {
            // do nothing, this test always passed.
        }
    }

    public void testD() {
        // ignore this test case
    }

}
