package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Ruler24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Ruler24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.25f, 2f)
            curveTo(8.007f, 2f, 7f, 3.007f, 7f, 4.25f)
            verticalLineToRelative(15.5f)
            curveTo(7f, 20.993f, 8.007f, 22f, 9.25f, 22f)
            horizontalLineToRelative(5.5f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineTo(4.25f)
            curveTo(17f, 3.007f, 15.993f, 2f, 14.75f, 2f)
            horizontalLineToRelative(-5.5f)
            close()
            moveTo(8.5f, 19f)
            horizontalLineToRelative(1.75f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(8.5f)
            verticalLineTo(16f)
            horizontalLineToRelative(3.75f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(8.5f)
            verticalLineToRelative(-1.75f)
            horizontalLineToRelative(1.75f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(8.5f)
            verticalLineTo(9.5f)
            horizontalLineToRelative(3.75f)
            curveTo(12.664f, 9.5f, 13f, 9.164f, 13f, 8.75f)
            reflectiveCurveTo(12.664f, 8f, 12.25f, 8f)
            horizontalLineTo(8.5f)
            verticalLineTo(6.5f)
            horizontalLineToRelative(1.75f)
            curveTo(10.664f, 6.5f, 11f, 6.164f, 11f, 5.75f)
            reflectiveCurveTo(10.664f, 5f, 10.25f, 5f)
            horizontalLineTo(8.5f)
            verticalLineTo(4.25f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(5.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(15.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-5.5f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineTo(19f)
            close()
        }
    }.build()
}
