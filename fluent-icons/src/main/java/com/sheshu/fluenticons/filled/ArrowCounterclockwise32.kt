package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowCounterclockwise32: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowCounterclockwise32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(26.5f, 16f)
            curveToRelative(0f, -5.799f, -4.701f, -10.5f, -10.5f, -10.5f)
            curveToRelative(-2.594f, 0f, -4.968f, 0.94f, -6.801f, 2.5f)
            horizontalLineToRelative(2.051f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineToRelative(-5f)
            curveTo(5.56f, 10.5f, 5f, 9.94f, 5f, 9.25f)
            verticalLineToRelative(-5f)
            curveTo(5f, 3.56f, 5.56f, 3f, 6.25f, 3f)
            reflectiveCurveTo(7.5f, 3.56f, 7.5f, 4.25f)
            verticalLineToRelative(1.914f)
            curveTo(9.778f, 4.194f, 12.75f, 3f, 16f, 3f)
            curveToRelative(7.18f, 0f, 13f, 5.82f, 13f, 13f)
            reflectiveCurveToRelative(-5.82f, 13f, -13f, 13f)
            reflectiveCurveTo(3f, 23.18f, 3f, 16f)
            curveToRelative(0f, -0.279f, 0.009f, -0.556f, 0.026f, -0.831f)
            curveToRelative(0.044f, -0.69f, 0.638f, -1.212f, 1.327f, -1.169f)
            curveToRelative(0.689f, 0.044f, 1.212f, 0.637f, 1.168f, 1.326f)
            curveTo(5.507f, 15.55f, 5.5f, 15.774f, 5.5f, 16f)
            curveToRelative(0f, 5.799f, 4.701f, 10.5f, 10.5f, 10.5f)
            reflectiveCurveTo(26.5f, 21.799f, 26.5f, 16f)
            close()
        }
    }.build()
}
