package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowWrap32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowWrap32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 7f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(19.5f)
            curveToRelative(3.038f, 0f, 5.5f, 2.462f, 5.5f, 5.5f)
            reflectiveCurveTo(26.538f, 17f, 23.5f, 17f)
            horizontalLineToRelative(-15f)
            curveTo(6.567f, 17f, 5f, 18.567f, 5f, 20.5f)
            reflectiveCurveTo(6.567f, 24f, 8.5f, 24f)
            horizontalLineToRelative(18.086f)
            lineToRelative(-1.293f, -1.293f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0f, -1.414f)
            curveToRelative(0.39f, -0.39f, 1.024f, -0.39f, 1.414f, 0f)
            lineToRelative(3f, 3f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0f, 1.414f)
            lineToRelative(-3f, 3f)
            curveToRelative(-0.39f, 0.39f, -1.024f, 0.39f, -1.414f, 0f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0f, -1.414f)
            lineTo(26.586f, 26f)
            horizontalLineTo(8.5f)
            curveTo(5.462f, 26f, 3f, 23.538f, 3f, 20.5f)
            reflectiveCurveTo(5.462f, 15f, 8.5f, 15f)
            horizontalLineToRelative(15f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            reflectiveCurveTo(25.433f, 8f, 23.5f, 8f)
            horizontalLineTo(4f)
            curveTo(3.448f, 8f, 3f, 7.552f, 3f, 7f)
            close()
        }
    }.build()
}
