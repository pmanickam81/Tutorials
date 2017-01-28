package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LanguageController {

	@Value("${language-known}") String languageKnown;

	@RequestMapping("/language-known")
	public String showLuckyWord() {
		return "The lucky known is: " + languageKnown;
	}

}
