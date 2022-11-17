package com.example.test2.Entities;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "DetailProduit")
public class DetailPoduit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailProduit;
    @Temporal(value = TemporalType.DATE)
    private  Date dateCreation;
    @Temporal(value = TemporalType.DATE)
    private Date dateDerniereModification;
    private categorieProduit categorieProduit;
    @OneToOne
    private Produit produit;

}
