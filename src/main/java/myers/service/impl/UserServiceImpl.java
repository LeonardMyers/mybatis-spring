package myers.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import myers.inter.userMapper;
import myers.model.user;
import myers.service.UserServiceI;

/**
 * @author songpeng
 * 使用@Service注解将UserServiceImpl类标注为一个service
 * service的id是userService
 */
@Service("userService")
public class UserServiceImpl implements UserServiceI {

    /**
     * 使用@Autowired注解标注userMapper变量，
     * 当需要使用UserMapper时，Spring就会自动注入UserMapper
     */
    @Autowired
    private userMapper userMapper;//注入dao

    public void addUser(user user) {
        userMapper.insert(user);
    }

    public user getUserById(Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}