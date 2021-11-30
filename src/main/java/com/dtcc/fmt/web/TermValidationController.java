package com.dtcc.fmt.web;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dtcc.fmt.dto.Term;
import com.dtcc.fmt.meta.domain.ErrorResponses;
import com.dtcc.fmt.service.TermValidationService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/terms/validate")
@Api(tags = "Terms Validation", description = " ")
@RequiredArgsConstructor
public class TermValidationController {

	private final TermValidationService termValidationService;

	@PostMapping
	@ApiOperation("Validates the provided 'term' fact objects against the available rules.")
	public ErrorResponses validate(@RequestBody List<Term> termFacts) {
		return termValidationService.validate(termFacts);
	}

}
