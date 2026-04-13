package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SlideText48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SlideText48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 17.25f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            horizontalLineToRelative(9.5f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineToRelative(-9.5f)
            curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
            close()
            moveToRelative(1.25f, 5.25f)
            curveToRelative(-0.69f, 0f, -1.25f, 0.56f, -1.25f, 1.25f)
            reflectiveCurveTo(12.56f, 25f, 13.25f, 25f)
            horizontalLineToRelative(17.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f)
            horizontalLineToRelative(-17.5f)
            close()
            moveToRelative(0f, 6.5f)
            curveTo(12.56f, 29f, 12f, 29.56f, 12f, 30.25f)
            reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(13.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveTo(27.44f, 29f, 26.75f, 29f)
            horizontalLineToRelative(-13.5f)
            close()
            moveTo(8.75f, 8f)
            curveTo(6.127f, 8f, 4f, 10.127f, 4f, 12.75f)
            verticalLineToRelative(22.5f)
            curveTo(4f, 37.873f, 6.127f, 40f, 8.75f, 40f)
            horizontalLineToRelative(30.5f)
            curveToRelative(2.623f, 0f, 4.75f, -2.127f, 4.75f, -4.75f)
            verticalLineToRelative(-22.5f)
            curveTo(44f, 10.127f, 41.873f, 8f, 39.25f, 8f)
            horizontalLineTo(8.75f)
            close()
            moveTo(6.5f, 12.75f)
            curveToRelative(0f, -1.243f, 1.007f, -2.25f, 2.25f, -2.25f)
            horizontalLineToRelative(30.5f)
            curveToRelative(1.243f, 0f, 2.25f, 1.007f, 2.25f, 2.25f)
            verticalLineToRelative(22.5f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineTo(8.75f)
            curveToRelative(-1.243f, 0f, -2.25f, -1.007f, -2.25f, -2.25f)
            verticalLineToRelative(-22.5f)
            close()
        }
    }.build()
}
