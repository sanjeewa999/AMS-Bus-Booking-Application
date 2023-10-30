/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.booking.system;

import com.busbooking.dao.BusStopDao;
import com.busbooking.dao.BusStopDaoImplementation;
import com.busbooking.model.BusStop;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BusStopDao busStopDao = new BusStopDaoImplementation();
        try {
            // Add bus stops
            busStopDao.add(new BusStop(1, "Abudhabi", 1));
            busStopDao.add(new BusStop(2, "Dubai", 2));
            busStopDao.add(new BusStop(3, "Umm AlQuwain", 3));
            busStopDao.add(new BusStop(4, "Ajman", 4));
            busStopDao.add(new BusStop(5, "Ras AlKhaimah", 5));
            busStopDao.add(new BusStop(6, "Fujairah", 6));
            busStopDao.add(new BusStop(7, "Sharjah", 7));
            busStopDao.add(new BusStop(8, "Alain", 8));

            // Print out the bus stops
            List<BusStop> stops = busStopDao.getStops();
            for(BusStop stop : stops) {
                System.out.println("Stop ID: " + stop.getStop_id() + ", Stop Name: " + stop.getStop_name() + ", Stop Order: " + stop.getStop_order());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
