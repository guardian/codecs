package com.gu.codecs


trait Codec {
  def decode(input: String): String
  def encode(input: String): String
}