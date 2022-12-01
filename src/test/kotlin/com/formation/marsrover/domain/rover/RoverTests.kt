package com.formation.marsrover.domain.rover

import com.formation.marsrover.domain.Command
import com.formation.marsrover.domain.Direction.*
import com.formation.marsrover.domain.Movement.B
import com.formation.marsrover.domain.Movement.F
import com.formation.marsrover.domain.Position
import com.formation.marsrover.domain.Rover
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RoverTests {

    @Test
    internal fun `should return rover start position facing a direction`() {
        val rover = Rover(Position(), S)

        assertThat(rover).isEqualTo(Rover(Position(0, 0), S))
    }

    @Test
    internal fun `should move the rover forward`() {
        val rover = Rover(Position(), N)
        val commands: List<Command> = listOf(Command(F))

        val roverPosition = rover.execute(commands)

        assertThat(roverPosition).isEqualTo(Rover(Position(0, 1), N))
    }

    @Test
    internal fun `should move the rover backward`() {
        val rover = Rover(Position(), W)
        val commands: List<Command> = listOf(Command(B))

        val roverPosition = rover.execute(commands)

        assertThat(roverPosition).isEqualTo(Rover(Position(1, 0), W))
    }
}
