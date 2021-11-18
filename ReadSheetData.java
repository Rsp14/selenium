
import java.io.IOException;
public class ReadSheetData {
public static void main(String[] args) throws IOException {
ReadExcelSheetData r = new ReadExcelSheetData();
String val = r.getMapData("room3");
System.out.println(val);
}
}
