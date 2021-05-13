package io.npc.hilttest

interface MainRepository {
    fun get(): String
}

class MainRepositoryImpl : MainRepository {
    override fun get(): String = "get string"
}
