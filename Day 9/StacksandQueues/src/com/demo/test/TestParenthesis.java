package com.demo.test;

import cpm.demo.stacksqueues.MyStackListGeneric;

public class TestParenthesis {

	public static void main(String[] args) {
		String str1= "{{[](){[]}}}";
		String str2="{{}[{]}}";
		boolean status=checkParenthesis(str1);
		if(status) {
			System.out.println("it is balanced parenthesis "+str1);
		}else{
			System.out.println("it is not balanced parenthesis");
		}
		
		 status=checkParenthesis(str2);
		if(status) {
			System.out.println("it is balanced parenthesis "+str2);
		}else{
			System.out.println("it is not balanced parenthesis");
		}

	}

	private static boolean checkParenthesis(String str) {
		MyStackListGeneric<Character> st=new MyStackListGeneric<>();
		for(int i=0;i<str.length();i++) {
			Character ch=str.charAt(i);
			if(ch=='(' || ch=='{' || ch=='[') {
				st.push(ch);
			}else {
				if(st.isEmpty()) {
					return false;
				}else {
					Character ch1=st.pop();
					switch(ch) {
					case '}':
						if(ch1!='{')
							return false;
						break;
					case ')':
						if(ch1!='(')
							return false;
						break;
					case ']':
						if(ch1!='[')
							return false;
						break;
						
					}
				}
			}
		}//end of for
		if(st.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}

}
