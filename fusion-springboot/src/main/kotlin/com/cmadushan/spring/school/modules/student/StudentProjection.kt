package com.cmadushan.spring.school.modules.student

import com.cmadushan.spring.school.modules.school.School
import org.springframework.beans.factory.annotation.Value
import org.springframework.data.rest.core.config.Projection


@Projection(name="student", types = [Student::class])
interface StudentSchoolProjection{
    fun getFirstName():String
    fun getLastName():String

    @Value("#{target.firstName + ' ' + target.lastName}")
    fun getFullName(): String

    fun getSchool(): School
}
