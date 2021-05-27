package com.krause.retrofitutil.model

import java.util.concurrent.TimeUnit

data class TimeoutApi(
    val readTimeout: TimeoutClient = TimeoutClient(),
    val writeTimeout: TimeoutClient = TimeoutClient(),
    val connectTimeout: TimeoutClient = TimeoutClient()
)

data class TimeoutClient(
    val timeout: Long = 20L,
    val timeUnit: TimeUnit = TimeUnit.SECONDS
)
