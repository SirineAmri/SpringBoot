package com.example.test2.Entities;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "Client")

public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long idClient;
    private String nom;
    private String prenom;
    @Temporal(value = TemporalType.DATE)
    private Date dateNaissance;
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)

    private categorieClient categorieClient;
    @Enumerated(EnumType.STRING)
    private profession profession;
    @OneToMany(mappedBy = "client")
    private List<Facture> factures;



}
