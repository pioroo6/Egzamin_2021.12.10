package pl.aleksander_figielski.hotelsapplication.hotels.data.entity.reservationsparameters;

@Entity
@Table(name="reservations_parameters")
public class ReservationsParametersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Integer id;

    @Column(name="reservation_id")
    private Integer orderId;

    @Column(name="room_id")
    private Integer roomId;

    @ManyToOne
    @JoinColumn(name="reservation_id", insertable = false, updatable = false)
    private ReservationsEntity reservation;

    @ManyToOne
    @JoinColumn(name="room_id", insertable = false, updatable = false)
    private RoomEntity room;
}
