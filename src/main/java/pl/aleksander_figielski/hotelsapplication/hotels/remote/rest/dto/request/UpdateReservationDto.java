package pl.aleksander_figielski.hotelsapplication.hotels.remote.rest.dto.request;

import pl.aleksander_figielski.hotelsapplication.hotels.domain.model.ReservationStatusType;

import java.util.List;

public class UpdateReservationDto {

    private ReservationStatusType status;
    private List<RoomReservationDto> rooms;
    private PersonReservationDto person;

    public UpdateReservationDto() {
    }

    public UpdateReservationDto(ReservationStatusType status, List<RoomReservationDto> pizzas, PersonReservationDto person) {
        this.status = status;
        this.rooms = rooms;
        this.person = person;
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

    public void setRooms(List<RoomReservationDto> rooms) {
        this.rooms = rooms;
    }

    public PersonReservationDto getPerson() {
        return person;
    }

    public void setPerson(PersonReservationDto person) {
        this.person = person;
    }

}
