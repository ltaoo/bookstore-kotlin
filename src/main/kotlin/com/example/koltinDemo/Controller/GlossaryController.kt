package com.example.koltinDemo.Controller

import com.example.koltinDemo.Repository.GlossaryRepository
import com.example.koltinDemo.Entity.Glossary
import com.google.gson.Gson
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class GlossaryController
@Autowired constructor(val repository: GlossaryRepository) {

    @RequestMapping("/glossary")
    fun findAll() = repository.findAll()

    @RequestMapping("/glossary/create", method = arrayOf(RequestMethod.POST))
    @ResponseBody
    fun create(@RequestBody record: String) {
        // 将 record 的字段转为字符串以便保存
        val glossary = Gson().fromJson(record, Glossary::class.java)
        repository.save(glossary)
    }

    @PutMapping("/glossary")
    fun updateUser(@RequestBody record: Glossary) {
        repository.save(record)
    }

    @DeleteMapping("/glossary/{id}")
    fun deleteEmployee(@PathVariable id: Long) {
        repository.delete(id)
    }
}
