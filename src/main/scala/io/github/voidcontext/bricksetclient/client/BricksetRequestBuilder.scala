package io.github.voidcontext.bricksetclient.client

import io.github.voidcontext.bricksetclient.api._
import scala.collection.JavaConversions._
import javax.xml.bind.annotation.XmlType


case class BricksetRequest(body: java.util.List[String], headers: java.util.Map[String, Object])

object BricksetRequestBuilder {

  /**
   * Builds the param list by reading the operation class' annotation
   */
  private def buildBody[T](apiKey: String, operationClass: Class[T], params: Map[String, String]): List[String] = {
    operationClass.getAnnotation(classOf[XmlType]) // get XmlType annotation
      .propOrder.toList // list of property names
      .map(_ match {
        case name if params.contains(name)  => params.apply(name)   // set the specifici prop from the given map
        case name if name == "apiKey"       => apiKey               // set apiKey
        case _                              => ""                   //  set empty prop e.g. optional props
      })
  }

  private def lcfirst(str: String): String = {
    str.head.toLower + str.tail
  }

  def build[T](apiKey: String,operationClass: Class[T], params: Map[String, String]) : BricksetRequest = {
    BricksetRequest(buildBody(apiKey, operationClass, params), Map("operationName" -> lcfirst(operationClass.getSimpleName)))
  }
}
