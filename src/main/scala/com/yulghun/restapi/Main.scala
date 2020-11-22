package com.yulghun.restapi

import cats.effect.{ExitCode, IO, IOApp}
import cats.implicits._

object Main extends IOApp {
  def run(args: List[String]) =
    RestapiServer.stream[IO].compile.drain.as(ExitCode.Success)
}