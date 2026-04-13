package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DismissCircle32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DismissCircle32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 16f)
            curveTo(2f, 8.268f, 8.268f, 2f, 16f, 2f)
            reflectiveCurveToRelative(14f, 6.268f, 14f, 14f)
            reflectiveCurveToRelative(-6.268f, 14f, -14f, 14f)
            reflectiveCurveTo(2f, 23.732f, 2f, 16f)
            close()
            moveToRelative(19.707f, -5.707f)
            curveToRelative(-0.39f, -0.39f, -1.024f, -0.39f, -1.414f, 0f)
            lineTo(16f, 14.586f)
            lineToRelative(-4.293f, -4.293f)
            curveToRelative(-0.39f, -0.39f, -1.024f, -0.39f, -1.414f, 0f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.024f, 0f, 1.414f)
            lineTo(14.586f, 16f)
            lineToRelative(-4.293f, 4.293f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.024f, 0f, 1.414f)
            curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.414f, 0f)
            lineTo(16f, 17.414f)
            lineToRelative(4.293f, 4.293f)
            curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.414f, 0f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0f, -1.414f)
            lineTo(17.414f, 16f)
            lineToRelative(4.293f, -4.293f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0f, -1.414f)
            close()
        }
    }.build()
}
