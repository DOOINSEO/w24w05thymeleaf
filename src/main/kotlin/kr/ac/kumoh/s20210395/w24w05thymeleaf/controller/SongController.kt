package kr.ac.kumoh.s20210395.w24w05thymeleaf.controller

import kr.ac.kumoh.s20210395.w24w05thymeleaf.service.SongService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class SongController(val service: SongService) {
    @GetMapping("/song/random")
    fun getRandomSong(model: Model): String {
        model.addAttribute("songTitle", service.getRandomSong().title)
        return "random"
    }
}