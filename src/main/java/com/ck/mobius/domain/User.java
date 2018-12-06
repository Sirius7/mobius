package com.ck.mobius.domain;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * @desc: 用户信息
 * @auther: ck
 * @date: 2018-12-04 13:52
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user", indexes = {@Index(name = "idx_user_id", columnList = "user_id")})
public class User implements Serializable {
    @Id
    @GenericGenerator(name="user_id_uuid", strategy="uuid")
    @GeneratedValue(generator="user_id_uuid")
    @Column(name = "user_id", nullable = false, unique = true, length = 32)
    private String id;

    @Column(name = "username", nullable = false, length = 50)
    private String userName;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "email", length = 50)
    private String email;

    @Column(name = "phone", length = 11)
    private String phone;

    @Column(name = "create_time")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date createTime;

    @ManyToMany
    @JoinTable(name = "user_role", joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id")})
    private Set<Role> roleSet;

    @ManyToMany
    @JoinTable(name = "user_department", joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "department_id")})
    private Set<Department> departmentSet;
}
