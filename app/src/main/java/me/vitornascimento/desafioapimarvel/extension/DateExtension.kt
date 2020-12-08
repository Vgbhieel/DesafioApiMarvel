package me.vitornascimento.desafioapimarvel.extension

import java.text.SimpleDateFormat
import java.util.*

fun Date.toFormatted() = SimpleDateFormat("MMMM d, YYYY", Locale.US).format(this)