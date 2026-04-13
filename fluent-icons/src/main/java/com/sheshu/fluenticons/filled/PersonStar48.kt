package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonStar48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonStar48",
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
            moveTo(12.25f, 28f)
            curveTo(9.903f, 28f, 8f, 29.901f, 8f, 32.249f)
            verticalLineTo(33f)
            curveToRelative(0f, 3.755f, 1.942f, 6.567f, 4.92f, 8.38f)
            curveTo(15.85f, 43.163f, 19.786f, 44f, 24f, 44f)
            curveToRelative(0.532f, 0f, 1.06f, -0.013f, 1.58f, -0.04f)
            curveTo(23.363f, 41.628f, 22f, 38.473f, 22f, 35f)
            curveToRelative(0f, -2.577f, 0.75f, -4.98f, 2.044f, -7f)
            horizontalLineTo(12.25f)
            close()
            moveTo(46f, 35f)
            curveToRelative(0f, 6.075f, -4.925f, 11f, -11f, 11f)
            reflectiveCurveToRelative(-11f, -4.925f, -11f, -11f)
            reflectiveCurveToRelative(4.925f, -11f, 11f, -11f)
            reflectiveCurveToRelative(11f, 4.925f, 11f, 11f)
            close()
            moveToRelative(-9.81f, -6.599f)
            curveToRelative(-0.374f, -1.201f, -2.005f, -1.201f, -2.38f, 0f)
            lineToRelative(-1.194f, 3.83f)
            horizontalLineToRelative(-3.862f)
            curveToRelative(-1.213f, 0f, -1.716f, 1.617f, -0.736f, 2.36f)
            lineToRelative(3.125f, 2.366f)
            lineToRelative(-1.194f, 3.83f)
            curveToRelative(-0.374f, 1.201f, 0.945f, 2.2f, 1.926f, 1.458f)
            lineTo(35f, 39.878f)
            lineToRelative(3.125f, 2.367f)
            curveToRelative(0.98f, 0.743f, 2.3f, -0.257f, 1.925f, -1.458f)
            lineToRelative(-1.193f, -3.83f)
            lineToRelative(3.125f, -2.367f)
            curveToRelative(0.98f, -0.742f, 0.477f, -2.36f, -0.736f, -2.36f)
            horizontalLineToRelative(-3.862f)
            lineToRelative(-1.194f, -3.829f)
            close()
        }
    }.build()
}
