package org.slf4j.impl;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.Marker;

/**
 * Logger binder implementation for slf4j that simply returns NumbrsLoggerFactory.
 * Used internally in slf4j.
 */
@SuppressWarnings("unused")
public final class StaticLoggerBinder {

    /**
     * The unique instance of this class.
     *
     */
    private static final StaticLoggerBinder SINGLETON = new StaticLoggerBinder();

    /**
     * Return the singleton of this class.
     *
     * @return the StaticLoggerBinder singleton
     */
    public static StaticLoggerBinder getSingleton() {
        return SINGLETON;
    }

    /**
     * Declare the version of the SLF4J API this implementation is compiled against.
     * The value of this field is modified with each major release.
     */
    // to avoid constant folding by the compiler, this field must *not* be final
    public static String REQUESTED_API_VERSION = "1.7.22"; // !final

    private static final String LOGGER_FACTORY_CLASS_STR = "Hello";

    private StaticLoggerBinder() {

    }

    public ILoggerFactory getLoggerFactory() {
        return new ILoggerFactory() {
            @Override
            public Logger getLogger(String name) {
                return new Logger() {
                    @Override
                    public String getName() {
                        return "Hello";
                    }

                    @Override
                    public boolean isTraceEnabled() {
                        return false;
                    }

                    @Override
                    public void trace(String msg) {

                    }

                    @Override
                    public void trace(String format, Object arg) {

                    }

                    @Override
                    public void trace(String format, Object arg1, Object arg2) {

                    }

                    @Override
                    public void trace(String format, Object... arguments) {

                    }

                    @Override
                    public void trace(String msg, Throwable t) {

                    }

                    @Override
                    public boolean isTraceEnabled(Marker marker) {
                        return false;
                    }

                    @Override
                    public void trace(Marker marker, String msg) {

                    }

                    @Override
                    public void trace(Marker marker, String format, Object arg) {

                    }

                    @Override
                    public void trace(Marker marker, String format, Object arg1, Object arg2) {

                    }

                    @Override
                    public void trace(Marker marker, String format, Object... argArray) {

                    }

                    @Override
                    public void trace(Marker marker, String msg, Throwable t) {

                    }

                    @Override
                    public boolean isDebugEnabled() {
                        return false;
                    }

                    @Override
                    public void debug(String msg) {

                    }

                    @Override
                    public void debug(String format, Object arg) {

                    }

                    @Override
                    public void debug(String format, Object arg1, Object arg2) {

                    }

                    @Override
                    public void debug(String format, Object... arguments) {

                    }

                    @Override
                    public void debug(String msg, Throwable t) {

                    }

                    @Override
                    public boolean isDebugEnabled(Marker marker) {
                        return false;
                    }

                    @Override
                    public void debug(Marker marker, String msg) {

                    }

                    @Override
                    public void debug(Marker marker, String format, Object arg) {

                    }

                    @Override
                    public void debug(Marker marker, String format, Object arg1, Object arg2) {

                    }

                    @Override
                    public void debug(Marker marker, String format, Object... arguments) {

                    }

                    @Override
                    public void debug(Marker marker, String msg, Throwable t) {

                    }

                    @Override
                    public boolean isInfoEnabled() {
                        return false;
                    }

                    @Override
                    public void info(String msg) {

                    }

                    @Override
                    public void info(String format, Object arg) {

                    }

                    @Override
                    public void info(String format, Object arg1, Object arg2) {

                    }

                    @Override
                    public void info(String format, Object... arguments) {

                    }

                    @Override
                    public void info(String msg, Throwable t) {

                    }

                    @Override
                    public boolean isInfoEnabled(Marker marker) {
                        return false;
                    }

                    @Override
                    public void info(Marker marker, String msg) {

                    }

                    @Override
                    public void info(Marker marker, String format, Object arg) {

                    }

                    @Override
                    public void info(Marker marker, String format, Object arg1, Object arg2) {

                    }

                    @Override
                    public void info(Marker marker, String format, Object... arguments) {

                    }

                    @Override
                    public void info(Marker marker, String msg, Throwable t) {

                    }

                    @Override
                    public boolean isWarnEnabled() {
                        return false;
                    }

                    @Override
                    public void warn(String msg) {

                    }

                    @Override
                    public void warn(String format, Object arg) {

                    }

                    @Override
                    public void warn(String format, Object... arguments) {

                    }

                    @Override
                    public void warn(String format, Object arg1, Object arg2) {

                    }

                    @Override
                    public void warn(String msg, Throwable t) {

                    }

                    @Override
                    public boolean isWarnEnabled(Marker marker) {
                        return false;
                    }

                    @Override
                    public void warn(Marker marker, String msg) {

                    }

                    @Override
                    public void warn(Marker marker, String format, Object arg) {

                    }

                    @Override
                    public void warn(Marker marker, String format, Object arg1, Object arg2) {

                    }

                    @Override
                    public void warn(Marker marker, String format, Object... arguments) {

                    }

                    @Override
                    public void warn(Marker marker, String msg, Throwable t) {

                    }

                    @Override
                    public boolean isErrorEnabled() {
                        return false;
                    }

                    @Override
                    public void error(String msg) {

                    }

                    @Override
                    public void error(String format, Object arg) {

                    }

                    @Override
                    public void error(String format, Object arg1, Object arg2) {

                    }

                    @Override
                    public void error(String format, Object... arguments) {

                    }

                    @Override
                    public void error(String msg, Throwable t) {

                    }

                    @Override
                    public boolean isErrorEnabled(Marker marker) {
                        return false;
                    }

                    @Override
                    public void error(Marker marker, String msg) {

                    }

                    @Override
                    public void error(Marker marker, String format, Object arg) {

                    }

                    @Override
                    public void error(Marker marker, String format, Object arg1, Object arg2) {

                    }

                    @Override
                    public void error(Marker marker, String format, Object... arguments) {

                    }

                    @Override
                    public void error(Marker marker, String msg, Throwable t) {

                    }
                };
            }
        };
    }

    @SuppressWarnings("MethodMayBeStatic")
    public String getLoggerFactoryClassStr() {
        return LOGGER_FACTORY_CLASS_STR;
    }

    public static String test() {
        return "Test";
    }

}
