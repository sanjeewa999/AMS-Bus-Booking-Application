/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.busbooking.dao;

import com.busbooking.model.Booking;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author josephlahiru
 */
public interface BookingDao {
    int add(Booking booking) throws SQLException;
    void deleteBooking(int id) throws SQLException;
    Booking getBooking(int id) throws SQLException;
    List<Booking> getBookings() throws SQLException;
    void updateBooking(Booking booking) throws SQLException;
    float calculateTicketPrice(Booking booking) throws SQLException;
}
