package com.cmadushan.spring.school.modules.student


import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Student (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: UUID ?= null,

    var firstName : String ?= null,
    var lastName : String ?= null,
    var email:String ?= null
)