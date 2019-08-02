package org.designPattern.javatpoint.example.mobileShopEx;

import org.designPattern.javatpoint.example.mobileShopEx.mobile.Blackberry;
import org.designPattern.javatpoint.example.mobileShopEx.mobile.Iphone;
import org.designPattern.javatpoint.example.mobileShopEx.mobile.Samsung;
import org.designPattern.javatpoint.example.mobileShopEx.mobileShop.MobileShop;

public class ShopKeeper {

	private MobileShop iphone;
	private MobileShop samsung;
	private MobileShop blackberry;

	public ShopKeeper() {
		iphone = new Iphone();
		samsung = new Samsung();
		blackberry = new Blackberry();
	}

	public void iphoneSale() {
		iphone.modelNo();
		iphone.price();
	}

	public void samsungSale() {
		samsung.modelNo();
		samsung.price();
	}

	public void blackberrySale() {
		blackberry.modelNo();
		blackberry.price();
	}

}
