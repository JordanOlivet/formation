package com.formation.marsrover.infrastructure.api

import com.formation.marsrover.domain.Rover
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RoverController(val roverAdapter: RoverAdapter) {

    @GetMapping("/rover")
    fun getRover(): ResponseEntity<RoverView> {
        val roverView = roverAdapter.getRover()
        return ResponseEntity.ok(roverView)
    }
}

