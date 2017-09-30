var IvyBoilerPlate = IvyBoilerPlate || {};
IvyBoilerPlate.component = IvyBoilerPlate.component || {};
IvyBoilerPlate.component.datatable = IvyBoilerPlate.component.datatable || {};
IvyBoilerPlate.component.datatable.CustomTable = IvyBoilerPlate.component.datatable.CustomTable || {};

IvyBoilerPlate.component.datatable.CustomTable.loadById = function(id){
	var $el = $("div.datatable-component[data-component-id$='" + id + "']");
	if($el.length === 0) {
		console.error("Cannot find any datatable component with id = " + id);
		return;
	}
	var el = $el.get(0);
	var tableWvar = $el.attr("data-component-widgetVar");
	IvyBoilerPlate.component.datatable.CustomTable.decorate(PF(tableWvar));
	PF(tableWvar)._setupPagingOption();
	PF(tableWvar).filter();
};

IvyBoilerPlate.component.datatable.CustomTable.decorate = function(table){
	table._setupPagingOption = function(){
		var displayAllOption = this.jq.find(".ui-paginator-rpp-options option[value=999999]");
		displayAllOption.text("All");
	};
}
