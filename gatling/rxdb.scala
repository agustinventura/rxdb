package digitalsingular

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

	val feeder = Iterator.continually(Map(
	  "page" -> Random.nextInt(5982)))

	val scn = scenario("rxdb").feed(feeder).repeat(500) {
		exec(http("Enclosures Page WarmUp Request")
			.get("/enclosures?plot=${page}")
			.check(status.is(200)))
	}

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
