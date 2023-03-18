import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class DigikalaCalculatorMethods extends DigiKalaPresenter {


    public DigikalaCalculatorMethods(List<DataModel> dataModels) {
        super(dataModels);
    }


    public List<DataModel> ListBasedOnOrderId(String orderId){
        List<DataModel> order = new ArrayList<>();
        for (DataModel dataModel : dataModels) {
            if (dataModel.getId_order().contains(orderId)){
                order.add(dataModel);
            }
        }
        return order;

    }
    public List<DataModel> ListBasedOnCityName(String cityName) {
        List<DataModel> city = new ArrayList<>();
        for (DataModel dataModel : dataModels) {
            if (dataModel.getCityNameFa().contains(cityName)) {
                city.add(dataModel);
            }
        }
        return city;
    }

    public long AmountGrossOrderBasedOnCustomer(String customerId){
        long amount = 0;
        for (DataModel dataModel : dataModels) {
            if (dataModel.getId_customer().contains(customerId)){
                int customerAmount = Integer.parseInt(dataModel.getAmount_Gross_Order().split("\\.")[0]);
                int CustomerQuantity = Integer.parseInt(dataModel.getQuantity_item().split("\\.")[0]);
                int finalProcess = customerAmount*CustomerQuantity;
                amount = amount+finalProcess;
            }
        }
        return amount;
    }
    public long AmountGrossOrderBasedOnYear(String year) {
        long AmountBasedOnYear = 0;
        for (DataModel dataModel : dataModels) {
            String[] year1 = dataModel.getDateTime_CartFinalize().split(" ");
            String[] onlyYear = year1[0].split("-");
            if (Objects.equals(onlyYear[0], year)) {
                int amou = Integer.parseInt(dataModel.getAmount_Gross_Order().split("\\.")[0]);
                AmountBasedOnYear = AmountBasedOnYear + amou;
            }


        }

        return AmountBasedOnYear;

    }

    public Long Amount_Gross_OrderBasedOnCityName(String cityName) {
        long AllVal = 0L;
        Iterator var3 = dataModels.iterator();

        while (var3.hasNext()) {
            DataModel dataModel = (DataModel) var3.next();
            if (dataModel.getCityNameFa().contains(cityName)) {
                String[] arr = dataModel.getAmount_Gross_Order().split("\\.");
                String[] arr2 = dataModel.getQuantity_item().split("\\.");
                long x = Long.parseLong(arr[0]) * Integer.parseInt(arr2[0]);

                AllVal += x;
            }
        }

        return AllVal;
    }

    public int OrderBasedOnIdItem(String idItem) {
        int product = 0;
        for (DataModel dataModel : dataModels) {
            if (dataModel.getId_item().contains(idItem)) {
                product++;
            }
        }


        return product;
    }


}
