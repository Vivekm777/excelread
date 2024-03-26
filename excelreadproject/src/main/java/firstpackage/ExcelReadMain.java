package firstpackage;

import java.io.IOException;

import excel.ExcelRead;

public class ExcelReadMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(ExcelRead.getStringData(0,0));
		System.out.println(ExcelRead.getIntegerData(0, 1));
		System.out.println(ExcelRead.getStringData(3, 0));
		System.out.println(ExcelRead.getIntegerData(1, 1));
	
	}

}
