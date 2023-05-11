/**
 * @(#)ProductRestController.java 2023/04/10.
 * 
  *
 */
package haui.qstore.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import haui.qstore.entity.Product;
import haui.qstore.model.ProductModel;
import haui.qstore.service.ProductService;

/**
 * Class cung cap cac dich vu rest api cho bang product
 * 
 *
 */
@CrossOrigin("*")
@RestController
@RequestMapping("/rest/product")
public class ProductRestController {
	@Autowired
	ProductService productService;
	
	@PostMapping("/form")
	public ProductModel create(@RequestBody ProductModel productModel) {
		return productService.createProduct(productModel);
	}
	
	@GetMapping()
	public List<Product> getAll(){
		return productService.findAll();
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		productService.delete(id);
	}
	
	@PutMapping("/form/{id}")
	public ProductModel update(@PathVariable("id") Integer id, @RequestBody ProductModel productModel) {
		return productService.updateProduct(productModel);
	}
	
	@GetMapping("/form/{id}")
	public ProductModel getOneProductById(@PathVariable("id") Integer id) {
		return productService.getOneProductById(id);
	}
}
