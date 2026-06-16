package Practice;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class excel {

    public static void main(String[] args) throws IOException {
        File file = new File("C:/Users/somes/OneDrive/Desktop/Data/somesh.xlsx");
        System.out.println(file.exists());
        FileInputStream fis = new FileInputStream(file);

        Workbook reads = WorkbookFactory.create(fis);

// sheet read
        Sheet sheet = reads.getSheetAt(0);

        System.out.println(sheet.getSheetName());
    }
}
