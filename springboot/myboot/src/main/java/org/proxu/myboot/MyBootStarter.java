package org.proxu.myboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * TODO
 *
 * @author ProXu
 * @version 1.0
 * @date 2020/9/16 0016 15:46
 */
@MapperScan("org.proxu.myboot.dao")
@SpringBootApplication
public class MyBootStarter {
	public static void main(String[] args) {
		SpringApplication.run(MyBootStarter.class, args);
	}
}

