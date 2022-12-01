package com.formation.marsrover.domain

enum class Direction(value: String) {
    S("SOUTH"),
    N("NORTH"),
    W("WEST"),
    E("EST");

    fun turn(right: Orientation) {
        TODO("Not yet implemented")
    }
}
