package com.ck.mobius.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @desc: 部门信息
 * @auther: sirius
 * @date: 2018-12-05 16:19
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "department")
public class Department implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "dept_id")
    private Long id;

    @Column(name = "dept_name")
    private String departmentName;

    @Column(name = "description")
    private String description;

    @Column(name = "p_id")
    private Long parentId;
}
