package com.cmadushan.spring.school.modules.student

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/students")
class StudentController(val studentService: StudentService){

    @PostMapping
    fun saveStudent(@RequestBody student: Student):Student{
        return this.studentService.save(student)
    }

    @GetMapping
    fun getAllStudents(): MutableIterable<Student> {
        return this.studentService.getAllStudents()
    }

    @DeleteMapping("/{id}")
    fun deleteById(@PathVariable("id") id: String) {
        return this.studentService.deleteOneById(id)

    }

}