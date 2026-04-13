package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonAlert20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonAlert20",
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
            moveToRelative(-4.991f, 9f)
            curveTo(2.903f, 11f, 2f, 11.887f, 2f, 13f)
            curveToRelative(0f, 1.691f, 0.833f, 2.966f, 2.135f, 3.797f)
            curveTo(5.417f, 17.614f, 7.145f, 18f, 9f, 18f)
            curveToRelative(0.377f, 0f, 0.749f, -0.016f, 1.113f, -0.048f)
            curveToRelative(-1.116f, -0.287f, -1.54f, -1.782f, -0.58f, -2.596f)
            lineToRelative(0.966f, -0.82f)
            verticalLineTo(13f)
            curveToRelative(0f, -0.729f, 0.195f, -1.412f, 0.535f, -2f)
            horizontalLineTo(4.01f)
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
