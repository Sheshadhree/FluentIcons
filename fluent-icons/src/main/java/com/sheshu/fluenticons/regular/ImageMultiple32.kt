package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ImageMultiple32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ImageMultiple32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 7f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            horizontalLineToRelative(14f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            verticalLineToRelative(14f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            horizontalLineTo(7f)
            curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
            verticalLineTo(7f)
            close()
            moveToRelative(4f, -2f)
            curveTo(5.895f, 5f, 5f, 5.895f, 5f, 7f)
            verticalLineToRelative(14f)
            curveToRelative(0f, 0.191f, 0.027f, 0.377f, 0.077f, 0.552f)
            lineToRelative(7.32f, -6.914f)
            curveToRelative(0.9f, -0.85f, 2.306f, -0.85f, 3.205f, 0f)
            lineToRelative(7.32f, 6.914f)
            curveTo(22.974f, 21.377f, 23f, 21.192f, 23f, 21f)
            verticalLineTo(7f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(7f)
            close()
            moveToRelative(0f, 18f)
            horizontalLineToRelative(14f)
            curveToRelative(0.166f, 0f, 0.328f, -0.02f, 0.482f, -0.058f)
            lineToRelative(-7.253f, -6.85f)
            curveToRelative(-0.129f, -0.122f, -0.33f, -0.122f, -0.458f, 0f)
            lineToRelative(-7.253f, 6.85f)
            curveTo(6.673f, 22.98f, 6.834f, 23f, 7f, 23f)
            close()
            moveToRelative(11.5f, -11f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(19.328f, 9f, 18.5f, 9f)
            reflectiveCurveTo(17f, 9.672f, 17f, 10.5f)
            reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
            close()
            moveToRelative(-8f, 16.5f)
            curveToRelative(-1.48f, 0f, -2.773f, -0.804f, -3.465f, -2f)
            horizontalLineTo(21f)
            curveToRelative(3.038f, 0f, 5.5f, -2.462f, 5.5f, -5.5f)
            verticalLineTo(7.035f)
            curveToRelative(1.196f, 0.692f, 2f, 1.984f, 2f, 3.465f)
            verticalLineTo(21f)
            curveToRelative(0f, 4.142f, -3.358f, 7.5f, -7.5f, 7.5f)
            horizontalLineTo(10.5f)
            close()
        }
    }.build()
}
