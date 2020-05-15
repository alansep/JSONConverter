package br.com.gg.core;

public class JsonUtil {

	public static boolean isList(Object object) {
		System.out.println(getClass(object).getName());
		Class<?> classe = getClass(object);
		if (classe.getName().startsWith("java.util") && classe.getName().split("\\.")[2].toLowerCase().contains("list")) {
			return true;
		}
		return false;
	}

	private static Class<?> getClass(Object object) {
		return object.getClass();
	}

}
