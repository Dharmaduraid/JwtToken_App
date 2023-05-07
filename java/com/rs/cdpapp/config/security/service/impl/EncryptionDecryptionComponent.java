package com.rs.cdpapp.config.security.service.impl;

import java.security.MessageDigest;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class EncryptionDecryptionComponent {

	private static String UTF = "UTF-8";
	/*
	 * private Pattern BCRYPT_PATTERN = Pattern
	 * .compile("\\A\\$2a?\\$\\d\\d\\$[./0-9A-Za-z]{53}");
	 */
	protected final Logger logger = LoggerFactory.getLogger(getClass());

	public String encryptionText(String text, String key) {
		String encText = "";
		byte[] keyArray = new byte[24];
		byte[] toEncryptArray = null;
		try {
			toEncryptArray = text.getBytes(UTF);
			MessageDigest m = MessageDigest.getInstance("MD5");
			byte temporaryKey[] = m.digest(key.getBytes(UTF));
			if (temporaryKey.length < 24) {
				int index = 0;
				for (int i = temporaryKey.length; i < 24; i++)
					keyArray[i] = temporaryKey[index];

			}
			Cipher c = Cipher.getInstance("DESede/CBC/PKCS5Padding");
			c.init(1, new SecretKeySpec(keyArray, "DESede"), new IvParameterSpec(sharedvector));
			byte encrypted[] = c.doFinal(toEncryptArray);
			encText = Base64.getEncoder().encodeToString(encrypted);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return encText;
	}

	public String decryptText(String text, String key) {
		String decrypText = "";
		byte keyArray[] = new byte[24];
		try {
			MessageDigest m = MessageDigest.getInstance("MD5");
			byte temporaryKey[] = m.digest(key.getBytes(UTF));
			if (temporaryKey.length < 24) {
				int index = 0;
				for (int i = temporaryKey.length; i < 24; i++)
					keyArray[i] = temporaryKey[index];

			}
			Cipher c = Cipher.getInstance("DESede/CBC/PKCS5Padding");
			c.init(2, new SecretKeySpec(keyArray, "DESede"), new IvParameterSpec(sharedvector));
			byte decrypted[] = c.doFinal(Base64.getDecoder().decode(text));
			decrypText = new String(decrypted, UTF);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return decrypText;
	}

	private static byte[] sharedvector = { 1, 2, 3, 5, 7, 11, 13, 17 };

	public static void main(String[] args) {
//		EncryptionDecryptionComponent obj=new EncryptionDecryptionComponent();
//		System.out.println(" "+obj.encryptionText("P@ssword123",H2HAppIntegrationConstants.ENCRYPT_DECRYPT_KEY.getValue()));
//		
//		System.out.println(" "+obj.decryptText("V9oKYrLki7c17sowtSpMVaS7VIALl2OO", H2HAppIntegrationConstants.ENCRYPT_DECRYPT_KEY.getValue()));
//		String text=StringUtils.rightPad("sarangapani.sankar@royalsundaram.in",2," ");
//		System.out.println(text+".");
		
		System.out.println(" "+StringUtils.isNumeric("18828738.78")+" "+NumberUtils.isDigits("18828738.78"));
		
//		/PMDD/sarangapani.sankar@royalsundaram.in                                  .
		
		
		
	}
}
