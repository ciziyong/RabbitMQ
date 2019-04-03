package com.czy.frame;

import com.czy.frame.user.dao.SysUserMapper;
import com.czy.frame.user.model.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FrameApplicationTests {
    @Autowired
    SysUserMapper sysUserMapper;

    @Test
    public void contextLoads() {
        SysUser sysUser = new SysUser();
        sysUser.setAccount("czy");
        sysUser.setPassword("123456");
        sysUserMapper.insert(sysUser);
    }
    @Test
    public void select() {
        sysUserMapper.selectList(1,4);
    }

}
