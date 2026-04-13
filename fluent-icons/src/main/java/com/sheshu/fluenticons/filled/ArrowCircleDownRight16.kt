package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowCircleDownRight16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowCircleDownRight16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 1f)
            curveToRelative(3.866f, 0f, 7f, 3.134f, 7f, 7f)
            reflectiveCurveToRelative(-3.134f, 7f, -7f, 7f)
            reflectiveCurveToRelative(-7f, -3.134f, -7f, -7f)
            reflectiveCurveToRelative(3.134f, -7f, 7f, -7f)
            close()
            moveToRelative(2.5f, 4.5f)
            curveTo(10.224f, 5.5f, 10f, 5.724f, 10f, 6f)
            verticalLineToRelative(3.293f)
            lineTo(6.354f, 5.647f)
            lineTo(6.275f, 5.581f)
            curveTo(6.081f, 5.454f, 5.817f, 5.476f, 5.646f, 5.646f)
            curveToRelative(-0.17f, 0.171f, -0.192f, 0.435f, -0.064f, 0.63f)
            lineToRelative(0.064f, 0.078f)
            lineTo(9.293f, 10f)
            horizontalLineTo(6f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            reflectiveCurveTo(5.724f, 11f, 6f, 11f)
            horizontalLineToRelative(4.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(6f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            close()
        }
    }.build()
}
