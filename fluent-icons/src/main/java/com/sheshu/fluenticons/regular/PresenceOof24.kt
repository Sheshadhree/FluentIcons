package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PresenceOof24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PresenceOof24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.562f, 9.057f)
            curveToRelative(0.586f, -0.586f, 0.586f, -1.536f, 0f, -2.122f)
            curveToRelative(-0.585f, -0.585f, -1.535f, -0.585f, -2.121f, 0f)
            lineTo(6.437f, 10.94f)
            curveToRelative(-0.586f, 0.585f, -0.586f, 1.535f, 0f, 2.12f)
            lineToRelative(4.004f, 4.005f)
            curveToRelative(0.586f, 0.586f, 1.536f, 0.586f, 2.121f, 0f)
            curveToRelative(0.586f, -0.586f, 0.586f, -1.536f, 0f, -2.121f)
            lineTo(11.12f, 13.5f)
            horizontalLineToRelative(5.38f)
            curveToRelative(0.83f, 0f, 1.5f, -0.671f, 1.5f, -1.5f)
            curveToRelative(0f, -0.828f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-5.38f)
            lineToRelative(1.443f, -1.443f)
            close()
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
        }
    }.build()
}
