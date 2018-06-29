package org.cookienats.template;

import javafx.application.Application;
import org.cookienats.template.base.CommonMapper;
import org.cookienats.template.conf.ConfigBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableConfigurationProperties(ConfigBean.class)
@EnableTransactionManagement
@MapperScan("org.cookienats.template.dao") //配置扫描mapper接口的地址
public class TemplateApplication  extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }


    public static void main(String[] args) {
        SpringApplication.run(TemplateApplication.class, args);
    }
}
