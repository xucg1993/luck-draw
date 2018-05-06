package com.xcg.luckdraw;

import com.xcg.luckdraw.util.StringRedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LuckDrawApplicationTests {

    @Test
    public void contextLoads() {
        StringRedisUtil.set("11","11");
    }

}
