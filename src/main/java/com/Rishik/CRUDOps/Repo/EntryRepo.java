package com.Rishik.CRUDOps.Repo;
import com.Rishik.CRUDOps.Entity.StudentEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface EntryRepo extends MongoRepository<StudentEntry, ObjectId>{}
