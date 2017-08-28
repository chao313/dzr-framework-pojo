package com.dzr.framework.pojo.dubbo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * Created by qiuyangjun on 2016/10/27.
 *
 * @packageName:com.sdxd.message.dubbo.response
 * @CreateDate:2016/10/27
 * @UpdateDate:2016/10/27
 * @Description:
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class DubboResponse<T> implements Serializable {
    private String status;
    private String error;
    private String msg;
    private T data;

    public void mset(String status, String error, String msg) {
        this.status = status;
        this.error = error;
        this.msg = msg;
    }
}
