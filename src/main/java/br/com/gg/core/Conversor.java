package br.com.gg.core;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class Conversor {

	private List<Field> chaves;
	private Class<?> classe;

	public String executeConversion(Object object) throws IllegalArgumentException, IllegalAccessException {
		classe = salvarClasse(object);
		chaves = salvarCampos(classe);

		for (Field atributo : chaves) {
			atributo.setAccessible(true);
			System.out.println(atributo.getName());
			if (atributo.getType().getName().contains("java.util.List")) {
				executeConversion(atributo.get(object));
			}
		}

		StringBuilder sb = new StringBuilder();
		return sb.toString();
	}

	private List<Field> salvarCampos(Class<?> classe) {
		return Arrays.asList(classe.getDeclaredFields());
	}

	private Class<?> salvarClasse(Object object) {
		Class<?> klass = object.getClass();
		return klass;
	}

}
