package com.a1111158.doubao.theme

import de.robv.android.xposed.IXposedHookLoadPackage
import de.robv.android.xposed.XposedBridge
import de.robv.android.xposed.callbacks.XC_LoadPackage

class HookEntry : IXposedHookLoadPackage {
    override fun handleLoadPackage(lpparam: XC_LoadPackage.LoadPackageParam) {
        if (lpparam.packageName != TARGET_PACKAGE) return

        XposedBridge.log(
            "DoubaoTheme: loaded package=${lpparam.packageName}, process=${lpparam.processName}"
        )
    }

    private companion object {
        const val TARGET_PACKAGE = "com.bytedance.android.doubaoime"
    }
}
