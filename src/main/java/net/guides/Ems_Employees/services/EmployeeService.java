package net.guides.Ems_Employees.services;

import java.util.List;
import net.guides.Ems_Employees.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeedto);
    EmployeeDto getEmployeeById(Long employeeId);
    List<EmployeeDto> getAllEmployees();
    EmployeeDto update(Long employeeId, EmployeeDto updatedDetails);
    void deleteEmployee(Long employeeId);
}
