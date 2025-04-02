package com.empire.Make_My_Trip_Application.controller;

import ch.qos.logback.core.CoreConstants;
import com.empire.Make_My_Trip_Application.binding.Passenger;
import com.empire.Make_My_Trip_Application.binding.Ticket;
import com.empire.Make_My_Trip_Application.service.MakeMyTripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MakeMyTrip {

    @Autowired
    MakeMyTripService makeMyTripService;

    @GetMapping("/")
    public String loadIndexPage(){

        return "index";
    }

    @PostMapping("/bookticket")
    public String bookTicket(Passenger passenger, Model model){
        System.out.println(passenger);
        Ticket ticketInfo = makeMyTripService.processTicketBooking(passenger);
        model.addAttribute("ticket", ticketInfo);
        return "sucess";
    }

    @GetMapping("/searchTicket")
    public String searchTicket(@RequestParam(value = "ticketId", required = false) String ticketId, Model model){
        System.out.println(ticketId);

        if (ticketId != null && !ticketId.isEmpty()){
            Ticket ticketInfo =  makeMyTripService.searchTicket(ticketId);
            model.addAttribute("ticket", ticketInfo);

        }


        return "searchTicket";
    }
}
