package haui.qstore.service;

import java.util.List;

import haui.qstore.entity.MenuOne;
import haui.qstore.model.Nav1Model;

public interface MenuOneService {

	Nav1Model createNav1(Nav1Model nav1Model);

	List<MenuOne> findAll();

	void delete(Integer id);

	Nav1Model getOneNav1ById(Integer id);

	Nav1Model updateNav1(Nav1Model nav1Model);

}
