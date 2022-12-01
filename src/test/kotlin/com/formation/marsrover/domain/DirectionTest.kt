package com.formation.marsrover.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DirectionTest {

    @Test
    internal fun `should turn to the right from south`() {
        val direction: Direction = Direction.S

        direction.turn(Orientation.RIGHT)

        assertThat(direction).isEqualTo(Direction.W)
    }
}

