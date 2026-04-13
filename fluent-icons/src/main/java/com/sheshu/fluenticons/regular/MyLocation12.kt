package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.MyLocation12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MyLocation12",
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
                moveTo(6f, 8f)
                curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
                reflectiveCurveTo(7.105f, 4f, 6f, 4f)
                reflectiveCurveTo(4f, 4.895f, 4f, 6f)
                reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
                close()
                moveTo(5.5f, 2.03f)
                verticalLineTo(0.5f)
                curveTo(5.5f, 0.224f, 5.724f, 0f, 6f, 0f)
                reflectiveCurveToRelative(0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(1.53f)
                curveTo(8.31f, 2.257f, 9.743f, 3.69f, 9.969f, 5.5f)
                horizontalLineTo(11.5f)
                curveTo(11.776f, 5.5f, 12f, 5.724f, 12f, 6f)
                reflectiveCurveToRelative(-0.224f, 0.5f, -0.5f, 0.5f)
                horizontalLineTo(9.969f)
                curveToRelative(-0.226f, 1.81f, -1.66f, 3.244f, -3.47f, 3.47f)
                lineTo(6.5f, 10f)
                verticalLineToRelative(1.5f)
                curveTo(6.5f, 11.776f, 6.276f, 12f, 6f, 12f)
                reflectiveCurveToRelative(-0.5f, -0.224f, -0.5f, -0.5f)
                verticalLineTo(9.97f)
                curveTo(3.69f, 9.743f, 2.257f, 8.31f, 2.03f, 6.5f)
                horizontalLineTo(0.5f)
                curveTo(0.224f, 6.5f, 0f, 6.276f, 0f, 6f)
                reflectiveCurveToRelative(0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1.53f)
                curveTo(2.257f, 3.692f, 3.69f, 2.258f, 5.5f, 2.032f)
                close()
                moveTo(3f, 6f)
                curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.343f, 3f, -3f)
                reflectiveCurveToRelative(-1.343f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.343f, -3f, 3f)
                close()
            }
        }
    }.build()
}
