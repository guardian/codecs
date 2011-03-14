Codecs
======

What is it?
-----------

Codecs is a repacked library of useful encoders and decoders. Included are:

 * OWASP ESAPI codecs: These are difficult to include without the full ESAPI framework. See http://code.google.com/p/owasp-esapi-java.


Include in your project by adding the following to your SBT project definition. (With most recent version number.)

   val guardian = "Guardian GitHub" at "http://guardian.github.com/maven/repo-releases"
   val codecs = "com.gu" % "codecs" % "0.1" withSources
