package com.example.models

import com.example.other.Constants.TYPE_GAME_ERROR
import javax.lang.model.type.ErrorType

data class GameError(
    val errorType: Int
):BaseModel(TYPE_GAME_ERROR){

    companion object{
        const val ERROR_ROOM_NOT_FOUND = 0
    }
}
