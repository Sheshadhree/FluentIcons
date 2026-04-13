package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowCircleLeft16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowCircleLeft16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 15f)
            curveToRelative(-3.866f, 0f, -7f, -3.134f, -7f, -7f)
            reflectiveCurveToRelative(3.134f, -7f, 7f, -7f)
            reflectiveCurveToRelative(7f, 3.134f, 7f, 7f)
            reflectiveCurveToRelative(-3.134f, 7f, -7f, 7f)
            close()
            moveTo(4.538f, 8.191f)
            curveToRelative(0.024f, 0.058f, 0.06f, 0.113f, 0.106f, 0.16f)
            lineToRelative(0.003f, 0.003f)
            lineToRelative(2.5f, 2.5f)
            curveToRelative(0.195f, 0.195f, 0.511f, 0.195f, 0.707f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineTo(6.207f, 8.5f)
            horizontalLineTo(11f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(11.276f, 7.5f, 11f, 7.5f)
            horizontalLineTo(6.207f)
            lineToRelative(1.647f, -1.646f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            lineToRelative(-2.5f, 2.5f)
            lineTo(4.645f, 7.65f)
            curveTo(4.555f, 7.739f, 4.5f, 7.863f, 4.5f, 8f)
            curveToRelative(0f, 0.068f, 0.013f, 0.132f, 0.038f, 0.191f)
            close()
        }
    }.build()
}
