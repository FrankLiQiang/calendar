package com.frank.calendar.util;

/**
 * The default timer is used in the normal execution of the app.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/frank/calendar/util/DefaultTimer;", "Lcom/frank/calendar/util/Timer;", "()V", "TIMER_PERIOD_MS", "", "timer", "Ljava/util/Timer;", "start", "", "task", "Ljava/util/TimerTask;", "app_debug"})
public final class DefaultTimer implements com.frank.calendar.util.Timer {
    private static final long TIMER_PERIOD_MS = 1000L;
    @org.jetbrains.annotations.NotNull
    private static java.util.Timer timer;
    @org.jetbrains.annotations.NotNull
    public static final com.frank.calendar.util.DefaultTimer INSTANCE = null;
    
    private DefaultTimer() {
        super();
    }
    
    @java.lang.Override
    public void start(@org.jetbrains.annotations.NotNull
    java.util.TimerTask task) {
    }
}