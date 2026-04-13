package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ErrorCircle16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ErrorCircle16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 2f)
            curveToRelative(3.314f, 0f, 6f, 2.686f, 6f, 6f)
            reflectiveCurveToRelative(-2.686f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.686f, -6f, -6f)
            reflectiveCurveToRelative(2.686f, -6f, 6f, -6f)
            close()
            moveToRelative(0f, 1f)
            curveTo(5.239f, 3f, 3f, 5.239f, 3f, 8f)
            reflectiveCurveToRelative(2.239f, 5f, 5f, 5f)
            reflectiveCurveToRelative(5f, -2.239f, 5f, -5f)
            reflectiveCurveToRelative(-2.239f, -5f, -5f, -5f)
            close()
            moveToRelative(0f, 7f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(8.414f, 11.5f, 8f, 11.5f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            reflectiveCurveTo(7.586f, 10f, 8f, 10f)
            close()
            moveToRelative(0f, -5.5f)
            curveToRelative(0.245f, 0f, 0.45f, 0.177f, 0.492f, 0.41f)
            lineTo(8.5f, 5f)
            verticalLineToRelative(3.5f)
            curveTo(8.5f, 8.776f, 8.276f, 9f, 8f, 9f)
            curveTo(7.755f, 9f, 7.55f, 8.823f, 7.508f, 8.59f)
            lineTo(7.5f, 8.5f)
            verticalLineTo(5f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            close()
        }
    }.build()
}
