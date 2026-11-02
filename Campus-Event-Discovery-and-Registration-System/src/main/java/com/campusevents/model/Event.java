package com.campusevents.model;
import java.time.*;
public record Event(int id,String title,String description,String category,String organizer,LocalDate date,LocalTime start,LocalTime end,String venue,LocalDate deadline,int capacity,String status,int confirmed,int waitlisted){public int available(){return Math.max(0,capacity-confirmed);}public String toString(){return title+" | "+date+" | "+venue+" | seats: "+available();}}
