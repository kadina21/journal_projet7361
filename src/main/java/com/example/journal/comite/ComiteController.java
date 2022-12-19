package com.example.journal.evaluateur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ComiteController {
    private final ComiteService comiteService;

    @Autowired
    public ComiteController(ComiteService cs){
        this.comiteService=cs;
    }

    @CrossOrigin
    @GetMapping("comites")
    public List<Comite> getComite(){
        return comiteService.getComite();
    }

    @CrossOrigin
    @GetMapping("comite_cat/{categorie}")
    public Optional<Comite> getComiteByCategorie(@PathVariable(value = "categorie")String cat){
        return comiteService.getComiteByCategorie(cat);
    }

    @CrossOrigin
    @GetMapping("comite_article/{id}")
    public Comite getComiteByArticle(@PathVariable(value = "id")Long id){
        return comiteService.getComiteByArticle(id);
    }

    @CrossOrigin
    @PutMapping("comite/{id}")
    public void noterArticle(@PathVariable(value = "id")String id){
        comiteService.noterArticle(id);
    }
}
