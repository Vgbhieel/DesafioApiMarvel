package me.vitornascimento.desafioapimarvel.extension

fun Double.toPrice() = String.format("$ %.2f", this)