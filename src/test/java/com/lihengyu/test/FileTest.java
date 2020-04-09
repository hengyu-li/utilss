package com.lihengyu.test;

import org.junit.Test;

import com.lihengyu.dateutil.FileUtil;

public class FileTest {//测试
	
	@Test
	public void file() {
		String s=FileUtil.getExtendName("aa.txt");
		System.out.println(s);
	}

}
