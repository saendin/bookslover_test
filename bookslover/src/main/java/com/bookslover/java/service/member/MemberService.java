package com.bookslover.java.service.member;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bookslover.java.vo.member.MemberVO;

/**
 * @create 01/18/23
 * @author sunjin
 * @title Member Mapper Interface
 */
@Service
public interface MemberService {
	public List<MemberVO> getAllMemberList();
}
