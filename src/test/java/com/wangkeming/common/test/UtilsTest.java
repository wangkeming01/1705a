package com.wangkeming.common.test;

import org.junit.Test;

import com.wangkeming.common.utils.StringUtil;

public class UtilsTest {
	
	//转换格式
	@Test
	public void test01() {
		String text = "9月5日一大早，又有了新情况。\\r上午9点多，传出中美经贸高级别磋商牵头人通话的消息。\\n9月5日上午，中共中央政治局委员、国务院副总理、中美全面经济对话中方牵头人刘鹤应约与美国贸易代表莱特希泽、财政部长姆努钦通话。";
		String html = StringUtil.toHtml(text);
		System.out.println(html);
	}
	
	//测试电话
	@Test
	public void test02() {
		String text = "1383838438";
		System.out.println(StringUtil.isMobileNumber(text));
	}
	
	//测试邮箱
	@Test
	public void test03() {
		String text = "1383838438@qq.com";
		System.out.println(StringUtil.isEmail(text));
	}
}
