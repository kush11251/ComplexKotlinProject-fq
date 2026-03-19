package com.company.app.repositories

import com.company.app.models.User

class UserRepository {
    fun getUsers(): List<User> {
        // Simulate data retrieval from a database
        return listOf(User(1, "John Doe", "john.doe@example.com"), User(2, "Jane Doe", "jane.doe@example.com"))
    }
}