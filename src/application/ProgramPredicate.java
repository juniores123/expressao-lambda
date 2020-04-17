package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;
import util.ProductPredicate;

public class ProgramPredicate {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
//		//forma 1
		list.removeIf(new ProductPredicate());
		
//		//forma 2
		list.removeIf(Product::staticProductPredicate);
		
		//lambda
		Predicate<Product> pred = p -> p.getPrice() >= 100.0;
		list.removeIf(pred);
		
		//lambda in line
		list.removeIf(p -> p.getPrice() >= 100.0);
		
		for(Product p : list) {
			System.out.println(p);
		}
	}

}
