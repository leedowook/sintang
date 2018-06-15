package d0604;
import java.util.*;
public class shopmain {
	public static void main(String[] args) {
		ishop shop=new Myshop();
		shop.settitle("myshop");
		shop.genuser();
		shop.genproduct();
		shop.start();
	}
}
