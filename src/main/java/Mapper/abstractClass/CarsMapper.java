package Mapper.abstractClass;

import Entity.Enum.FuelType;
import Entity.annotation.BioDieselCar;
import Entity.annotation.Car;
import Entity.annotation.CarDTO;
import Entity.annotation.ElectricCar;
import org.mapstruct.AfterMapping;
import org.mapstruct.BeforeMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public abstract class CarsMapper {

  @BeforeMapping
  protected void enrichDTOWithFuelType(Car car, @MappingTarget CarDTO carDTO) {
    if(car instanceof ElectricCar) {
      carDTO.setFuelType(FuelType.ELECTRIC);
    }
    if (car instanceof BioDieselCar) {
      carDTO.setFuelType(FuelType.BIO_DIESEL);
    }
  }

  @AfterMapping
  protected void convertNameToUpperCase(@MappingTarget CarDTO carDTO) {
    carDTO.setName(carDTO.getName().toUpperCase());
  }

  public abstract CarDTO carDTO(Car car);
}
