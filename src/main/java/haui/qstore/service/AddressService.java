package haui.qstore.service;

import java.util.List;

import haui.qstore.entity.Address;
import haui.qstore.entity.District;
import haui.qstore.entity.Province;
import haui.qstore.entity.Ward;
import haui.qstore.model.AddressModel;

public interface AddressService {	
	List<Address> findListAddressByEmail(String username);
	List<Province> findAllProvince();
	List<District> findDistrictByIdProvince(Integer id);
	List<Ward> findWardByIdProvinceAndIdDistrict(Integer idProvince, Integer idDistrict);
	AddressModel createAddress(AddressModel addressModel);
	Address getAddressById(int parseInt);
	void delete(Address address);
	Address findAddressById(String username, int id);
	AddressModel getOneAddressById(int id);
	List<District> getListDistrictByAdressId(Integer id);
	List<Ward> getListWardByAdressId(Integer id);
	AddressModel updateAddress(AddressModel addressModel, Integer id);
}
