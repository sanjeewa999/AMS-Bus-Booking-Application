/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.busbooking.dao;

import com.busbooking.model.BusStop;
import java.sql.SQLException;
import java.util.List;

import com.busbooking.utill.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author josephlahiru
 */
public class BusStopDaoImplementation implements BusStopDao{
    
    static Connection con = DatabaseConnection.getConnection();

    @Override
    public int add(BusStop stop) throws SQLException {
        String query = "insert into BusStop(stop_name, stop_order) values (?, ?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, stop.getStop_name());
        ps.setInt(2, stop.getStop_order());
        return ps.executeUpdate();
    }

    @Override
    public void delete(int id) throws SQLException {
        String query = "delete from BusStop where stop_id = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    @Override
    public BusStop getStop(int id) throws SQLException {
        String query = "select * from BusStop where stop_id = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        if(!rs.next()) {
            return null;
        }
        BusStop stop = new BusStop();
        stop.setStop_id(rs.getInt("stop_id"));
        stop.setStop_name(rs.getString("stop_name"));
        stop.setStop_order(rs.getInt("stop_order"));
        return stop;
    }

    @Override
    public List<BusStop> getStops() throws SQLException {
        String query = "select * from BusStop";
        PreparedStatement ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        List<BusStop> stops = new ArrayList<>();
        while(rs.next()) {
            BusStop stop = new BusStop();
            stop.setStop_id(rs.getInt("stop_id"));
            stop.setStop_name(rs.getString("stop_name"));
            stop.setStop_order(rs.getInt("stop_order"));
            stops.add(stop);
        }
        return stops;
    }

    @Override
    public void update(BusStop stop) throws SQLException {
        String query = "update BusStop set stop_name = ?, stop_order = ? where stop_id = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, stop.getStop_name());
        ps.setInt(2, stop.getStop_order());
        ps.setInt(3, stop.getStop_id());
        ps.executeUpdate();
    }
    
}
