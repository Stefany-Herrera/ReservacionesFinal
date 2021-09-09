package com.example.reservacionesapp

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "reservaciones")
class Reservacion(
    val nombre:String,
    val apellido:String,
    val telefono:String,
    val email:String,
    val tipo:String,
    val precio:String,
    val descripcion:String,
    val imagen:Int,
    @PrimaryKey(autoGenerate = true)
    var idReservacion: Int = 0
) : Serializable