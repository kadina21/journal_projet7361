package com.example.journal;

import com.example.journal.article.Article;
import com.example.journal.article.ArticleRepository;
import com.example.journal.article.EtatArticle;
import com.example.journal.article.EtatNonSoumis;
import com.example.journal.comite.Comite;
import com.example.journal.comite.ComiteRepository;
import com.example.journal.scientifique.Scientifique;
import com.example.journal.scientifique.ScientifiqueRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class Config {

    @Bean
    CommandLineRunner commandLineRunner(ScientifiqueRepository sciRepo, ArticleRepository artRepo, ComiteRepository comRepo){
        EtatArticle ea=new EtatNonSoumis();
        return args ->{
            Article a1=new Article(
                    null,
                    "Molécules",
                    "Chimie",
                    ea,
                    null,
                    0,
                    null
            );
            Article a2=new Article(
                    null,
                    "Electrons et neutrons",
                    "Chimie",
                    ea,
                    null,
                    0,
                    null
            );
            Article ac5=new Article(
                    null,
                    "Spring Boot",
                    "Informatique",
                    ea,
                    null,
                    0,
                    null
            );
            Article ac1=new Article(
                    null,
                    "Thermodynamique",
                    "Physique",
                    ea,
                    null,
                    0,
                    null
            );
            Article ac2=new Article(
                    null,
                    "Intégrales",
                    "Maths",
                    ea,
                    null,
                    0,
                    null
            );
            Article ac3=new Article(
                    null,
                    "Respiration",
                    "Biologie",
                    ea,
                    null,
                    0,
                    null
            );
            Article ac4=new Article(
                    null,
                    "COVID",
                    "Médecine",
                    ea,
                    null,
                    0,
                    null
            );
            artRepo.saveAll(List.of(a1,a2,ac1,ac2,ac3,ac4,ac5));

            Scientifique s1=new Scientifique(
                    "Holland",
                    "Tom",
                    "tholland@gmail.com",
                    "tomH",
                    "spidey",
                    "auteur",
                    "Physique",
                    "Chercheur",
                    null
            );

            Scientifique s2=new Scientifique(
                    "Oldman",
                    "Barry",
                    "boldman@gmail.com",
                    "barryO",
                    "barrio",
                    "auteur",
                    "Chimie",
                    "Chercheur",
                    a2.getId().toString()
            );

            Scientifique s3=new Scientifique(
                    "Writer",
                    "Harrison",
                    "hwriter@gmail.com",
                    "harrisonW",
                    "articles",
                    "auteur",
                    "Chimie",
                    "Chercheur",
                    a1.getId().toString()+a2.getId().toString()
            );
            Scientifique s4=new Scientifique(
                    "Peralta",
                    "Santiago",
                    "speralta@gmail.com",
                    "santiagoP",
                    "amyjake",
                    "auteur",
                    "Chimie",
                    "Professeur",
                    a1.getId().toString()
            );

            //Evaluateurs
            Scientifique e1=new Scientifique(
                    "Holland",
                    "Brian",
                    "bholland@gmail.com",
                    "brianH",
                    "brianH",
                    "evaluateur",
                    "Chimie",
                    "Chercheur",
                    null
            );

            Scientifique e2=new Scientifique(
                    "Youngman",
                    "Barry",
                    "byoungman@gmail.com",
                    "barryY",
                    "barriy",
                    "evaluateur",
                    "Chimie",
                    "Chercheur",
                    null
            );

            Scientifique e3=new Scientifique(
                    "Reader",
                    "Harrison",
                    "hreader@gmail.com",
                    "harrisonR",
                    "articles",
                    "evaluateur",
                    "Chimie",
                    "Chercheur",
                    null
            );



            Scientifique e4=new Scientifique(
                    "Poland",
                    "Tom",
                    "tpoland@gmail.com",
                    "tomP",
                    "spidey",
                    "evaluateur",
                    "Physique",
                    "Chercheur",
                    null
            );

            Scientifique e5=new Scientifique(
                    "Oldman",
                    "Timothy",
                    "toldman@gmail.com",
                    "timothyO",
                    "timmyo",
                    "evaluateur",
                    "Physique",
                    "Chercheur",
                    null
            );

            Scientifique e6=new Scientifique(
                    "Writering",
                    "Lucas",
                    "lwritering@gmail.com",
                    "lucasW",
                    "articles",
                    "evaluateur",
                    "Physique",
                    "Chercheur",
                    null
            );



            Scientifique e7=new Scientifique(
                    "Jackson",
                    "Alexandra",
                    "ajackson@gmail.com",
                    "alexandraJ",
                    "spidey",
                    "evaluateur",
                    "Informatique",
                    "Chercheur",
                    null
            );

            Scientifique e8=new Scientifique(
                    "Light",
                    "Larry",
                    "llight@gmail.com",
                    "raito",
                    "barrio",
                    "evaluateur",
                    "Informatique",
                    "Chercheur",
                    null
            );

            Scientifique e9=new Scientifique(
                    "Patterson",
                    "Jane",
                    "jpatternson@gmail.com",
                    "janeP",
                    "articles",
                    "evaluateur",
                    "Informatique",
                    "Chercheur",
                    null
            );



            Scientifique e10=new Scientifique(
                    "Jefferson",
                    "Thomas",
                    "tjefferson@gmail.com",
                    "thomasJ",
                    "spidey",
                    "evaluateur",
                    "Maths",
                    "evaluateur",
                    null
            );

            Scientifique e11=new Scientifique(
                    "Mahagrid",
                    "Alina",
                    "amahagrid@gmail.com",
                    "alinaM",
                    "barrio",
                    "evaluateur",
                    "Maths",
                    "Chercheur",
                    null
            );

            Scientifique e12=new Scientifique(
                    "Windsor",
                    "Lizzie",
                    "lindsor@gmail.com",
                    "lizzieW",
                    "articles",
                    "evaluateur",
                    "Maths",
                    "Professeur",
                    null
            );



            Scientifique e13=new Scientifique(
                    "Dupont",
                    "Dominique",
                    "ddupont@gmail.com",
                    "dominiqueD",
                    "spidey",
                    "evaluateur",
                    "Biologie",
                    "Chercheur",
                    null
            );

            Scientifique e14=new Scientifique(
                    "Martin",
                    "Jean",
                    "jmartin@gmail.com",
                    "jeanM",
                    "barrio",
                    "evaluateur",
                    "Biologie",
                    "Chercheur",
                    null
            );

            Scientifique e15=new Scientifique(
                    "Ferry",
                    "Pauline",
                    "pferry@gmail.com",
                    "paulineF",
                    "articles",
                    "evaluateur",
                    "Biologie",
                    "Professeur",
                    null
            );



            Scientifique e16=new Scientifique(
                    "Foster",
                    "Camille",
                    "cfoster@gmail.com",
                    "camilleF",
                    "spidey",
                    "evaluateur",
                    "Médecine",
                    "Médecin",
                    null
            );

            Scientifique e17=new Scientifique(
                    "Alain",
                    "Charles",
                    "calain@gmail.com",
                    "charlesA",
                    "barrio",
                    "evaluateur",
                    "Médecine",
                    "Chirurgien",
                    null
            );

            Scientifique e18=new Scientifique(
                    "Yamamoto",
                    "Kouki",
                    "kyamamoto@gmail.com",
                    "koukiY",
                    "articles",
                    "evaluateur",
                    "Médecine",
                    "Cardiologue",
                    null
            );

            Comite c1=new Comite(
                    "Chimie",
                    a1.getId(),
                    "5,6,7"
            );

            Comite c2=new Comite(
                    "Physique",
                    ac1.getId(),
                    "8,9,10"
            );

            Comite c3=new Comite(
                    "Informatique",
                    ac2.getId(),
                    "11,12,13"
            );

            Comite c4=new Comite(
                    "Maths",
                    ac3.getId(),
                    "14,15,16"
            );

            Comite c5=new Comite(
                    "Biologie",
                    ac4.getId(),
                    "17,18,19"
            );

            Comite c6=new Comite(
                    "Médecine",
                    ac5.getId(),
                    "20,21,22"
            );


            a1.setAuteurs("3,4");
            a2.setAuteurs("2,3");
            a1.setComite(c1.getId());
            ac1.setComite(c2.getId());
            ac2.setComite(c3.getId());
            ac3.setComite(c4.getId());
            ac4.setComite(c5.getId());
            ac5.setComite(c6.getId());
            e1.setComite(c1.getId());
            e2.setComite(c1.getId());
            e3.setComite(c1.getId());

            e4.setComite(c2.getId());
            e5.setComite(c2.getId());
            e6.setComite(c2.getId());

            e7.setComite(c3.getId());
            e8.setComite(c3.getId());
            e9.setComite(c3.getId());

            e10.setComite(c4.getId());
            e11.setComite(c4.getId());
            e12.setComite(c4.getId());

            e13.setComite(c5.getId());
            e14.setComite(c5.getId());
            e15.setComite(c5.getId());

            e16.setComite(c6.getId());
            e17.setComite(c6.getId());
            e18.setComite(c6.getId());

            comRepo.saveAll(List.of(c1,c2,c3,c4,c5,c6));
            sciRepo.saveAll(
                    List.of(s1,s2,s3,s4,e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15,e16,e17,e18)
            );

            artRepo.saveAll(List.of(a1,a2,ac1,ac2,ac3,ac4,ac5));
        };
    }
}
