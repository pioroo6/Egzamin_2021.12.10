package pl.aleksander_figielski.hotelsapplication.hotels.remote.rest.dto.request;

import java.util.Date;

public class PersonReservationDto {

    private String name;
    private String phone;
    private Date date;
    private Integer days;

    public PersonReservationDto() {}

    public PersonReservationDto(String name, String phone, Date date, Integer days) {
        this.name = name;
        this.phone = phone;
        this.date = date;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDate() {return date;}

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getDays() {return days;}

    public void setDays(Integer days) {
        this.days = days;
    }

}
