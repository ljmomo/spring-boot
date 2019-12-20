package com.lvzhu.springboot.lvzhu.mvc.config;

import com.lvzhu.springboot.lvzhu.mvc.pojo.User;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;


/**
 * @author lvzhu.
 * Time 2019-12-19 22:55
 * Desc 文件描述
 */
@Configuration
@ConditionalOnProperty(prefix="mf",name = "assert", havingValue = "true")
public class AssertConfig {

	@Bean(initMethod = "init")
	@Lazy(value = false)
	public User user() {
		return new User();
	}
}
