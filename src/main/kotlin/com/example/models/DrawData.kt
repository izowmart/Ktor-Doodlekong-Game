package com.example.models

import com.example.other.Constants.TYPE_DRAW_DATA

data class DrawData(
    val roomName : String,
    val color : Int,
    val thickness: Float,
    val fromX: Float,
    val fromY: Float,
    val toX: Float,
    val toY: Float,
    val motionEvent: Int
): BaseModel(TYPE_DRAW_DATA)
