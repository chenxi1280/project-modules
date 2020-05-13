package com.qf.pojo.dto;

import com.sun.istack.internal.Nullable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReulstData implements Serializable {

    private String msg;// 返回给调用方的一个消息

    private Integer code = 200;// 状态码

    private Object data;// 就是返回的这个数据

    private Boolean res = true;// 直接给他一个操作的结果

    public static ReulstData ok(String msg, Object data) {

        return new ReulstData(msg, 200, data, true);
    }

    public static ReulstData ok(Object data) {
        return new ReulstData("操作成功", 200, data, true);
    }

    public static ReulstData ok(String msg) {
        return new ReulstData("操作成功", 200, null, true);
    }

    public static ReulstData fail(String msg) {
        return new ReulstData(msg, 100, null, false);
    }
}
