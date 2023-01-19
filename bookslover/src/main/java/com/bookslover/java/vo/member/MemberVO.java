package com.bookslover.java.vo.member;

import java.util.Date;

import lombok.Data;

/**
 * @create 01/18/23
 * @author sunjin
 * @title Member VO
 */
@Data
public class MemberVO {
	
		private String memId;
		private String memPwd;
		private String memName;
		private String memNickName;
		private int memBirthday;
		private int memSex;
		private int memPhone;
		private String memProfileImg;
		private int memGrade;
		private int memAdmin;
		private Date memLastLogin;
		private int memStatus;
}
