package org.Service_Request.program;

import org.Service_Request.entities.Client;
import org.Service_Request.entities.Order;
import org.Service_Request.entities.OrderItem;
import org.Service_Request.entities.Product;
import org.Service_Request.entities.enuns.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {

       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
       SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");


        Product produto1 = new Product("tv", 100.00);
        Product produto2 = new Product("radio", 103.00);
        OrderItem orderItem = new OrderItem(3,produto1);
        OrderItem orderItem2 = new OrderItem(3,produto2);
        Client client = new Client("vitor","vm280338@gmail.com", sdf1.parse("20/02/2002"));

        Order order = new Order(sdf.parse("01/02/2024 23:47:01"), OrderStatus.valueOf("DELIVERED"), client);

        order.addOrderItem(orderItem);
        order.addOrderItem(orderItem2);

        //System.out.println(orderItem);
        //System.out.println(orderItem2);



       System.out.println(order.toString());




    }
}