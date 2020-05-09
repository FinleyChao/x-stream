package com.foolish.xstream.controller;

import com.foolish.xstream.dto.RspDTO;
import com.foolish.xstream.dto.UserDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @description:
 * @author：chaoxianfei
 * @date：2020/4/24 16:38
 */
@RestController
public class UserController {

    /**
     * 走参数校验注解
     *
     * @param userDTO
     * @return
     */
    @PostMapping("/save/valid")
    public RspDTO save(@RequestBody @Valid UserDTO userDTO) {
        System.out.println(userDTO);
        return RspDTO.success();
    }

}
