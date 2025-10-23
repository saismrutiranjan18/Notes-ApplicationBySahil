package com.example.NoteApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.NoteApp.model.Note;

public interface NoteRepository extends MongoRepository<Note, String> {
}
