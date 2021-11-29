package com.learning.service;

import java.security.SecureRandom;

public class credentialService {

	public String generateEmailAddress(String fn,String ln, String de) {
		return fn + ln + "@" + de + ".abc.com";
	}
	
	public static String generatePassword()
    {
		String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String specialCharacters = "!@#$%^&*()";
		String numbers = "1234567890";
		String chars = specialCharacters + capitalCaseLetters + lowerCaseLetters + numbers;
	  
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
 
        for (int i = 0; i < 8; i++)
        {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
 
        return sb.toString();
    }
	
	public void showCredentials(String fn,String em, String de) {
		System.out.println("Dear "+fn+" your generated credentials are as follows");
		System.out.println("Email -->"+em);
	
		System.out.println("Password -->"+ generatePassword());
	} 

}
