package com.dtcc.fmt.dto;

import java.util.Date;

import lombok.Data;

@Data
public class Term {

	private double repurchaseAgreementInterestRate;
	private double repurchaseAgreementStartAmount;
	private double repurchaseAgreementEndAmount;
	private Date repurchaseAgreementStartDate;
	private Date repurchaseAgreementEndDate;

	/*
	public double getRepurchaseAgreementEndAmount() {
		Term = repurchaseAgreementEndDate - repurchaseAgreementStartDate
		Repo Interest Amount = repurchaseAgreementStartAmount * repurchaseAgreementInterestRate * (Term/360)
		repurchaseAgreementEndAmount = repurchaseAgreementStartAmount + (Repo Interest Amount)
		return repurchaseAgreementEndAmount;
	}
	*/

}
