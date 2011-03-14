package com.gu.codecs.owasp

object CodecFunctions {

  private lazy val css = new CSSCodec
  private lazy val html = new HTMLCodec
  private lazy val xpath = new XPathCodec
  private lazy val htmlAttribute = new HTMLAttributeCodec
  private lazy val javascript = new JavascriptCodec
  private lazy val xml = new XMLCodec
  private lazy val xmlAttribute = new XMLAttributeCodec
  private lazy val oracle = new OracleCodec
  private lazy val mysqlModeMysql = new MySQLModeMySQLCodec
  private lazy val ansiModeMysql = new ANSIModeMySQLCodec
  private lazy val percent = new PercentCodec
  
  def encodeForCSS(input: String): String = css encode input
  def encodeForHTML(input: String): String = html encode input
  def encodeForHTMLAttribute(input: String): String = htmlAttribute encode input
  def encodeForJavascript(input: String): String = javascript encode input
  def encodeForXML(input: String): String = xml encode input
  def encodeForXMLAttribute(input: String): String = xmlAttribute encode input
  def encodeForXPath(input: String): String = xpath encode input
  def encodeForOracle(input: String): String = oracle encode input
  def encodeForMySQLModelMySQL(input: String): String = mysqlModeMysql encode input
  def encodeForANSIModeMySQL(input: String): String = ansiModeMysql encode input
  def encodeForPercent(input: String): String = percent encode input
  
  def decodeForCSS(input: String): String = css decode input
  def decodeForHTML(input: String): String = html decode input
  def decodeForHTMLAttribute(input: String): String = htmlAttribute decode input
  def decodeForJavascript(input: String): String = javascript decode input
  def decodeForXML(input: String): String = xml decode input
  def decodeForXMLAttribute(input: String): String = xmlAttribute decode input
  def decodeForXPath(input: String): String = xpath decode input
  def decodeForOracle(input: String): String = oracle decode input
  def decodeForMySQLModelMySQL(input: String): String = mysqlModeMysql decode input
  def decodeForANSIModeMySQL(input: String): String = ansiModeMysql decode input
  def decodeForPercent(input: String): String = percent decode input

}

