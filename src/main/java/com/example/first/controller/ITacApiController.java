package com.example.first.controller;

import com.example.first.bean.ITacApiReturn;
import com.example.first.bean.result.Result_configGetValue;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "ITac API", description = "iTac API desc")
@RestController
@RequestMapping("/itacapi")
public class ITacApiController {

    @Operation(description = "get api1")
    @GetMapping("/getapi1")
    public ITacApiReturn<Result_configGetValue> getapi1() {
        Result_configGetValue instance = Result_configGetValue.getInstance();
        return ITacApiReturn.getInstance(instance);
    }
}
