package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Person48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Person48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 4f)
            curveToRelative(-5.523f, 0f, -10f, 4.477f, -10f, 10f)
            reflectiveCurveToRelative(4.477f, 10f, 10f, 10f)
            reflectiveCurveToRelative(10f, -4.477f, 10f, -10f)
            reflectiveCurveTo(29.523f, 4f, 24f, 4f)
            close()
            moveToRelative(-7.5f, 10f)
            curveToRelative(0f, -4.142f, 3.358f, -7.5f, 7.5f, -7.5f)
            curveToRelative(4.142f, 0f, 7.5f, 3.358f, 7.5f, 7.5f)
            curveToRelative(0f, 4.142f, -3.358f, 7.5f, -7.5f, 7.5f)
            curveToRelative(-4.142f, 0f, -7.5f, -3.358f, -7.5f, -7.5f)
            close()
            moveToRelative(-4.25f, 14f)
            curveTo(9.903f, 28f, 8f, 29.901f, 8f, 32.249f)
            verticalLineTo(33f)
            curveToRelative(0f, 3.755f, 1.942f, 6.567f, 4.92f, 8.38f)
            curveTo(15.85f, 43.163f, 19.786f, 44f, 24f, 44f)
            reflectiveCurveToRelative(8.15f, -0.837f, 11.08f, -2.62f)
            curveTo(38.058f, 39.567f, 40f, 36.755f, 40f, 33f)
            verticalLineToRelative(-0.751f)
            curveTo(40f, 29.9f, 38.097f, 28f, 35.75f, 28f)
            horizontalLineToRelative(-23.5f)
            close()
            moveToRelative(-1.75f, 4.249f)
            curveToRelative(0f, -0.966f, 0.783f, -1.749f, 1.75f, -1.749f)
            horizontalLineToRelative(23.5f)
            curveToRelative(0.967f, 0f, 1.75f, 0.783f, 1.75f, 1.749f)
            verticalLineTo(33f)
            curveToRelative(0f, 2.744f, -1.36f, 4.808f, -3.72f, 6.245f)
            curveTo(31.37f, 40.712f, 27.932f, 41.5f, 24f, 41.5f)
            curveToRelative(-3.932f, 0f, -7.37f, -0.788f, -9.78f, -2.255f)
            curveToRelative(-2.36f, -1.437f, -3.72f, -3.5f, -3.72f, -6.245f)
            verticalLineToRelative(-0.751f)
            close()
        }
    }.build()
}
