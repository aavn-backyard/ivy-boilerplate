package ch.axonivy.web.application.page.samplepage;

import java.util.Arrays;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import ch.axonivy.web.application.page.samplepage.model.CustomerModel;
import ch.axonivy.web.application.page.samplepage.model.Gender;
import ch.axonivy.web.kit.util.ClonerUtil;

@Getter
@Setter
public class CustomerInfo {
	private CustomerModel selectedModel;

	public CustomerInfo() {
		this.selectedModel = CustomerModel.builder().build();
	}

	public List<Gender> getGenders() {
		return Arrays.asList(Gender.values());
	}

	public void data(CustomerModel customerModel) {
		this.selectedModel = ClonerUtil.deepClone(customerModel);
	}
}
