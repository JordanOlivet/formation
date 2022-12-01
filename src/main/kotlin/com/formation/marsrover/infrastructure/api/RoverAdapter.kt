package com.formation.marsrover.infrastructure.api

import com.formation.marsrover.domain.RoverQuery

class RoverAdapter constructor(private val roverQuery: RoverQuery) {
    fun getRover(): RoverView = RoverView.from(roverQuery.find())

}
