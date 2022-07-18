package com.xworkz.core_java.exception_Handling.customexception;

public class AtmMachineException extends Exception{

	@Override
	public String toString() {
		return "you crossed daily limit";
	}
	@Override
	public String getMessage() {
		return "Invlaid amount Enterd";
	}
	

}

