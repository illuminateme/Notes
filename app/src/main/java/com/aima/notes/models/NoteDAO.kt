package com.aima.notes.models

import androidx.room.Dao
import androidx.room.Query

@Dao
interface NoteDAO {
    @Query()
    fun getAllNotes(): List<Notes>
    
}