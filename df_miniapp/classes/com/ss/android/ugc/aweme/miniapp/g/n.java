package com.ss.android.ugc.aweme.miniapp.g;

public final class n {
  private static volatile m a;
  
  public static m a() {
    // Byte code:
    //   0: ldc com/ss/android/ugc/aweme/miniapp/g/n
    //   2: monitorenter
    //   3: getstatic com/ss/android/ugc/aweme/miniapp/g/n.a : Lcom/ss/android/ugc/aweme/miniapp/g/m;
    //   6: ifnonnull -> 40
    //   9: ldc com/ss/android/ugc/aweme/miniapp/g/m
    //   11: monitorenter
    //   12: getstatic com/ss/android/ugc/aweme/miniapp/g/n.a : Lcom/ss/android/ugc/aweme/miniapp/g/m;
    //   15: ifnonnull -> 28
    //   18: new com/ss/android/ugc/aweme/miniapp/g/m
    //   21: dup
    //   22: invokespecial <init> : ()V
    //   25: putstatic com/ss/android/ugc/aweme/miniapp/g/n.a : Lcom/ss/android/ugc/aweme/miniapp/g/m;
    //   28: ldc com/ss/android/ugc/aweme/miniapp/g/m
    //   30: monitorexit
    //   31: goto -> 40
    //   34: astore_0
    //   35: ldc com/ss/android/ugc/aweme/miniapp/g/m
    //   37: monitorexit
    //   38: aload_0
    //   39: athrow
    //   40: getstatic com/ss/android/ugc/aweme/miniapp/g/n.a : Lcom/ss/android/ugc/aweme/miniapp/g/m;
    //   43: astore_0
    //   44: ldc com/ss/android/ugc/aweme/miniapp/g/n
    //   46: monitorexit
    //   47: aload_0
    //   48: areturn
    //   49: astore_0
    //   50: ldc com/ss/android/ugc/aweme/miniapp/g/n
    //   52: monitorexit
    //   53: aload_0
    //   54: athrow
    // Exception table:
    //   from	to	target	type
    //   3	12	49	finally
    //   12	28	34	finally
    //   28	31	49	finally
    //   35	40	49	finally
    //   40	44	49	finally
  }
}


/* Location:              C:\Users\august\Desktop\tik\df_miniapp\classes.jar!\com\ss\androi\\ugc\aweme\miniapp\g\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */