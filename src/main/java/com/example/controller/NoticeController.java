package com.example.controller;



import com.example.entity.Notice;
import com.example.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author gaoxiang
 * @since 2023-11-26
 */
@RestController
@RequestMapping("/notice")
public class NoticeController {

    @Autowired
    NoticeService noticeService;

    @GetMapping("/save")
    public String save(){
        Notice notice = new Notice();
        notice.setTitle("2");
        notice.setContent("2");
        notice.setFromId(1L);
        notice.setToId(2L);
        notice.setIsRead(0);
        noticeService.save(notice);
        return "新增id"+notice.getId();
    }
}
