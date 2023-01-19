package com.bookslover.java.mapper.member;

import java.util.List;



import com.bookslover.java.vo.member.MemberVO;
/**
 * @create 01/18/23
 * @author sunjin
 * @title Member Mapper Interface
 */

public interface MemberMapper {
	
	public List<MemberVO> getAllMemberList();
}
