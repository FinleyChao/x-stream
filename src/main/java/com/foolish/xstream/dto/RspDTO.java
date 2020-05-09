package com.foolish.xstream.dto;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;

/**
 * @description:
 * @author：chaoxianfei
 * @date：2020/4/24 16:41
 */
@Data
@Builder
public class RspDTO<T> {

    @Tolerate
    public RspDTO(int code, String msg){
        this.code = code;
        this.msg = msg;
    }

    private Integer code;

    private String msg;

    private T data;

    public static RspDTO success() {
        return RspDTO.builder().code(200).msg("success").build();
    }
}
