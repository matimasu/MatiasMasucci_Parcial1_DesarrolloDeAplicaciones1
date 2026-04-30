package com.example.matiasmasucci_parcial1_desarrollodeaplicaciones1

import java.util.Locale

fun Double.formato(decimales: Int): String {
    return "%.${decimales}f".format(Locale.US, this)
}
