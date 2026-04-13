package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CheckmarkCircleSquare16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CheckmarkCircleSquare16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 5.5f)
            curveTo(9f, 3.567f, 7.433f, 2f, 5.5f, 2f)
            reflectiveCurveTo(2f, 3.567f, 2f, 5.5f)
            reflectiveCurveTo(3.567f, 9f, 5.5f, 9f)
            reflectiveCurveTo(9f, 7.433f, 9f, 5.5f)
            close()
            moveToRelative(1f, 0f)
            curveTo(10f, 7.985f, 7.985f, 10f, 5.5f, 10f)
            reflectiveCurveTo(1f, 7.985f, 1f, 5.5f)
            reflectiveCurveTo(3.015f, 1f, 5.5f, 1f)
            reflectiveCurveTo(10f, 3.015f, 10f, 5.5f)
            close()
            moveToRelative(-3.999f, 7f)
            verticalLineToRelative(-1.522f)
            curveToRelative(0.343f, -0.031f, 0.678f, -0.094f, 1f, -0.185f)
            verticalLineTo(12.5f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(4f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-1.707f)
            curveToRelative(0.091f, -0.322f, 0.154f, -0.657f, 0.185f, -1f)
            horizontalLineTo(12.5f)
            curveTo(13.88f, 6f, 15f, 7.12f, 15f, 8.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-4f)
            curveTo(7.12f, 15f, 6f, 13.88f, 6f, 12.5f)
            close()
            moveToRelative(1.353f, -8.354f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(-2f, 2f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            lineToRelative(-1f, -1f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            lineTo(5f, 5.793f)
            lineToRelative(1.646f, -1.647f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            close()
            moveToRelative(5f, 5.708f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.707f)
            curveToRelative(-0.196f, -0.196f, -0.512f, -0.196f, -0.708f, 0f)
            lineTo(10f, 10.793f)
            lineToRelative(-0.646f, -0.647f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            curveToRelative(-0.196f, 0.196f, -0.196f, 0.512f, 0f, 0.708f)
            lineToRelative(1f, 1f)
            curveToRelative(0.195f, 0.195f, 0.511f, 0.195f, 0.707f, 0f)
            lineToRelative(2f, -2f)
            close()
        }
    }.build()
}
