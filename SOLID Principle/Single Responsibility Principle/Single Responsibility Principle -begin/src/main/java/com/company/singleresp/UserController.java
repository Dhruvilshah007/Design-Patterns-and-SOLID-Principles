package com.company.singleresp;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.fasterxml.jackson.databind.ObjectMapper;

//Handles incoming JSON requests that work on User resource/entity
public class UserController {
	// Store used by controller
	// private Store store = new Store();

	// #2-Created new class for User save()
	private UserPersistenceService persistenceService = new UserPersistenceService();

	// #3 Created new class for json to bean conversion
	JsonToBeanConverter beanConverter = new JsonToBeanConverter();

	// Create a new user
	public String createUser(String userJson) throws IOException {
		try {
			User user = beanConverter.convertJsonToBean(userJson, User.class);

			// #1-Created new class for User validation
			UserValidator validator = new UserValidator();
			boolean valid = validator.validateUser(user);

			if (!valid) {
				return "ERROR";
			}

			persistenceService.saveUser(user);
		} catch (Exception e) {
			// Handle exception
			return null;
		}

		return "SUCCESS";
	}

}