package kr.ac.kumoh.s20211139.w24w05thymeleaf.repository

import kr.ac.kumoh.s20211139.w24w05thymeleaf.model.Song
import org.springframework.stereotype.Repository

@Repository
class SongRepository{
    protected val songs= listOf(
        Song(1,"슬픔이어 안녕","잔나비"),
        Song(2,"Sunny days","wave to earth"),
        Song(3,"구름 타고 멀리 날아","신지훈")
    )
    val songSize: Int
        get()=songs.size
    fun getSong(index: Int)=songs[index]

    fun fetchSong()=songs
}