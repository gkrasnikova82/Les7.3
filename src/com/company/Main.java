package com.company;

//3. Реализовать два класса: договор и акт. В каждом сделать поля: номер, дата, список товаров (массив строк).
// Написать класс со статическим методом конвертации договора в акт (на вход передавать договор, на выходе получаем акт).

import java.util.Arrays;
import java.util.Date; // класс дата

class Contract {
      int number;
      int Data;
      String [] products ={"вода ","мясо ","молоко ","икра ","рыба "};

}
class Act {
    int number;
    int Data;
    String[] products;
}
class Conversion { //класс со статическим методом конвертации договора в акт
    public static Act DoConversion (Contract c) {
        Act Act1 = new Act();
        Act1.number = c.number+100;
        Act1.Data = c.Data+1;
     //   Act.products = new String[c.products.length];
        Act1.products = Arrays.copyOf(c.products,c.products.length);
        return Act1;
    }

}
public class Main {

    public static void main(String[] args) {
        Contract Contract1 = new Contract();// экземпляр класса
        Contract1.number = 19;
        Contract1.Data = 20201218;
        System.out.println("Номер договора: "+Contract1.number+" Дата договора: "+Contract1.Data+ " Список продуктов: "+ Arrays.toString(Contract1.products));
        Act Act1 = new Act();
        Act1 = Conversion.DoConversion(Contract1);

        System.out.println("Номер акта: "+Act1.number+" Дата акта: "+Act1.Data+ " Список продуктов: "+ Arrays.toString(Act1.products));
        System.out.println();



    }
}
