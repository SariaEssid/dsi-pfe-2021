package com.esprit.gdp;

import java.util.HashMap;

public class Test {

	public static void main(String[] args)
	{
		
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>(); 
		  
        // Mapping string values to int keys 
        hash_map.put(10, "Geeks"); 
        hash_map.put(15, "4"); 
        hash_map.put(20, "Geeks"); 
        hash_map.put(25, "Welcomes"); 
        hash_map.put(30, "You"); 
  
        // Displaying the HashMap 
        System.out.println("Initial Mappings are: " + hash_map); 
  
        // Inserting existing key along with new value 
        String returned_value = (String)hash_map.put(20, "All"); 
  
        // Verifying the returned value 
        System.out.println("Returned value is: " + returned_value); 
  
        // Displayin the new map 
        System.out.println("New map is: " + hash_map); 
	       
//		// System.out.println("===============================================> lol-1" + );
//		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
//		DateFormat dateFormata = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
//		dateFormata.format(timestamp);
//		
//		System.out.println("-------------------> Date - 1: " + dateFormata.format(timestamp));
//		
//		
//
//		System.out.println("---------------------------------------------------------------------> Date: " + timestamp);
//		
//
//		Date date = new Date();
//		
////		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");  
////		dateFormat.format(date);
//		
//		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd HH24:MI:SS");  
//		dateFormat.format(new Date());
//		
//		
//		System.out.println("-------------------> Date - 1: " + date);
//		System.out.println("-------------------> Date - 2: " + dateFormat.format(date));
//		
//		System.out.println("---------------------------------------------------------------------------------------------------");
//		
//		String comb = "$2a$10$IpqXOR7mkhRwsd4LLcVK2eukhoHGy2nxRfTmZyRYAos0XBOEddNzG$$$$$sars123";
//		//String part1 = comb.substring(0, comb.lastIndexOf("сочетание"));
//		String part1 = comb.substring(comb.lastIndexOf("$$$$$") + 5, comb.length());
//		//String part2 = comb.substring(0, comb.lastIndexOf("$$$$$"));
//		
//		// System.out.println("-------------------> Part 1: " + part1);
//		 System.out.println("-------------------> Part 2: " + part1);
//		
//		
//		/****************************************************************************/
//		// $2a$10$qHNJL80LaTqpx14OX6T2Uent9PqwQicRr3D1sdIxpf0NzByINDqxG$$$$$7+iEtrS0dWxMH0uKDbbsoC2jRGRsXgUN
//		// $2a$10$RbyJBeGGHN18j/csfXuCCu/9zDtERjIFSvCgHHg1333ktolyeLOa.$$$$$QMfTrFomawQSGv1hJSBoEF/TAlBcL26M
//		 
//		String mpCryptoPassword = "salt";
////	    String value = "lol123a2";
////		
////		System.out.println(value);
////        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
////        encryptor.setPassword(mpCryptoPassword);
////        String encryptedPassword = encryptor.encrypt(value);
////        System.out.println(encryptedPassword);
//		
//		// $2a$10$QV9CPwk8eOEh6NO0Yipwy.Fz4yb2srU50JnwdrFHm4oppXKR.sgW6$$$$$g8BHUOt4kLsXqgQQbaaVxQ==
//		// $2a$10$1EV/2W49yVMdCqV5C.03YeTfWx/DnfoDIBK2AJQuXDgwScHCwB4fe$$$$$ivIFhde5ynG8QP1p+cs8sw==
//		
//        StandardPBEStringEncryptor decryptor = new StandardPBEStringEncryptor();
//        decryptor.setPassword(mpCryptoPassword);
//        System.out.println(decryptor.decrypt("ivIFhde5ynG8QP1p+cs8sw=="));
	}

}
