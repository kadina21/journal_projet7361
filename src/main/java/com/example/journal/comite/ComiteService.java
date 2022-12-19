package com.example.journal.evaluateur;

import com.example.journal.article.Article;
import com.example.journal.article.EtatCameraReady;
import com.example.journal.scientifique.Scientifique;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.journal.article.ArticleRepository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class ComiteService {
    private final ComiteRepository comRepo;
    private final ArticleRepository artRepo;

    @Autowired
    public ComiteService(ComiteRepository comRepository, ArticleRepository artRepo){
        comRepo=comRepository;
        this.artRepo = artRepo;
    }

    public List<Comite> getComite() {
        return comRepo.findAll();
    }

    public Optional<Comite> getComiteByCategorie(String cat) {
        return comRepo.findComiteByCategorie(cat);
    }

    public Comite getComiteByArticle(Long id) {
       Optional<Article> oa =  artRepo.findById(id);
       if(oa.isPresent()){
           Article a=oa.get();
           return a.getComite();
       }else{
           throw new IllegalStateException("Article introuvable");
       }
    }

    public void noterArticle(String id) {
        Optional<Comite> oc=comRepo.findComiteByCategorie(id);
        Random r=new Random();
        if(oc.isPresent()){
            Comite c=oc.get();
            Article a=c.getArticle();
            for(Scientifique s :c.getListEval()){
                int pointsDonnes = r.nextInt(4);
                a.setPoints(a.getPoints()+pointsDonnes);
            }
            if(a.getPoints()>=4){
                a.setEtat(new EtatCameraReady());
                artRepo.save(a);
            }else{
                a.setPoints(0);
            }
        }
    }
}
