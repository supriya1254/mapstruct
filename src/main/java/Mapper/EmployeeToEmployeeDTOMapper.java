package Mapper;

//solution : So what if a bean we are about to map has a different field name?

import Entity.Employee;
import Entity.EmployeeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface EmployeeToEmployeeDTOMapper {

  @Mappings(
    {
      @Mapping(target = "id", source = "employee.employeeId"),
      @Mapping(target = "name", source = "employee.employeeName"),
      @Mapping(target = "startDt", source = "employee.employeeStartDate",
      dateFormat = "dd-MM-yyyy HH:mm:ss")
    }
  )
  EmployeeDTO employeeToEmployeeDTO(Employee employee);

}
