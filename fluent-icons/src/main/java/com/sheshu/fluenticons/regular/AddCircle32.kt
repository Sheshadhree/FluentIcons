package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.AddCircle32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.AddCircle32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15f, 10f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(5f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineToRelative(-5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            verticalLineToRelative(-5f)
            horizontalLineToRelative(-5f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(-5f)
            close()
            moveToRelative(15f, 6f)
            curveToRelative(0f, 7.732f, -6.268f, 14f, -14f, 14f)
            reflectiveCurveTo(2f, 23.732f, 2f, 16f)
            reflectiveCurveTo(8.268f, 2f, 16f, 2f)
            reflectiveCurveToRelative(14f, 6.268f, 14f, 14f)
            close()
            moveToRelative(-2f, 0f)
            curveToRelative(0f, -6.627f, -5.373f, -12f, -12f, -12f)
            reflectiveCurveTo(4f, 9.373f, 4f, 16f)
            reflectiveCurveToRelative(5.373f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.373f, 12f, -12f)
            close()
        }
    }.build()
}
