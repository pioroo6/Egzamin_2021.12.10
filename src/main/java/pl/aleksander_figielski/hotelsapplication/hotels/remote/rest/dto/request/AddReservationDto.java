package pl.aleksander_figielski.hotelsapplication.hotels.remote.rest.dto.request;

import java.util.List;

public class AddReservationDto {

    private List<RoomReservationDto> rooms;
    private PersonReservationDto person;

    public AddReservationDto() {}

    public AddReservationDto(List<RoomReservationDto> rooms, PersonReservationDto person) {
        this.rooms = rooms;
        this.person = person;
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
