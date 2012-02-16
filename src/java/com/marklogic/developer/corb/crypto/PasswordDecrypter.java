package com.marklogic.developer.corb.crypto;

public class PasswordDecrypter {
	public static void main(String[] args) throws Exception {

		String decrypted = Crypto.decryptPassword();
	    System.out.println("Decrypted password: " + decrypted);	    
	}
}


