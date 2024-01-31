package org.sparta.mytaek1.domain.user.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.sparta.mytaek1.domain.broadcast.entity.Broadcast;
import org.sparta.mytaek1.domain.order.entity.Orders;
import org.sparta.mytaek1.global.audit.Auditable;

import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "users")
public class User extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(nullable = false, unique = true)
    private String userName;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String userEmail;

    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private UserRoleEnum role;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<Broadcast> broadcastList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<Orders> orderList;

    public User(String userName, String userEmail, String password) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.password = password;
    }
}