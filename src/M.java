import edu.unapec.opensource.logic.ExcelDataReader;
import edu.unapec.opensource.models.ViewInformation;

/**
 * Created by LENOVO on 19/07/2016.
 */
public class M {


public static  void  main(String [] args)
{
    ExcelDataReader excelDataReader= new ExcelDataReader();
    ViewInformation viewInformation= excelDataReader.getNewCalculation();
    excelDataReader.updateFile();


}
}
