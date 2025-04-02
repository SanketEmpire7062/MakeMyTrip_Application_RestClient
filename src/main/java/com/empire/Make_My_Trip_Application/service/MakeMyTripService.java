package com.empire.Make_My_Trip_Application.service;

import com.empire.Make_My_Trip_Application.binding.Passenger;
import com.empire.Make_My_Trip_Application.binding.Ticket;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MakeMyTripService {

    
    @Value("${irctc.endpoint.book_ticket}")
    private String IRCTC_BOOK_TICKET_URL;

    @Value("${irctc.endpoint.get_ticket}")
    private String IRCTC_GET_TICKET_URL;



    public Ticket searchTicket(String ticketId){
        RestTemplate  restTemplate = new RestTemplate();

        ResponseEntity<Ticket> responseEntity =
                restTemplate.getForEntity(IRCTC_GET_TICKET_URL, Ticket.class, ticketId);

        int statuscode = responseEntity.getStatusCodeValue();

        if(statuscode == 200){
            Ticket ticket = responseEntity.getBody();
            return ticket;
        }


        return  null;
    }


    public Ticket processTicketBooking(Passenger passenger){

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<Ticket> responseEntity =
                    restTemplate.postForEntity(IRCTC_BOOK_TICKET_URL, passenger, Ticket.class);

        int statuscode = responseEntity.getStatusCodeValue();

        if(statuscode == 200){
            Ticket ticket = responseEntity.getBody();
            return ticket;
        }
        return  null;
    }
}
