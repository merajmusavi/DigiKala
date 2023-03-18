//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import javax.xml.crypto.Data;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class DigiKalaPresenter {
    private String path = "/home/meraj/IdeaProjects/daneshGahprojectDataSet/orders.csv";
    private String line = "";
    private String CsvSpr = ",";
   protected List<DataModel> dataModels;

    public DigiKalaPresenter(List<DataModel> dataModels){
        this.dataModels = dataModels;
    }

    public void CreateDataListWithCsv(){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

            try {
                bufferedReader.readLine();

                while((line = bufferedReader.readLine()) != null) {
                    String[] values = line.split(CsvSpr);
                    String id_order = values[0];
                    String id_customer = values[1];
                    String id_item = values[2];
                    String DateTime_CartFinalize = values[3];
                    String Amount_Gross_Order = values[4];
                    String cityNameFa = values[5];
                    String quantity = values[6];
                    DataModel dataModel = new DataModel(id_order, id_customer, id_item, DateTime_CartFinalize, Amount_Gross_Order, cityNameFa, quantity);
                    dataModels.add(dataModel);
                }
            } catch (Throwable var15) {
                try {
                    bufferedReader.close();
                } catch (Throwable var14) {
                    var15.addSuppressed(var14);
                }

                throw var15;
            }

            bufferedReader.close();
        } catch (IOException var16) {
            throw new RuntimeException(var16);
        }
    }

}
