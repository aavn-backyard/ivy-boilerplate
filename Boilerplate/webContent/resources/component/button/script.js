var IvyBoilerPlate = IvyBoilerPlate || {};
IvyBoilerPlate.component = IvyBoilerPlate.component || {};
IvyBoilerPlate.component.button = IvyBoilerPlate.component.button || {};
IvyBoilerPlate.component.button.CustomButton = IvyBoilerPlate.component.button.CustomButton || {};


IvyBoilerPlate.component.button.CustomButton.loadById = function(id){
	var $el = $("div.custombutton-component[data-component-id$='"+id+"']");
	if($el.length === 0) {
		console.error("Cannot find any custom button component with id = " + id);
		return;
	}
};

