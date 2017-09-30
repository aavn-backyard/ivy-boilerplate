package ch.axonivy.web.application.component.datatable;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class DataTableController<T> {
	private List<T> resources;
	private List<T> filteredModels;
	
	public DataTableController(){
		this.resources = new ArrayList<>();
		this.filteredModels = new ArrayList<>();
	}
}
