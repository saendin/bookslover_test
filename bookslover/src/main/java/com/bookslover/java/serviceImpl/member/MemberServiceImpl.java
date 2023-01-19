package com.bookslover.java.serviceImpl.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookslover.java.mapper.member.MemberMapper;
import com.bookslover.java.service.member.MemberService;
import com.bookslover.java.vo.member.MemberVO;

/**
 * @create 01/18/23
 * @author sunjin
 * @title Member Mapper Interface
 */

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	MemberMapper mapper;
	
	//멤버리스트
	@Override
	public List<MemberVO> getAllMemberList() {
		return mapper.getAllMemberList();
	}
}
