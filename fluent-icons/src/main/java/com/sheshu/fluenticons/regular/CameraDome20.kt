package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CameraDome20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CameraDome20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 12f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            reflectiveCurveToRelative(-0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            close()
            moveToRelative(2f, -4f)
            curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            close()
            moveToRelative(-3f, 4f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.343f, 3f, 3f)
            reflectiveCurveToRelative(-1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            close()
            moveTo(2f, 4.5f)
            curveTo(2f, 3.672f, 2.672f, 3f, 3.5f, 3f)
            horizontalLineToRelative(13f)
            curveTo(17.328f, 3f, 18f, 3.672f, 18f, 4.5f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.653f, -0.417f, 1.209f, -1f, 1.415f)
            verticalLineTo(11f)
            curveToRelative(0f, 3.866f, -3.134f, 7f, -7f, 7f)
            reflectiveCurveToRelative(-7f, -3.134f, -7f, -7f)
            verticalLineTo(6.915f)
            curveTo(2.417f, 6.709f, 2f, 6.153f, 2f, 5.5f)
            verticalLineToRelative(-1f)
            close()
            moveTo(4f, 7f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 3.314f, 2.686f, 6f, 6f, 6f)
            reflectiveCurveToRelative(6f, -2.686f, 6f, -6f)
            verticalLineTo(7f)
            horizontalLineTo(4f)
            close()
            moveTo(3.5f, 4f)
            curveTo(3.224f, 4f, 3f, 4.224f, 3f, 4.5f)
            verticalLineToRelative(1f)
            curveTo(3f, 5.776f, 3.224f, 6f, 3.5f, 6f)
            horizontalLineToRelative(13f)
            curveTo(16.776f, 6f, 17f, 5.776f, 17f, 5.5f)
            verticalLineToRelative(-1f)
            curveTo(17f, 4.224f, 16.776f, 4f, 16.5f, 4f)
            horizontalLineToRelative(-13f)
            close()
        }
    }.build()
}
