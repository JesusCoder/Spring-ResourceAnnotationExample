package com.sun.steve.atResourceAnnotationExample;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Wife {
	
	@Getter
	@Setter
	private String name;
	
	@Getter
	@Setter
	private String faith;

}
