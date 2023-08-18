package com.frank.calendar.util;

/**
 * An [Observable] [ViewModel] for Data Binding.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0006\u0010\u000e\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/frank/calendar/util/ObservableViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/databinding/Observable;", "()V", "callbacks", "Landroidx/databinding/PropertyChangeRegistry;", "getCallbacks", "()Landroidx/databinding/PropertyChangeRegistry;", "callbacks$delegate", "Lkotlin/Lazy;", "addOnPropertyChangedCallback", "", "callback", "Landroidx/databinding/Observable$OnPropertyChangedCallback;", "notifyChange", "notifyPropertyChanged", "fieldId", "", "removeOnPropertyChangedCallback", "app_debug"})
public class ObservableViewModel extends androidx.lifecycle.ViewModel implements androidx.databinding.Observable {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy callbacks$delegate = null;
    
    public ObservableViewModel() {
        super();
    }
    
    private final androidx.databinding.PropertyChangeRegistry getCallbacks() {
        return null;
    }
    
    @java.lang.Override
    public void addOnPropertyChangedCallback(@org.jetbrains.annotations.NotNull
    androidx.databinding.Observable.OnPropertyChangedCallback callback) {
    }
    
    @java.lang.Override
    public void removeOnPropertyChangedCallback(@org.jetbrains.annotations.NotNull
    androidx.databinding.Observable.OnPropertyChangedCallback callback) {
    }
    
    /**
     * Notifies listeners that all properties of this instance have changed.
     */
    @kotlin.Suppress(names = {"unused"})
    public final void notifyChange() {
    }
    
    /**
     * Notifies listeners that a specific property has changed. The getter for the property
     * that changes should be marked with [Bindable] to generate a field in
     * `BR` to be used as `fieldId`.
     *
     * @param fieldId The generated BR id for the Bindable field.
     */
    public final void notifyPropertyChanged(int fieldId) {
    }
}