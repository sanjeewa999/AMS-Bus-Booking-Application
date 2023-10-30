/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.busbooking.dao;

import java.sql.SQLException;
import java.util.List;
import com.busbooking.model.BusStop;

/**
 *
 * @author josephlahiru
 */

public interface BusStopDao {
    public int add(BusStop stop) throws SQLException;
    public void delete(int id) throws SQLException;
    public BusStop getStop(int id) throws SQLException;
    public List<BusStop> getStops() throws SQLException;
    public void update(BusStop stop) throws SQLException;
}
