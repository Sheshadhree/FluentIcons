package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.AutoFitWidth32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.AutoFitWidth32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 6f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(18f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            verticalLineTo(7f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            close()
            moveToRelative(24f, 0f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(18f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            verticalLineTo(7f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            close()
            moveToRelative(-8.707f, 5.293f)
            curveToRelative(0.39f, -0.39f, 1.024f, -0.39f, 1.414f, 0f)
            lineToRelative(4f, 4f)
            curveToRelative(0.366f, 0.366f, 0.389f, 0.945f, 0.068f, 1.338f)
            lineToRelative(-0.068f, 0.076f)
            lineToRelative(-4f, 4f)
            lineToRelative(-0.076f, 0.068f)
            curveToRelative(-0.393f, 0.32f, -0.972f, 0.298f, -1.338f, -0.068f)
            curveToRelative(-0.366f, -0.366f, -0.389f, -0.945f, -0.068f, -1.338f)
            lineToRelative(0.068f, -0.076f)
            lineTo(21.586f, 17f)
            horizontalLineTo(10.414f)
            lineToRelative(2.293f, 2.293f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0f, 1.414f)
            curveToRelative(-0.39f, 0.39f, -1.024f, 0.39f, -1.414f, 0f)
            lineToRelative(-4f, -4f)
            lineToRelative(-0.066f, -0.073f)
            curveTo(7.08f, 16.456f, 7f, 16.232f, 7f, 16f)
            curveToRelative(0f, -0.265f, 0.105f, -0.52f, 0.293f, -0.707f)
            lineToRelative(4f, -4f)
            lineToRelative(0.076f, -0.068f)
            curveToRelative(0.393f, -0.32f, 0.972f, -0.298f, 1.338f, 0.068f)
            curveToRelative(0.366f, 0.366f, 0.389f, 0.945f, 0.068f, 1.338f)
            lineToRelative(-0.068f, 0.076f)
            lineTo(10.414f, 15f)
            horizontalLineToRelative(11.172f)
            lineToRelative(-2.293f, -2.293f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0f, -1.414f)
            close()
        }
    }.build()
}
