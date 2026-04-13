package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowWrapUpToDown32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowWrapUpToDown32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 3f)
            curveTo(6.448f, 3f, 6f, 3.448f, 6f, 4f)
            verticalLineToRelative(19.5f)
            curveToRelative(0f, 3.038f, 2.462f, 5.5f, 5.5f, 5.5f)
            reflectiveCurveToRelative(5.5f, -2.462f, 5.5f, -5.5f)
            verticalLineToRelative(-15f)
            curveTo(17f, 6.567f, 18.567f, 5f, 20.5f, 5f)
            reflectiveCurveTo(24f, 6.567f, 24f, 8.5f)
            verticalLineToRelative(18.086f)
            lineToRelative(-1.293f, -1.293f)
            curveToRelative(-0.39f, -0.39f, -1.024f, -0.39f, -1.414f, 0f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.024f, 0f, 1.414f)
            lineToRelative(3f, 3f)
            curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.414f, 0f)
            lineToRelative(3f, -3f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0f, -1.414f)
            curveToRelative(-0.39f, -0.39f, -1.024f, -0.39f, -1.414f, 0f)
            lineTo(26f, 26.586f)
            verticalLineTo(8.5f)
            curveTo(26f, 5.462f, 23.538f, 3f, 20.5f, 3f)
            reflectiveCurveTo(15f, 5.462f, 15f, 8.5f)
            verticalLineToRelative(15f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            reflectiveCurveTo(8f, 25.433f, 8f, 23.5f)
            verticalLineTo(4f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            close()
        }
    }.build()
}
