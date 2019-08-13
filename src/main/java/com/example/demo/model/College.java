package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author smriti on 7/6/19
 */
@Entity
@Table(name = "college")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class College implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_menu_id")
    private Long userMenuId;

    @Column(name = "role_id")
    private Long roleId;

    @Column(name = "status")
    private Character status;
}
