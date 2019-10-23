package com.exercise20palindromo.app;

import com.exercise20palindromo.model.StringAplications;

public class PalindromeApp 
{

	public static void main(String[] args) 
	{
		String cadPalindrome1 ="Anita lava la tina.";
		String cadPalindrome2 ="Yo dono rosas, oro no doy.!!";
		String cadPalindrome3 ="Isaac no ronca asi";
		
		//forma1
		System.out.println(StringAplications.isPalindrome(cadPalindrome1));
		System.out.println(StringAplications.isPalindrome(cadPalindrome2));
		System.out.println(StringAplications.isPalindrome(cadPalindrome3));
		//forma2
		System.out.println(StringAplications.isPalindromeStack(cadPalindrome1));
		System.out.println(StringAplications.isPalindromeStack(cadPalindrome2));
		System.out.println(StringAplications.isPalindromeStack(cadPalindrome3));
		
	}

}

