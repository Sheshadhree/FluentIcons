package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PersonDesktop20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PersonDesktop20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 2f)
            curveTo(7.79f, 2f, 6f, 3.79f, 6f, 6f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            close()
            moveTo(7f, 6f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.343f, 3f, 3f)
            reflectiveCurveToRelative(-1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            close()
            moveToRelative(-1.991f, 5f)
            curveTo(3.903f, 11f, 3f, 11.887f, 3f, 13f)
            curveToRelative(0f, 1.691f, 0.833f, 2.966f, 2.135f, 3.797f)
            curveTo(6.417f, 17.614f, 8.145f, 18f, 10f, 18f)
            curveToRelative(0.242f, 0f, 0.481f, -0.006f, 0.718f, -0.02f)
            curveToRelative(-0.63f, -0.089f, -1.165f, -0.47f, -1.464f, -1.003f)
            curveToRelative(-1.424f, -0.09f, -2.667f, -0.44f, -3.581f, -1.024f)
            curveTo(4.623f, 15.283f, 4f, 14.31f, 4f, 13f)
            curveToRelative(0f, -0.553f, 0.448f, -1f, 1.009f, -1f)
            horizontalLineTo(9f)
            curveToRelative(0f, -0.364f, 0.097f, -0.706f, 0.268f, -1f)
            horizontalLineToRelative(-4.26f)
            close()
            moveTo(10f, 12f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(7f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(16.776f, 19f, 16.5f, 19f)
            horizontalLineToRelative(-4f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            reflectiveCurveToRelative(0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineTo(13f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineToRelative(-4f)
            close()
        }
    }.build()
}
