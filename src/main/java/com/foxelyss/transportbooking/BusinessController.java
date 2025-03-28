package com.foxelyss.transportbooking;

import com.foxelyss.transportbooking.model.Transporting;
import com.foxelyss.transportbooking.service.TransportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

@RestController
@RequestMapping("/api/business")
public class BusinessController {
    @Autowired
    TransportService transportService;

    @GetMapping("/add_transport")
    public void AddTransporting(
            @RequestParam(value = "name") String name,
            @RequestParam(value = "departure") Timestamp departure,
            @RequestParam(value = "arrival") Timestamp arrival,
            @RequestParam(value = "departure_point") int departure_point,
            @RequestParam(value = "arrival_point") int arrival_point,
            @RequestParam(value = "transporting_mean") int transporting_mean,
            @RequestParam(value = "company") int company,
            @RequestParam(value = "price") float price,
            @RequestParam(value = "place_count") int place_count) {

        transportService.createItem(new Transporting(0, name, departure,
                arrival, departure_point, arrival_point, transporting_mean, company, price, place_count, place_count));
    }
}
