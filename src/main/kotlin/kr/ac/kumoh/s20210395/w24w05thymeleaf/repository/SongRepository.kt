package kr.ac.kumoh.s20210395.w24w05thymeleaf.repository

import kr.ac.kumoh.s20210395.w24w05thymeleaf.model.Song
import org.springframework.stereotype.Repository

@Repository
class SongRepository {
    protected val songs = listOf(
        Song(1, "Ditto", "NewJeans"),
        Song(2, "0310", "백예린"),
        Song(3, "Ballade4", "Chopin"),
    )

    val songsSize: Int
        get() = songs.size

    fun getSong(index: Int) = songs[index]

    fun fetchSong() = songs
}