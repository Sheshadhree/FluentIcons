package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Attach32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Attach32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.223f, 4.364f)
            curveToRelative(3.152f, -3.152f, 8.262f, -3.152f, 11.414f, 0f)
            curveToRelative(3.152f, 3.152f, 3.152f, 8.262f, 0f, 11.414f)
            lineToRelative(-12.79f, 12.79f)
            curveToRelative(-1.91f, 1.909f, -5.005f, 1.909f, -6.914f, 0f)
            curveToRelative(-1.91f, -1.91f, -1.91f, -5.006f, 0f, -6.915f)
            lineToRelative(11.36f, -11.36f)
            curveToRelative(0.39f, -0.39f, 1.024f, -0.39f, 1.414f, 0f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0f, 1.414f)
            lineToRelative(-11.36f, 11.36f)
            curveToRelative(-1.128f, 1.128f, -1.128f, 2.958f, 0f, 4.086f)
            curveToRelative(1.128f, 1.128f, 2.958f, 1.128f, 4.086f, 0f)
            lineToRelative(12.79f, -12.79f)
            curveToRelative(2.37f, -2.37f, 2.37f, -6.214f, 0f, -8.585f)
            curveToRelative(-2.371f, -2.37f, -6.215f, -2.37f, -8.586f, 0f)
            lineToRelative(-13.93f, 13.93f)
            curveToRelative(-0.39f, 0.39f, -1.024f, 0.39f, -1.414f, 0f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.023f, 0f, -1.414f)
            lineToRelative(13.93f, -13.93f)
            close()
        }
    }.build()
}
