package com.bookslover.java.controller.member;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.bookslover.java.service.member.MemberService;
import com.bookslover.java.vo.member.MemberVO;

@RestController
@RequestMapping("/") //요청 URI 묶을 단위
public class MemberController {

	@Autowired
	MemberService memService;
	
	@GetMapping
	public ModelAndView main() {
		//데이터와 뷰를 동시에 설정 가능
//		List<MemberVO> memberList = memService.getAllMemberList();
		ModelAndView viewName = new ModelAndView();
		viewName.setViewName("page/main"); //뷰의 이름
//		viewName.addObject("list", memberList);
		
		return viewName;
	}

	
	//회원 리스트 반환
	@GetMapping("member")
	public ModelAndView getMemberList() throws Exception{
		List<MemberVO> memberList = memService.getAllMemberList();
		
		ModelAndView viewName = new ModelAndView();
		viewName.setViewName("page/memberList");
		viewName.addObject("list", memberList);
		
		return viewName;

	}
}
