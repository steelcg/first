package com.example.first.controller;

import com.example.first.bean.ApiReturn;
import com.example.first.bean.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user2")
public class User2Controller {

    @Operation(description = "getUser")
    @GetMapping("/getUser")
    public ApiReturn<User> getUser() {
        User user = new User();
        user.setId(111);
        user.setName("aaa");
        return ApiReturn.success(user);
    }

    @Operation(description = "testArray")
    @PostMapping("/testArray")
    @Parameters({
            @Parameter(name = "model")
    })
    public ApiReturn<User> testArray(@RequestBody User model) {
        return ApiReturn.success(model);
    }

}
