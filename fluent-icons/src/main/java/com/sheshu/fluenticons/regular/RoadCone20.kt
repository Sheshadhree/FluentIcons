package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.RoadCone20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.RoadCone20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.384f, 2f)
            curveToRelative(-0.453f, 0f, -0.85f, 0.305f, -0.966f, 0.742f)
            lineTo(4.616f, 17f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 17f, 2f, 17.224f, 2f, 17.5f)
            reflectiveCurveTo(2.224f, 18f, 2.5f, 18f)
            horizontalLineToRelative(15f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(17.776f, 17f, 17.5f, 17f)
            horizontalLineToRelative(-2.116f)
            lineTo(11.582f, 2.742f)
            curveTo(11.465f, 2.305f, 11.07f, 2f, 10.616f, 2f)
            horizontalLineTo(9.384f)
            close()
            moveTo(5.651f, 17f)
            lineToRelative(0.8f, -3f)
            horizontalLineTo(11.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(11.776f, 13f, 11.5f, 13f)
            horizontalLineTo(6.718f)
            lineToRelative(0.533f, -2f)
            horizontalLineTo(10.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(10.776f, 10f, 10.5f, 10f)
            horizontalLineTo(7.518f)
            lineToRelative(1.866f, -7f)
            horizontalLineToRelative(1.232f)
            lineToRelative(3.733f, 14f)
            horizontalLineTo(5.651f)
            close()
        }
    }.build()
}
