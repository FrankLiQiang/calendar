package com.frank.calendar.databinding;
import com.frank.calendar.R;
import com.frank.calendar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding implements com.frank.calendar.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            );
        this.activityContainer.setTag(null);
        this.date.setTag(null);
        this.leftTime.setTag(null);
        this.time.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.frank.calendar.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewmodel == variableId) {
            setViewmodel((com.frank.calendar.data.IntervalTimerViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable com.frank.calendar.data.IntervalTimerViewModel Viewmodel) {
        updateRegistration(4, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelNongliDate((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewmodelCurrentDate((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewmodelDateColor((androidx.databinding.ObservableBoolean) object, fieldId);
            case 3 :
                return onChangeViewmodelCurrentTime((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewmodel((com.frank.calendar.data.IntervalTimerViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelNongliDate(androidx.databinding.ObservableField<java.lang.String> ViewmodelNongliDate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelCurrentDate(androidx.databinding.ObservableField<java.lang.String> ViewmodelCurrentDate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelDateColor(androidx.databinding.ObservableBoolean ViewmodelDateColor, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelCurrentTime(androidx.databinding.ObservableField<java.lang.String> ViewmodelCurrentTime, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodel(com.frank.calendar.data.IntervalTimerViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.databinding.ObservableField<java.lang.String> viewmodelNongliDate = null;
        java.lang.String viewmodelCurrentTimeGet = null;
        java.lang.String viewmodelNongliDateGet = null;
        boolean viewmodelDateColorGet = false;
        androidx.databinding.ObservableField<java.lang.String> viewmodelCurrentDate = null;
        int viewmodelDateColorDateAndroidColorTeal700DateAndroidColorRed = 0;
        java.lang.String viewmodelCurrentDateGet = null;
        androidx.databinding.ObservableBoolean viewmodelDateColor = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelCurrentTime = null;
        com.frank.calendar.data.IntervalTimerViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.nongliDate
                        viewmodelNongliDate = viewmodel.getNongliDate();
                    }
                    updateRegistration(0, viewmodelNongliDate);


                    if (viewmodelNongliDate != null) {
                        // read viewmodel.nongliDate.get()
                        viewmodelNongliDateGet = viewmodelNongliDate.get();
                    }
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.currentDate
                        viewmodelCurrentDate = viewmodel.getCurrentDate();
                    }
                    updateRegistration(1, viewmodelCurrentDate);


                    if (viewmodelCurrentDate != null) {
                        // read viewmodel.currentDate.get()
                        viewmodelCurrentDateGet = viewmodelCurrentDate.get();
                    }
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.dateColor
                        viewmodelDateColor = viewmodel.getDateColor();
                    }
                    updateRegistration(2, viewmodelDateColor);


                    if (viewmodelDateColor != null) {
                        // read viewmodel.dateColor.get()
                        viewmodelDateColorGet = viewmodelDateColor.get();
                    }
                if((dirtyFlags & 0x34L) != 0) {
                    if(viewmodelDateColorGet) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read viewmodel.dateColor.get() ? @android:color/teal_700 : @android:color/red
                    viewmodelDateColorDateAndroidColorTeal700DateAndroidColorRed = ((viewmodelDateColorGet) ? (getColorFromResource(date, R.color.teal_700)) : (getColorFromResource(date, R.color.red)));
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.currentTime
                        viewmodelCurrentTime = viewmodel.getCurrentTime();
                    }
                    updateRegistration(3, viewmodelCurrentTime);


                    if (viewmodelCurrentTime != null) {
                        // read viewmodel.currentTime.get()
                        viewmodelCurrentTimeGet = viewmodelCurrentTime.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.date, viewmodelCurrentDateGet);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            this.date.setTextColor(viewmodelDateColorDateAndroidColorTeal700DateAndroidColorRed);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.leftTime, viewmodelNongliDateGet);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.leftTime.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.time, viewmodelCurrentTimeGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewmodel != null
        boolean viewmodelJavaLangObjectNull = false;
        // viewmodel
        com.frank.calendar.data.IntervalTimerViewModel viewmodel = mViewmodel;



        viewmodelJavaLangObjectNull = (viewmodel) != (null);
        if (viewmodelJavaLangObjectNull) {


            viewmodel.leftTimeClicked();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.nongliDate
        flag 1 (0x2L): viewmodel.currentDate
        flag 2 (0x3L): viewmodel.dateColor
        flag 3 (0x4L): viewmodel.currentTime
        flag 4 (0x5L): viewmodel
        flag 5 (0x6L): null
        flag 6 (0x7L): viewmodel.dateColor.get() ? @android:color/teal_700 : @android:color/red
        flag 7 (0x8L): viewmodel.dateColor.get() ? @android:color/teal_700 : @android:color/red
    flag mapping end*/
    //end
}