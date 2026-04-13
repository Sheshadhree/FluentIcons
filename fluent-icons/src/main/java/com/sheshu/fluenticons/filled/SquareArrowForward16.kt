package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SquareArrowForward16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SquareArrowForward16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.5f, 4.5f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(7f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(1.39f)
            curveTo(12.637f, 5.327f, 11.607f, 5f, 10.5f, 5f)
            curveTo(7.462f, 5f, 5f, 7.462f, 5f, 10.5f)
            curveToRelative(0f, 1.107f, 0.327f, 2.137f, 0.89f, 3f)
            horizontalLineTo(4.5f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineToRelative(-7f)
            close()
            moveToRelative(8f, 10.5f)
            curveTo(8.015f, 15f, 6f, 12.985f, 6f, 10.5f)
            reflectiveCurveTo(8.015f, 6f, 10.5f, 6f)
            reflectiveCurveTo(15f, 8.015f, 15f, 10.5f)
            reflectiveCurveTo(12.985f, 15f, 10.5f, 15f)
            close()
            moveToRelative(0.896f, -6.396f)
            lineTo(12.293f, 9.5f)
            horizontalLineTo(10.75f)
            curveTo(9.231f, 9.5f, 8f, 10.731f, 8f, 12.25f)
            verticalLineToRelative(0.25f)
            curveTo(8f, 12.776f, 8.224f, 13f, 8.5f, 13f)
            reflectiveCurveTo(9f, 12.776f, 9f, 12.5f)
            verticalLineToRelative(-0.25f)
            curveToRelative(0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
            horizontalLineToRelative(1.543f)
            lineToRelative(-0.897f, 0.896f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineToRelative(1.752f, -1.753f)
            curveToRelative(0.047f, -0.047f, 0.082f, -0.102f, 0.106f, -0.16f)
            curveTo(13.986f, 10.132f, 14f, 10.068f, 14f, 10f)
            reflectiveCurveToRelative(-0.014f, -0.132f, -0.038f, -0.191f)
            curveToRelative(-0.024f, -0.06f, -0.06f, -0.115f, -0.108f, -0.162f)
            lineToRelative(-1.75f, -1.75f)
            curveToRelative(-0.196f, -0.196f, -0.512f, -0.196f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.511f, 0f, 0.707f)
            close()
        }
    }.build()
}
