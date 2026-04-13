package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonStar32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonStar32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15f, 16f)
            curveToRelative(3.866f, 0f, 7f, -3.134f, 7f, -7f)
            reflectiveCurveToRelative(-3.134f, -7f, -7f, -7f)
            reflectiveCurveToRelative(-7f, 3.134f, -7f, 7f)
            reflectiveCurveToRelative(3.134f, 7f, 7f, 7f)
            close()
            moveToRelative(-8.5f, 2f)
            curveTo(4.567f, 18f, 3f, 19.567f, 3f, 21.5f)
            verticalLineTo(22f)
            curveToRelative(0f, 2.393f, 1.523f, 4.417f, 3.685f, 5.793f)
            curveTo(8.859f, 29.177f, 11.802f, 30f, 15f, 30f)
            curveToRelative(0.744f, 0f, 1.475f, -0.045f, 2.185f, -0.13f)
            curveTo(15.237f, 28.219f, 14f, 25.754f, 14f, 23f)
            curveToRelative(0f, -1.85f, 0.558f, -3.57f, 1.516f, -5f)
            horizontalLineTo(6.5f)
            close()
            moveToRelative(24f, 5f)
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
