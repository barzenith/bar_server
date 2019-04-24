package com.zenith;

import com.zenith.core.mapper.UserMapper;
import com.zenith.core.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BarApplicationTests {

    //该测试类,相当于直接获取了spring容器对象
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private User user;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testFind() {
        List<User> userList = userMapper.findAll();
        System.out.println(userList);
    }

}
