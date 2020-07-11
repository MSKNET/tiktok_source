package com.facebook.yoga;

import java.util.ArrayList;
import java.util.List;

public class YogaNode implements Cloneable {
  private YogaBaselineFunction mBaselineFunction;
  
  private float mBorderBottom;
  
  private float mBorderLeft;
  
  private float mBorderRight;
  
  private float mBorderTop;
  
  private List<YogaNode> mChildren;
  
  private Object mData;
  
  private int mEdgeSetFlag;
  
  private boolean mHasNewLayout = true;
  
  private boolean mHasSetPosition;
  
  private float mHeight = 1.0E21F;
  
  private int mLayoutDirection;
  
  private float mLeft = 1.0E21F;
  
  private float mMarginBottom;
  
  private float mMarginLeft;
  
  private float mMarginRight;
  
  private float mMarginTop;
  
  private YogaMeasureFunction mMeasureFunction;
  
  private long mNativePointer = jni_YGNodeNew();
  
  private float mPaddingBottom;
  
  private float mPaddingLeft;
  
  private float mPaddingRight;
  
  private float mPaddingTop;
  
  private YogaNode mParent;
  
  private float mTop = 1.0E21F;
  
  private float mWidth = 1.0E21F;
  
  public YogaNode() {
    if (this.mNativePointer != 0L)
      return; 
    throw new IllegalStateException("Failed to allocate native memory");
  }
  
  public YogaNode(YogaConfig paramYogaConfig) {
    if (this.mNativePointer != 0L)
      return; 
    throw new IllegalStateException("Failed to allocate native memory");
  }
  
  private native void jni_YGNodeCalculateLayout(long paramLong, float paramFloat1, float paramFloat2);
  
  private native long jni_YGNodeClone(long paramLong, Object paramObject);
  
  private native void jni_YGNodeCopyStyle(long paramLong1, long paramLong2);
  
  private native void jni_YGNodeFree(long paramLong);
  
  static native int jni_YGNodeGetInstanceCount();
  
  private native void jni_YGNodeInsertChild(long paramLong1, long paramLong2, int paramInt);
  
  private native boolean jni_YGNodeIsDirty(long paramLong);
  
  private native void jni_YGNodeMarkDirty(long paramLong);
  
  private native void jni_YGNodeMarkDirtyAndPropogateToDescendants(long paramLong);
  
  private native long jni_YGNodeNew();
  
  private native long jni_YGNodeNewWithConfig(long paramLong);
  
  private native void jni_YGNodePrint(long paramLong);
  
  private native void jni_YGNodeRemoveChild(long paramLong1, long paramLong2);
  
  private native void jni_YGNodeReset(long paramLong);
  
  private native void jni_YGNodeSetHasBaselineFunc(long paramLong, boolean paramBoolean);
  
  private native void jni_YGNodeSetHasMeasureFunc(long paramLong, boolean paramBoolean);
  
  private native int jni_YGNodeStyleGetAlignContent(long paramLong);
  
  private native int jni_YGNodeStyleGetAlignItems(long paramLong);
  
  private native int jni_YGNodeStyleGetAlignSelf(long paramLong);
  
  private native float jni_YGNodeStyleGetAspectRatio(long paramLong);
  
  private native float jni_YGNodeStyleGetBorder(long paramLong, int paramInt);
  
  private native int jni_YGNodeStyleGetDirection(long paramLong);
  
  private native int jni_YGNodeStyleGetDisplay(long paramLong);
  
  private native Object jni_YGNodeStyleGetFlexBasis(long paramLong);
  
  private native int jni_YGNodeStyleGetFlexDirection(long paramLong);
  
  private native float jni_YGNodeStyleGetFlexGrow(long paramLong);
  
  private native float jni_YGNodeStyleGetFlexShrink(long paramLong);
  
  private native Object jni_YGNodeStyleGetHeight(long paramLong);
  
  private native int jni_YGNodeStyleGetJustifyContent(long paramLong);
  
  private native Object jni_YGNodeStyleGetMargin(long paramLong, int paramInt);
  
  private native Object jni_YGNodeStyleGetMaxHeight(long paramLong);
  
  private native Object jni_YGNodeStyleGetMaxWidth(long paramLong);
  
  private native Object jni_YGNodeStyleGetMinHeight(long paramLong);
  
  private native Object jni_YGNodeStyleGetMinWidth(long paramLong);
  
  private native int jni_YGNodeStyleGetOverflow(long paramLong);
  
  private native Object jni_YGNodeStyleGetPadding(long paramLong, int paramInt);
  
  private native Object jni_YGNodeStyleGetPosition(long paramLong, int paramInt);
  
  private native int jni_YGNodeStyleGetPositionType(long paramLong);
  
  private native Object jni_YGNodeStyleGetWidth(long paramLong);
  
  private native void jni_YGNodeStyleSetAlignContent(long paramLong, int paramInt);
  
  private native void jni_YGNodeStyleSetAlignItems(long paramLong, int paramInt);
  
  private native void jni_YGNodeStyleSetAlignSelf(long paramLong, int paramInt);
  
  private native void jni_YGNodeStyleSetAspectRatio(long paramLong, float paramFloat);
  
  private native void jni_YGNodeStyleSetBorder(long paramLong, int paramInt, float paramFloat);
  
  private native void jni_YGNodeStyleSetDirection(long paramLong, int paramInt);
  
  private native void jni_YGNodeStyleSetDisplay(long paramLong, int paramInt);
  
  private native void jni_YGNodeStyleSetFlex(long paramLong, float paramFloat);
  
  private native void jni_YGNodeStyleSetFlexBasis(long paramLong, float paramFloat);
  
  private native void jni_YGNodeStyleSetFlexBasisAuto(long paramLong);
  
  private native void jni_YGNodeStyleSetFlexBasisPercent(long paramLong, float paramFloat);
  
  private native void jni_YGNodeStyleSetFlexDirection(long paramLong, int paramInt);
  
  private native void jni_YGNodeStyleSetFlexGrow(long paramLong, float paramFloat);
  
  private native void jni_YGNodeStyleSetFlexShrink(long paramLong, float paramFloat);
  
  private native void jni_YGNodeStyleSetFlexWrap(long paramLong, int paramInt);
  
  private native void jni_YGNodeStyleSetHeight(long paramLong, float paramFloat);
  
  private native void jni_YGNodeStyleSetHeightAuto(long paramLong);
  
  private native void jni_YGNodeStyleSetHeightPercent(long paramLong, float paramFloat);
  
  private native void jni_YGNodeStyleSetJustifyContent(long paramLong, int paramInt);
  
  private native void jni_YGNodeStyleSetMargin(long paramLong, int paramInt, float paramFloat);
  
  private native void jni_YGNodeStyleSetMarginAuto(long paramLong, int paramInt);
  
  private native void jni_YGNodeStyleSetMarginPercent(long paramLong, int paramInt, float paramFloat);
  
  private native void jni_YGNodeStyleSetMaxHeight(long paramLong, float paramFloat);
  
  private native void jni_YGNodeStyleSetMaxHeightPercent(long paramLong, float paramFloat);
  
  private native void jni_YGNodeStyleSetMaxWidth(long paramLong, float paramFloat);
  
  private native void jni_YGNodeStyleSetMaxWidthPercent(long paramLong, float paramFloat);
  
  private native void jni_YGNodeStyleSetMinHeight(long paramLong, float paramFloat);
  
  private native void jni_YGNodeStyleSetMinHeightPercent(long paramLong, float paramFloat);
  
  private native void jni_YGNodeStyleSetMinWidth(long paramLong, float paramFloat);
  
  private native void jni_YGNodeStyleSetMinWidthPercent(long paramLong, float paramFloat);
  
  private native void jni_YGNodeStyleSetOverflow(long paramLong, int paramInt);
  
  private native void jni_YGNodeStyleSetPadding(long paramLong, int paramInt, float paramFloat);
  
  private native void jni_YGNodeStyleSetPaddingPercent(long paramLong, int paramInt, float paramFloat);
  
  private native void jni_YGNodeStyleSetPosition(long paramLong, int paramInt, float paramFloat);
  
  private native void jni_YGNodeStyleSetPositionPercent(long paramLong, int paramInt, float paramFloat);
  
  private native void jni_YGNodeStyleSetPositionType(long paramLong, int paramInt);
  
  private native void jni_YGNodeStyleSetWidth(long paramLong, float paramFloat);
  
  private native void jni_YGNodeStyleSetWidthAuto(long paramLong);
  
  private native void jni_YGNodeStyleSetWidthPercent(long paramLong, float paramFloat);
  
  public void addChildAt(YogaNode paramYogaNode, int paramInt) {
    if (paramYogaNode.mParent == null) {
      if (this.mChildren == null)
        this.mChildren = new ArrayList<YogaNode>(4); 
      this.mChildren.add(paramInt, paramYogaNode);
      paramYogaNode.mParent = this;
      jni_YGNodeInsertChild(this.mNativePointer, paramYogaNode.mNativePointer, paramInt);
      return;
    } 
    throw new IllegalStateException("Child already has a parent, it must be removed first.");
  }
  
  public final float baseline(float paramFloat1, float paramFloat2) {
    return this.mBaselineFunction.baseline(this, paramFloat1, paramFloat2);
  }
  
  public void calculateLayout(float paramFloat1, float paramFloat2) {
    jni_YGNodeCalculateLayout(this.mNativePointer, paramFloat1, paramFloat2);
  }
  
  public YogaNode clone() throws CloneNotSupportedException {
    YogaNode yogaNode = (YogaNode)super.clone();
    yogaNode.mNativePointer = jni_YGNodeClone(this.mNativePointer, yogaNode);
    List<YogaNode> list = this.mChildren;
    if (list != null) {
      list = (List<YogaNode>)((ArrayList)list).clone();
    } else {
      list = null;
    } 
    yogaNode.mChildren = list;
    return yogaNode;
  }
  
  public void copyStyle(YogaNode paramYogaNode) {
    jni_YGNodeCopyStyle(this.mNativePointer, paramYogaNode.mNativePointer);
  }
  
  public void dirty() {
    jni_YGNodeMarkDirty(this.mNativePointer);
  }
  
  public void dirtyAllDescendants() {
    jni_YGNodeMarkDirtyAndPropogateToDescendants(this.mNativePointer);
  }
  
  protected void finalize() throws Throwable {
    try {
      jni_YGNodeFree(this.mNativePointer);
      return;
    } finally {
      super.finalize();
    } 
  }
  
  public YogaAlign getAlignContent() {
    return YogaAlign.fromInt(jni_YGNodeStyleGetAlignContent(this.mNativePointer));
  }
  
  public YogaAlign getAlignItems() {
    return YogaAlign.fromInt(jni_YGNodeStyleGetAlignItems(this.mNativePointer));
  }
  
  public YogaAlign getAlignSelf() {
    return YogaAlign.fromInt(jni_YGNodeStyleGetAlignSelf(this.mNativePointer));
  }
  
  public float getAspectRatio() {
    return jni_YGNodeStyleGetAspectRatio(this.mNativePointer);
  }
  
  public float getBorder(YogaEdge paramYogaEdge) {
    return ((this.mEdgeSetFlag & 0x4) != 4) ? 1.0E21F : jni_YGNodeStyleGetBorder(this.mNativePointer, paramYogaEdge.intValue());
  }
  
  public YogaNode getChildAt(int paramInt) {
    return this.mChildren.get(paramInt);
  }
  
  public int getChildCount() {
    List<YogaNode> list = this.mChildren;
    return (list == null) ? 0 : list.size();
  }
  
  public Object getData() {
    return this.mData;
  }
  
  public YogaDisplay getDisplay() {
    return YogaDisplay.fromInt(jni_YGNodeStyleGetDisplay(this.mNativePointer));
  }
  
  public YogaValue getFlexBasis() {
    return (YogaValue)jni_YGNodeStyleGetFlexBasis(this.mNativePointer);
  }
  
  public YogaFlexDirection getFlexDirection() {
    return YogaFlexDirection.fromInt(jni_YGNodeStyleGetFlexDirection(this.mNativePointer));
  }
  
  public float getFlexGrow() {
    return jni_YGNodeStyleGetFlexGrow(this.mNativePointer);
  }
  
  public float getFlexShrink() {
    return jni_YGNodeStyleGetFlexShrink(this.mNativePointer);
  }
  
  public YogaValue getHeight() {
    return (YogaValue)jni_YGNodeStyleGetHeight(this.mNativePointer);
  }
  
  public YogaJustify getJustifyContent() {
    return YogaJustify.fromInt(jni_YGNodeStyleGetJustifyContent(this.mNativePointer));
  }
  
  public float getLayoutBorder(YogaEdge paramYogaEdge) {
    switch (null.a[paramYogaEdge.ordinal()]) {
      default:
        throw new IllegalArgumentException("Cannot get layout border of multi-edge shorthands");
      case 6:
        return (getLayoutDirection() == YogaDirection.RTL) ? this.mBorderLeft : this.mBorderRight;
      case 5:
        return (getLayoutDirection() == YogaDirection.RTL) ? this.mBorderRight : this.mBorderLeft;
      case 4:
        return this.mBorderBottom;
      case 3:
        return this.mBorderRight;
      case 2:
        return this.mBorderTop;
      case 1:
        break;
    } 
    return this.mBorderLeft;
  }
  
  public YogaDirection getLayoutDirection() {
    return YogaDirection.fromInt(this.mLayoutDirection);
  }
  
  public float getLayoutHeight() {
    return this.mHeight;
  }
  
  public float getLayoutMargin(YogaEdge paramYogaEdge) {
    switch (null.a[paramYogaEdge.ordinal()]) {
      default:
        throw new IllegalArgumentException("Cannot get layout margins of multi-edge shorthands");
      case 6:
        return (getLayoutDirection() == YogaDirection.RTL) ? this.mMarginLeft : this.mMarginRight;
      case 5:
        return (getLayoutDirection() == YogaDirection.RTL) ? this.mMarginRight : this.mMarginLeft;
      case 4:
        return this.mMarginBottom;
      case 3:
        return this.mMarginRight;
      case 2:
        return this.mMarginTop;
      case 1:
        break;
    } 
    return this.mMarginLeft;
  }
  
  public float getLayoutPadding(YogaEdge paramYogaEdge) {
    switch (null.a[paramYogaEdge.ordinal()]) {
      default:
        throw new IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
      case 6:
        return (getLayoutDirection() == YogaDirection.RTL) ? this.mPaddingLeft : this.mPaddingRight;
      case 5:
        return (getLayoutDirection() == YogaDirection.RTL) ? this.mPaddingRight : this.mPaddingLeft;
      case 4:
        return this.mPaddingBottom;
      case 3:
        return this.mPaddingRight;
      case 2:
        return this.mPaddingTop;
      case 1:
        break;
    } 
    return this.mPaddingLeft;
  }
  
  public float getLayoutWidth() {
    return this.mWidth;
  }
  
  public float getLayoutX() {
    return this.mLeft;
  }
  
  public float getLayoutY() {
    return this.mTop;
  }
  
  public YogaValue getMargin(YogaEdge paramYogaEdge) {
    return ((this.mEdgeSetFlag & 0x1) != 1) ? YogaValue.UNDEFINED : (YogaValue)jni_YGNodeStyleGetMargin(this.mNativePointer, paramYogaEdge.intValue());
  }
  
  public YogaValue getMaxHeight() {
    return (YogaValue)jni_YGNodeStyleGetMaxHeight(this.mNativePointer);
  }
  
  public YogaValue getMaxWidth() {
    return (YogaValue)jni_YGNodeStyleGetMaxWidth(this.mNativePointer);
  }
  
  public YogaValue getMinHeight() {
    return (YogaValue)jni_YGNodeStyleGetMinHeight(this.mNativePointer);
  }
  
  public YogaValue getMinWidth() {
    return (YogaValue)jni_YGNodeStyleGetMinWidth(this.mNativePointer);
  }
  
  public YogaOverflow getOverflow() {
    return YogaOverflow.fromInt(jni_YGNodeStyleGetOverflow(this.mNativePointer));
  }
  
  public YogaValue getPadding(YogaEdge paramYogaEdge) {
    return ((this.mEdgeSetFlag & 0x2) != 2) ? YogaValue.UNDEFINED : (YogaValue)jni_YGNodeStyleGetPadding(this.mNativePointer, paramYogaEdge.intValue());
  }
  
  public YogaNode getParent() {
    return this.mParent;
  }
  
  public YogaValue getPosition(YogaEdge paramYogaEdge) {
    return !this.mHasSetPosition ? YogaValue.UNDEFINED : (YogaValue)jni_YGNodeStyleGetPosition(this.mNativePointer, paramYogaEdge.intValue());
  }
  
  public YogaPositionType getPositionType() {
    return YogaPositionType.fromInt(jni_YGNodeStyleGetPositionType(this.mNativePointer));
  }
  
  public YogaDirection getStyleDirection() {
    return YogaDirection.fromInt(jni_YGNodeStyleGetDirection(this.mNativePointer));
  }
  
  public YogaValue getWidth() {
    return (YogaValue)jni_YGNodeStyleGetWidth(this.mNativePointer);
  }
  
  public boolean hasNewLayout() {
    return this.mHasNewLayout;
  }
  
  public int indexOf(YogaNode paramYogaNode) {
    List<YogaNode> list = this.mChildren;
    return (list == null) ? -1 : list.indexOf(paramYogaNode);
  }
  
  public boolean isDirty() {
    return jni_YGNodeIsDirty(this.mNativePointer);
  }
  
  public boolean isMeasureDefined() {
    return (this.mMeasureFunction != null);
  }
  
  public void markLayoutSeen() {
    this.mHasNewLayout = false;
  }
  
  public final long measure(float paramFloat1, int paramInt1, float paramFloat2, int paramInt2) {
    if (isMeasureDefined())
      return this.mMeasureFunction.measure(this, paramFloat1, YogaMeasureMode.fromInt(paramInt1), paramFloat2, YogaMeasureMode.fromInt(paramInt2)); 
    throw new RuntimeException("Measure function isn't defined!");
  }
  
  public void print() {
    jni_YGNodePrint(this.mNativePointer);
  }
  
  public YogaNode removeChildAt(int paramInt) {
    YogaNode yogaNode = this.mChildren.remove(paramInt);
    yogaNode.mParent = null;
    jni_YGNodeRemoveChild(this.mNativePointer, yogaNode.mNativePointer);
    return yogaNode;
  }
  
  public void reset() {
    this.mEdgeSetFlag = 0;
    this.mHasSetPosition = false;
    this.mHasNewLayout = true;
    this.mWidth = 1.0E21F;
    this.mHeight = 1.0E21F;
    this.mTop = 1.0E21F;
    this.mLeft = 1.0E21F;
    this.mMarginLeft = 0.0F;
    this.mMarginTop = 0.0F;
    this.mMarginRight = 0.0F;
    this.mMarginBottom = 0.0F;
    this.mPaddingLeft = 0.0F;
    this.mPaddingTop = 0.0F;
    this.mPaddingRight = 0.0F;
    this.mPaddingBottom = 0.0F;
    this.mBorderLeft = 0.0F;
    this.mBorderTop = 0.0F;
    this.mBorderRight = 0.0F;
    this.mBorderBottom = 0.0F;
    this.mLayoutDirection = 0;
    this.mMeasureFunction = null;
    this.mBaselineFunction = null;
    this.mData = null;
    jni_YGNodeReset(this.mNativePointer);
  }
  
  public void setAlignContent(YogaAlign paramYogaAlign) {
    jni_YGNodeStyleSetAlignContent(this.mNativePointer, paramYogaAlign.intValue());
  }
  
  public void setAlignItems(YogaAlign paramYogaAlign) {
    jni_YGNodeStyleSetAlignItems(this.mNativePointer, paramYogaAlign.intValue());
  }
  
  public void setAlignSelf(YogaAlign paramYogaAlign) {
    jni_YGNodeStyleSetAlignSelf(this.mNativePointer, paramYogaAlign.intValue());
  }
  
  public void setAspectRatio(float paramFloat) {
    jni_YGNodeStyleSetAspectRatio(this.mNativePointer, paramFloat);
  }
  
  public void setBaselineFunction(YogaBaselineFunction paramYogaBaselineFunction) {
    boolean bool;
    this.mBaselineFunction = paramYogaBaselineFunction;
    long l = this.mNativePointer;
    if (paramYogaBaselineFunction != null) {
      bool = true;
    } else {
      bool = false;
    } 
    jni_YGNodeSetHasBaselineFunc(l, bool);
  }
  
  public void setBorder(YogaEdge paramYogaEdge, float paramFloat) {
    this.mEdgeSetFlag |= 0x4;
    jni_YGNodeStyleSetBorder(this.mNativePointer, paramYogaEdge.intValue(), paramFloat);
  }
  
  public void setData(Object paramObject) {
    this.mData = paramObject;
  }
  
  public void setDirection(YogaDirection paramYogaDirection) {
    jni_YGNodeStyleSetDirection(this.mNativePointer, paramYogaDirection.intValue());
  }
  
  public void setDisplay(YogaDisplay paramYogaDisplay) {
    jni_YGNodeStyleSetDisplay(this.mNativePointer, paramYogaDisplay.intValue());
  }
  
  public void setFlex(float paramFloat) {
    jni_YGNodeStyleSetFlex(this.mNativePointer, paramFloat);
  }
  
  public void setFlexBasis(float paramFloat) {
    jni_YGNodeStyleSetFlexBasis(this.mNativePointer, paramFloat);
  }
  
  public void setFlexBasisAuto() {
    jni_YGNodeStyleSetFlexBasisAuto(this.mNativePointer);
  }
  
  public void setFlexBasisPercent(float paramFloat) {
    jni_YGNodeStyleSetFlexBasisPercent(this.mNativePointer, paramFloat);
  }
  
  public void setFlexDirection(YogaFlexDirection paramYogaFlexDirection) {
    jni_YGNodeStyleSetFlexDirection(this.mNativePointer, paramYogaFlexDirection.intValue());
  }
  
  public void setFlexGrow(float paramFloat) {
    jni_YGNodeStyleSetFlexGrow(this.mNativePointer, paramFloat);
  }
  
  public void setFlexShrink(float paramFloat) {
    jni_YGNodeStyleSetFlexShrink(this.mNativePointer, paramFloat);
  }
  
  public void setHeight(float paramFloat) {
    jni_YGNodeStyleSetHeight(this.mNativePointer, paramFloat);
  }
  
  public void setHeightAuto() {
    jni_YGNodeStyleSetHeightAuto(this.mNativePointer);
  }
  
  public void setHeightPercent(float paramFloat) {
    jni_YGNodeStyleSetHeightPercent(this.mNativePointer, paramFloat);
  }
  
  public void setJustifyContent(YogaJustify paramYogaJustify) {
    jni_YGNodeStyleSetJustifyContent(this.mNativePointer, paramYogaJustify.intValue());
  }
  
  public void setMargin(YogaEdge paramYogaEdge, float paramFloat) {
    this.mEdgeSetFlag |= 0x1;
    jni_YGNodeStyleSetMargin(this.mNativePointer, paramYogaEdge.intValue(), paramFloat);
  }
  
  public void setMarginAuto(YogaEdge paramYogaEdge) {
    this.mEdgeSetFlag |= 0x1;
    jni_YGNodeStyleSetMarginAuto(this.mNativePointer, paramYogaEdge.intValue());
  }
  
  public void setMarginPercent(YogaEdge paramYogaEdge, float paramFloat) {
    this.mEdgeSetFlag |= 0x1;
    jni_YGNodeStyleSetMarginPercent(this.mNativePointer, paramYogaEdge.intValue(), paramFloat);
  }
  
  public void setMaxHeight(float paramFloat) {
    jni_YGNodeStyleSetMaxHeight(this.mNativePointer, paramFloat);
  }
  
  public void setMaxHeightPercent(float paramFloat) {
    jni_YGNodeStyleSetMaxHeightPercent(this.mNativePointer, paramFloat);
  }
  
  public void setMaxWidth(float paramFloat) {
    jni_YGNodeStyleSetMaxWidth(this.mNativePointer, paramFloat);
  }
  
  public void setMaxWidthPercent(float paramFloat) {
    jni_YGNodeStyleSetMaxWidthPercent(this.mNativePointer, paramFloat);
  }
  
  public void setMeasureFunction(YogaMeasureFunction paramYogaMeasureFunction) {
    boolean bool;
    this.mMeasureFunction = paramYogaMeasureFunction;
    long l = this.mNativePointer;
    if (paramYogaMeasureFunction != null) {
      bool = true;
    } else {
      bool = false;
    } 
    jni_YGNodeSetHasMeasureFunc(l, bool);
  }
  
  public void setMinHeight(float paramFloat) {
    jni_YGNodeStyleSetMinHeight(this.mNativePointer, paramFloat);
  }
  
  public void setMinHeightPercent(float paramFloat) {
    jni_YGNodeStyleSetMinHeightPercent(this.mNativePointer, paramFloat);
  }
  
  public void setMinWidth(float paramFloat) {
    jni_YGNodeStyleSetMinWidth(this.mNativePointer, paramFloat);
  }
  
  public void setMinWidthPercent(float paramFloat) {
    jni_YGNodeStyleSetMinWidthPercent(this.mNativePointer, paramFloat);
  }
  
  public void setOverflow(YogaOverflow paramYogaOverflow) {
    jni_YGNodeStyleSetOverflow(this.mNativePointer, paramYogaOverflow.intValue());
  }
  
  public void setPadding(YogaEdge paramYogaEdge, float paramFloat) {
    this.mEdgeSetFlag |= 0x2;
    jni_YGNodeStyleSetPadding(this.mNativePointer, paramYogaEdge.intValue(), paramFloat);
  }
  
  public void setPaddingPercent(YogaEdge paramYogaEdge, float paramFloat) {
    this.mEdgeSetFlag |= 0x2;
    jni_YGNodeStyleSetPaddingPercent(this.mNativePointer, paramYogaEdge.intValue(), paramFloat);
  }
  
  public void setPosition(YogaEdge paramYogaEdge, float paramFloat) {
    this.mHasSetPosition = true;
    jni_YGNodeStyleSetPosition(this.mNativePointer, paramYogaEdge.intValue(), paramFloat);
  }
  
  public void setPositionPercent(YogaEdge paramYogaEdge, float paramFloat) {
    this.mHasSetPosition = true;
    jni_YGNodeStyleSetPositionPercent(this.mNativePointer, paramYogaEdge.intValue(), paramFloat);
  }
  
  public void setPositionType(YogaPositionType paramYogaPositionType) {
    jni_YGNodeStyleSetPositionType(this.mNativePointer, paramYogaPositionType.intValue());
  }
  
  public void setWidth(float paramFloat) {
    jni_YGNodeStyleSetWidth(this.mNativePointer, paramFloat);
  }
  
  public void setWidthAuto() {
    jni_YGNodeStyleSetWidthAuto(this.mNativePointer);
  }
  
  public void setWidthPercent(float paramFloat) {
    jni_YGNodeStyleSetWidthPercent(this.mNativePointer, paramFloat);
  }
  
  public void setWrap(YogaWrap paramYogaWrap) {
    jni_YGNodeStyleSetFlexWrap(this.mNativePointer, paramYogaWrap.intValue());
  }
}


/* Location:              C:\Users\august\Desktop\tik\df_rn_kit\classes.jar.jar!\com\facebook\yoga\YogaNode.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */