/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.busbooking.model;

/**
 *
 * @author josephlahiru
 */
public class BusStop {
    private int stop_id;
    private String stop_name;
    private int stop_order;

    public BusStop() {
    }

    public BusStop(int stop_id, String stop_name, int stop_order) {
        this.stop_id = stop_id;
        this.stop_name = stop_name;
        this.stop_order = stop_order;
    }

    public int getStop_id() {
        return stop_id;
    }

    public void setStop_id(int stop_id) {
        this.stop_id = stop_id;
    }

    public String getStop_name() {
        return stop_name;
    }

    public void setStop_name(String stop_name) {
        this.stop_name = stop_name;
    }

    public int getStop_order() {
        return stop_order;
    }

    public void setStop_order(int stop_order) {
        this.stop_order = stop_order;
    }
}
