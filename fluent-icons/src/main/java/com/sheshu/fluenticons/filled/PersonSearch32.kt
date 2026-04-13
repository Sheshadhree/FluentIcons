package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonSearch32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonSearch32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 16f)
            curveToRelative(3.866f, 0f, 7f, -3.134f, 7f, -7f)
            reflectiveCurveToRelative(-3.134f, -7f, -7f, -7f)
            reflectiveCurveToRelative(-7f, 3.134f, -7f, 7f)
            reflectiveCurveToRelative(3.134f, 7f, 7f, 7f)
            close()
            moveToRelative(0f, 14f)
            curveToRelative(-0.337f, 0f, -0.67f, -0.01f, -1f, -0.027f)
            curveToRelative(-0.007f, -0.63f, -0.25f, -1.26f, -0.732f, -1.74f)
            lineToRelative(-2.5f, -2.5f)
            curveToRelative(0.47f, -0.98f, 0.732f, -2.077f, 0.732f, -3.233f)
            curveToRelative(0f, -1.688f, -0.558f, -3.247f, -1.5f, -4.5f)
            horizontalLineToRelative(13.5f)
            curveToRelative(1.933f, 0f, 3.5f, 1.567f, 3.5f, 3.5f)
            verticalLineTo(22f)
            curveToRelative(0f, 2.393f, -1.523f, 4.417f, -3.685f, 5.793f)
            curveTo(24.141f, 29.177f, 21.198f, 30f, 18f, 30f)
            close()
            moveTo(7f, 28.5f)
            curveToRelative(1.296f, 0f, 2.496f, -0.41f, 3.476f, -1.11f)
            lineToRelative(3.317f, 3.317f)
            curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.414f, 0f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0f, -1.414f)
            lineToRelative(-3.316f, -3.316f)
            curveTo(12.589f, 24.995f, 13f, 23.796f, 13f, 22.5f)
            curveToRelative(0f, -3.314f, -2.686f, -6f, -6f, -6f)
            reflectiveCurveToRelative(-6f, 2.686f, -6f, 6f)
            reflectiveCurveToRelative(2.686f, 6f, 6f, 6f)
            close()
            moveToRelative(0f, -2f)
            curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
            reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
            reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
            reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
            close()
        }
    }.build()
}
