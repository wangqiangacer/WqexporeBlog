package com.dimple.test.service;

import com.dimple.DimpleBlogApplication;
import com.dimple.project.common.service.impl.MailServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @className: MailServiceTest
 * @description:
 * @auther: Dimple
 * @date: 07/18/19
 * @version: 1.0
 */
@SpringBootTest(classes = DimpleBlogApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class MailServiceImplTest {
    @Autowired
    MailServiceImpl mailServiceImpl;

    @Test
    public void testSendSimpleMail() {
        String to = "1084753221@qq.com";
        String subject = "来自外星的一封神秘邮件";
        String content = "亲爱的，我想你了";
        mailServiceImpl.sendSimpleMail(to, subject, content);
    }

    @Test
    public void testReplyEmail() {
        mailServiceImpl.sendReplyEmail("1084753221@qq.com", 15, "原始内容", "", "http://www.bianxiaofeng.com");
    }
}
