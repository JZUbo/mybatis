package zxb.dao;

import zxb.domain.User;

import java.util.List;

/**
 * @author 赵学博
 * @create 2022-09-20 14:31
 */
public interface IUserDao {
    List<User> findAll();
}
