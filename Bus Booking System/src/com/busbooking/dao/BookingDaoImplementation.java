/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.busbooking.dao;

import com.busbooking.utill.DatabaseConnection;
import com.busbooking.model.Booking;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author josephlahiru
 */
public class BookingDaoImplementation implements BookingDao {
    static Connection con = DatabaseConnection.getConnection();

    @Override
    public int add(Booking booking) throws SQLException {
        String query = "insert into Booking(name, pickup, destination, noOfSeats) values (?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, booking.getName());
        ps.setString(2, booking.getPickup());
        ps.setString(3, booking.getDestination());
        ps.setInt(4, booking.getNoOfSeats());
        return ps.executeUpdate();
    }

    @Override
    public void deleteBooking(int id) throws SQLException {
        String query = "delete from Booking where id = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    @Override
    public Booking getBooking(int id) throws SQLException {
        String query = "select * from Booking where id = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        if(!rs.next()) {
            return null;
        }
        Booking booking = new Booking();
        booking.setId(rs.getInt("id"));
        booking.setName(rs.getString("name"));
        booking.setPickup(rs.getString("pickup"));
        booking.setDestination(rs.getString("destination"));
        booking.setNoOfSeats(rs.getInt("noOfSeats"));
        return booking;
    }

    @Override
    public List<Booking> getBookings() throws SQLException {
        String query = "select * from Booking";
        PreparedStatement ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        List<Booking> bookings = new ArrayList<>();
        while(rs.next()) {
            Booking booking = new Booking();
            booking.setId(rs.getInt("id"));
            booking.setName(rs.getString("name"));
            booking.setPickup(rs.getString("pickup"));
            booking.setDestination(rs.getString("destination"));
            booking.setNoOfSeats(rs.getInt("noOfSeats"));
            bookings.add(booking);
        }
        return bookings;
    }

    @Override
    public void updateBooking(Booking booking) throws SQLException {
        String query = "update Booking set name = ?, pickup = ?, destination = ?, noOfSeats = ? where id = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, booking.getName());
        ps.setString(2, booking.getPickup());
        ps.setString(3, booking.getDestination());
        ps.setInt(4, booking.getNoOfSeats());
        ps.setInt(5, booking.getId());
        ps.executeUpdate();
    }
}
