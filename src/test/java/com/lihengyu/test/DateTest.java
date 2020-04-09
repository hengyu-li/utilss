package com.lihengyu.test;

import java.util.Date;

import org.junit.Test;

import com.lihengyu.dateutil.DateUtil;

public class DateTest {//测试
	
	@Test
	public void fundate() {
		Date date=new Date(2019-3-11);
		Date d=DateUtil.getDateByFullMonth(date);
		System.out.println(d);
		
	}
	
	@Test
	public void Date() {
		Date date=new Date(2019-3-11);
		Date d=DateUtil.getDateByInitMonth(date);
		System.out.println(d);
		
	}

}
