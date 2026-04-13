package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PersonMail48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PersonMail48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22f, 4f)
            curveToRelative(-5.523f, 0f, -10f, 4.477f, -10f, 10f)
            reflectiveCurveToRelative(4.477f, 10f, 10f, 10f)
            reflectiveCurveToRelative(10f, -4.477f, 10f, -10f)
            reflectiveCurveTo(27.523f, 4f, 22f, 4f)
            close()
            moveToRelative(-7.5f, 10f)
            curveToRelative(0f, -4.142f, 3.358f, -7.5f, 7.5f, -7.5f)
            curveToRelative(4.142f, 0f, 7.5f, 3.358f, 7.5f, 7.5f)
            curveToRelative(0f, 4.142f, -3.358f, 7.5f, -7.5f, 7.5f)
            curveToRelative(-4.142f, 0f, -7.5f, -3.358f, -7.5f, -7.5f)
            close()
            moveToRelative(-4.25f, 14f)
            curveTo(7.903f, 28f, 6f, 29.901f, 6f, 32.249f)
            verticalLineTo(33f)
            curveToRelative(0f, 3.755f, 1.942f, 6.567f, 4.92f, 8.38f)
            curveTo(13.85f, 43.163f, 17.786f, 44f, 22f, 44f)
            verticalLineToRelative(-2.5f)
            curveToRelative(-3.932f, 0f, -7.37f, -0.788f, -9.78f, -2.255f)
            curveTo(9.86f, 37.808f, 8.5f, 35.745f, 8.5f, 33f)
            verticalLineToRelative(-0.751f)
            curveToRelative(0f, -0.966f, 0.783f, -1.749f, 1.75f, -1.749f)
            horizontalLineTo(22f)
            verticalLineTo(30f)
            curveToRelative(0f, -0.729f, 0.195f, -1.412f, 0.535f, -2f)
            horizontalLineTo(10.25f)
            close()
            moveTo(24f, 31f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(16f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(0.79f)
            lineToRelative(-11f, 5.108f)
            lineToRelative(-11f, -5.108f)
            verticalLineTo(31f)
            close()
            moveToRelative(11.421f, 7.907f)
            lineTo(46f, 33.995f)
            verticalLineTo(43f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineTo(27f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            verticalLineToRelative(-9.005f)
            lineToRelative(10.579f, 4.912f)
            curveToRelative(0.267f, 0.124f, 0.575f, 0.124f, 0.842f, 0f)
            close()
        }
    }.build()
}
