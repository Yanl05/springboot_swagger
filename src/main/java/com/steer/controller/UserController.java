package com.steer.controller;

import com.steer.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @author yanl
 * @date 2019-12-25 10:02 上午
 *
 * 提供用户增删改查四个接口
 */
@RestController
@RequestMapping("/user")
@Api(tags = "用户相关接口", description = "提供用户相关的Rest API")
public class UserController {
    @ApiOperation("/新增用户接口")
    @PostMapping("/add")
    public boolean addUser(@RequestBody User user){
        return false;
    }
    @GetMapping("/find/{id}")
    public User findById(@PathVariable("id") int id){
        return new User();
    }
    @PutMapping("/update")
    public boolean update(@RequestBody User user){
        return true;
    }
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable int id){
        return true;
    }
}
