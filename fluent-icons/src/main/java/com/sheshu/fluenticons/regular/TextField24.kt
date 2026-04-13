package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextField24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextField24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.5f, 7.5f)
            horizontalLineToRelative(-2.75f)
            verticalLineToRelative(9f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(13.664f, 18f, 13.25f, 18f)
            horizontalLineToRelative(-2.5f)
            curveTo(10.336f, 18f, 10f, 17.664f, 10f, 17.25f)
            reflectiveCurveToRelative(0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(0.5f)
            verticalLineToRelative(-9f)
            horizontalLineTo(8.5f)
            verticalLineToRelative(0.75f)
            curveTo(8.5f, 8.664f, 8.164f, 9f, 7.75f, 9f)
            reflectiveCurveTo(7f, 8.664f, 7f, 8.25f)
            verticalLineToRelative(-1.5f)
            curveTo(7f, 6.336f, 7.336f, 6f, 7.75f, 6f)
            horizontalLineToRelative(8.5f)
            curveTo(16.664f, 6f, 17f, 6.336f, 17f, 6.75f)
            verticalLineToRelative(1.5f)
            curveTo(17f, 8.664f, 16.664f, 9f, 16.25f, 9f)
            reflectiveCurveTo(15.5f, 8.664f, 15.5f, 8.25f)
            verticalLineTo(7.5f)
            close()
            moveTo(5.75f, 3f)
            curveTo(3.679f, 3f, 2f, 4.679f, 2f, 6.75f)
            verticalLineToRelative(10.5f)
            curveTo(2f, 19.321f, 3.679f, 21f, 5.75f, 21f)
            horizontalLineToRelative(12.5f)
            curveToRelative(2.071f, 0f, 3.75f, -1.679f, 3.75f, -3.75f)
            verticalLineTo(6.75f)
            curveTo(22f, 4.679f, 20.321f, 3f, 18.25f, 3f)
            horizontalLineTo(5.75f)
            close()
            moveTo(3.5f, 6.75f)
            curveToRelative(0f, -1.243f, 1.007f, -2.25f, 2.25f, -2.25f)
            horizontalLineToRelative(12.5f)
            curveToRelative(1.243f, 0f, 2.25f, 1.007f, 2.25f, 2.25f)
            verticalLineToRelative(10.5f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineTo(5.75f)
            curveToRelative(-1.243f, 0f, -2.25f, -1.007f, -2.25f, -2.25f)
            verticalLineTo(6.75f)
            close()
        }
    }.build()
}
