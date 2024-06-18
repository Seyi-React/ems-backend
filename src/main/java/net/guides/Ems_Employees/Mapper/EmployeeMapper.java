package net.guides.Ems_Employees.Mapper;

import net.guides.Ems_Employees.dto.EmployeeDto;
import net.guides.Ems_Employees.entity.Employee;

public class EmployeeMapper {
    
    public static EmployeeDto mapToEmployeeDto (Employee employee) {
        return new EmployeeDto(
            employee.getId(),
            employee.getFirstName(),
            employee.getLastName(),
            employee.getEmail()
        );
    }

    public static Employee mapToEmployee (EmployeeDto employeeDto) {
        return new Employee(
            employeeDto.getId(),
            employeeDto.getFirstName(),
            employeeDto.getLastName(),
            employeeDto.getEmail()
        );
     
    }
}
