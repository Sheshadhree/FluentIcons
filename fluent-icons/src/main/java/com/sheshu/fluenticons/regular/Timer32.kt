package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Timer32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Timer32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13f, 2f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(6f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-6f)
            close()
            moveToRelative(3f, 9f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            close()
            moveToRelative(12f, 7f)
            curveToRelative(0f, 6.627f, -5.373f, 12f, -12f, 12f)
            reflectiveCurveTo(4f, 24.627f, 4f, 18f)
            reflectiveCurveTo(9.373f, 6f, 16f, 6f)
            reflectiveCurveToRelative(12f, 5.373f, 12f, 12f)
            close()
            moveToRelative(-2f, 0f)
            curveToRelative(0f, -5.523f, -4.477f, -10f, -10f, -10f)
            reflectiveCurveTo(6f, 12.477f, 6f, 18f)
            reflectiveCurveToRelative(4.477f, 10f, 10f, 10f)
            reflectiveCurveToRelative(10f, -4.477f, 10f, -10f)
            close()
            moveToRelative(0.708f, -11.707f)
            curveToRelative(-0.39f, -0.391f, -1.024f, -0.391f, -1.414f, 0f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.023f, 0f, 1.414f)
            lineToRelative(2f, 2f)
            curveToRelative(0.39f, 0.39f, 1.023f, 0.39f, 1.414f, 0f)
            curveToRelative(0.39f, -0.391f, 0.39f, -1.024f, 0f, -1.415f)
            lineToRelative(-2f, -2f)
            close()
        }
    }.build()
}
