package haui.qstore.service;

import java.util.List;

import haui.qstore.entity.InformationShop;
import haui.qstore.model.ShopModel;

public interface InformationShopService {

	ShopModel createInformationShop(ShopModel shopModel);

	List<InformationShop> findAll();

	void delete(Integer id);

	ShopModel updateActive(ShopModel shopModel);

	ShopModel getOneShopById(Integer id);

	ShopModel updateInformation(ShopModel shopModel);

	InformationShop getOneInformationShop();

}
