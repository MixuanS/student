package demo.dao;

import demo.pojo.User;

import java.util.List;

/**
 * 用户的持久层接口
 *
 * @author hc
 * @version 1.0.0
 * @date 2019/7/26
 */
public interface UserDao {
    /**
     * 查询所有操作 新增的tet操作
     * @return
     */
    List<User> findAll();

    /**
     * 插入操作
     * @param user
     */
    void saveUser(User user);
}
