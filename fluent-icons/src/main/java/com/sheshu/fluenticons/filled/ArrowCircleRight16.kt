package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowCircleRight16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowCircleRight16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 15f)
            curveToRelative(3.866f, 0f, 7f, -3.134f, 7f, -7f)
            reflectiveCurveToRelative(-3.134f, -7f, -7f, -7f)
            reflectiveCurveToRelative(-7f, 3.134f, -7f, 7f)
            reflectiveCurveToRelative(3.134f, 7f, 7f, 7f)
            close()
            moveToRelative(3.462f, -6.809f)
            curveToRelative(-0.024f, 0.058f, -0.06f, 0.113f, -0.106f, 0.16f)
            lineToRelative(-0.003f, 0.003f)
            lineToRelative(-2.5f, 2.5f)
            curveToRelative(-0.195f, 0.195f, -0.511f, 0.195f, -0.707f, 0f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            lineTo(9.793f, 8.5f)
            horizontalLineTo(5f)
            curveTo(4.724f, 8.5f, 4.5f, 8.276f, 4.5f, 8f)
            reflectiveCurveTo(4.724f, 7.5f, 5f, 7.5f)
            horizontalLineToRelative(4.793f)
            lineTo(8.147f, 5.854f)
            curveToRelative(-0.196f, -0.196f, -0.196f, -0.512f, 0f, -0.708f)
            curveToRelative(0.195f, -0.195f, 0.511f, -0.195f, 0.707f, 0f)
            lineToRelative(2.5f, 2.5f)
            lineToRelative(0.002f, 0.003f)
            curveTo(11.445f, 7.739f, 11.5f, 7.863f, 11.5f, 8f)
            curveToRelative(0f, 0.068f, -0.014f, 0.132f, -0.038f, 0.191f)
            close()
        }
    }.build()
}
