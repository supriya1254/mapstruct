package Mapper;

//solution : So what if a bean we are about to map has a different field name?

import Entity.Employee;
import Entity.EmployeeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface EmployeeDTOToEmployeeMapper {

  @Mappings(
    {
      @Mapping(target = "employeeId", source = "employeeDTO.id"),
      @Mapping(target = "employeeName", source = "employeeDTO.name")
    }
  )
  Employee employeeDTOToEmployee(EmployeeDTO employeeDTO);

}
