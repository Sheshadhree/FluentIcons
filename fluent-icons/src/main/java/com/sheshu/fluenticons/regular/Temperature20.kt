package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Temperature20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Temperature20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 6.5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(5.063f)
            curveTo(11.363f, 12.285f, 12f, 13.068f, 12f, 14f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            curveToRelative(0f, -0.932f, 0.637f, -1.715f, 1.5f, -1.937f)
            verticalLineTo(7f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            close()
            moveTo(10f, 2f)
            curveTo(8.343f, 2f, 7f, 3.343f, 7f, 5f)
            verticalLineToRelative(6.354f)
            curveTo(6.378f, 12.06f, 6f, 12.986f, 6f, 14f)
            curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
            reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
            curveToRelative(0f, -1.014f, -0.378f, -1.941f, -1f, -2.646f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            close()
            moveToRelative(0f, 1f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(6.755f)
            lineToRelative(0.143f, 0.145f)
            curveTo(12.673f, 12.442f, 13f, 13.182f, 13f, 14f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            curveToRelative(0f, -0.818f, 0.326f, -1.558f, 0.857f, -2.1f)
            lineTo(8f, 11.755f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            close()
        }
    }.build()
}
