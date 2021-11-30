package com.dtcc.fmt.service;

import java.util.List;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.StatelessKieSession;
import org.springframework.stereotype.Service;

import com.dtcc.fmt.dto.Term;
import com.dtcc.fmt.meta.domain.ErrorResponses;
import com.dtcc.fmt.meta.domain.RuleResponses;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TermValidationService {

	private final RuleResponses ruleResponses;
	
	
	public ErrorResponses validate(List<Term> terms) {
		ErrorResponses errors = new ErrorResponses();
		KieContainer kieContainer = KieServices.Factory.get().getKieClasspathContainer();
		StatelessKieSession kieSession = kieContainer.newStatelessKieSession("FMTValidations");
		kieSession.setGlobal("errors", errors);
		kieSession.setGlobal("ruleResponses", ruleResponses);
		System.out.println("==== DROOLS SESSION START ==== ");
		terms.forEach(_term -> {
			kieSession.execute(_term);
		});
		System.out.println("==== DROOLS SESSION END ==== ");
		return errors;
	}
}
