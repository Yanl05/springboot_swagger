package com.steer.testcontroller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yanl
 * @date 2019-12-25 10:03 上午
 *
 * 提供一个测试接口
 */
@RestController
@RequestMapping("/test")
@Api(tags = "测试相关接口")
public class TestController {
    @GetMapping("/test")
    public void test(){
        System.out.println("test");
    }
}
