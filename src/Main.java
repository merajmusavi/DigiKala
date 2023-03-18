//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<DataModel> dataModels;

    public Main() {
    }

    public static void main(String[] args) throws AWTException {
        dataModels = new ArrayList();
        DigiKalaPresenter digiKalaPresenter = new DigiKalaPresenter(dataModels);
        digiKalaPresenter.CreateDataListWithCsv();
        DigikalaCalculatorMethods digikalaCalculatorMethods = new DigikalaCalculatorMethods(dataModels);


        int selectedItem = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("menu, enter your option number:");
            System.out.println("1-search based on item id");
            System.out.println("2-search based on city name(this option will return to you a list(not readable for users. its good for developers :))");
            System.out.println("3-search based on user id");
            System.out.println("4-search Based On year");
            System.out.println("5-Amount Based On city name");
            System.out.println("6-order data based on order id.");
            System.out.println("0-enter 0 if u wanna close program");
            while (!scanner.hasNextInt()){
                System.out.println("only numeric value from list");
                scanner.nextLine();
            }
            selectedItem = scanner.nextInt();
            scanner.nextLine();

            switch (selectedItem){
                case 1 :
                    int firstValue = scanner.nextInt();
                    System.out.println(digikalaCalculatorMethods.OrderBasedOnIdItem(String.valueOf(firstValue)));
                    break;
                case 2:
                    System.out.println("enter city name");
                    String secVal = scanner.nextLine();
                    System.out.println(digikalaCalculatorMethods.ListBasedOnCityName(secVal));
                    break;
                case 3 :
                    System.out.println("input customer id");
                    int id = scanner.nextInt();
                    System.out.println(digikalaCalculatorMethods.AmountGrossOrderBasedOnCustomer(String.valueOf(id)));
                    break;
                case 4:
                    System.out.println("input year");
                    int year = scanner.nextInt();
                    System.out.println(digikalaCalculatorMethods.AmountGrossOrderBasedOnYear(String.valueOf(year)));
                    break;
                case 5 :
                    System.out.println("input city name");
                    String city = scanner.nextLine();
                    System.out.println(digikalaCalculatorMethods.Amount_Gross_OrderBasedOnCityName(city));
                    break;
                case 6:
                    System.out.println("input your order id ");
                    int orderId = scanner.nextInt();
                    List<DataModel> data1 = digikalaCalculatorMethods.ListBasedOnOrderId(String.valueOf(orderId));
                    DataModel dataModel = data1.get(0);
                    String cityName = dataModel.getCityNameFa();
                    String amount = dataModel.getAmount_Gross_Order();
                    String quantity = dataModel.getQuantity_item();
                    String DateOrder = dataModel.getDateTime_CartFinalize();
                    System.out.println("city name: "+cityName+"\n"+"amount: "+amount+"\n"+"quantity: "+quantity+"\n"+"date: "+DateOrder);
                    break;
                case 0:
                    System.out.println("closing program");
                    break;
                default:
                    System.out.println("invalid option");
 break;
            }

        }while (selectedItem!=0);




       }


}
