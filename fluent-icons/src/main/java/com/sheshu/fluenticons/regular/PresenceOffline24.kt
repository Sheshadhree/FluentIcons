package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PresenceOffline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PresenceOffline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.06f, 7.94f)
            curveToRelative(0.586f, 0.585f, 0.586f, 1.535f, 0f, 2.12f)
            lineTo(14.122f, 12f)
            lineToRelative(1.94f, 1.94f)
            curveToRelative(0.585f, 0.585f, 0.585f, 1.535f, 0f, 2.12f)
            curveToRelative(-0.586f, 0.587f, -1.536f, 0.587f, -2.122f, 0f)
            lineTo(12f, 14.122f)
            lineToRelative(-1.94f, 1.94f)
            curveToRelative(-0.585f, 0.585f, -1.535f, 0.585f, -2.12f, 0f)
            curveToRelative(-0.587f, -0.586f, -0.587f, -1.536f, 0f, -2.122f)
            lineTo(9.878f, 12f)
            lineToRelative(-1.94f, -1.94f)
            curveToRelative(-0.585f, -0.585f, -0.585f, -1.535f, 0f, -2.12f)
            curveToRelative(0.586f, -0.586f, 1.536f, -0.586f, 2.122f, 0f)
            lineTo(12f, 9.878f)
            lineToRelative(1.94f, -1.94f)
            curveToRelative(0.585f, -0.585f, 1.535f, -0.585f, 2.12f, 0f)
            close()
            moveTo(0f, 12f)
            curveTo(0f, 5.373f, 5.373f, 0f, 12f, 0f)
            reflectiveCurveToRelative(12f, 5.373f, 12f, 12f)
            reflectiveCurveToRelative(-5.373f, 12f, -12f, 12f)
            reflectiveCurveTo(0f, 18.627f, 0f, 12f)
            close()
            moveToRelative(12f, -9f)
            curveToRelative(-4.97f, 0f, -9f, 4.03f, -9f, 9f)
            reflectiveCurveToRelative(4.03f, 9f, 9f, 9f)
            reflectiveCurveToRelative(9f, -4.03f, 9f, -9f)
            reflectiveCurveToRelative(-4.03f, -9f, -9f, -9f)
            close()
        }
    }.build()
}
