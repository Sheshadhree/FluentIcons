package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Timer20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Timer20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 2f)
            curveTo(7.224f, 2f, 7f, 2.224f, 7f, 2.5f)
            reflectiveCurveTo(7.224f, 3f, 7.5f, 3f)
            horizontalLineToRelative(4f)
            curveTo(11.776f, 3f, 12f, 2.776f, 12f, 2.5f)
            reflectiveCurveTo(11.776f, 2f, 11.5f, 2f)
            horizontalLineToRelative(-4f)
            close()
            moveToRelative(7.656f, 1.929f)
            curveToRelative(-0.195f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.512f, 0f, 0.707f)
            lineToRelative(1.414f, 1.414f)
            curveToRelative(0.196f, 0.196f, 0.512f, 0.196f, 0.707f, 0f)
            curveToRelative(0.196f, -0.195f, 0.196f, -0.511f, 0f, -0.707f)
            lineTo(15.156f, 3.93f)
            close()
            moveTo(9.5f, 6f)
            curveTo(9.224f, 6f, 9f, 6.224f, 9f, 6.5f)
            verticalLineToRelative(5f)
            curveTo(9f, 11.776f, 9.224f, 12f, 9.5f, 12f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-5f)
            curveTo(10f, 6.224f, 9.776f, 6f, 9.5f, 6f)
            close()
            moveToRelative(0f, 12f)
            curveToRelative(3.866f, 0f, 7f, -3.134f, 7f, -7f)
            reflectiveCurveToRelative(-3.134f, -7f, -7f, -7f)
            reflectiveCurveToRelative(-7f, 3.134f, -7f, 7f)
            reflectiveCurveToRelative(3.134f, 7f, 7f, 7f)
            close()
            moveToRelative(0f, -1f)
            curveToRelative(-3.314f, 0f, -6f, -2.686f, -6f, -6f)
            reflectiveCurveToRelative(2.686f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.686f, 6f, 6f)
            reflectiveCurveToRelative(-2.686f, 6f, -6f, 6f)
            close()
        }
    }.build()
}
