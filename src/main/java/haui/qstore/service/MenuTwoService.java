package haui.qstore.service;

import java.util.List;
import haui.qstore.entity.MenuTwo;
import haui.qstore.model.Nav2Model;

public interface MenuTwoService {

	Nav2Model createNav2(Nav2Model nav2Model);

	List<MenuTwo> findAll();

	void delete(Integer id);

	Nav2Model getOneNav2ById(Integer id);

	Nav2Model updateNav2(Nav2Model nav2Model);

}
