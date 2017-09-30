package ch.axonivy.web.kit.util;

import com.rits.cloning.Cloner;

public class ClonerUtil {

	public static <T> T deepClone(T customerModel) {
		return (new Cloner()).deepClone(customerModel);
	}

}
