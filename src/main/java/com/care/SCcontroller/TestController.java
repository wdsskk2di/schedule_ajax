package com.care.SCcontroller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	// = @Controller와 @ResponseBody가 합쳐진것..  @ResponseBody를 따로 붙일 필요x
public class TestController {
	
	static int aaa = 0;
	
	@PostMapping(value="ajax_result", produces = "application/test;charset=utf8")
	//@ResponseBody 없어도 값 전달 가능
	public String ajax_post() {
		return "post: 데이터 추가할 때";
	}
	
	@GetMapping(value="ajax_result", produces = "application/test;charset=utf8")
	public String ajax_get() {
		return "get: 데이터 요구할 때";
	}
	
	@PutMapping(value="ajax_result", produces = "application/test;charset=utf8")
	public String ajax_put() {
		return "put: 수정할 때";
	}
	
	@DeleteMapping(value="ajax_result", produces = "application/test;charset=utf8")
	public String ajax_delete() {
		return "del: 삭제할 때";
	}
}
