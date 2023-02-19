package com.thechaoscompany.user.infrastructure.out.jpa.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "usuarios")
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre")
    private String name;
    @Column(name = "apellido")
    private String lastName;
    @Column(name = "celular")
    private String phoneNumber;
    @Column(name = "correo", unique = true)
    private String email;
    @Column(name = "clave")
    private String password;
    @ManyToOne
    @JoinColumn(name = "id_rol")
    private RoleEntity role;
}
