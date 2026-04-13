package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.MyLocation20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MyLocation20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 13f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            reflectiveCurveToRelative(-1.343f, -3f, -3f, -3f)
            reflectiveCurveToRelative(-3f, 1.343f, -3f, 3f)
            reflectiveCurveToRelative(1.343f, 3f, 3f, 3f)
            close()
            moveToRelative(0.5f, -10.5f)
            curveTo(10.5f, 2.224f, 10.276f, 2f, 10f, 2f)
            reflectiveCurveTo(9.5f, 2.224f, 9.5f, 2.5f)
            verticalLineToRelative(1.52f)
            curveTo(6.585f, 4.261f, 4.261f, 6.585f, 4.02f, 9.5f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 9.5f, 2f, 9.724f, 2f, 10f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(1.52f)
            curveToRelative(0.241f, 2.915f, 2.565f, 5.239f, 5.48f, 5.48f)
            verticalLineToRelative(1.52f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-1.52f)
            curveToRelative(2.915f, -0.241f, 5.239f, -2.565f, 5.48f, -5.48f)
            horizontalLineToRelative(1.52f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveToRelative(-0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineToRelative(-1.52f)
            curveToRelative(-0.241f, -2.915f, -2.565f, -5.239f, -5.48f, -5.48f)
            verticalLineTo(2.5f)
            close()
            moveTo(10f, 15f)
            curveToRelative(-2.761f, 0f, -5f, -2.239f, -5f, -5f)
            reflectiveCurveToRelative(2.239f, -5f, 5f, -5f)
            reflectiveCurveToRelative(5f, 2.239f, 5f, 5f)
            reflectiveCurveToRelative(-2.239f, 5f, -5f, 5f)
            close()
        }
    }.build()
}
