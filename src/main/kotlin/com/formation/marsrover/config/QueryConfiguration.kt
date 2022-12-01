package com.formation.marsrover.config

import com.formation.marsrover.domain.RoverQuery
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class QueryConfiguration {

    @Bean
    fun roverQuery(): RoverQuery {
        return RoverQuery()
    }


}