package Question_one;

import java.util.*;

public class Product_Repo 
{
	private List<Product> pro;
	Product_Repo()
	{
		pro = new ArrayList<Product>();
		Product pr1 = new Product(101,"Samsung Moile",55499.00,"Electronics");
		Product pr2 = new Product(102,"T-shirt",200.00,"Clothing");
		Product pr3 = new Product(103,"Charger Adapter",450.00,"Electronics");
		Product pr4 = new Product(104,"Bluetooh Speaker",2500.00,"Electronics");
		Product pr5 = new Product(105,"Shorts",1000.00,"Clothing");
		Product pr6 = new Product(106,"Coke",300.00,"Food");
		pro.add(pr1);
		pro.add(pr2);
		pro.add(pr3);
		pro.add(pr4);
		pro.add(pr5);
		pro.add(pr6);
	}

	public List<Product> getList()
	{
	return pro;
	}

}

