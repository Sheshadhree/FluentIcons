package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PersonAlert20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PersonAlert20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 2f)
            curveTo(6.79f, 2f, 5f, 3.79f, 5f, 6f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            close()
            moveTo(6f, 6f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.343f, 3f, 3f)
            reflectiveCurveToRelative(-1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            close()
            moveToRelative(-1.991f, 5f)
            curveTo(2.903f, 11f, 2f, 11.887f, 2f, 13f)
            curveToRelative(0f, 1.691f, 0.833f, 2.966f, 2.135f, 3.797f)
            curveTo(5.417f, 17.614f, 7.145f, 18f, 9f, 18f)
            curveToRelative(0.377f, 0f, 0.749f, -0.016f, 1.113f, -0.048f)
            curveToRelative(-0.504f, -0.13f, -0.866f, -0.505f, -1.024f, -0.952f)
            horizontalLineTo(9f)
            curveToRelative(-1.735f, 0f, -3.257f, -0.364f, -4.327f, -1.047f)
            curveTo(3.623f, 15.283f, 3f, 14.31f, 3f, 13f)
            curveToRelative(0f, -0.553f, 0.448f, -1f, 1.009f, -1f)
            horizontalLineToRelative(6.616f)
            curveToRelative(0.091f, -0.355f, 0.23f, -0.69f, 0.41f, -1f)
            horizontalLineTo(4.008f)
            close()
            moveToRelative(7.49f, 2f)
            curveToRelative(0f, -1.657f, 1.344f, -3f, 3f, -3f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(2f)
            lineToRelative(1.32f, 1.119f)
            curveToRelative(0.356f, 0.3f, 0.143f, 0.881f, -0.323f, 0.881f)
            horizontalLineToRelative(-7.993f)
            curveToRelative(-0.466f, 0f, -0.678f, -0.58f, -0.323f, -0.881f)
            lineTo(11.5f, 15f)
            verticalLineToRelative(-2f)
            close()
            moveToRelative(3f, 6f)
            curveToRelative(-0.652f, 0f, -1.208f, -0.418f, -1.414f, -1f)
            horizontalLineToRelative(2.829f)
            curveToRelative(-0.206f, 0.582f, -0.761f, 1f, -1.415f, 1f)
            close()
        }
    }.build()
}
