package pl.aleksander_figielski.hotelsapplication.hotels.remote.rest.dto.request;

import java.util.List;

public class AddRoomDto {

    private String name;

    public AddRoomDto() {
    }

    public AddRoomDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
