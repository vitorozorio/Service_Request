package org.Service_Request.entities;

import org.Service_Request.entities.enuns.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private OrderStatus status;
    private Client client;


    private List<OrderItem> orderItems = new ArrayList<>();

    public Order(){

    }
    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getOrderItems(){
        return orderItems;
    }

    public void addOrderItem(OrderItem orderItem){
        orderItems.add(orderItem);
    }
    public void removeOrderItem(OrderItem orderItem){
        orderItems.remove(orderItem);
    }

    public String toString(){

        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY \n");
        sb.append("Order momen: " + sdf.format(moment) + "\n");
        sb.append("Order status: " + getStatus() + "\n");
        sb.append("Client: " + getClient() + "\n");
        sb.append("Order items: \n");
        for(OrderItem c : orderItems ){
            sb.append(c.toString() + "\n");
        }

        return sb.toString();
    }

}
