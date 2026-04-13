package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PersonHeart32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PersonHeart32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23f, 9f)
            curveToRelative(0f, 3.866f, -3.134f, 7f, -7f, 7f)
            reflectiveCurveToRelative(-7f, -3.134f, -7f, -7f)
            reflectiveCurveToRelative(3.134f, -7f, 7f, -7f)
            reflectiveCurveToRelative(7f, 3.134f, 7f, 7f)
            close()
            moveToRelative(-2f, 0f)
            curveToRelative(0f, -2.761f, -2.239f, -5f, -5f, -5f)
            reflectiveCurveToRelative(-5f, 2.239f, -5f, 5f)
            reflectiveCurveToRelative(2.239f, 5f, 5f, 5f)
            reflectiveCurveToRelative(5f, -2.239f, 5f, -5f)
            close()
            moveTo(7.5f, 18f)
            curveTo(5.567f, 18f, 4f, 19.567f, 4f, 21.5f)
            verticalLineTo(22f)
            curveToRelative(0f, 2.393f, 1.523f, 4.417f, 3.685f, 5.793f)
            curveTo(9.859f, 29.177f, 12.802f, 30f, 16f, 30f)
            curveToRelative(1.236f, 0f, 2.433f, -0.123f, 3.563f, -0.354f)
            lineToRelative(-1.647f, -1.758f)
            curveTo(17.298f, 27.96f, 16.657f, 28f, 16f, 28f)
            curveToRelative(-2.877f, 0f, -5.434f, -0.744f, -7.241f, -1.894f)
            curveTo(6.939f, 24.95f, 6f, 23.472f, 6f, 22f)
            verticalLineToRelative(-0.5f)
            curveTo(6f, 20.672f, 6.672f, 20f, 7.5f, 20f)
            horizontalLineToRelative(6.39f)
            curveToRelative(0.162f, -0.709f, 0.463f, -1.39f, 0.903f, -2f)
            horizontalLineTo(7.5f)
            close()
            moveToRelative(14.89f, 0.572f)
            lineToRelative(0.607f, 0.765f)
            lineToRelative(0.608f, -0.765f)
            curveToRelative(1.523f, -1.917f, 4.322f, -2.11f, 6.084f, -0.42f)
            curveToRelative(1.685f, 1.616f, 1.755f, 4.323f, 0.157f, 6.027f)
            lineToRelative(-6.082f, 6.487f)
            curveToRelative(-0.418f, 0.446f, -1.116f, 0.445f, -1.534f, 0f)
            lineToRelative(-6.079f, -6.492f)
            curveToRelative(-1.594f, -1.703f, -1.524f, -4.403f, 0.156f, -6.017f)
            curveToRelative(1.76f, -1.692f, 4.559f, -1.5f, 6.082f, 0.415f)
            close()
            moveTo(20.95f, 29.3f)
            lineToRelative(-1.555f, -1.661f)
            close()
        }
    }.build()
}
