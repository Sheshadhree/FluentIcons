package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PresenceAvailable24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PresenceAvailable24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 0f)
            curveTo(5.373f, 0f, 0f, 5.373f, 0f, 12f)
            reflectiveCurveToRelative(5.373f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.373f, 12f, -12f)
            reflectiveCurveTo(18.627f, 0f, 12f, 0f)
            close()
            moveTo(3f, 12f)
            curveToRelative(0f, -4.97f, 4.03f, -9f, 9f, -9f)
            reflectiveCurveToRelative(9f, 4.03f, 9f, 9f)
            reflectiveCurveToRelative(-4.03f, 9f, -9f, 9f)
            reflectiveCurveToRelative(-9f, -4.03f, -9f, -9f)
            close()
            moveToRelative(14.06f, -3.56f)
            curveToRelative(0.586f, 0.585f, 0.586f, 1.535f, 0f, 2.12f)
            lineToRelative(-5.5f, 5.5f)
            curveToRelative(-0.585f, 0.586f, -1.535f, 0.586f, -2.12f, 0f)
            lineToRelative(-2f, -2f)
            curveToRelative(-0.587f, -0.585f, -0.587f, -1.535f, 0f, -2.12f)
            curveToRelative(0.585f, -0.586f, 1.535f, -0.586f, 2.12f, 0f)
            lineToRelative(0.94f, 0.939f)
            lineToRelative(4.44f, -4.44f)
            curveToRelative(0.585f, -0.585f, 1.535f, -0.585f, 2.12f, 0f)
            close()
        }
    }.build()
}
