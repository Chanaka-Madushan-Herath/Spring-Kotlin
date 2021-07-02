package com.cmadushan.spring.school.modules.school

import com.cmadushan.spring.school.modules.student.Student
import java.util.*
import javax.persistence.*

@Entity
data class School (
   @Id
   @GeneratedValue( strategy = GenerationType.AUTO)
    var id: UUID ?= null,

    var name :String ?= null,

   @OneToMany(mappedBy = "school")
   var students:List<Student> = mutableListOf()

    )

