package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonAdd32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonAdd32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 16f)
            curveToRelative(3.866f, 0f, 7f, -3.134f, 7f, -7f)
            reflectiveCurveToRelative(-3.134f, -7f, -7f, -7f)
            reflectiveCurveToRelative(-7f, 3.134f, -7f, 7f)
            reflectiveCurveToRelative(3.134f, 7f, 7f, 7f)
            close()
            moveToRelative(-8.5f, 2f)
            curveTo(5.567f, 18f, 4f, 19.567f, 4f, 21.5f)
            verticalLineTo(22f)
            curveToRelative(0f, 2.393f, 1.523f, 4.417f, 3.685f, 5.793f)
            curveTo(9.859f, 29.177f, 12.802f, 30f, 16f, 30f)
            curveToRelative(0.415f, 0f, 0.827f, -0.014f, 1.232f, -0.041f)
            curveToRelative(-1.685f, -1.636f, -2.732f, -3.925f, -2.732f, -6.459f)
            curveToRelative(0f, -2.071f, 0.7f, -3.98f, 1.876f, -5.5f)
            horizontalLineTo(7.5f)
            close()
            moveToRelative(16f, 13f)
            curveToRelative(4.142f, 0f, 7.5f, -3.358f, 7.5f, -7.5f)
            curveToRelative(0f, -4.142f, -3.358f, -7.5f, -7.5f, -7.5f)
            curveToRelative(-4.142f, 0f, -7.5f, 3.358f, -7.5f, 7.5f)
            curveToRelative(0f, 4.142f, 3.358f, 7.5f, 7.5f, 7.5f)
            close()
            moveToRelative(1f, -12.25f)
            verticalLineToRelative(3.75f)
            horizontalLineToRelative(3.75f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(28.664f, 24f, 28.25f, 24f)
            horizontalLineTo(24.5f)
            verticalLineToRelative(3.75f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveTo(23f, 28.164f, 23f, 27.75f)
            verticalLineTo(24f)
            horizontalLineToRelative(-3.75f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            reflectiveCurveToRelative(0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineTo(23f)
            verticalLineToRelative(-3.75f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            reflectiveCurveToRelative(0.75f, 0.336f, 0.75f, 0.75f)
            close()
        }
    }.build()
}
