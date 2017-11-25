package com.example.koltinDemo.Entity

import javax.persistence.*

@Entity
@Table(name = "glossary")
data class Glossary (
        // 发音
        var phonetic: String = "",
        // 释义
        var explains: Array<String> = arrayOf(),
        // 查询的单词
        var query: String = "",
        // 翻译结果
        var translation: Array<String> = arrayOf(),

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long = 0
)