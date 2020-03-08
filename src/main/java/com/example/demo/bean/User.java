package com.example.demo.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 	用户信息
 * </p>
 */
@Data
@NoArgsConstructor
public class User implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    private String id;

    /**
     * 用户名
     */
    private String username;


    /**
     * 邮箱
     */
    private String email;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 微信
     */
    private String wechat;

    /**
     * qq
     */
    private String qq;

    /**
     * 备注
     */
    private String remark;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 创建时间
     */
    private LocalDateTime createtime;

    /**
     * 创建人
     */
    private String createby;

    /**
     * 更新时间
     */
    private LocalDateTime updatetime;

    /**
     * 更新人
     */
    private String updateby;

    /**
     * 头像
     */
    private String headpicture;

    /**
     * 所在地
     */
    private String place;

    /**
     * 性别
     */

    private String sex;

    /**
     * 电话号码
     */
    private String telephone;

    /**
     * 微信openid
     */
    private String wechatopenid;
    
    
}
