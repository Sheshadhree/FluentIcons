package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.RoadCone16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.RoadCone16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.462f, 1f)
            curveToRelative(-0.46f, 0f, -0.86f, 0.312f, -0.97f, 0.758f)
            lineTo(5.056f, 7.5f)
            horizontalLineTo(8.5f)
            curveTo(8.776f, 7.5f, 9f, 7.724f, 9f, 8f)
            reflectiveCurveTo(8.776f, 8.5f, 8.5f, 8.5f)
            horizontalLineTo(4.806f)
            lineToRelative(-0.5f, 2f)
            horizontalLineTo(9.25f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveToRelative(-0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineTo(4.056f)
            lineTo(3.43f, 14f)
            horizontalLineTo(1.5f)
            curveTo(1.224f, 14f, 1f, 14.224f, 1f, 14.5f)
            reflectiveCurveTo(1.224f, 15f, 1.5f, 15f)
            horizontalLineToRelative(13f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(14.776f, 14f, 14.5f, 14f)
            horizontalLineToRelative(-1.931f)
            lineTo(9.509f, 1.758f)
            curveTo(9.396f, 1.312f, 8.996f, 1f, 8.537f, 1f)
            horizontalLineTo(7.462f)
            close()
        }
    }.build()
}
