package com.gu.codecs.owasp

import com.gu.codecs.Codec

trait OWASPCodec extends Codec {
  def codec: org.owasp.esapi.codecs.Codec
  lazy val immune = Array[Char]()

  def decode(input: String) = codec decode input
  def encode(input: String) = codec.encode(immune, input)
}

class CSSCodec extends OWASPCodec {
  lazy val codec = new org.owasp.esapi.codecs.CSSCodec
}

class HTMLEntityCodec extends OWASPCodec {
  lazy val codec = new org.owasp.esapi.codecs.HTMLEntityCodec
}

class HTMLCodec extends HTMLEntityCodec {
  override lazy val immune = Array(',', '.', '-', '_', ' ')
}

class HTMLAttributeCodec extends HTMLEntityCodec {
  override lazy val immune = Array(',', '.', '-', '_')
}

class XPathCodec extends HTMLEntityCodec {
  override lazy val immune = Array(',', '.', '-', '_', ' ')
}

class JavascriptCodec extends OWASPCodec {
  lazy val codec = new org.owasp.esapi.codecs.JavaScriptCodec
  override lazy val immune = Array(',', '.', '_')
}

trait SQLCodec extends OWASPCodec {
  override lazy val immune = Array(' ')
}

class MySQLModeMySQLCodec extends SQLCodec {
  lazy val codec = new org.owasp.esapi.codecs.MySQLCodec(org.owasp.esapi.codecs.MySQLCodec.MYSQL_MODE)
}

class ANSIModeMySQLCodec extends SQLCodec {
  lazy val codec = new org.owasp.esapi.codecs.MySQLCodec(org.owasp.esapi.codecs.MySQLCodec.ANSI_MODE)
}

class OracleCodec extends SQLCodec {
  lazy val codec = new org.owasp.esapi.codecs.OracleCodec
}

class PercentCodec extends OWASPCodec {
  lazy val codec = new org.owasp.esapi.codecs.PercentCodec
}

class XMLEntityCodec extends OWASPCodec {
  lazy val codec = new org.owasp.esapi.codecs.XMLEntityCodec
}

class XMLCodec extends XMLEntityCodec {
  override lazy val immune = Array(',', '.', '-', '_', ' ')
}

class XMLAttributeCodec extends XMLEntityCodec {
  override lazy val immune = Array(',', '.', '-', '_')
}
