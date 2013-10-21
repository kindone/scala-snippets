#!/bin/bash
scalac -cp "../../lib/h2-1.3.173.jar" h2.scala
scala -cp ".:../../lib/h2-1.3.173.jar" standalone.H2
