package com.bookslover.java;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import com.bookslover.java.mapper.member.MemberMapper;
import com.bookslover.java.service.member.MemberService;
import com.bookslover.java.vo.member.MemberVO;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	MemberMapper memberMapper;
	
	@Autowired
	MemberService memberService;
	
	//회원 리스트 조회 테스트
	@Test
	@Transactional
	@Rollback(false)
	public void getAllMember() {
		System.out.println("test를 시작합니다.");
		
		List<MemberVO> memberList = new ArrayList<>();
		
		for(int i=0; i<memberList.size(); i++) {
			System.out.println(memberList);
		}
		
		memberService.getAllMemberList();
	}

}
