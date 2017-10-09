package my.ci.dsl

import my.ci.shared.Config

def String hello = new Config().greet('world')
println(hello)
