package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PeopleStar48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PeopleStar48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 22f)
            curveToRelative(4.418f, 0f, 8f, -3.582f, 8f, -8f)
            reflectiveCurveToRelative(-3.582f, -8f, -8f, -8f)
            reflectiveCurveToRelative(-8f, 3.582f, -8f, 8f)
            reflectiveCurveToRelative(3.582f, 8f, 8f, 8f)
            close()
            moveToRelative(18f, 0f)
            curveToRelative(3.314f, 0f, 6f, -2.686f, 6f, -6f)
            reflectiveCurveToRelative(-2.686f, -6f, -6f, -6f)
            reflectiveCurveToRelative(-6f, 2.686f, -6f, 6f)
            reflectiveCurveToRelative(2.686f, 6f, 6f, 6f)
            close()
            moveTo(6.75f, 25f)
            curveTo(4.679f, 25f, 3f, 26.679f, 3f, 28.75f)
            verticalLineTo(30f)
            reflectiveCurveToRelative(0f, 9f, 13f, 9f)
            curveToRelative(2.61f, 0f, 4.695f, -0.363f, 6.362f, -0.942f)
            curveTo(22.125f, 37.078f, 22f, 36.053f, 22f, 35f)
            curveToRelative(0f, -3.91f, 1.727f, -7.418f, 4.459f, -9.8f)
            curveToRelative(-0.38f, -0.13f, -0.786f, -0.2f, -1.209f, -0.2f)
            horizontalLineTo(6.75f)
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
