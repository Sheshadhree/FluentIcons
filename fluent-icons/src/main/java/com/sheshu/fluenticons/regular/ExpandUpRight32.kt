package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ExpandUpRight32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ExpandUpRight32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 7.5f)
            curveTo(5f, 6.12f, 6.12f, 5f, 7.5f, 5f)
            horizontalLineTo(13f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineTo(7.5f)
            curveTo(5.015f, 3f, 3f, 5.015f, 3f, 7.5f)
            verticalLineToRelative(17f)
            curveTo(3f, 26.985f, 5.015f, 29f, 7.5f, 29f)
            horizontalLineToRelative(17f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            verticalLineTo(19f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineTo(16f)
            verticalLineToRelative(-7.23f)
            curveToRelative(0f, -2.082f, -1.688f, -3.77f, -3.77f, -3.77f)
            horizontalLineTo(5f)
            verticalLineTo(7.5f)
            close()
            moveTo(5f, 18f)
            horizontalLineToRelative(7.23f)
            curveToRelative(0.978f, 0f, 1.77f, 0.792f, 1.77f, 1.77f)
            verticalLineTo(27f)
            horizontalLineTo(7.5f)
            curveTo(6.12f, 27f, 5f, 25.88f, 5f, 24.5f)
            verticalLineTo(18f)
            close()
            moveTo(18f, 4f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(9f)
            curveToRelative(0.553f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.552f, -0.447f, 1f, -1f, 1f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(6.414f)
            lineToRelative(-7.293f, 7.293f)
            curveToRelative(-0.39f, 0.39f, -1.024f, 0.39f, -1.414f, 0f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.023f, 0f, -1.414f)
            lineTo(25.586f, 5f)
            horizontalLineTo(19f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            close()
        }
    }.build()
}
