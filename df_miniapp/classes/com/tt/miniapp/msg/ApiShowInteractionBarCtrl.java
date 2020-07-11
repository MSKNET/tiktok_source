package com.tt.miniapp.msg;

import com.tt.miniapp.page.AppbrandSinglePage;
import com.tt.option.e.e;

public class ApiShowInteractionBarCtrl extends ApiInteractionBarCtrl {
  public ApiShowInteractionBarCtrl(String paramString, int paramInt, e parame) {
    super(paramString, paramInt, parame);
  }
  
  public void act() {
    AppbrandSinglePage appbrandSinglePage = getAppbrandSinglePage();
    if (appbrandSinglePage == null) {
      callbackFail("interaction bar is not available in this scene");
      return;
    } 
    if (appbrandSinglePage.getBottomBar() == null) {
      callbackFail("interaction bar is not available in this scene");
      return;
    } 
    if (appbrandSinglePage.isBottomBarShown()) {
      callbackFail("interaction bar has already been shown");
      return;
    } 
    appbrandSinglePage.showBottomBar();
    callbackOk();
  }
  
  public String getActionName() {
    return "showInteractionBar";
  }
}


/* Location:              C:\Users\august\Desktop\tik\df_miniapp\classes.jar!\com\tt\miniapp\msg\ApiShowInteractionBarCtrl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */