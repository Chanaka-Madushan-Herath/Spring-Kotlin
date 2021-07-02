package com.cmadushan.spring.school.utils

import com.cmadushan.spring.school.modules.school.School
import com.cmadushan.spring.school.modules.school.SchoolRepository
import com.cmadushan.spring.school.modules.student.Student
import com.cmadushan.spring.school.modules.student.StudentRepository
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class DummyData (val studentRepository: StudentRepository , val schoolRepository: SchoolRepository ){

    @PostConstruct
    fun initialData(){
        var school1 =School(name = "School1")
        schoolRepository.save(school1)

        var student = Student(firstName = "Chanaka" , lastName = "Herath" , email = "chanaka@gmai.com" , school = school1)
        studentRepository.save(student)
    }
}