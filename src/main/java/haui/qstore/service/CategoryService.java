package haui.qstore.service;

import java.util.List;

import haui.qstore.entity.Category;
import haui.qstore.model.CategoryModel;

public interface CategoryService {

	CategoryModel createCategory(CategoryModel categoryModel);

	List<Category> findAll();

	void delete(Integer id);

	CategoryModel getOneCategoryById(Integer id);

	CategoryModel updateCategory(CategoryModel categoryModel);

	Category getCategoryByNameSearch(String nameSearch);

}
