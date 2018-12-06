package com.ck.mobius.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @desc: 权限信息
 * @auther: sirius
 * @date: 2018-12-05 16:07
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private Long id;

    @Column(name = "role_name", nullable = false)
    private String roleName;

    @Column(name = "remark")
    private String remark;

    @Temporal(value = TemporalType.DATE)
    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "user_id")
    private String userId;
}
