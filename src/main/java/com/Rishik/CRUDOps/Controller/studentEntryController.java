package com.Rishik.CRUDOps.Controller;

import com.Rishik.CRUDOps.Entity.StudentEntry;
import com.Rishik.CRUDOps.Service.StudentEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("student")
public class studentEntryController {
    @Autowired
    private StudentEntryService studentEntryService;

    @GetMapping//GetRequest
    public List<StudentEntry> getAll(){
        return studentEntryService.getAll();
    }

    @PostMapping//PostRequest
    public boolean createStudent(@RequestBody StudentEntry myEntry){
        myEntry.setDate(LocalDateTime.now());
        studentEntryService.saveEntry(myEntry);
        return true;
    }

    @GetMapping("id/{myroll}")
    public StudentEntry studentEntry(@PathVariable("myroll") ObjectId rollno){ // Fixed: Added ("myroll") to map the path variable correctly
        return studentEntryService.findbyRollno(rollno).orElse(null); // Fixed: Added 'return' statement so it actually returns the student
    }

    @DeleteMapping("id/{myroll}")
    public boolean deletebyRollno(@PathVariable("myroll") ObjectId rollno){ // Fixed: Added @PathVariable("myroll") annotation
        studentEntryService.deletebyRollno(rollno);
        return true;
    }
}
