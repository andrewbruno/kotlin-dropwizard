package com.example

import io.dropwizard.core.Application
import io.dropwizard.core.setup.Environment

class HelloWorldApplication : Application<HelloWorldConfiguration>() {

    override fun run(configuration: HelloWorldConfiguration, environment: Environment) {
        environment.jersey().register(HelloWorldResource())
    }
}

fun main(args: Array<String>) {
    HelloWorldApplication().run(*args)
}
