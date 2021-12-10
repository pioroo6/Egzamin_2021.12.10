package pl.aleksander_figielski.hotelsapplication.hotels.data.entity.room;

import pl.aleksander_figielski.hotelsapplication.hotels.data.entity.Parameters.ParametersEntity;

import java.util.Set;

@Entity
@Table(name="rooms")
public class RoomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "room")
    private Set<ParametersEntity> room;
}
