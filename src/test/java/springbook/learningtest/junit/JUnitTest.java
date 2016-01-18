package springbook.learningtest.junit;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
/**
 * Created by dw on 2016. 1. 18..
 */
public class JUnitTest {
    static JUnitTest testObject;

    @Test
    public void test1() throws Exception {
        assertThat(this, is(not(sameInstance(testObject))));
    }

    @Test
    public void test2() {
        assertThat(this, is(not(sameInstance(testObject))));
        testObject = this;
    }

    @Test
    public void test3() {
        assertThat(this, is(not(sameInstance(testObject))));
        testObject = this;
    }
}
