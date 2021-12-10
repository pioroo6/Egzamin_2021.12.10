package pl.aleksander_figielski.hotelsapplication.hotels.data.entity.reservations;

import pl.aleksander_figielski.hotelsapplication.hotels.data.entity.reservationsparameters.ReservationsParametersEntity;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name="reservations")
public class ReservationsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name = "client_name")
    private String clientName;

    @Column(name = "client_phone")
    private String clientPhone;

    @Column(name = "room_type")
    private String roomType;

    @Column(name = "date")
    private Date date;

    @Column(name = "days")
    private Integer days;

    @Column(name = "status")
    private String status;

    @Column(name = "token")
    private String token;

    @OneToMany(mappedBy = "reservation")
    private Set<ReservationsParametersEntity> reservation;
}
