package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowCircleDownRight20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowCircleDownRight20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.851f, 12.856f)
            curveToRelative(-0.047f, 0.047f, -0.102f, 0.082f, -0.16f, 0.106f)
            curveTo(12.632f, 12.986f, 12.568f, 13f, 12.5f, 13f)
            horizontalLineToRelative(-5f)
            curveTo(7.224f, 13f, 7f, 12.776f, 7f, 12.5f)
            reflectiveCurveTo(7.224f, 12f, 7.5f, 12f)
            horizontalLineToRelative(3.793f)
            lineTo(7.147f, 7.854f)
            curveToRelative(-0.196f, -0.196f, -0.196f, -0.512f, 0f, -0.708f)
            curveToRelative(0.195f, -0.195f, 0.511f, -0.195f, 0.707f, 0f)
            lineTo(12f, 11.293f)
            verticalLineTo(7.5f)
            curveTo(12f, 7.224f, 12.224f, 7f, 12.5f, 7f)
            reflectiveCurveTo(13f, 7.224f, 13f, 7.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.068f, -0.014f, 0.132f, -0.038f, 0.191f)
            curveToRelative(-0.024f, 0.058f, -0.06f, 0.113f, -0.106f, 0.16f)
            lineToRelative(-0.005f, 0.005f)
            close()
            moveTo(10f, 18f)
            curveToRelative(4.418f, 0f, 8f, -3.582f, 8f, -8f)
            reflectiveCurveToRelative(-3.582f, -8f, -8f, -8f)
            reflectiveCurveToRelative(-8f, 3.582f, -8f, 8f)
            reflectiveCurveToRelative(3.582f, 8f, 8f, 8f)
            close()
            moveToRelative(7f, -8f)
            curveToRelative(0f, 3.866f, -3.134f, 7f, -7f, 7f)
            reflectiveCurveToRelative(-7f, -3.134f, -7f, -7f)
            reflectiveCurveToRelative(3.134f, -7f, 7f, -7f)
            reflectiveCurveToRelative(7f, 3.134f, 7f, 7f)
            close()
        }
    }.build()
}
