package kr.study.elan.kotlin.controller

import kr.study.elan.kotlin.service.PokemonService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/pokemon")
class PokemonController(
    private val pokemonService: PokemonService
) {
    @GetMapping("/{id}")
    fun delegateApi(@PathVariable id: Int): Mono<Any> {
        return pokemonService.getPokemon(id)
    }
}