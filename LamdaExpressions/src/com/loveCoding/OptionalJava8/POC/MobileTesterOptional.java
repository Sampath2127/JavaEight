package com.loveCoding.OptionalJava8.POC;

import java.util.Optional;

public class MobileTesterOptional {

	public static void main(String[] args) {
		ScreenResolution screenResolution=new ScreenResolution(3080, 2020);
		DisplayFeatures displayFeatures=new DisplayFeatures("5.5", Optional.of(screenResolution));
		Mobile mobile =new Mobile(12345689, "Yapple", "YPhone", Optional.of(displayFeatures)); 
		
		MobileService mobileService=new MobileService();
		System.out.println(mobileService.getMobileScreenWidth(Optional.of(mobile)));
		
		Mobile mobile2=new Mobile(12345689, "Yapple", "YPhone", Optional.empty()); 
		System.out.println(mobileService.getMobileScreenWidth(Optional.of(mobile2)));
	}
}
