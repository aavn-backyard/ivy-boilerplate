package ch.axonivy.web.application.page.samplepage.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import ch.axonivy.web.application.page.samplepage.model.CustomerModel;
import ch.axonivy.web.application.page.samplepage.model.Gender;

public class SamplePageService {

	public List<CustomerModel> getCustomers() {
		List<CustomerModel> result = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			result.add(CustomerModel
					.builder()
					.customerId(String.valueOf(i))
					.name("Customer " + i)
					.gender(Gender.values()[(new Random()).nextInt(Gender
							.values().length)]).build());
		}
		return result;
	}

}
