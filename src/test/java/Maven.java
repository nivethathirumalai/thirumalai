import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Maven {
public static void main(String[] args) throws IOException{
	File loc=new File("C:\\Users\\Karjan\\NewWorkspace\\Framework\\Excel\\excel1.xlsx");
	FileInputStream f=new FileInputStream(loc);
	Workbook w=new XSSFWorkbook(f);
    Sheet s=w.getSheet("Sheet1");
    
    Row r=s.getRow(5);
    Cell c=r.getCell(1);
    String value = c.getStringCellValue();
    if(value.contains("thirumalai"))
    		{
    	c.setCellValue("thirumalaisamy");
    		}
    FileOutputStream ff=new FileOutputStream(loc);
    w.write(ff);
    System.out.println("done");
<<<<<<< HEAD
    System.out.println("modify 222");
=======
    System.out.println("mem1 modificate");
>>>>>>> 4367ed1e71ceeefc735da883d82eeaef782ac2f0
    System.out.println(c);
		}
	
		
	}


