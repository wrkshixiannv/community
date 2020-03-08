package com.example.demo.contants;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * qq ，wx 登陆常量配置类
 */
@Configuration
@Data
@NoArgsConstructor
public class WechatConstant {


	@Value("${constants.weChatAppId}")
	private String weCatAppId;

	@Value("${constants.weChatAppSecret}")
	private String weCatAppSecret;

	@Value("${constants.weChatRedirectUrl}")
	private String weCatRedirectUrl;

}
