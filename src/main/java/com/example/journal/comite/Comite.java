package com.example.journal.comite;

import com.example.journal.article.Article;
import com.example.journal.scientifique.Scientifique;
import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import org.hibernate.annotations.Where;

import java.util.List;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
/*@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")*/
@Entity
@Table
public class Comite {
    @Id
    /*@GeneratedValue(
            strategy = GenerationType.IDENTITY
    )*/
    //@GeneratedValue(generator = "uuid")
    //@GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    /*@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "articleId")
    //@JsonBackReference
    private Article article;*/
    private Long article;
    //@Where(clause="type_user='evaluateur'")
    //@OneToMany(mappedBy = "comite")
    //@JsonBackReference
    //private List<Scientifique> listEval;
    private String listEval;


    public Comite() {

    }

    public Comite(String id,Long article, String listEval) {
        this.id=id;
        this.article = article;
        this.listEval = listEval;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getArticle() {
        return article;
    }

    public void setArticle(Long article) {
        this.article = article;
    }

    public String getListEval() {
        return listEval;
    }

    public void setListEval(String listEval) {
        this.listEval = listEval;
    }
}
