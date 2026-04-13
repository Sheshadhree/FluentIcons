package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowClockwise32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowClockwise32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 16f)
            curveToRelative(0f, -5.799f, 4.701f, -10.5f, 10.5f, -10.5f)
            curveToRelative(2.594f, 0f, 4.968f, 0.94f, 6.801f, 2.5f)
            horizontalLineTo(20.75f)
            curveToRelative(-0.69f, 0f, -1.25f, 0.56f, -1.25f, 1.25f)
            reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineToRelative(-5f)
            curveTo(27f, 3.56f, 26.44f, 3f, 25.75f, 3f)
            reflectiveCurveTo(24.5f, 3.56f, 24.5f, 4.25f)
            verticalLineToRelative(1.914f)
            curveTo(22.222f, 4.194f, 19.25f, 3f, 16f, 3f)
            curveTo(8.82f, 3f, 3f, 8.82f, 3f, 16f)
            reflectiveCurveToRelative(5.82f, 13f, 13f, 13f)
            reflectiveCurveToRelative(13f, -5.82f, 13f, -13f)
            curveToRelative(0f, -0.279f, -0.009f, -0.556f, -0.026f, -0.831f)
            curveToRelative(-0.044f, -0.69f, -0.637f, -1.212f, -1.326f, -1.169f)
            curveToRelative(-0.69f, 0.044f, -1.213f, 0.637f, -1.17f, 1.326f)
            curveTo(26.494f, 15.55f, 26.5f, 15.774f, 26.5f, 16f)
            curveToRelative(0f, 5.799f, -4.701f, 10.5f, -10.5f, 10.5f)
            reflectiveCurveTo(5.5f, 21.799f, 5.5f, 16f)
            close()
        }
    }.build()
}
