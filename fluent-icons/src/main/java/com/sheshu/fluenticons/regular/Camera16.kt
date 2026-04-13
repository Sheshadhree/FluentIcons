package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Camera16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Camera16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11f, 8f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            reflectiveCurveTo(5f, 9.657f, 5f, 8f)
            reflectiveCurveToRelative(1.343f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.343f, 3f, 3f)
            close()
            moveToRelative(-1f, 0f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            reflectiveCurveTo(6f, 6.895f, 6f, 8f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.895f, 2f, -2f)
            close()
            moveTo(6.618f, 2f)
            curveTo(6.05f, 2f, 5.53f, 2.321f, 5.276f, 2.83f)
            lineTo(4.691f, 4f)
            horizontalLineTo(4f)
            curveTo(2.895f, 4f, 2f, 4.895f, 2f, 6f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineToRelative(-0.691f)
            lineToRelative(-0.585f, -1.17f)
            curveTo(10.469f, 2.32f, 9.95f, 2f, 9.382f, 2f)
            horizontalLineTo(6.618f)
            close()
            moveTo(6.171f, 3.276f)
            curveTo(6.255f, 3.107f, 6.429f, 3f, 6.618f, 3f)
            horizontalLineToRelative(2.764f)
            curveToRelative(0.19f, 0f, 0.363f, 0.107f, 0.447f, 0.276f)
            lineToRelative(0.724f, 1.448f)
            curveTo(10.637f, 4.893f, 10.81f, 5f, 11f, 5f)
            horizontalLineToRelative(1f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(4f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(6f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(1f)
            curveToRelative(0.19f, 0f, 0.362f, -0.107f, 0.447f, -0.276f)
            lineToRelative(0.724f, -1.448f)
            close()
        }
    }.build()
}
