package com.nidaappdev.performancemeasurement.customViews.Tutorial;


import com.nidaappdev.performancemeasurement.customViews.Tutorial.Focus.Focus;
import com.nidaappdev.performancemeasurement.customViews.Tutorial.Focus.FocusGravity;
import com.nidaappdev.performancemeasurement.util.Constants;

public class TutorialConfiguration {
    private int maskColor;

    private long delayMillis;

    private boolean isFadeInAnimationEnabled;

    private boolean isFadeOutAnimationEnabled;

    private Focus focusType;

    private FocusGravity focusGravity;

    private int padding;

    private boolean dismissOnTouch;

    private int colorTextViewInfo;

    private boolean isDotViewEnabled;

    private boolean isImageViewEnabled;

    public TutorialConfiguration() {
        maskColor = Constants.DEFAULT_MASK_COLOR;
        delayMillis = Constants.DEFAULT_DELAY_MILLIS;
        padding = Constants.DEFAULT_TARGET_PADDING;
        colorTextViewInfo = Constants.DEFAULT_COLOR_TEXTVIEW_INFO;
        focusType = Focus.ALL;
        focusGravity = FocusGravity.CENTER;
        isFadeInAnimationEnabled = true;
        isFadeOutAnimationEnabled = true;
        dismissOnTouch = false;
        isDotViewEnabled = false;
        isImageViewEnabled = true;
    }

    public int getMaskColor() {
        return maskColor;
    }

    public void setMaskColor(int maskColor) {
        this.maskColor = maskColor;
    }

    public long getDelayMillis() {
        return delayMillis;
    }

    public void setDelayMillis(long delayMillis) {
        this.delayMillis = delayMillis;
    }

    public boolean isFadeInAnimationEnabled() {
        return isFadeInAnimationEnabled;
    }

    public void setFadeInAnimationEnabled(boolean fadeInAnimationEnabled) {
        isFadeInAnimationEnabled = fadeInAnimationEnabled;
    }

    public boolean isFadeOutAnimationEnabled() {
        return isFadeOutAnimationEnabled;
    }

    public void setFadeOutAnimationEnabled(boolean fadeOutAnimationEnabled) {
        isFadeOutAnimationEnabled = fadeOutAnimationEnabled;
    }

    public Focus getFocusType() {
        return focusType;
    }

    public void setFocusType(Focus focusType) {
        this.focusType = focusType;
    }

    public FocusGravity getFocusGravity() {
        return focusGravity;
    }

    public void setFocusGravity(FocusGravity focusGravity) {
        this.focusGravity = focusGravity;
    }

    public int getPadding() {
        return padding;
    }

    public void setPadding(int padding) {
        this.padding = padding;
    }

    public boolean isDismissOnTouch() {
        return dismissOnTouch;
    }

    public void setDismissOnTouch(boolean dismissOnTouch) {
        this.dismissOnTouch = dismissOnTouch;
    }

    public int getColorTextViewInfo() {
        return colorTextViewInfo;
    }

    public void setColorTextViewInfo(int colorTextViewInfo) {
        this.colorTextViewInfo = colorTextViewInfo;
    }

    public boolean isDotViewEnabled() {
        return isDotViewEnabled;
    }

    public boolean isImageViewEnabled(){
        return isImageViewEnabled;
    }

    public void setDotViewEnabled(boolean dotViewEnabled) {
        isDotViewEnabled = dotViewEnabled;
    }
}
