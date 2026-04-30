package com.example.matiasmasucci_parcial1_desarrollodeaplicaciones1


fun String.toSecureOutput(): String {
    return this.replace("a", "apa").replace("e", "epe")
}
