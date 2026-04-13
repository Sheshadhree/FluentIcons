package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.RatingMature20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.RatingMature20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.924f, 7.235f)
            curveToRelative(-0.118f, -0.19f, -0.347f, -0.277f, -0.562f, -0.216f)
            curveTo(7.148f, 7.081f, 7f, 7.277f, 7f, 7.5f)
            verticalLineToRelative(5f)
            curveTo(7f, 12.776f, 7.224f, 13f, 7.5f, 13f)
            reflectiveCurveTo(8f, 12.776f, 8f, 12.5f)
            verticalLineTo(9.243f)
            lineToRelative(1.576f, 2.522f)
            curveTo(9.667f, 11.911f, 9.828f, 12f, 10f, 12f)
            reflectiveCurveToRelative(0.333f, -0.089f, 0.424f, -0.235f)
            lineTo(12f, 9.243f)
            verticalLineTo(12.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.223f, -0.148f, -0.42f, -0.362f, -0.48f)
            curveToRelative(-0.215f, -0.062f, -0.444f, 0.026f, -0.562f, 0.215f)
            lineTo(10f, 10.557f)
            lineTo(7.924f, 7.235f)
            close()
            moveTo(6f, 3f)
            curveTo(4.343f, 3f, 3f, 4.343f, 3f, 6f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(8f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineTo(6f)
            close()
            moveTo(4f, 6f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(6f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(6f)
            close()
        }
    }.build()
}
