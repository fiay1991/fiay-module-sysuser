package com.fiay.microserv.sysuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class FiayModuleSysuserApplication {

	public static void main(String[] args) {

		SpringApplication.run(FiayModuleSysuserApplication.class, args);

	}
}
