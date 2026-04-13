package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.ArrowClockwise32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.ArrowClockwise32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 16f)
            curveTo(4f, 9.373f, 9.373f, 4f, 16f, 4f)
            curveToRelative(4.015f, 0f, 7.57f, 1.972f, 9.748f, 5f)
            horizontalLineTo(20.5f)
            curveTo(20.224f, 9f, 20f, 9.224f, 20f, 9.5f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(6f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-6f)
            curveTo(27f, 3.224f, 26.776f, 3f, 26.5f, 3f)
            reflectiveCurveTo(26f, 3.224f, 26f, 3.5f)
            verticalLineToRelative(4.193f)
            curveTo(23.615f, 4.826f, 20.02f, 3f, 16f, 3f)
            curveTo(8.82f, 3f, 3f, 8.82f, 3f, 16f)
            reflectiveCurveToRelative(5.82f, 13f, 13f, 13f)
            reflectiveCurveToRelative(13f, -5.82f, 13f, -13f)
            curveToRelative(0f, -0.534f, -0.032f, -1.06f, -0.095f, -1.578f)
            curveTo(28.875f, 14.179f, 28.666f, 14f, 28.421f, 14f)
            curveToRelative(-0.307f, 0f, -0.54f, 0.276f, -0.504f, 0.581f)
            curveTo(27.972f, 15.046f, 28f, 15.52f, 28f, 16f)
            curveToRelative(0f, 6.627f, -5.373f, 12f, -12f, 12f)
            reflectiveCurveTo(4f, 22.627f, 4f, 16f)
            close()
        }
    }.build()
}
