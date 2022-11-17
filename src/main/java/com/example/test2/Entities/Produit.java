package com.example.test2.Entities;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Produit")
public class Produit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  idProduit;
    private  String cpdeProduit;
    private  String libelleProduit;
    private float prixUnitaire;
    @ManyToMany
    private List<Fournisseur> fournisseurs;
    @ManyToOne
    private Rayon rayon;
    @ManyToOne
    private Stock stock;

    @OneToOne(mappedBy = "produit")
    private  DetailPoduit detailproduit;

    @OneToMany(mappedBy = "produit")
    private  List<DetailFacture> detailfacture;

}
