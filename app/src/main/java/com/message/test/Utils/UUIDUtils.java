package com.message.test.Utils;

import java.util.UUID;

public class UUIDUtils {

	public static String getUUId() {

		String s = UUID.randomUUID().toString();
		// 去掉“-”符号
		return s.substring(0, 8) + s.substring(9, 13) + s.substring(14, 18)
				+ s.substring(19, 23) + s.substring(24);
	}

	public static String getShortUUId() {
		String s = UUID.randomUUID().toString();
		return s.substring(0, 8);
	}
}
