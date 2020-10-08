package com.example.homework_2

import android.os.Parcel
import android.os.Parcelable
import java.util.*

data class MovieData(

    val stars: String,
    val adult: Boolean,
    val backdrop_path: String,
    val genre_ids: List<Int>,
    val id: Int,
    val original_language: String,
    val original_title: String,
    val overview: String,
    val popularity: Double,
    val poster_path: String,
    val release_date: String,
    val title: String,
    val video: Boolean,
    val vote_average: Double,
    val vote_count: Int,



)










//    val movies: String = """
//[
//{
//"vote_count": 222,
//"id": 439079,
//"video": false,
//"vote_average": 6.2,
//"title": "The Nun",
//"popularity": 176.945,
//"poster_path": "/sFC1ElvoKGdHJIWRpNB3xWJ9lJA.jpg",
//"original_language": "en",
//"original_title": "The Nun",
//"genre_ids": [    27,
//9648,
//53
//],
//"backdrop_path": "/fgsHxz21B27hOOqQBiw9L6yWcM7.jpg",
//"adult": false,
//"overview": "When a young nun at a cloistered abbey in Romania takes her own life, a priest
//with a haunted past and a novitiate on the threshold of her final vows are sent by the Vatican to
//investigate. Together they uncover the order’s unholy secret. Risking not only their lives but
//their faith and their very souls, they confront a malevolent force in the form of the same demonic
//nun that first terrorized audiences in “The Conjuring 2,” as the abbey becomes a horrific
//battleground between the living and the damned.",
//"release_date": "2018-09-05"
//},
//…………………………………………
// "release_date": "2018-08-09"
//}
//]
//""".trimIndent()





