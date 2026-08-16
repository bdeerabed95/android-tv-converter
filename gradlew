#!/bin/sh
# Gradle wrapper script

if [ -n "$JAVA_HOME" ] ; then
    JAVACMD="$JAVA_HOME/bin/java"
else
    JAVACMD=java
fi

exec $JAVACMD -Xmx1536m -jar gradle/wrapper/gradle-wrapper.jar "$@"
