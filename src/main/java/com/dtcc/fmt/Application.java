package com.dtcc.fmt;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.dtcc.fmt.dto.Term;
import com.dtcc.fmt.meta.domain.ErrorResponses;
import com.dtcc.fmt.service.TermValidationService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	
	
	

//	@Bean
	public CommandLineRunner cli(TermValidationService termValidationService) {
		return args -> {
			List<Term> terms = new ArrayList<>();
			Term term = new Term();
			term.setRepurchaseAgreementEndDate(new Date());
			term.setRepurchaseAgreementInterestRate(0);
			term.setRepurchaseAgreementStartAmount(100000);
			term.setRepurchaseAgreementEndAmount(100000);

			term.setRepurchaseAgreementStartDate(new Date());
			terms.add(term);
			ErrorResponses errors = termValidationService.validate(terms);
			errors.getErrors().forEach(System.out::println);

		};
	}

}
