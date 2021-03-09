package com.wyh.configure;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.pagehelper.PageHelper;
/**
 * 分页插件配置
 * @author wyh
 *
 */
@Configuration
public class PageHelperConfiguration {
	@Bean
	public PageHelper pageHelper() {
	    PageHelper pageHelper = new PageHelper();
	    Properties p = new Properties();
	    p.setProperty("offsetAsPageNum", "true");
	    p.setProperty("rowBoundsWithCount", "true");
	    p.setProperty("reasonable", "true");
	    pageHelper.setProperties(p);
	    return pageHelper;
	}
}
