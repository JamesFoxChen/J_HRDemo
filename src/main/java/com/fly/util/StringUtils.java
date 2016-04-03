package com.fly.util;

import java.security.MessageDigest;
import java.util.UUID;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class StringUtils {

	private final static Log logger = LogFactory.getLog(StringUtils.class);


	/**
	 * @FuncName getToken
	 * @description 获取token
	 * @return strong token
	 * @author xiaoyong
	 * @throws Exception
	 */
	public static String getToken() {
		logger.info("生成token");
		StringBuffer buf = new StringBuffer("");
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(UUID.randomUUID().toString().replaceAll("-", "").getBytes());
			byte b[] = md.digest();
			int i;
			for (int offset = 0; offset < b.length; offset++) {
				i = b[offset];
				if (i < 0) {
					i += 256;
				}
				if (i < 16) {
					buf.append("0");
				}

				buf.append(Integer.toHexString(i));
			}

		} catch (Exception e) {
			logger.error("生成Token异常" + e);
		}
		return buf.toString();
	}
}
