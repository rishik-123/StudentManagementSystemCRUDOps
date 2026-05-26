package com.Rishik.CRUDOps.Service;

import com.Rishik.CRUDOps.Entity.StudentEntry;
import com.Rishik.CRUDOps.Repo.EntryRepo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class StudentEntryService {
    @Autowired
    private EntryRepo entryRepo;

    public void saveEntry(StudentEntry studentEntry){
        entryRepo.save(studentEntry);
    }

    public List<StudentEntry> getAll(){
        return entryRepo.findAll(); // Fixed typo: findall -> findAll
    }

    public Optional<StudentEntry> findbyRollno(ObjectId rollno){
        return entryRepo.findById(rollno); // Fixed syntax: entryRepo(rollno) -> entryRepo.findById(rollno)
    }

    public void deletebyRollno(ObjectId rollno){
        entryRepo.deleteById(rollno); // Fixed syntax: entryRepo.deletebytrollno -> entryRepo.deleteById
    }
}
