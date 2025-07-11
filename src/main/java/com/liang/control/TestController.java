package com.liang.control;

import org.springframework.web.bind.annotation.*;

/**
 * ClassName: TestController
 * Package: com.liang.control
 * Description:
 *
 * @Author liang
 * @Create 2025/4/23 21:43
 * @Version jdk11
 */
@RestController
@RequestMapping("/index")
public class TestController {

    @GetMapping("/test1/{id1}")
    public String test1(@PathVariable("id1") int id){
        System.out.println(id);
        return  id+"";
    }

    @GetMapping("/test2")
    public String test2( int id){
        System.out.println(id);
        return  id+"";
    }
}
