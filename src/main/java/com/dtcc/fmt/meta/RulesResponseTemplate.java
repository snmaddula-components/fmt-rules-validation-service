package com.dtcc.fmt.meta;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.dtcc.fmt.meta.domain.ErrorResponse;
import com.dtcc.fmt.meta.domain.Rule;
import com.dtcc.fmt.meta.domain.RuleResponses;

@Component
public class RulesResponseTemplate implements RuleResponses {

	private static final String ERROR_CODE = "ErrorCode";
	private static final String ERROR_RESP = "ErrorResponse";
	
	private Map<Rule, ErrorResponse> responseMap = new HashMap<>();
	
	@PostConstruct
	public void init() {
		for(Rule rule : Rule.values()) {
			ErrorResponse errorResponse = new ErrorResponse();
			errorResponse.addError(ERROR_CODE, rule.getCode());
			errorResponse.addError(ERROR_RESP, rule.getValue());
			responseMap.putIfAbsent(rule, errorResponse);
		}
	}
	
	@Override
	public ErrorResponse obtainResponse(Rule rule) {
		return responseMap.get(rule);
	}

	@Override
	public Map<Rule, ErrorResponse> responseMap() {
		return responseMap;
	}
	
}
