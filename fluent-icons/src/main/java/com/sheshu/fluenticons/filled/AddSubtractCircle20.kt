package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AddSubtractCircle20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AddSubtractCircle20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.5f, 12f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(14.776f, 12f, 14.5f, 12f)
            horizontalLineToRelative(-3f)
            close()
            moveTo(10f, 18f)
            curveToRelative(4.418f, 0f, 8f, -3.582f, 8f, -8f)
            reflectiveCurveToRelative(-3.582f, -8f, -8f, -8f)
            reflectiveCurveToRelative(-8f, 3.582f, -8f, 8f)
            reflectiveCurveToRelative(3.582f, 8f, 8f, 8f)
            close()
            moveToRelative(0f, -1f)
            curveToRelative(-1.753f, 0f, -3.356f, -0.644f, -4.583f, -1.71f)
            lineToRelative(9.874f, -9.873f)
            curveTo(16.356f, 6.644f, 17f, 8.246f, 17f, 10f)
            curveToRelative(0f, 3.866f, -3.134f, 7f, -7f, 7f)
            close()
            moveTo(5.5f, 7f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(-1f)
            curveTo(7f, 5.224f, 7.224f, 5f, 7.5f, 5f)
            reflectiveCurveTo(8f, 5.224f, 8f, 5.5f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(1f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(9.276f, 7.5f, 9f, 7.5f)
            horizontalLineTo(8f)
            verticalLineToRelative(1f)
            curveTo(8f, 8.776f, 7.776f, 9f, 7.5f, 9f)
            reflectiveCurveTo(7f, 8.776f, 7f, 8.5f)
            verticalLineToRelative(-1f)
            horizontalLineTo(6f)
            curveTo(5.724f, 7.5f, 5.5f, 7.276f, 5.5f, 7f)
            close()
        }
    }.build()
}
