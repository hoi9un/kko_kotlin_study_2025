package kr.study.elan.kotlin.domain

import java.util.UUID

data class User(
    val id: String = UUID.randomUUID().toString(),
    val name: String,
)
