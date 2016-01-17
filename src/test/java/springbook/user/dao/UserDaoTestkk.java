package springbook.user.dao;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import springbook.user.domain.User;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class UserDaoTestkk {
    @Test
    public void andAndGet() throws Exception {
        ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");

        UserDao dao = context.getBean("userDao3", UserDao.class);

        User user = new User();
        user.setId("gyumee222");
        user.setName("박성철");
        user.setPassword("springno21");

        dao.add(user);

        User user2 = dao.get(user.getId());

        assertThat(user2.getName(), is(user.getName()));
        assertThat(user2.getPassword(), is(user.getPassword()));
        System.out.println("ddd");

    }

    @Test
    public void testName() throws Exception {
        ApplicationContext context = new GenericXmlApplicationContext("c.xml");
        User us2 = context.getBean("user33", User.class);
        us2.setId("d");

        System.out.println(us2.getId());

    }

    public static void main(String[] args) {
        JUnitCore.main("springbook.user.dao.UserDaoTestkk");
    }
}
