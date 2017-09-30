package ch.axonivy.web.application.page.samplepage;

import lombok.Getter;
import lombok.Setter;
import ch.axonivy.web.application.component.datatable.DataTableController;
import ch.axonivy.web.application.page.samplepage.model.CustomerModel;
import ch.axonivy.web.application.page.samplepage.service.SamplePageService;

public class CustomerTable extends DataTableController<CustomerModel> {
	@Getter
	@Setter
	private CustomerModel selectedCustomer;
	
	private SamplePageService service;
	
	public CustomerTable(){
		this.service = new SamplePageService();
	}

	public void init() {
		this.setResources(this.service.getCustomers());		
	}

}
