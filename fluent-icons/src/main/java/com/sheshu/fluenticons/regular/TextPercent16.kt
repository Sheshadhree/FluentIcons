package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextPercent16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextPercent16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.989f, 2.086f)
            curveToRelative(0.228f, 0.154f, 0.289f, 0.465f, 0.134f, 0.694f)
            lineTo(4.705f, 13.777f)
            curveToRelative(-0.154f, 0.23f, -0.465f, 0.29f, -0.694f, 0.135f)
            curveToRelative(-0.229f, -0.154f, -0.29f, -0.465f, -0.135f, -0.694f)
            lineTo(11.294f, 2.22f)
            curveToRelative(0.155f, -0.229f, 0.466f, -0.289f, 0.695f, -0.135f)
            close()
            moveTo(4.5f, 3f)
            curveTo(3.672f, 3f, 3f, 3.672f, 3f, 4.5f)
            reflectiveCurveTo(3.672f, 6f, 4.5f, 6f)
            reflectiveCurveTo(6f, 5.328f, 6f, 4.5f)
            reflectiveCurveTo(5.328f, 3f, 4.5f, 3f)
            close()
            moveTo(2f, 4.5f)
            curveTo(2f, 3.12f, 3.12f, 2f, 4.5f, 2f)
            reflectiveCurveTo(7f, 3.12f, 7f, 4.5f)
            reflectiveCurveTo(5.88f, 7f, 4.5f, 7f)
            reflectiveCurveTo(2f, 5.88f, 2f, 4.5f)
            close()
            moveToRelative(8f, 7f)
            curveToRelative(0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
            close()
            moveTo(11.5f, 9f)
            curveTo(10.12f, 9f, 9f, 10.12f, 9f, 11.5f)
            reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            reflectiveCurveTo(12.88f, 9f, 11.5f, 9f)
            close()
        }
    }.build()
}
