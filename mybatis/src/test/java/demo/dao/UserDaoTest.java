package demo.dao;

import demo.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.aspectj.lang.annotation.AfterReturning;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class UserDaoTest {
    private InputStream in;
    private SqlSession sqlSession;

    private UserDao userDao;

    @Before
    public void init() throws Exception{
        // 1. 读取配置文件
        in = Resources.getResourceAsStream("mybatisConfig.xml");
        // 2. 创建sqlSessionFactory工厂
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory buildFactory = sqlSessionFactoryBuilder.build(in);
        // 3. 使用工厂生产SqlSession对象
        sqlSession = buildFactory.openSession();
        // 4. 使用SqlSession创建Dao接口的代理对象(代理模式)
        userDao= sqlSession.getMapper(UserDao.class);
    }

    @After
    public void destroy()throws Exception{
        // 6.释放资源
        sqlSession.close();
        in.close();
    }
    /**
     * 入门案例
     * @throws IOException
     */
    @Test
    public void findAll() {
        // 5. 调用代理对象执行方法
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }

    }


    @Test
    public void saveUser(){
        User user = new User();
        user.setId(100);
        user.setUsername("goodForYou");
        user.setAddress("jiangxi");
        user.setBirthday(new Date());
        user.setSex("1");
        userDao.saveUser(user);
        sqlSession.commit();
    }
}