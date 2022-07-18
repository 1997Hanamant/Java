package com.xworkz.core_java.dtoAndDtoAssignment.Assignment.Service;

import com.xworkz.core_java.dtoAndDtoAssignment.Assignment.Excepation.InvalidDataException;
import com.xworkz.core_java.dtoAndDtoAssignment.Assignment.dto1.EngineerDto;

public interface EngineerService {
public	boolean validAndSave(EngineerDto dto) throws InvalidDataException;

}
