package pl.aleksander_figielski.hotelsapplication.hotels.remote.rest.dto.request;

public class RoomReservationDto {

    private Integer id;
    private Integer roomId;

    public RoomReservationDto() {}

    public RoomReservationDto(Integer id, Integer roomId, Integer count) {
        this.id = id;
        this.roomId = roomId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setSizeId(Integer roomId) {
        this.roomId = roomId;
    }
}
