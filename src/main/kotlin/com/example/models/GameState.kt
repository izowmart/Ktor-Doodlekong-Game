package com.example.models

import com.example.other.Constants.TYPE_GAME_STATE

data class GameState(
    val drawingPlayer : String,
    val word: String
):BaseModel(TYPE_GAME_STATE)
