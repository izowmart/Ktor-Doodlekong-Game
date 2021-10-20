package com.example.models

import com.example.data.Room
import com.example.other.Constants.TYPE_PHASE_CHANGE

data class PhaseChange(
    var phase: Room.Phase?,
    var time: Long,
    var drawingPlayer: String? = null
): BaseModel(TYPE_PHASE_CHANGE)
