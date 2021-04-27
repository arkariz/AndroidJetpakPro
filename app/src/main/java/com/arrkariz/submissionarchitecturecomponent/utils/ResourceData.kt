package com.arrkariz.submissionarchitecturecomponent.utils

import com.arrkariz.submissionarchitecturecomponent.R
import com.arrkariz.submissionarchitecturecomponent.data.resource.remote.response.ResultsItem
import com.arrkariz.submissionarchitecturecomponent.data.resource.remote.response.TvShow

object ResourceData {
    fun setMovies(): List<ResultsItem> {

        val movies = ArrayList<ResultsItem>()

        movies.add(ResultsItem(
                id = 1,
                title= "Mortal Kombat",
                overview = "Seasoned musician Jackson Maine (Bradley Cooper) discovers-and falls \n" +
                        "in love with-struggling artist Ally (Gaga). \n" +
                        "She has just about given up on her \n" +
                        "dream to make it big as a singer \n" +
                        "until Jack coaxes her into the spotlight. \n" +
                        "But even as Ally's career takes off, \n" +
                        "the personal side of their relationship \n" +
                        "is breaking down, as Jack fights \n" +
                        "an ongoing battle with his own \n" +
                        "internal demons.",
                voteAverage = 5.0,
                posterPath = R.drawable.poster_a_start_is_born.toString()
            )
        )

        movies.add(ResultsItem(
                id = 2,
                title = "Alita: Battle Angel",
                overview = "Alita is a creation from an age of despair. Found by the mysterious Dr. Ido while trolling for cyborg parts, Alita becomes a lethal, dangerous being. She cannot remember who she is, or where she came from. But to Dr. Ido, the truth is all too clear. She is the one being who can break the cycle of death and destruction left behind from Tiphares. But to accomplish her true purpose, she must fight and kill. And that is where Alita's true significance comes to bear. She is an angel from heaven. She is an angel of death",
                voteAverage = 5.0,
                posterPath = R.drawable.poster_alita.toString()
        ))

        movies.add(ResultsItem(
                id = 3,
                title = "Aquaman",
                overview = "Born upon the shores of the surface world, Arthur Curry (Jason Momoa) discovers that he is only half human, with the other half of his blood being of Atlanteean descent, thus making him the rightful heir to the throne of the undersea kingdom of Atlantis. However, Arthur learns that Atlantis is being ruled by his malicious half-brother Orm (Patrick Wilson), who seeks to unite the seven underwater kingdoms and wage war upon the surface. With aid from Nuidis Vulko (Willem Dafoe) and the gorgeous Mera (Amber Heard), Arthur must discover the full potential of his true destiny and become Aquaman in order to save Atlantis and the surface from Orm's evil plot.",
                voteAverage = 5.0,
                posterPath = R.drawable.poster_aquaman.toString()
        ))

        movies.add(ResultsItem(
                id = 4,
                title = "Bohemian Rhapsody",
                overview = "Bohemian Rhapsody is a foot-stomping celebration of Queen, their music and their extraordinary lead singer Freddie Mercury. Freddie defied stereotypes and shattered convention to become one of the most beloved entertainers on the planet. The film traces the meteoric rise of the band through their iconic songs and revolutionary sound. They reach unparalleled success, but in an unexpected turn Freddie, surrounded by darker influences, shuns Queen in pursuit of his solo career.",
                voteAverage = 5.0,
                posterPath = R.drawable.poster_bohemian.toString()
        ))

        movies.add(ResultsItem(
                id = 5,
                title = "Cold Pursuit",
                overview = "Quiet family man and hard-working snowplow driver Nels is the lifeblood of a glitzy resort town in the Rocky Mountains because he is the one who keeps the winter roads clear. He and his wife live in a comfortable cabin away from the tourists. The town has just awarded him \"Citizen of the Year.\" But Nels has to leave his quiet mountain life when his son is murdered by a powerful drug lord.",
                voteAverage = 5.0,
                posterPath = R.drawable.poster_cold_persuit.toString()
        ))

        movies.add(ResultsItem(
                id = 6,
                title = "Creed II",
                overview = "Years after Adonis Creed made a name for himself under Rocky Balboa's mentorship, the young boxer becomes the Heavyweight Champion of the World. While life is good with that victory and his marriage to Bianca, trouble comes to Philadelphia when Ivan Drago, the Russian boxer who killed Adonis' father, Apollo, arrives with his son, Viktor, to challenge Adonis.",
                voteAverage = 5.0,
                posterPath = R.drawable.poster_creed.toString()
        ))

        movies.add(ResultsItem(
                id = 7,
                title = "Fantastic Beasts: The Crimes of Grindelwald",
                overview = "In an effort to thwart Grindelwald's plans of raising pure-blood wizards to rule over all non-magical beings, Albus Dumbledore enlists his former student Newt Scamander, who agrees to help, though he's unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world.",
                voteAverage = 5.0,
                posterPath = R.drawable.poster_crimes.toString()
        ))

        movies.add(ResultsItem(
                id = 8,
                title = "Glass",
                overview = "After pursuing Kevin Wendell Crumb and the multiple identities that reside within, David Dunn finds himself locked in a mental hospital alongside his archenemy, Elijah Price. The trio must now contend with a psychiatrist, who is out to prove they do not actually possess superhuman abilities.",
                voteAverage = 5.0,
                posterPath = R.drawable.poster_glass.toString()
        ))

        movies.add(ResultsItem(
                id = 9,
                title = "How to Train Your Dragon: The Hidden World ",
                overview = "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless' discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup's reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.",
                voteAverage = 5.0,
                posterPath = R.drawable.poster_how_to_train.toString()
        ))

        movies.add(ResultsItem(
                id = 10,
                title = "Avengers: Infinity War",
                overview = "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality.",
                voteAverage = 5.0,
                posterPath = R.drawable.poster_infinity_war.toString()
        ))

        return movies
    }

    fun setTv(): List<TvShow> {

        val movies = ArrayList<TvShow>()

        movies.add(
            TvShow(
            id = 1,
            name= "The Falcon and the Winter Soldier",
            overview = "Seasoned musician Jackson Maine (Bradley Cooper) discovers-and falls \n" +
                    "in love with-struggling artist Ally (Gaga). \n" +
                    "She has just about given up on her \n" +
                    "dream to make it big as a singer \n" +
                    "until Jack coaxes her into the spotlight. \n" +
                    "But even as Ally's career takes off, \n" +
                    "the personal side of their relationship \n" +
                    "is breaking down, as Jack fights \n" +
                    "an ongoing battle with his own \n" +
                    "internal demons.",
            voteAverage = 5.0,
            posterPath = R.drawable.poster_a_start_is_born.toString()
        )
        )

        movies.add(TvShow(
            id = 2,
            name = "Alita: Battle Angel",
            overview = "Alita is a creation from an age of despair. Found by the mysterious Dr. Ido while trolling for cyborg parts, Alita becomes a lethal, dangerous being. She cannot remember who she is, or where she came from. But to Dr. Ido, the truth is all too clear. She is the one being who can break the cycle of death and destruction left behind from Tiphares. But to accomplish her true purpose, she must fight and kill. And that is where Alita's true significance comes to bear. She is an angel from heaven. She is an angel of death",
            voteAverage = 5.0,
            posterPath = R.drawable.poster_alita.toString()
        ))

        movies.add(TvShow(
            id = 3,
            name = "Aquaman",
            overview = "Born upon the shores of the surface world, Arthur Curry (Jason Momoa) discovers that he is only half human, with the other half of his blood being of Atlanteean descent, thus making him the rightful heir to the throne of the undersea kingdom of Atlantis. However, Arthur learns that Atlantis is being ruled by his malicious half-brother Orm (Patrick Wilson), who seeks to unite the seven underwater kingdoms and wage war upon the surface. With aid from Nuidis Vulko (Willem Dafoe) and the gorgeous Mera (Amber Heard), Arthur must discover the full potential of his true destiny and become Aquaman in order to save Atlantis and the surface from Orm's evil plot.",
            voteAverage = 5.0,
            posterPath = R.drawable.poster_aquaman.toString()
        ))

        movies.add(TvShow(
            id = 4,
            name = "Bohemian Rhapsody",
            overview = "Bohemian Rhapsody is a foot-stomping celebration of Queen, their music and their extraordinary lead singer Freddie Mercury. Freddie defied stereotypes and shattered convention to become one of the most beloved entertainers on the planet. The film traces the meteoric rise of the band through their iconic songs and revolutionary sound. They reach unparalleled success, but in an unexpected turn Freddie, surrounded by darker influences, shuns Queen in pursuit of his solo career.",
            voteAverage = 5.0,
            posterPath = R.drawable.poster_bohemian.toString()
        ))

        movies.add(TvShow(
            id = 5,
            name = "Cold Pursuit",
            overview = "Quiet family man and hard-working snowplow driver Nels is the lifeblood of a glitzy resort town in the Rocky Mountains because he is the one who keeps the winter roads clear. He and his wife live in a comfortable cabin away from the tourists. The town has just awarded him \"Citizen of the Year.\" But Nels has to leave his quiet mountain life when his son is murdered by a powerful drug lord.",
            voteAverage = 5.0,
            posterPath = R.drawable.poster_cold_persuit.toString()
        ))

        movies.add(TvShow(
            id = 6,
            name = "Creed II",
            overview = "Years after Adonis Creed made a name for himself under Rocky Balboa's mentorship, the young boxer becomes the Heavyweight Champion of the World. While life is good with that victory and his marriage to Bianca, trouble comes to Philadelphia when Ivan Drago, the Russian boxer who killed Adonis' father, Apollo, arrives with his son, Viktor, to challenge Adonis.",
            voteAverage = 5.0,
            posterPath = R.drawable.poster_creed.toString()
        ))

        movies.add(TvShow(
            id = 7,
            name = "Fantastic Beasts: The Crimes of Grindelwald",
            overview = "In an effort to thwart Grindelwald's plans of raising pure-blood wizards to rule over all non-magical beings, Albus Dumbledore enlists his former student Newt Scamander, who agrees to help, though he's unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world.",
            voteAverage = 5.0,
            posterPath = R.drawable.poster_crimes.toString()
        ))

        movies.add(TvShow(
            id = 8,
            name = "Glass",
            overview = "After pursuing Kevin Wendell Crumb and the multiple identities that reside within, David Dunn finds himself locked in a mental hospital alongside his archenemy, Elijah Price. The trio must now contend with a psychiatrist, who is out to prove they do not actually possess superhuman abilities.",
            voteAverage = 5.0,
            posterPath = R.drawable.poster_glass.toString()
        ))

        movies.add(TvShow(
            id = 9,
            name = "How to Train Your Dragon: The Hidden World ",
            overview = "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless' discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup's reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.",
            voteAverage = 5.0,
            posterPath = R.drawable.poster_how_to_train.toString()
        ))

        movies.add(TvShow(
            id = 10,
            name = "Avengers: Infinity War",
            overview = "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality.",
            voteAverage = 5.0,
            posterPath = R.drawable.poster_infinity_war.toString()
        ))

        return movies
    }

//    fun setTvshow(): List<ResultsItem>{
//        val tvShow =ArrayList<ResultsItem>()
//
//        tvShow.add(ResultsItem(
//                "t01",
//                "Arrow",
//                "Oliver Queen and his father are lost at sea when their luxury yacht sinks, apparently in a storm. His father dies, but Oliver survives for five years on an uncharted island and eventually returns home. But he wasn't alone on the island where he learned not only how to fight and survive but also of his father's corruption and unscrupulous business dealings. He returns to civilization a changed man, determined to put things right.",
//                3,
//                R.drawable.poster_arrow
//        ))
//
//        tvShow.add(ResultsItem(
//                "t02",
//                "Doom Patrol",
//                "A re-imagining of one of DC's most beloved group of outcast Super Heroes: Robotman, Negative Man, Elasti-Girl and Crazy Jane, led by modern-day mad scientist Dr. Niles Caulder (The Chief). The Doom Patrol's members each suffered horrible accidents that gave them superhuman abilities - but also left them scarred and disfigured. ",
//                3,
//                R.drawable.poster_doom_patrol
//        ))
//
//        tvShow.add(ResultsItem(
//                "t03",
//                "Dragon Ball",
//                "What starts off as a bizarre re-telling of the Chinese legend \"Journey to the West\" quickly transforms into pure madness. On a twisted version of Earth, the ridiculously strong child-fighter Son Gokû is joined by several companions in the quest for the seven \"dragon balls\", which, when assembled, will summon the Grand Dragon, who will grant the bearer of the balls one single wish. ",
//                4,
//                R.drawable.poster_dragon_ball
//        ))
//
//        tvShow.add(ResultsItem(
//                "t04",
//                "Fairy Tail",
//                "Lucy, a 17 year old girl, sets out on journey to become a full-fledged wizard and joins the strongest and most (in) famous guild FAIRY TAIL where she meets Natsu, Happy, Gray and Erza, who treat her more like family than friends.",
//                4,
//                R.drawable.poster_fairytail
//        ))
//
//        tvShow.add(ResultsItem(
//                "t05",
//                "Family Guy",
//                "Sick, twisted and politically incorrect, the animated series features the adventures of the Griffin family. Endearingly ignorant Peter and his stay-at-home wife Lois reside in Quahog, R.I., and have three kids.",
//                4,
//                R.drawable.poster_family_guy
//        ))
//
//        tvShow.add(ResultsItem(
//                "t06",
//                "Flash",
//                "Barry Allen is a Central City police forensic scientist with a reasonably happy life, despite the childhood trauma of a mysterious red and yellow lightning killing his mother and framing his father. All that changes when a massive particle accelerator accident leads to Barry being struck by lightning in his lab.",
//                3,
//                R.drawable.poster_flash
//        ))
//
//        tvShow.add(ResultsItem(
//                "t07",
//                "Game of Thrones",
//                "In the mythical continent of Westeros, several powerful families fight for control of the Seven Kingdoms. As conflict erupts in the kingdoms of men, an ancient enemy rises once again to threaten them all. Meanwhile, the last heirs of a recently usurped dynasty plot to take back their homeland from across the Narrow Sea.",
//                5,
//                R.drawable.poster_god
//        ))
//
//        tvShow.add(ResultsItem(
//                "t08",
//                "Gotham",
//                "In crime ridden Gotham City, Thomas and Martha Wayne are murdered before young Bruce Wayne's eyes. Although Gotham City Police Department detectives, James Gordon, and his cynical partner, Harvey Bullock, seem to solace's the case quickly, things are not so simple. Inspired by Bruce's traumatized desire for justice, Gordon vows to find it amid Gotham's corruption.",
//                3,
//                R.drawable.poster_gotham
//        ))
//
//        tvShow.add(ResultsItem(
//                "t09",
//                "Grey Anatomy",
//                "A medical based drama centered around Meredith Grey, an aspiring surgeon and daughter of one of the best surgeons, Dr. Ellis Grey. Throughout the series, Meredith goes through professional and personal challenges along with fellow surgeons at Seattle Grace Hospital.",
//                3,
//                R.drawable.poster_grey_anatomy
//        ))
//
//        tvShow.add(ResultsItem(
//                "t10",
//                "Hanna",
//                "In equal parts high-concept thriller and coming-of-age drama, HANNA follows the journey of an extraordinary young girl raised in the forest, as she evades the relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is.",
//                3,
//                R.drawable.poster_hanna
//        ))
//
//        return tvShow
//    }
}