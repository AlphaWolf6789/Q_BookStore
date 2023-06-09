package haui.qstore.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import haui.qstore.entity.InformationShop;

public interface InformationShopDao extends JpaRepository<InformationShop, Integer>{
	@Query("SELECT i FROM InformationShop i WHERE i.Deleteday = null")
	List<InformationShop> getListInformationShop();
	
	@Query("SELECT i FROM InformationShop i WHERE i.Deleteday = null and i.active = 1")
	InformationShop getOneInformationShop();
}
