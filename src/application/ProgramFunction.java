package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

public class ProgramFunction {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//1
		List<String> names1 = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		names1.forEach(System.out::println);
		
		//2
		List<String> names2 = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
		names2.forEach(System.out::println);
		

	}
}
