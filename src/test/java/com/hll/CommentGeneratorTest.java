package com.hll;

import com.hll.mapper.AdminMenuButtonMapper;
import com.hll.model.AdminMenuButton;
import com.hll.model.AdminMenuButtonExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 你知道越多，你不知道的也就越多
 *
 * @Author: Domid
 * @Description:
 * @Date: 2020-12-04 10:38
 * @Version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {GeneratorDemoApplication.class})
public class CommentGeneratorTest {

    @Autowired
    private AdminMenuButtonMapper adminMenuButtonMapper;

    @Test
    public void test() throws Exception {
//        AdminMenuButton adminMenuButton = adminMenuButtonMapper.selectByPrimaryKey(1);
//        System.out.println(adminMenuButton);

        AdminMenuButtonExample adminMenuButtonExample = new AdminMenuButtonExample();
        adminMenuButtonExample.createCriteria().andNameIsNotNull();
        List<AdminMenuButton> adminMenuButtons = adminMenuButtonMapper.selectByExample(adminMenuButtonExample);
        System.out.println(adminMenuButtons.size());
    }

}