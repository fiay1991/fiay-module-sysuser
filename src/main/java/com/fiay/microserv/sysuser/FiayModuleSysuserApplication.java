package com.fiay.microserv.sysuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ServletComponentScan
@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan(basePackages = "com.fiay.microserv.sysuser")
public class FiayModuleSysuserApplication {

    public static void main(String[] args) {

        SpringApplication.run(FiayModuleSysuserApplication.class, args);

    }
}
