package com.guiodes

import java.io.File
import java.util.concurrent.atomic.AtomicInteger

fun main() {
    val count = AtomicInteger(0)

    // Format the references given by the https://www.openbible.info/labs/cross-references/ website
    File("src/main/resources/references.txt").forEachLine {
        val wordList = it.split("\t").toMutableList()

        wordList.removeLast()

        File("src/main/resources/formatted.txt").appendText(
            wordList.joinToString(",")+ "\n"
        )

        println("${count.incrementAndGet()}º line added to formatted.txt")
    }

    // Translate each english bible reference to portuguese
    File("src/main/resources/formatted.txt").forEachLine {
        val wordList = it.split(",").toMutableList()

        // Translate each english bible reference to portuguese

        File("src/main/resources/translated.txt").appendText(
            "${wordList.joinToString(",").translateReference()}\n"
        )

        println("${count.incrementAndGet()}º line added to translated.txt")
    }
}

fun String.translateReference() = this.replace("Gen", "Gênesis")
    .replace("Exod", "Êxodo")
    .replace("Lev", "Levítico")
    .replace("Num", "Números")
    .replace("Deut", "Deuteronômio")
    .replace("Josh", "Josué")
    .replace("Judg", "Juízes")
    .replace("Ruth", "Rute")
    .replace("1Sam", "1 Samuel")
    .replace("2Sam", "2 Samuel")
    .replace("1Kgs", "1 Reis")
    .replace("2Kgs", "2 Reis")
    .replace("1Chr", "1 Crônicas")
    .replace("2Chr", "2 Crônicas")
    .replace("Ezra", "Esdras")
    .replace("Neh", "Neemias")
    .replace("Esth", "Ester")
    .replace("Job", "Jó")
    .replace("Ps", "Salmos")
    .replace("Prov", "Provérbios")
    .replace("Eccl", "Eclesiastes")
    .replace("Song", "Cantares")
    .replace("Isa", "Isaías")
    .replace("Jer", "Jeremias")
    .replace("Lam", "Lamentações")
    .replace("Ezek", "Ezequiel")
    .replace("Dan", "Daniel")
    .replace("Hos", "Oséias")
    .replace("Joel", "Joel")
    .replace("Amos", "Amós")
    .replace("Obad", "Obadias")
    .replace("Jonah", "Jonas")
    .replace("Mic", "Miquéias")
    .replace("Nah", "Naum")
    .replace("Hab", "Habacuque")
    .replace("Zeph", "Sofonias")
    .replace("Hag", "Ageu")
    .replace("Zech", "Zacarias")
    .replace("Mal", "Malaquias")
    .replace("Matt", "Mateus")
    .replace("Mark", "Marcos")
    .replace("Luke", "Lucas")
    .replace("John", "João")
    .replace("Acts", "Atos")
    .replace("Rom", "Romanos")
    .replace("1Cor", "1 Coríntios")
    .replace("2Cor", "2 Coríntios")
    .replace("Gal", "Gálatas")
    .replace("Eph", "Efésios")
    .replace("Phil", "Filipenses")
    .replace("Col", "Colossenses")
    .replace("1Thess", "1 Tessalonicenses")
    .replace("2Thess", "2 Tessalonicenses")
    .replace("1Tim", "1 Timóteo")
    .replace("2Tim", "2 Timóteo")
    .replace("Titus", "Tito")
    .replace("Phlm", "Filemom")
    .replace("Heb", "Hebreus")
    .replace("Jas", "Tiago")
    .replace("1Pet", "1 Pedro")
    .replace("2Pet", "2 Pedro")
    .replace("1John", "1 João")
    .replace("2John", "2 João")
    .replace("3John", "3 João")
    .replace("Jude", "Judas")
    .replace("Rev", "Apocalipse")