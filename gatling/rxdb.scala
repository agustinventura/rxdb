package com.digitalsingular.rxdb

import scala.concurrent.duration._
import scala.util.Random

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class rxdb extends Simulation {

	val httpProtocol = http
		.baseUrl("http://localhost:8080")
		.inferHtmlResources()
		.acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("es-ES,es;q=0.8,en-US;q=0.5,en;q=0.3")
		.upgradeInsecureRequestsHeader("1")
		.userAgentHeader("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0")

	def randomPlot() = Random.nextInt(5982)

	val scn = scenario("rxdb").repeat(5000) {
		val plotId = randomPlot()
		exec(http("Enclosures Page Request")
			.get("/enclosures?plot=" + plotId)
			.check(status.is(200))
			.check(jsonPath("$[0].plot").ofType[Int].is(plotId)))
	}

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}