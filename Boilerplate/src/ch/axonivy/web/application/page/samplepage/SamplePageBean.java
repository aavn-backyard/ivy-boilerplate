package ch.axonivy.web.application.page.samplepage;

import org.primefaces.event.SelectEvent;

import ch.axonivy.web.application.page.samplepage.model.CustomerModel;
import ch.axonivy.web.kit.validation.Assert;

public class SamplePageBean {
	private CustomerInfo customerInfo;
	private CustomerTable customers;
	
	public SamplePageBean(){
		this.customerInfo = new CustomerInfo();
		this.customers = new CustomerTable();
	}
	
	public void init(){
		this.customers.init();
	}
	
	public CustomerInfo getCustomerInfo() {
		return customerInfo;
	}

	public CustomerTable getCustomers() {
		return customers;
	}
	
	public void setCustomers(CustomerTable customers) {
		this.customers = customers;
	}
	
	public void submit(){
		//TODO Auto-generated method stub
	}
	
	public void onSelectCustomer(SelectEvent event){
		Assert.instanceOf(event.getObject(), CustomerModel.class, "Selected customer is not a instance of CustomerModel");
		this.customerInfo.data((CustomerModel)event.getObject());
	}
	
	
}
