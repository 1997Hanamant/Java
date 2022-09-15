package com.xworkz.core_java.collectionFramework.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductRunner {
	public static void main(String[] args) {
		List<Product> products = new ArrayList<Product>();
		products.add(new Product(1, "Dell", 300000.00D));
		products.add(new Product(2, "Hp", 400000.00D));
		products.add(new Product(3, "Lenova", 350000.00D));
		products.add(new Product(4, "Sony", 500000.00D));

//		products.stream().filter(product -> product.price == 300000.00D)
//				.forEach(product -> System.out.println(product.name));
//		List<Double> productsList = products.stream().filter(product -> product.price == 300000.00D)
//				.map(product -> product.price).collect(Collectors.toList());
//		System.out.println(productsList);

		List<String> proList = products.stream().filter(product -> product.name.equals("Hp"))
				.map(product -> product.name).collect(Collectors.toList());
		System.out.println(proList);

	}
}