package com.beyond.environmental.gateway.controller;

import com.alibaba.fastjson.JSON;
import com.beyond.environmental.gateway.module.wechat.vo.Goods;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * WechatController class
 *
 * @author Paul Ge
 * @date 2019-07-13
 */
@RestController
@RequestMapping("/env")
public class WechatController {

    @GetMapping(value = "/search")
    public String search(@RequestParam(value = "keyword", required = true, defaultValue = "") String keyword) {
        Goods goods = new Goods();
        goods.setId(1);
        goods.setName(keyword);
        goods.setClassify("干垃圾");
        return JSON.toJSONString(goods);
    }

}
