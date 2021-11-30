package com.dtcc.fmt.meta.domain;

import java.util.Map;

public interface RuleResponses {
	
	ErrorResponse obtainResponse(Rule rule);
	
	Map<Rule, ErrorResponse> responseMap();
}
