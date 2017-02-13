package com.miage.ntdp.bibliotheque.entities;

import com.miage.ntdp.bibliotheque.entities.Livre;
import com.miage.ntdp.bibliotheque.entities.TypeAuteur;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-12-11T20:51:20")
@StaticMetamodel(Auteur.class)
public class Auteur_ extends Personne_ {

    public static volatile SingularAttribute<Auteur, String> nationalite;
    public static volatile SingularAttribute<Auteur, String> aProposDe;
    public static volatile SingularAttribute<Auteur, TypeAuteur> type;
    public static volatile ListAttribute<Auteur, Livre> livres;

}