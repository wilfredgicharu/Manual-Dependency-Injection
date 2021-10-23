package com.example.manualinjectionapp

import java.util.*

class NumberRepositoryImp(private val random: Random): NumberRepository {
    override fun generateNextNumber(): Int {
        return random.nextInt()
    }


}