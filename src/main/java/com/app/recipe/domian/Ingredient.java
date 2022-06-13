package com.app.recipe.domian;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String description;
    private BigDecimal amount;

//    private UnitOfMeasure uom;

    @ManyToOne
    private Recipe recipe;
}
