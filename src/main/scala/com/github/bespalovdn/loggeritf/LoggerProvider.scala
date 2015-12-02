package com.github.bespalovdn.loggeritf

import scala.reflect.ClassTag

trait LoggerProvider
{
    def logger: Logger
    def loggerT[A : ClassTag]: Logger
}