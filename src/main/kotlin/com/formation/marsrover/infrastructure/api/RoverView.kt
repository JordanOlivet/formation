package com.formation.marsrover.infrastructure.api

import com.formation.marsrover.domain.Rover

data class RoverView(val x: Int, val y: Int, val direction: String) {
    companion object {
        fun from(rover: Rover): RoverView {
            return RoverView(
                x = rover.position.x,
                y = rover.position.y,
                direction = rover.direction.name
            )
        }
    }
}