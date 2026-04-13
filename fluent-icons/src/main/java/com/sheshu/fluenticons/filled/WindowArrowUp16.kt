package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.WindowArrowUp16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.WindowArrowUp16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 4.5f)
            curveTo(2f, 3.12f, 3.12f, 2f, 4.5f, 2f)
            horizontalLineToRelative(7f)
            curveTo(12.88f, 2f, 14f, 3.12f, 14f, 4.5f)
            verticalLineToRelative(2.1f)
            curveToRelative(-0.317f, -0.162f, -0.651f, -0.294f, -1f, -0.393f)
            verticalLineTo(6f)
            horizontalLineTo(3f)
            verticalLineToRelative(5.5f)
            curveTo(3f, 12.328f, 3.672f, 13f, 4.5f, 13f)
            horizontalLineToRelative(1.707f)
            curveToRelative(0.099f, 0.349f, 0.23f, 0.683f, 0.393f, 1f)
            horizontalLineTo(4.5f)
            curveTo(3.12f, 14f, 2f, 12.88f, 2f, 11.5f)
            verticalLineToRelative(-7f)
            close()
            moveToRelative(14f, 7f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(7f, 13.985f, 7f, 11.5f)
            reflectiveCurveTo(9.015f, 7f, 11.5f, 7f)
            reflectiveCurveTo(16f, 9.015f, 16f, 11.5f)
            close()
            moveToRelative(-4.854f, -2.353f)
            lineToRelative(-2f, 2f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.511f, 0f, 0.707f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.707f, 0f)
            lineTo(11f, 10.707f)
            verticalLineTo(13.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-2.793f)
            lineToRelative(1.146f, 1.147f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-2f, -2f)
            curveToRelative(-0.048f, -0.048f, -0.104f, -0.084f, -0.163f, -0.108f)
            curveTo(11.633f, 9.014f, 11.57f, 9f, 11.503f, 9f)
            horizontalLineToRelative(-0.006f)
            curveToRelative(-0.067f, 0f, -0.13f, 0.014f, -0.188f, 0.038f)
            curveToRelative(-0.058f, 0.024f, -0.113f, 0.06f, -0.16f, 0.106f)
            lineToRelative(-0.003f, 0.003f)
            close()
        }
    }.build()
}
