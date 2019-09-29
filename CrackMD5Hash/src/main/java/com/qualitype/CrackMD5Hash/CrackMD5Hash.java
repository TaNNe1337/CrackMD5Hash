package com.qualitype.CrackMD5Hash;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CrackMD5Hash {

	public String getPassword(String hash) {
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (final NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		if (hash != null) {
			for (int i = 0; i <= 9999; i++) {
				final String passwordString = String.format("%04d", i);
				byte[] passwordByte = null;
				passwordByte = md.digest(passwordString.getBytes(StandardCharsets.UTF_8));
				final StringBuilder sb = new StringBuilder();
				for (final byte b : passwordByte) {
					sb.append(String.format("%02x", b));
				}
				if (sb.toString().equals(hash)) {
					return passwordString;
				}
			}
		}
		return null;

	}
}
