package com.Rishik.CRUDOps.Entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection="student_entry")
public class StudentEntry {
    @Id
    private ObjectId rollno;
    private LocalDateTime date;
    private String name;
    private String std;
    private String age;

    // Fixed: Changed method names to strict camelCase so Jackson can find them
    public void setRollno(ObjectId rollno){this.rollno=rollno;}
    public void setName(String name){this.name=name;}
    public void setStd(String std){this.std=std;}
    public void setAge(String age){this.age=age;}

    public ObjectId getRollno(){return rollno;}
    public String getName(){return name;}
    public String getStd(){return std;}
    public String getAge(){return age;}

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
