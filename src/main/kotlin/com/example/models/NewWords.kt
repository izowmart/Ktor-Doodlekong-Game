package com.example.models

import com.example.other.Constants.TYPE_NEW_WORDS

data class NewWords(
    val newWords : List<String>
): BaseModel(TYPE_NEW_WORDS)
