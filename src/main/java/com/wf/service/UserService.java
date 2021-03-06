package com.wf.service;


import com.wf.mapper.UserMapper;
import com.wf.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    // 根据id查询
    public User quryById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    // 新增保存用户
    @Transactional // 事务配置
   public void saveUser(User user) {
       System.out.println("新增用户");
       // 选择性新增，如果属性为空，则该属性不会出现在insert语句
        userMapper.insertSelective(user);
        int i = 1/0;
   }
}
