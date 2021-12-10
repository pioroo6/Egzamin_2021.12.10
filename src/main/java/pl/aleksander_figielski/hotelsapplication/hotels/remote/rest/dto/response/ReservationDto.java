package pl.aleksander_figielski.hotelsapplication.hotels.remote.rest.dto.response;

import pl.aleksander_figielski.hotelsapplication.hotels.domain.model.ReservationStatusType;
import pl.aleksander_figielski.hotelsapplication.hotels.remote.rest.dto.request.PersonReservationDto;
import pl.aleksander_figielski.hotelsapplication.hotels.remote.rest.dto.request.RoomReservationDto;

import java.util.List;

public class ReservationDto {

    private Integer id;
    private ReservationStatusType status;
    private List<RoomReservationDto> rooms;
    private PersonReservationDto person;

    public ReservationDto() {}

    public ReservationDto(Integer id, ReservationStatusType status, List<RoomReservationDto> rooms, PersonReservationDto person) {
        this.id = id;
        this.status = status;
        this.rooms = rooms;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ReservationStatusType getStatus() {
        return status;
    }

    public void setStatus(ReservationStatusType status) {
        this.status = status;
    }

    public List<RoomReservationDto> getRooms() {
        return rooms;
    }

    public void setPizzas(List<RoomReservationDto> rooms) {
        this.rooms = rooms;
    }

    public PersonReservationDto getPerson() {
        return person;
    }

    public void setPerson(PersonReservationDto person) {
        this.person = person;
    }

}
