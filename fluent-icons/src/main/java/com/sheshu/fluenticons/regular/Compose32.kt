package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Compose32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Compose32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 4f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineTo(7.5f)
            curveTo(6.12f, 6f, 5f, 7.12f, 5f, 8.5f)
            verticalLineToRelative(16f)
            curveTo(5f, 25.88f, 6.12f, 27f, 7.5f, 27f)
            horizontalLineToRelative(16f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(14f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            verticalLineToRelative(10.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-16f)
            curveTo(5.015f, 29f, 3f, 26.985f, 3f, 24.5f)
            verticalLineToRelative(-16f)
            curveTo(3f, 6.015f, 5.015f, 4f, 7.5f, 4f)
            horizontalLineTo(18f)
            close()
            moveToRelative(9.292f, -0.707f)
            curveToRelative(0.39f, -0.39f, 1.023f, -0.39f, 1.414f, 0f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0f, 1.414f)
            lineTo(14.12f, 19.293f)
            lineTo(12f, 20f)
            lineToRelative(0.707f, -2.122f)
            lineTo(27.292f, 3.293f)
            close()
        }
    }.build()
}
