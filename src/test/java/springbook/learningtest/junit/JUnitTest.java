package springbook.learningtest.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/junit.xml")
public class JUnitTest {

    @Autowired
    ApplicationContext context;

    static Set<JUnitTest> testObjects = new HashSet<>();
    static ApplicationContext contextObject = null;

    @Test
    public void test1() throws Exception {
        assertThat(testObjects, not(hasItem(this)));
        testObjects.add(this);
    }

    @Test
    public void test2() {
        assertThat(contextObject == null || contextObject == this.context, is(true));
        contextObject = context;

        assertTrue(contextObject == null || contextObject == this.context);
        contextObject = this.context;
    }

    @Test
    public void test3() {
        assertThat(contextObject, either(is(nullValue())).or(is(this.context)));
        contextObject = this.context;
    }

    @Test
    public void test4() {
        System.out.println(not(hasItem(this)));
    }
}
