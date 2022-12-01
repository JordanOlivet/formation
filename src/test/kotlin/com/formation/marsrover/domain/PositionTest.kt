package com.formation.marsrover.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PositionTest {

    @Test
    fun `should add position`() {
        //Given
        val position1 = Position(x = 0, y = 0)
        val position2 = Position(x = 1, y = 1)

        //when
        val expectedPosition = position1.plus(position2)

        //Then
        assertThat(expectedPosition).isEqualTo(Position(x = 1, y = 1))
    }
}
