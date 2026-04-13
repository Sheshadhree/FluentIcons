package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CommentCheckmark16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CommentCheckmark16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15f, 5.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(6f, 7.985f, 6f, 5.5f)
            reflectiveCurveTo(8.015f, 1f, 10.5f, 1f)
            reflectiveCurveTo(15f, 3.015f, 15f, 5.5f)
            close()
            moveToRelative(-2.146f, -1.853f)
            curveToRelative(-0.196f, -0.196f, -0.512f, -0.196f, -0.708f, 0f)
            lineTo(9.5f, 6.293f)
            lineTo(8.854f, 5.646f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            curveToRelative(-0.196f, 0.196f, -0.196f, 0.512f, 0f, 0.708f)
            lineToRelative(1f, 1f)
            curveToRelative(0.195f, 0.195f, 0.511f, 0.195f, 0.707f, 0f)
            lineToRelative(3f, -3f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            close()
            moveTo(3.5f, 3f)
            horizontalLineToRelative(2.1f)
            curveToRelative(0.183f, -0.358f, 0.404f, -0.693f, 0.657f, -1f)
            horizontalLineTo(3.5f)
            curveTo(2.12f, 2f, 1f, 3.12f, 1f, 4.5f)
            verticalLineToRelative(5f)
            curveTo(1f, 10.88f, 2.12f, 12f, 3.5f, 12f)
            horizontalLineTo(4f)
            verticalLineToRelative(1.942f)
            curveToRelative(0f, 0.842f, 0.992f, 1.292f, 1.625f, 0.738f)
            lineTo(8.688f, 12f)
            horizontalLineTo(12.5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(8.663f)
            curveToRelative(-0.29f, 0.411f, -0.634f, 0.78f, -1.023f, 1.098f)
            curveTo(13.854f, 10.466f, 13.24f, 11f, 12.5f, 11f)
            horizontalLineTo(8.312f)
            lineTo(5f, 13.898f)
            verticalLineTo(11f)
            horizontalLineTo(3.5f)
            curveTo(2.672f, 11f, 2f, 10.328f, 2f, 9.5f)
            verticalLineToRelative(-5f)
            curveTo(2f, 3.672f, 2.672f, 3f, 3.5f, 3f)
            close()
        }
    }.build()
}
