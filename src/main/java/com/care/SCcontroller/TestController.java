package com.care.SCcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController	// = @Controller와 @ResponseBody가 합쳐진것..  @ResponseBody를 따로 붙일 필요x. 세번째
public class TestController {
	
	static int aaa = 0;
	
	@GetMapping(value="ajax_result", produces = "application/json;charset=utf8")	//네번째. Json사용을 위해 test->json으로 변경	
	//public String ajax_post() { //@ResponseBody 없어도 값 전달 가능. 세번째
	public String ajax_get() throws JsonProcessingException {	//네번째. DB연결 후 받아온 값을 넘겨주는 상황을 가정. 반환값은 JSON형태만 가능
		//return "get: 데이터 추가할 때"; 세번째
		
		//네번째 추가
		ArrayList<UserDTO> list = new ArrayList<UserDTO>();
		UserDTO dto01 = new UserDTO();
		UserDTO dto02 = new UserDTO();
		dto01.setName("하나"); dto01.setAge("20");
		dto02.setName("둘"); dto02.setAge("30");
		list.add(dto01);	list.add(dto02);
		
		ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
		String strJson = mapper.writeValueAsString(list);		
		return strJson;
	}
	
									//한글 처리
	@PostMapping(value="ajax_result", produces = "application/test;charset=utf8")
	public String ajax_post() {return "post: 데이터 요구할 때";}
	
	@PutMapping(value="ajax_result", produces = "application/test;charset=utf8")
	public String ajax_put() {return "put: 수정할 때";}
	
	@DeleteMapping(value="ajax_result", produces = "application/test;charset=utf8")
	public String ajax_delete() {return "del: 삭제할 때";}
}
