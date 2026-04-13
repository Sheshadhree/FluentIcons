package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PeopleStar32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PeopleStar32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.5f, 14f)
            curveToRelative(3.038f, 0f, 5.5f, -2.462f, 5.5f, -5.5f)
            reflectiveCurveTo(13.538f, 3f, 10.5f, 3f)
            reflectiveCurveTo(5f, 5.462f, 5f, 8.5f)
            reflectiveCurveTo(7.462f, 14f, 10.5f, 14f)
            close()
            moveTo(23f, 14f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            close()
            moveToRelative(-9f, 9f)
            curveToRelative(0f, -2.712f, 1.2f, -5.143f, 3.096f, -6.793f)
            curveTo(16.756f, 16.073f, 16.386f, 16f, 16f, 16f)
            horizontalLineTo(5f)
            curveToRelative(-1.657f, 0f, -3f, 1.343f, -3f, 3f)
            verticalLineToRelative(0.15f)
            reflectiveCurveTo(2f, 25f, 10.5f, 25f)
            curveToRelative(1.442f, 0f, 2.64f, -0.168f, 3.633f, -0.448f)
            curveTo(14.046f, 24.048f, 14f, 23.53f, 14f, 23f)
            close()
            moveToRelative(16.5f, 0f)
            curveToRelative(0f, 4.142f, -3.358f, 7.5f, -7.5f, 7.5f)
            curveToRelative(-4.142f, 0f, -7.5f, -3.358f, -7.5f, -7.5f)
            curveToRelative(0f, -4.142f, 3.358f, -7.5f, 7.5f, -7.5f)
            curveToRelative(4.142f, 0f, 7.5f, 3.358f, 7.5f, 7.5f)
            close()
            moveToRelative(-8.212f, -4.862f)
            lineToRelative(-0.94f, 2.828f)
            horizontalLineToRelative(-2.994f)
            curveToRelative(-0.731f, 0f, -1.03f, 0.938f, -0.434f, 1.361f)
            lineToRelative(2.406f, 1.707f)
            lineToRelative(-0.929f, 2.792f)
            curveToRelative(-0.228f, 0.687f, 0.555f, 1.267f, 1.146f, 0.848f)
            lineTo(23f, 25.931f)
            lineToRelative(2.457f, 1.743f)
            curveToRelative(0.591f, 0.42f, 1.374f, -0.16f, 1.146f, -0.848f)
            lineToRelative(-0.93f, -2.792f)
            lineToRelative(2.407f, -1.707f)
            curveToRelative(0.597f, -0.423f, 0.297f, -1.361f, -0.434f, -1.361f)
            horizontalLineToRelative(-2.994f)
            lineToRelative(-0.94f, -2.828f)
            curveToRelative(-0.228f, -0.684f, -1.196f, -0.684f, -1.424f, 0f)
            close()
        }
    }.build()
}
