package com.alevel.java.nix.homework.hometask_16;

import java.util.LinkedList;

public class List {
	public static void main(String[] args) {

		LinkedList<String> states = new LinkedList<String>();

		// добавим в список ряд элементов
		states.add("Украйна");
		states.add("Россия");
		states.addLast("Англия"); // добавляем на последнее место
		states.addFirst("Испания"); // добавляем на первое место
		states.add(1, "Италия"); // добавляем элемент по индексу 1

		System.out.printf("List has %d elements \n", states.size());
		System.out.println(states.get(1));
		states.set(1, "Польща");
		for (String state : states) {

			System.out.println(state);
		}
		// проверка на наличие элемента в списке
		if (states.contains("Украйна")) {

			System.out.println("Список содержит Украйна");
		}

		states.remove("Украйна");
		states.removeFirst(); // удаление первого элемента
		states.removeLast(); // удаление последнего элемента

		LinkedList<Person> people = new LinkedList<Person>();
		people.add(new Person("Катя"));
		people.addFirst(new Person("Саша"));
		people.addLast(new Person("Даша"));
		people.remove(1); // удаление второго элемента

		for (Person p : people) {

			System.out.println(p.getName());
		}
		Person first = people.getFirst();
		System.out.println(first.getName()); // вывод первого элемента
	}
}

class Person {

	private String name;

	public Person(String value) {

		name = value;
	}

	String getName() {
		return name;
	}
}
