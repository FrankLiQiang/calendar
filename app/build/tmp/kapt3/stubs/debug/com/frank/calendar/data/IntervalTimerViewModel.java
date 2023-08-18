package com.frank.calendar.data;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010%\u001a\u00020&2\u0006\u0010\u0005\u001a\u00020\'J\u0006\u0010(\u001a\u00020\rJ\u0006\u0010)\u001a\u00020\rJ\b\u0010*\u001a\u0004\u0018\u00010\rJ\u0006\u0010+\u001a\u00020\rJ\u0006\u0010,\u001a\u00020&J\u0006\u0010-\u001a\u00020&J\b\u0010.\u001a\u00020&H\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010!\u001a\u00020\"\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$\u00a8\u0006/"}, d2 = {"Lcom/frank/calendar/data/IntervalTimerViewModel;", "Lcom/frank/calendar/util/ObservableViewModel;", "timer", "Lcom/frank/calendar/util/Timer;", "(Lcom/frank/calendar/util/Timer;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "currentDate", "Landroidx/databinding/ObservableField;", "", "getCurrentDate", "()Landroidx/databinding/ObservableField;", "currentDateNum", "", "getCurrentDateNum", "()I", "setCurrentDateNum", "(I)V", "currentTime", "getCurrentTime", "dateColor", "Landroidx/databinding/ObservableBoolean;", "getDateColor", "()Landroidx/databinding/ObservableBoolean;", "newCurrentDate", "getNewCurrentDate", "setNewCurrentDate", "nongliDate", "getNongliDate", "toDate", "Ljava/util/Calendar;", "getToDate", "()Ljava/util/Calendar;", "addContext", "", "Lcom/frank/calendar/MainActivity;", "getLeftDays", "getNongLi", "getNowDate", "getNowWeek", "leftTimeClicked", "startTimer", "updateTime", "app_debug"})
public final class IntervalTimerViewModel extends com.frank.calendar.util.ObservableViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.frank.calendar.util.Timer timer = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.databinding.ObservableField<java.lang.String> currentTime = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.databinding.ObservableField<java.lang.String> currentDate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.databinding.ObservableField<java.lang.String> nongliDate = null;
    private int newCurrentDate = -1;
    private int currentDateNum = -1;
    @org.jetbrains.annotations.NotNull
    private final androidx.databinding.ObservableBoolean dateColor = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.Calendar toDate = null;
    protected android.content.Context context;
    
    public IntervalTimerViewModel(@org.jetbrains.annotations.NotNull
    com.frank.calendar.util.Timer timer) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.databinding.ObservableField<java.lang.String> getCurrentTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.databinding.ObservableField<java.lang.String> getCurrentDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.databinding.ObservableField<java.lang.String> getNongliDate() {
        return null;
    }
    
    public final int getNewCurrentDate() {
        return 0;
    }
    
    public final void setNewCurrentDate(int p0) {
    }
    
    public final int getCurrentDateNum() {
        return 0;
    }
    
    public final void setCurrentDateNum(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.databinding.ObservableBoolean getDateColor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Calendar getToDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final android.content.Context getContext() {
        return null;
    }
    
    protected final void setContext(@org.jetbrains.annotations.NotNull
    android.content.Context p0) {
    }
    
    public final void addContext(@org.jetbrains.annotations.NotNull
    com.frank.calendar.MainActivity context) {
    }
    
    /**
     * Resets timers and state. Called from the UI.
     */
    public final void leftTimeClicked() {
    }
    
    /**
     * Start the timer!
     */
    public final void startTimer() {
    }
    
    private final void updateTime() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNongLi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLeftDays() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNowWeek() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getNowDate() {
        return null;
    }
}