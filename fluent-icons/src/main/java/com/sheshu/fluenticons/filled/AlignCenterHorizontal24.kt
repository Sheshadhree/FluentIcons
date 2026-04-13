package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AlignCenterHorizontal24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AlignCenterHorizontal24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.25f, 12.75f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(20f)
            verticalLineToRelative(-2.5f)
            curveToRelative(0f, -1.243f, -1.007f, -2.25f, -2.25f, -2.25f)
            horizontalLineToRelative(-2.5f)
            curveTo(14.007f, 6.5f, 13f, 7.507f, 13f, 8.75f)
            verticalLineToRelative(2.5f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(-4.5f)
            curveTo(11f, 5.507f, 9.993f, 4.5f, 8.75f, 4.5f)
            horizontalLineToRelative(-2.5f)
            curveTo(5.007f, 4.5f, 4f, 5.507f, 4f, 6.75f)
            verticalLineToRelative(4.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 11.25f, 2f, 11.586f, 2f, 12f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineTo(4f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 1.243f, 1.007f, 2.25f, 2.25f, 2.25f)
            horizontalLineToRelative(2.5f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineToRelative(-4.5f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 1.243f, 1.007f, 2.25f, 2.25f, 2.25f)
            horizontalLineToRelative(2.5f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineToRelative(-2.5f)
            horizontalLineToRelative(1.25f)
            close()
        }
    }.build()
}
