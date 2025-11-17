package com.lgdx.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// Spring에서는 FC가 Controller를 찾기 위해 Servlet-context.xml에서
// Component Scan을 통해 작업을 진행했다면!
// Boot에서는 해당 과정이 자동적으로 진행이 된다!
// -> SpringBootApplication.java 에서

@Controller
public class MyViewController {
	// - 화면을 띄워주기만 하는 컨트롤러

	// Spring boot에서는 RequestMapping은 권장하지 않는다!
	// -> Get/PostMapping으로 명확하게 Mapping을 구분하는 게 좋다!
	@GetMapping("/")
	public String goHome() {
//		return "home";
		return "Main";
	}
	
	@GetMapping("/goUpdate")
	public String goUpdate() {
		return "UpdateMember";
	}
	
}
