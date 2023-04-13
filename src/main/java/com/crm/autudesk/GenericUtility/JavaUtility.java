package com.crm.autudesk.GenericUtility;

import java.util.Random;

/**
 * This class contains generic methods related to java
 * @author punith raj.c
 *
 */

public class JavaUtility {
	/**
	 * This method generates random number
	 */
public int getRandomNum()
{
	Random ran=new Random();
	int randomNum=ran.nextInt(1000);
	return randomNum;
	
}
}
