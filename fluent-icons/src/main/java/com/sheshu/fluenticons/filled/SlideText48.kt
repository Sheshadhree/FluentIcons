package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SlideText48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SlideText48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 12.75f)
            curveTo(4f, 10.127f, 6.127f, 8f, 8.75f, 8f)
            horizontalLineToRelative(30.5f)
            curveTo(41.873f, 8f, 44f, 10.127f, 44f, 12.75f)
            verticalLineToRelative(22.5f)
            curveToRelative(0f, 2.623f, -2.127f, 4.75f, -4.75f, 4.75f)
            horizontalLineTo(8.75f)
            curveTo(6.127f, 40f, 4f, 37.873f, 4f, 35.25f)
            verticalLineToRelative(-22.5f)
            close()
            moveToRelative(9.25f, 9.75f)
            curveToRelative(-0.69f, 0f, -1.25f, 0.56f, -1.25f, 1.25f)
            reflectiveCurveTo(12.56f, 25f, 13.25f, 25f)
            horizontalLineToRelative(17.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f)
            horizontalLineToRelative(-17.5f)
            close()
            moveTo(12f, 30.25f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(13.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveTo(27.44f, 29f, 26.75f, 29f)
            horizontalLineToRelative(-13.5f)
            curveTo(12.56f, 29f, 12f, 29.56f, 12f, 30.25f)
            close()
            moveTo(13.25f, 16f)
            curveTo(12.56f, 16f, 12f, 16.56f, 12f, 17.25f)
            reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(9.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveTo(23.44f, 16f, 22.75f, 16f)
            horizontalLineToRelative(-9.5f)
            close()
        }
    }.build()
}
