package domain;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class User {

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "lastname", nullable = false)
    private String lastname;
    @Column(name = "rol_id", nullable = false)
    private Integer rol_id;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "phone_number", nullable = false)
    private String phone_number;
    @Column(name = "id_card_number", nullable = false)
    private String id_card_number;
    @Column(name = "address", nullable = false)
    private String address;
    @Column(name = "username", nullable = false)
    private String username;
    @Column(name = "password", nullable = false)
    private String password;
}
