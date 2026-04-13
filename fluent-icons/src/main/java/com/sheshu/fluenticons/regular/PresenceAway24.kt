package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PresenceAway24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PresenceAway24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13f, 11.31f)
            verticalLineTo(6.5f)
            curveTo(13f, 5.672f, 12.328f, 5f, 11.5f, 5f)
            reflectiveCurveTo(10f, 5.672f, 10f, 6.5f)
            verticalLineTo(12f)
            curveToRelative(0f, 0.438f, 0.191f, 0.854f, 0.524f, 1.139f)
            lineToRelative(3.5f, 3f)
            curveToRelative(0.629f, 0.539f, 1.576f, 0.466f, 2.115f, -0.163f)
            curveToRelative(0.539f, -0.629f, 0.466f, -1.576f, -0.163f, -2.115f)
            lineTo(13f, 11.311f)
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
