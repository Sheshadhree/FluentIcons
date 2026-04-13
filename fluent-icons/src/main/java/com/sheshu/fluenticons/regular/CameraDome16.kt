package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CameraDome16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CameraDome16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 9f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            close()
            moveToRelative(-3f, 1f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.343f, 3f, 3f)
            reflectiveCurveToRelative(-1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            close()
            moveToRelative(3f, -2f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.895f, 2f, -2f)
            reflectiveCurveToRelative(-0.895f, -2f, -2f, -2f)
            close()
            moveTo(1f, 3.5f)
            curveTo(1f, 2.672f, 1.672f, 2f, 2.5f, 2f)
            horizontalLineToRelative(11f)
            curveTo(14.328f, 2f, 15f, 2.672f, 15f, 3.5f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.653f, -0.417f, 1.209f, -1f, 1.415f)
            verticalLineTo(9f)
            curveToRelative(0f, 3.314f, -2.686f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.686f, -6f, -6f)
            verticalLineTo(5.915f)
            curveTo(1.417f, 5.709f, 1f, 5.153f, 1f, 4.5f)
            verticalLineToRelative(-1f)
            close()
            moveTo(2.5f, 5f)
            horizontalLineToRelative(11f)
            curveTo(13.776f, 5f, 14f, 4.776f, 14f, 4.5f)
            verticalLineToRelative(-1f)
            curveTo(14f, 3.224f, 13.776f, 3f, 13.5f, 3f)
            horizontalLineToRelative(-11f)
            curveTo(2.224f, 3f, 2f, 3.224f, 2f, 3.5f)
            verticalLineToRelative(1f)
            curveTo(2f, 4.776f, 2.224f, 5f, 2.5f, 5f)
            close()
            moveTo(3f, 6f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 2.761f, 2.239f, 5f, 5f, 5f)
            reflectiveCurveToRelative(5f, -2.239f, 5f, -5f)
            verticalLineTo(6f)
            horizontalLineTo(3f)
            close()
        }
    }.build()
}
