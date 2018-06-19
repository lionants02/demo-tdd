package com.example.demo

fun Number.format(digits: Int) = java.lang.String.format("%.${digits}f", this)