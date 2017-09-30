package ch.axonivy.web.kit.validation;

import java.util.Objects;
import java.util.function.Predicate;

import org.apache.poi.ss.formula.functions.T;

import ch.axonivy.web.application.page.samplepage.model.CustomerModel;


public final class Assert {

	private static <T> void assertion(Predicate<T> predicate, T t, String msg) {
		if(!predicate.test(t)){
			throw new IllegalArgumentException(msg);
		}
	}

	public static void instanceOf(Object object, Class<?> clazz, String msg) {
		assertion(obj -> clazz.isInstance(obj), object, msg);
	}

	public static void nonNull(CustomerModel selectedModel, String msg) {
		assertion(Objects::nonNull , selectedModel, msg);
	}
}
