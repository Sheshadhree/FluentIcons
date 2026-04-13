package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.AutoFitHeight32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.AutoFitHeight32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(25f, 27f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineTo(7f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(18f)
            close()
            moveTo(16f, 7f)
            curveToRelative(0.265f, 0f, 0.52f, 0.105f, 0.707f, 0.293f)
            lineToRelative(4f, 4f)
            lineToRelative(0.068f, 0.076f)
            curveToRelative(0.32f, 0.393f, 0.298f, 0.972f, -0.068f, 1.338f)
            curveToRelative(-0.366f, 0.366f, -0.945f, 0.389f, -1.338f, 0.068f)
            lineToRelative(-0.076f, -0.068f)
            lineTo(17f, 10.414f)
            verticalLineToRelative(11.172f)
            lineToRelative(2.293f, -2.293f)
            curveToRelative(0.39f, -0.39f, 1.024f, -0.39f, 1.414f, 0f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0f, 1.414f)
            lineToRelative(-4f, 4f)
            curveToRelative(-0.366f, 0.366f, -0.945f, 0.389f, -1.338f, 0.068f)
            lineToRelative(-0.076f, -0.068f)
            lineToRelative(-4f, -4f)
            lineToRelative(-0.068f, -0.076f)
            curveToRelative(-0.32f, -0.393f, -0.298f, -0.972f, 0.068f, -1.338f)
            curveToRelative(0.366f, -0.366f, 0.945f, -0.389f, 1.338f, -0.068f)
            lineToRelative(0.076f, 0.068f)
            lineTo(15f, 21.586f)
            verticalLineTo(10.414f)
            lineToRelative(-2.293f, 2.293f)
            curveToRelative(-0.39f, 0.39f, -1.024f, 0.39f, -1.414f, 0f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0f, -1.414f)
            lineToRelative(4f, -4f)
            lineToRelative(0.073f, -0.066f)
            curveTo(15.544f, 7.08f, 15.768f, 7f, 16f, 7f)
            close()
            moveToRelative(9f, -4f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineTo(7f)
            curveTo(6.448f, 5f, 6f, 4.552f, 6f, 4f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(18f)
            close()
        }
    }.build()
}
