import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import sample.Items;
public class MobilePhone {
	
	public static void main(String[] args) {
		
		List<Items> resultList;
	    	List<Items> itemList = new ArrayList<>();

		itemList.add(new Items(202, "Oneplus 9 Pro", "Smartphone", true, 64999));
		itemList.add(new Items(212, "Galaxy S21 Ultra", "Smartphone", true, 105999));
		itemList.add(new Items(225, "TCL", "watch", false, 70000));
		itemList.add(new Items(217, "Samsung Galaxy Note 20 Ultra", "Laptop", false, 38999));
		itemList.add(new Items(238, "Apple Iphone 12 Pro Max", "Smartphone", true, 95000));
		itemList.add(new Items(220, "Tecno", "Smartphone", true, 119900));
		itemList.add(new Items(216, "Xiaomi Mi 10", "Smatphone", true, 48999));
		itemList.add(new Items(235, "Vivo X60 Pro+", "Smartphone", true, 44999));
		itemList.add(new Items(207, "Telit", "Tablet", false, 69990));
		itemList.add(new Items(239, "Samsung Galaxy M31", "Laptop", false, 12499));
		itemList.add(new Items(224, "Toshiba", "smartphone", true, 12999));
		

		resultList = itemList.stream().filter(x -> x.getBrand().startsWith("T")).sorted(Comparator.comparing(Items::getPrice).reversed()).collect(Collectors.toList());
		resultList.stream().forEach(System.out::println);
	}

}