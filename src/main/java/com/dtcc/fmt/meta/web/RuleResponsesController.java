package com.dtcc.fmt.meta.web;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dtcc.fmt.meta.domain.ErrorResponse;
import com.dtcc.fmt.meta.domain.Rule;
import com.dtcc.fmt.meta.domain.RuleResponses;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;

@Api(tags = "Rule Responses", description = " ")
@RestController
@RequiredArgsConstructor
@RequestMapping("rules/responses")
public class RuleResponsesController {

	private final RuleResponses rResponses;

	@GetMapping
	@ApiOperation("Lists all the available rules and responses")
	public Map<Rule, ErrorResponse> getAllResponses() {
		return rResponses.responseMap();
	}
}
