package pl.aleksander_figielski.hotelsapplication.hotels.remote.rest.dto.response;

import java.util.List;

public class RoomDto {

    private Integer id;
    private String name;
    private List<RoomDto> rooms;

    public RoomDto(){}

    public RoomDto(Integer id, String name, List<RoomDto> rooms) {
        this.id = id;
        this.name = name;
        this.rooms = rooms;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<RoomDto> getRooms() {
        return rooms;
    }

    public void setSizes(List<RoomDto> rooms) {
        this.rooms = rooms;
    }

}
