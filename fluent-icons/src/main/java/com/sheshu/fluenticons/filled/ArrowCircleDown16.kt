package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowCircleDown16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowCircleDown16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 8f)
            curveToRelative(0f, 3.866f, 3.134f, 7f, 7f, 7f)
            reflectiveCurveToRelative(7f, -3.134f, 7f, -7f)
            reflectiveCurveToRelative(-3.134f, -7f, -7f, -7f)
            reflectiveCurveToRelative(-7f, 3.134f, -7f, 7f)
            close()
            moveToRelative(6.809f, 3.462f)
            curveToRelative(-0.059f, -0.024f, -0.113f, -0.06f, -0.16f, -0.106f)
            lineToRelative(-0.003f, -0.003f)
            lineToRelative(-2.5f, -2.5f)
            curveToRelative(-0.195f, -0.195f, -0.195f, -0.511f, 0f, -0.707f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            lineTo(7.5f, 9.793f)
            verticalLineTo(5f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            reflectiveCurveTo(8.5f, 4.724f, 8.5f, 5f)
            verticalLineToRelative(4.793f)
            lineToRelative(1.646f, -1.646f)
            curveToRelative(0.196f, -0.196f, 0.512f, -0.196f, 0.708f, 0f)
            curveToRelative(0.195f, 0.195f, 0.195f, 0.511f, 0f, 0.707f)
            lineToRelative(-2.5f, 2.5f)
            lineToRelative(-0.003f, 0.002f)
            curveTo(8.261f, 11.445f, 8.137f, 11.5f, 8f, 11.5f)
            curveToRelative(-0.068f, 0f, -0.132f, -0.014f, -0.191f, -0.038f)
            close()
        }
    }.build()
}
