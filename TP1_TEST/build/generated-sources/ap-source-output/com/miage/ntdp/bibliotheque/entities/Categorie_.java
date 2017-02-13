package com.miage.ntdp.bibliotheque.entities;

import com.miage.ntdp.bibliotheque.entities.Livre;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-12-11T20:51:20")
@StaticMetamodel(Categorie.class)
public class Categorie_ { 

    public static volatile SingularAttribute<Categorie, String> description;
    public static volatile SingularAttribute<Categorie, Long> id;
    public static volatile ListAttribute<Categorie, Livre> livres;
    public static volatile SingularAttribute<Categorie, String> nom;

}