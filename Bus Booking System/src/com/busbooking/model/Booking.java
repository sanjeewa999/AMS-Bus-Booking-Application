/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.busbooking.model;

/**
 *
 * @author josephlahiru
 */
public class Booking {
    private int id;
    private String name;
    private String pickup;
    private String destination;
    private int noOfSeats;
    private float ticketPrice;

    public Booking() {
    }

    public Booking(int id, String name, String pickup, String destination, int noOfSeats) {
        this.id = id;
        this.name = name;
        this.pickup = pickup;
        this.destination = destination;
        this.noOfSeats = noOfSeats;
    }

    public Booking(int id, String name, String pickup, String destination, int noOfSeats, float ticketPrice) {
        this.id = id;
        this.name = name;
        this.pickup = pickup;
        this.destination = destination;
        this.noOfSeats = noOfSeats;
        this.ticketPrice = ticketPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPickup() {
        return pickup;
    }

    public void setPickup(String pickup) {
        this.pickup = pickup;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
    
}
