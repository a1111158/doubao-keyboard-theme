package com.a1111158.doubao.theme

import de.robv.android.xposed.IXposedHookLoadPackage
import de.robv.android.xposed.callbacks.XC_LoadPackage

/**
 * Initial safe skeleton. This entry point deliberately does not hook views,
 * inspect text, access the clipboard, or make network requests.
 */
class HookEntry : IXposedHookLoadPackage {
    override fun handleLoadPackage(lpparam: XC_LoadPackage.LoadPackageParam) {
        if (lpparam.packageName != TARGET_PACKAGE) return

        // No-op until version-specific UI elements are identified and tested.
    }

    private companion object {
        const val TARGET_PACKAGE = "com.bytedance.android.doubaoime"
    }
}
