package com.mybatisplus.controller;

import com.mybatisplus.entity.Manhuashuju;
import com.mybatisplus.mapper.ManhuashujuMapper;
import com.mybatisplus.service.ManhuashujuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName: ShowJson
 * Package: com.mybatisplus.controller
 * Description:
 *
 * @Author liang
 * @Create 2025/5/29 23:03
 * @Version jdk17.0
 */
@RestController
@RequestMapping("/mybatisplus")
public class ShowJson {
    @Autowired
    private ManhuashujuService service;
    @GetMapping("getJson")
    public List<Manhuashuju> getJson() {
        List<Manhuashuju> list = service.list();
        return list;
    }
}
