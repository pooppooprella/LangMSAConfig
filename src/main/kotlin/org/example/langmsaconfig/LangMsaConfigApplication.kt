package org.example.langmsaconfig

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer


@SpringBootApplication
@EnableConfigServer //Config서버일경우 추가 필요
class LangMsaConfigApplication

fun main(args: Array<String>) {
    runApplication<LangMsaConfigApplication>(*args)
}
