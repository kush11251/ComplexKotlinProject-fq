package com.company.app.adapters

import com.company.app.models.User

class UserAdapter {
    fun adapt(user: User): String {
        return "User(id=${user.id}, name=${user.name}, email=${user.email})"
    }
}