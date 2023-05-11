/**
 * @(#)ProductService.java 2023/04/10.
 * 
  *
 */
package haui.qstore.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import haui.qstore.entity.Product;
import haui.qstore.model.ProductModel;
import haui.qstore.model.ShowProduct;

/**
 * Class cung cap cac dich vu thao tac voi table Products trong database
 * 
 *
 */
public interface ProductService {

	ProductModel createProduct(ProductModel productModel);

	List<Product> findAll();

	void delete(Integer id);

	ProductModel updateProduct(ProductModel productModel);

	ProductModel getOneProductById(Integer id);

	List<Product> getListLatestProduct();

	List<Product> getListViewsProduct();

	Page<Product> getListProductByNameSearch(String nameSearch, Pageable pageable);

	List<Product> getDemo(String nameSearch);

	Page<Product> getListProductByPrice(String nameSearch, int minPrice, int maxPrice, Pageable pageable);

	Page<ShowProduct> getListProductByFilter(String nameSearch, String price, String manu, String sort, Pageable pageable, String status, String name, String category);

	Product getProductByNameSearch(String nameSearch);

	List<Product> getListProductRelated(int id);

	void updateView(String nameSearch);

	void updateQuality(Product product);

	List<Product> getListProductSales();

}
