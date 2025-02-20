package com.foxelyss.transportbooking;

import com.foxelyss.transportbooking.model.Point;
import com.foxelyss.transportbooking.model.Transporting;
import com.foxelyss.transportbooking.service.PointService;
import com.foxelyss.transportbooking.service.TransportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.ArrayList;

@RestController
@RequestMapping("/api/business")
public class BusinessController {
    @Autowired
    TransportService transportService;
    @Autowired
    PointService pointService;

    @GetMapping("/tickets")
    public ArrayList<Transporting> GetTicketsForUser(@RequestParam(value = "point_a") int point_a,
                                                     @RequestParam(value = "point_b") int point_b,
                                                     @RequestParam(value = "quantity", defaultValue = "1") int quantity) {
        return null;
    }


    @GetMapping("/add_transport")
    public String AddTransporting(@RequestParam(value = "name", defaultValue = "World") String name) {

        transportService.createItem(new Transporting(0, "", new Timestamp(123123123), new Timestamp(123123123), "", "", 1, 2));
        return "";
    }

    @GetMapping("/add_point")
    public String AddPoint(@RequestParam(value = "name", defaultValue = "World") String name) {

        pointService.createItem(new Point(0, null, "Омская область", "фывф"));
        return "";
    }

    @GetMapping("/buy_ticket")
    public String BuyTicket(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "";
    }

    @GetMapping("/add_official")
    public String AddOfficial(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "";
    }
}
