package bricksetproduceractor

import com.brickset.api._

import akka.actor.{Actor}
import akka.camel.{CamelExtension, CamelMessage}

import scala.collection.JavaConversions._
import org.apache.cxf.message.MessageContentsList

case class BricksetRequest(body: java.util.List[String], headers: java.util.Map[String, Object])

class BricksetProducerActor extends Actor {
  val camel = CamelExtension(context.system)

  val uri = "cxf:http://brickset.com/api/v2.asmx?serviceClass=com.brickset.api.BricksetAPIv2Soap"

  def extract(response: MessageContentsList) : Any = {
    response.toArray.toList match {
      case List(str: String) => str
    }
  }

  def receive = {
    case BricksetRequest(body, headers) => {
      camel.template.requestBodyAndHeaders(uri, body, headers) match {
        case response: MessageContentsList => sender() ! extract(response)
      }
    }
  }
}

