package org.kk.javabrain;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService
public class ProductCatlog {

	public List<String> getProductCatgories() {
		List<String> categories = new ArrayList<>();
		categories.add("Book");
		categories.add("Music");
		categories.add("Movies");
		return categories;
	}
}
