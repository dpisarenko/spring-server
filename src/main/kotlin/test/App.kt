package test

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class App {
  fun run() {
	  SpringApplication.run(App::class.java)
  }
}

fun main(args: Array<String>) {
  App().run()
}

