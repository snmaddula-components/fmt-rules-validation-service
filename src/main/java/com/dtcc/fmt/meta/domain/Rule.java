package com.dtcc.fmt.meta.domain;

public enum Rule {

	//TODO:: update enum keys appropriately
	
	RULE_1("Repurchase Agreement Interest Rate cannot be '0'", "ROP-9081"),
	RULE_2("Repurchase Agreement Interest Rate must be between -99.9999999 and 99.999999", "ROP-9082"),
	RULE_3("Repurchase Agreement Start Date must be a Valid Business Date", "ROP-9083"),
	RULE_4("Repurchase Agreement End Date must be a Valid Business Date", "ROP-9084"),
	RULE_5("Repurchase Agreement Start Date must be less than End Date", "ROP-9085"),
	RULE_6("Repurchase Agreement End Date must be greater than Start Date", "ROP-9086"),
	RULE_7("Repurchase Agreement Start Amount must be a multiple of 1 Million", "ROP-9087"),
	RULE_8("Repurchase Agreement Start Amount must be greater than or equal to $1 Million", "ROP-9088"),
	RULE_9("Repurchase Agreement Start Amount must be less than or equal to $2 Billion", "ROP-9089");
	
	private String value;
	private String code;
	
	private Rule(String value, String code) {
		this.value = value;
		this.code = code;
	}
	
	public String getValue() {
		return value;
	}
	
	public String getCode() {
		return code;
	}
	
	
//
//	String RULE_5 = "Repurchase Agreement Start Date must be less than End Date";
//
//	String RULE_6 = "Repurchase Agreement End Date must be greater than Start Date";
//
//	String RULE_7 = "Repurchase Agreement Start Amount must be a multiple of 1 Million";
//
//	String RULE_8 = "Repurchase Agreement Start Amount must be greater than or equal to $1 Million";
//
//	String RULE_9 = "Repurchase Agreement Start Amount must be less than or equal to $2 Billion";
}
