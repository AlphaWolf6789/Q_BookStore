package haui.qstore.service;

import java.util.List;

import haui.qstore.entity.Manufacturer;
import haui.qstore.model.ManufacturerModel;

public interface ManufacturerService{

	ManufacturerModel createManufacturer(ManufacturerModel manufacturerModel);

	List<Manufacturer> findAll();

	ManufacturerModel getOneManufacturerById(Integer id);

	void delete(Integer id);

	ManufacturerModel updateManufacturer(ManufacturerModel manufacturerModel);

}
