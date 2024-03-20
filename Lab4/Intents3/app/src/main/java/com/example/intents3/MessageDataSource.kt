package com.example.intents3

object MessageDataSource {
    private val messages = mutableListOf<String>()

    fun getMessages(): List<String> {
        return messages.toList()
    }

    fun addMessage(message: String) {
        messages.add(message)
    }
}