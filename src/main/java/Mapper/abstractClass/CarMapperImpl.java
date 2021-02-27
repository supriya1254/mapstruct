package Mapper.abstractClass;

import Entity.annotation.Car;
import Entity.annotation.CarDTO;

public class CarMapperImpl extends CarsMapper{

  @Override
  public CarDTO carDTO(Car car) {
    if(car==null)
    {
      return null;
    }

    CarDTO carDTO = new CarDTO();
    enrichDTOWithFuelType(car,carDTO);

    carDTO.setId(1);
    carDTO.setName("Swift");
    convertNameToUpperCase(carDTO);

    return carDTO;
  }
}
