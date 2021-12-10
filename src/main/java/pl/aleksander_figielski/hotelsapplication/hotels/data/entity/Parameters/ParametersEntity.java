package pl.aleksander_figielski.hotelsapplication.hotels.data.entity.Parameters;

import pl.aleksander_figielski.hotelsapplication.hotels.data.entity.room.RoomEntity;

import java.util.Set;

@Entity
@Table(name="parameters")
public class ParametersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name = "price_base")
    private String priceBase;

    @Column(name = "room_type")
    private String roomType;

    @Column(name = "room_id")
    private Integer roomId;

    @OneToMany(mappedBy = "parameters")
    private Set<ReservationsEntity> reservation;

    @ManyToOne
    @JoinColumn(name="room_id", insertable = false, updatable = false)
    private RoomEntity room;
}
