package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CheckmarkCircleSquare16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CheckmarkCircleSquare16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 10f)
            curveTo(7.985f, 10f, 10f, 7.985f, 10f, 5.5f)
            reflectiveCurveTo(7.985f, 1f, 5.5f, 1f)
            reflectiveCurveTo(1f, 3.015f, 1f, 5.5f)
            reflectiveCurveTo(3.015f, 10f, 5.5f, 10f)
            close()
            moveToRelative(1.854f, -5.146f)
            lineToRelative(-2f, 2f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            lineToRelative(-1f, -1f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            lineTo(5f, 5.793f)
            lineToRelative(1.646f, -1.647f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            close()
            moveTo(6f, 10.977f)
            verticalLineTo(12.5f)
            curveTo(6f, 13.88f, 7.12f, 15f, 8.5f, 15f)
            horizontalLineToRelative(4f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-4f)
            curveTo(15f, 7.12f, 13.88f, 6f, 12.5f, 6f)
            horizontalLineToRelative(-1.522f)
            curveToRelative(-0.031f, 0.343f, -0.094f, 0.678f, -0.185f, 1f)
            horizontalLineTo(12.5f)
            curveTo(13.328f, 7f, 14f, 7.672f, 14f, 8.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-4f)
            curveTo(7.672f, 14f, 7f, 13.328f, 7f, 12.5f)
            verticalLineToRelative(-1.707f)
            curveToRelative(-0.322f, 0.091f, -0.657f, 0.154f, -1f, 0.185f)
            close()
            moveToRelative(6.353f, -1.124f)
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
