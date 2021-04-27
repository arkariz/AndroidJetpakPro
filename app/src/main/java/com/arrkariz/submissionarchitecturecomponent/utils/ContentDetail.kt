package com.arrkariz.submissionarchitecturecomponent.utils

import com.arrkariz.submissionarchitecturecomponent.R
import com.arrkariz.submissionarchitecturecomponent.data.resource.remote.response.DetailMovieResponse
import com.arrkariz.submissionarchitecturecomponent.data.resource.remote.response.DetailTvShowResponse
import com.arrkariz.submissionarchitecturecomponent.data.resource.remote.response.GenresItem

object ContentDetail {
    fun setDetail(): DetailMovieResponse {
        val gen1 = GenresItem("Fantasy", 14)
        val gen2 = GenresItem("Action", 28)
        val gen3 = GenresItem("Adventure", 12)
        val gen4 = GenresItem("Science Fiction", 878)
        val gen5 = GenresItem("Thriller", 53)
        val genres = arrayListOf<GenresItem>(gen1, gen2, gen3, gen4,gen5)
        val detail = DetailMovieResponse(
            "Mortal Kombat",
            genres,
            "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.",
            110,
            "/6Wdl9N6dL0Hi0T1qJLWSz6gMLbd.jpg",
            "2021-04-07",
            8.0
        )
        return detail
    }
}

object TvDetail {
    fun setDetail(): DetailTvShowResponse{
        val gen1 = GenresItem("Sci-Fi & Fantasy", 10765)
        val gen2 = GenresItem("Action", 28)
        val gen3 = GenresItem("Adventure", 12)
        val gen4 = GenresItem("Science Fiction", 878)
        val genres = arrayListOf<GenresItem>(gen1, gen2, gen3, gen4)
        val detail = DetailTvShowResponse(
            6,
            genres,
            "2021-03-19",
            "Following the events of “Avengers: Endgame”, the Falcon, Sam Wilson and the Winter Soldier, Bucky Barnes team up in a global adventure that tests their abilities, and their patience.",
            "laslalsl",
            8.0,
            "The Falcon and the Winter Soldier"
        )
        return detail
    }
}
//
//        detail.add(
//            DetailEntity(
//            "m02",
//            "PG-13",
//            "2h 2min",
//            "Action, Adventure, Sci-Fi",
//                    R.drawable.poster_alita
//
//            )
//        )
//
//        detail.add(
//            DetailEntity(
//            "m03",
//            "PG-13",
//            "2h 23min",
//            "Action, Adventure, Fantasy ",
//                    R.drawable.poster_aquaman
//
//            )
//        )
//
//        detail.add(
//            DetailEntity(
//            "m04",
//            "PG-13",
//            "2h 14min",
//            "Biography, Drama, Music",
//                    R.drawable.poster_bohemian
//
//            )
//        )
//
//        detail.add(
//            DetailEntity(
//            "m05",
//            "R",
//            "1h 59min",
//            "Action, Comedy, Crime",
//                    R.drawable.poster_cold_persuit
//
//            )
//        )
//
//        detail.add(
//            DetailEntity(
//            "m06",
//            "PG-13",
//            "2h 10min",
//            "Drama, Sport",
//                    R.drawable.poster_creed
//
//            )
//        )
//
//        detail.add(
//            DetailEntity(
//            "m07",
//            "PG-13",
//            "2h 14min",
//            "Adventure, Family, Fantasy",
//                    R.drawable.poster_crimes
//
//            )
//        )
//
//        detail.add(
//            DetailEntity(
//            "m08",
//            "PG-13",
//            "2h 9min",
//            "Drama, Sci-Fi, Thriller",
//                    R.drawable.poster_glass
//
//            )
//        )
//
//        detail.add(
//            DetailEntity(
//            "m09",
//            "PG",
//            "1h 44min",
//            "Animation, Action, Adventure",
//                    R.drawable.poster_how_to_train
//
//            )
//        )
//
//        detail.add(
//            DetailEntity(
//            "m10",
//            "PG-13",
//            "2h 29min",
//            "Action, Adventure, Sci-Fi",
//                    R.drawable.poster_infinity_war
//
//            )
//        )
//
//        detail.add(
//            DetailEntity(
//            "t01",
//            "TV-14",
//            "42min",
//            "Action, Adventure, Crime",
//                    R.drawable.poster_arrow
//        )
//        )
//
//        detail.add(
//            DetailEntity(
//            "t02",
//            "TV-MA",
//            "1h",
//            "Action, Adventure, Comedy",
//                    R.drawable.poster_doom_patrol
//        )
//        )
//
//        detail.add(
//            DetailEntity(
//            "t03",
//            "TV-Y7",
//            "24min",
//            "Animation, Action, Adventure",
//                    R.drawable.poster_dragon_ball
//        )
//        )
//
//        detail.add(
//            DetailEntity(
//            "t04",
//            "TV-14",
//            "24min",
//            "Animation, Action, Adventure",
//                    R.drawable.poster_fairytail
//        )
//        )
//
//        detail.add(
//            DetailEntity(
//            "t05",
//            "TV-14",
//            "22min",
//            "Animation, Comedy",
//                    R.drawable.poster_family_guy
//        )
//        )
//
//        detail.add(
//            DetailEntity(
//            "t06",
//            "TV-PG",
//            "43min",
//            "Action, Adventure, Drama",
//                    R.drawable.poster_flash
//        )
//        )
//
//        detail.add(
//            DetailEntity(
//            "t07",
//            "TV-MA",
//            "57min",
//            "Action, Adventure, Drama",
//                    R.drawable.poster_god
//        )
//        )
//
//        detail.add(
//            DetailEntity(
//            "t08",
//            "TV-14",
//            "42min",
//            "Action, Crime, Drama",
//                    R.drawable.poster_gotham
//        )
//        )
//
//        detail.add(
//            DetailEntity(
//            "t09",
//            "TV-14",
//            "41min",
//            "Drama, Romance",
//                    R.drawable.poster_grey_anatomy
//        )
//        )
//
//        detail.add(
//            DetailEntity(
//            "t10",
//            "TV-MA",
//            "1h",
//            "Action, Drama",
//                    R.drawable.poster_hanna
//        )
//        )
//
//        return detail
//    }
//}