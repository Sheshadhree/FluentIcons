package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MyLocation12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MyLocation12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(12f)
                horizontalLineTo(0f)
                close()
                moveToRelative(0f, 0f)
            }
        ) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 7.75f)
                curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
                reflectiveCurveTo(6.966f, 4.25f, 6f, 4.25f)
                reflectiveCurveTo(4.25f, 5.034f, 4.25f, 6f)
                reflectiveCurveTo(5.034f, 7.75f, 6f, 7.75f)
                close()
                moveToRelative(0.75f, -5.68f)
                curveToRelative(1.608f, 0.305f, 2.875f, 1.572f, 3.18f, 3.18f)
                horizontalLineToRelative(1.32f)
                curveTo(11.664f, 5.25f, 12f, 5.586f, 12f, 6f)
                reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
                horizontalLineTo(9.93f)
                curveTo(9.625f, 8.359f, 8.356f, 9.627f, 6.747f, 9.93f)
                curveTo(6.749f, 9.953f, 6.75f, 9.977f, 6.75f, 10f)
                verticalLineToRelative(1.25f)
                curveTo(6.75f, 11.664f, 6.414f, 12f, 6f, 12f)
                reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
                verticalLineTo(10f)
                curveToRelative(0f, -0.023f, 0.001f, -0.047f, 0.003f, -0.07f)
                curveToRelative(-1.61f, -0.304f, -2.88f, -1.573f, -3.183f, -3.183f)
                curveTo(2.047f, 6.749f, 2.023f, 6.75f, 2f, 6.75f)
                horizontalLineTo(0.75f)
                curveTo(0.336f, 6.75f, 0f, 6.414f, 0f, 6f)
                reflectiveCurveToRelative(0.336f, -0.75f, 0.75f, -0.75f)
                horizontalLineTo(2f)
                curveToRelative(0.023f, 0f, 0.047f, 0.001f, 0.07f, 0.003f)
                curveToRelative(0.304f, -1.609f, 1.57f, -2.878f, 3.18f, -3.183f)
                verticalLineTo(0.75f)
                curveTo(5.25f, 0.336f, 5.586f, 0f, 6f, 0f)
                reflectiveCurveToRelative(0.75f, 0.336f, 0.75f, 0.75f)
                verticalLineToRelative(1.32f)
                close()
                moveTo(8.5f, 6f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveTo(3.5f, 4.62f, 3.5f, 6f)
                reflectiveCurveTo(4.62f, 8.5f, 6f, 8.5f)
                reflectiveCurveTo(8.5f, 7.38f, 8.5f, 6f)
                close()
            }
        }
    }.build()
}
