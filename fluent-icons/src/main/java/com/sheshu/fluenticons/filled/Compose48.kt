package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Compose48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Compose48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(26.5f, 8f)
            curveTo(27.328f, 8f, 28f, 8.672f, 28f, 9.5f)
            reflectiveCurveTo(27.328f, 11f, 26.5f, 11f)
            horizontalLineToRelative(-14f)
            curveTo(10.567f, 11f, 9f, 12.567f, 9f, 14.5f)
            verticalLineToRelative(21f)
            curveToRelative(0f, 1.933f, 1.567f, 3.5f, 3.5f, 3.5f)
            horizontalLineToRelative(21f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            verticalLineToRelative(-14f)
            curveToRelative(0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
            verticalLineToRelative(14f)
            curveToRelative(0f, 3.59f, -2.91f, 6.5f, -6.5f, 6.5f)
            horizontalLineToRelative(-21f)
            curveTo(8.91f, 42f, 6f, 39.09f, 6f, 35.5f)
            verticalLineToRelative(-21f)
            curveTo(6f, 10.91f, 8.91f, 8f, 12.5f, 8f)
            horizontalLineToRelative(14f)
            close()
            moveToRelative(12.94f, -1.56f)
            curveToRelative(0.585f, -0.586f, 1.535f, -0.586f, 2.12f, 0f)
            curveToRelative(0.586f, 0.585f, 0.586f, 1.535f, 0f, 2.12f)
            lineTo(22.183f, 27.94f)
            lineTo(19f, 29f)
            lineToRelative(1.06f, -3.182f)
            lineTo(39.44f, 6.44f)
            close()
        }
    }.build()
}
