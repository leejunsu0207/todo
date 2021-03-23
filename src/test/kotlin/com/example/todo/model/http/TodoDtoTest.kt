package com.example.todo.model.http

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.validation.FieldError
import javax.validation.Validation

class TodoDtoTest {

    val validator = Validation.buildDefaultValidatorFactory().validator

    @Test
    fun todoDtoTest(){

        val todoDto = TodoDto().apply{
            this.title = "테스트 타이틀"
            this.description = "테스트 설명"
            this.schedule = "2021-03-23 14:04:30"

        }

        val result = validator.validate(todoDto)

        result.forEach {
            println(it.propertyPath.last().name)
            println(it.message)
            println(it.invalidValue)
        }
        Assertions.assertEquals(true, result.isEmpty())
    }
}