package haui.qstore.service;

import java.util.Collection;

import haui.qstore.entity.Discount;
import haui.qstore.model.CartModel;


public interface ShoppingCartService {
	void add(Integer id, CartModel entity);
	void remove(Integer id);
	void update(Integer id, int qty);
	void clear();
	Collection<CartModel> getItems();
	int getCount();
	int getCountAllProduct();
	double getAmount();
	void addDiscount(Integer id, Discount entity);
	Discount getDiscount();
	void clearDiscount();
}
