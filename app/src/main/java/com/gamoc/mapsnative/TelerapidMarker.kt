package com.gamoc.mapsnative

@Entity
data class TelerapidMarker {
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "first_name") val firstName: String?,
    @ColumnInfo(name = "last_name") val lastName: String?
}