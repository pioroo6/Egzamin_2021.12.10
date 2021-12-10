package pl.aleksander_figielski.hotelsapplication.hotels.remote.rest.dto.request;

import java.util.List;

public class UpdateRoomDto {

    private String name;
    private List<AddRoomDto> rooms;

    public UpdateRoomDto(){
    }

    public UpdateRoomDto(String name, List<AddRoomDto> rooms) {
        this.name=name;
        this.rooms=rooms;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public List<AddRoomDto> getSizes() {return  rooms;}
    public void setSizes(List<AddRoomDto> sizes) {this.rooms=rooms;}

}
