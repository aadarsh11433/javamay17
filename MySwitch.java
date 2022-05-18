package com.aadarsh;

public class MySwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String city = "Delhi";
		
		switch (city) {
		case "Mumbai":
			System.out.println("Financial city");
			break;
			
		case "Delhi":
			System.out.println("Capital of the country");
			break;
			
		case "Kolkata":
			System.out.println("City of Joy");
			break;
			
		case "Bangalore":
			System.out.println("Cyber City");
			break;

		default:
			System.out.println("May be Other Indian City");
			break;
		}
            
		 
	}

	
}
