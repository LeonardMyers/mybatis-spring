package myers.service;

import myers.model.user;;

public interface UserServiceI {

    /**
     * 添加用户
     * @param user
     */
    void addUser(user user);
    
    /**
     * 根据用户id获取用户
     * @param userId
     * @return
     */
    user getUserById(Integer userId);
}