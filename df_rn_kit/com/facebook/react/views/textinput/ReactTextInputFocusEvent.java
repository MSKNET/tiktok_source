package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

class ReactTextInputFocusEvent extends Event<ReactTextInputFocusEvent> {
  public ReactTextInputFocusEvent(int paramInt) {
    super(paramInt);
  }
  
  private WritableMap serializeEventData() {
    WritableMap writableMap = Arguments.createMap();
    writableMap.putInt("target", getViewTag());
    return writableMap;
  }
  
  public boolean canCoalesce() {
    return false;
  }
  
  public void dispatch(RCTEventEmitter paramRCTEventEmitter) {
    paramRCTEventEmitter.receiveEvent(getViewTag(), getEventName(), serializeEventData());
  }
  
  public String getEventName() {
    return "topFocus";
  }
}


/* Location:              C:\Users\august\Desktop\tik\df_rn_kit\classes.jar.jar!\com\facebook\react\views\textinput\ReactTextInputFocusEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */