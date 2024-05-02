package domain;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class Role {

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "name", nullable = false)
    private String name;
}
