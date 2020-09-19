package org.proxu.myboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * TODO
 *
 * @author ProXu
 * @version 1.0
 * @date 2020/9/16 0016 16:19
 */
@Controller("helloController")
@RequestMapping("/hello")
public class HelloController {
	@GetMapping("/say")
	@ResponseBody
	public String say() throws Exception{
		return "HelloWorld!";
	}
}
