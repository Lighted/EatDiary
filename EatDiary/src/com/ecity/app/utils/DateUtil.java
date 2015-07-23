package com.ecity.app.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateUtil {
	private static SimpleDateFormat sf1 = new SimpleDateFormat(
			"yy-MM-dd HH£ºmm:ss",Locale.CHINA);

	public static String getCurrentTime() {
		return sf1.format(new Date());
	}

}
