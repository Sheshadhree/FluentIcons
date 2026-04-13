package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonMail48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonMail48",
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
            moveTo(10.25f, 28f)
            curveTo(7.903f, 28f, 6f, 29.901f, 6f, 32.249f)
            verticalLineTo(33f)
            curveToRelative(0f, 3.755f, 1.942f, 6.567f, 4.92f, 8.38f)
            curveTo(13.85f, 43.163f, 17.786f, 44f, 22f, 44f)
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
