package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.RoadCone20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.RoadCone20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.422f, 2.764f)
            curveTo(8.53f, 2.316f, 8.932f, 2f, 9.394f, 2f)
            horizontalLineToRelative(1.222f)
            curveToRelative(0.453f, 0f, 0.85f, 0.305f, 0.966f, 0.742f)
            lineTo(15.384f, 17f)
            horizontalLineTo(17.5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(17.776f, 18f, 17.5f, 18f)
            horizontalLineToRelative(-15f)
            curveTo(2.224f, 18f, 2f, 17.776f, 2f, 17.5f)
            reflectiveCurveTo(2.224f, 17f, 2.5f, 17f)
            horizontalLineToRelative(2.114f)
            curveToRelative(0.253f, -0.969f, 0.523f, -1.974f, 0.803f, -3f)
            horizontalLineTo(11.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(11.776f, 13f, 11.5f, 13f)
            horizontalLineTo(5.69f)
            lineToRelative(0.448f, -1.63f)
            lineTo(6.24f, 11f)
            horizontalLineToRelative(4.26f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(10.776f, 10f, 10.5f, 10f)
            horizontalLineTo(6.515f)
            curveToRelative(0.68f, -2.478f, 1.352f, -4.959f, 1.907f, -7.236f)
            close()
        }
    }.build()
}
