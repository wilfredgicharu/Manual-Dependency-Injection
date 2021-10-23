package com.example.manualinjectionapp

import java.util.*

class ApplicationContainer {
    val numberRepository: NumberRepository= NumberRepositoryImp(Random())
}