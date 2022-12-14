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
@Table(name = "Rayon")
public class Rayon implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRayon;
    private String codeRayon;
    private String libelleRayon;

    @OneToMany (mappedBy = "rayon")
    private List<Produit> produit;
}


