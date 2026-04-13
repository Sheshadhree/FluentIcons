package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.AddSquareMultiple24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.AddSquareMultiple24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.25f, 3f)
            curveTo(4.007f, 3f, 3f, 4.007f, 3f, 5.25f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 1.243f, 1.007f, 2.25f, 2.25f, 2.25f)
            horizontalLineToRelative(11f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineToRelative(-11f)
            curveTo(18.5f, 4.007f, 17.493f, 3f, 16.25f, 3f)
            horizontalLineToRelative(-11f)
            close()
            moveTo(4.5f, 5.25f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(11f)
            curveTo(16.664f, 4.5f, 17f, 4.836f, 17f, 5.25f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-11f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineToRelative(-11f)
            close()
            moveTo(7.75f, 21f)
            curveToRelative(-0.98f, 0f, -1.813f, -0.626f, -2.122f, -1.5f)
            horizontalLineTo(16.25f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(5.628f)
            curveTo(20.374f, 5.937f, 21f, 6.77f, 21f, 7.75f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 2.623f, -2.127f, 4.75f, -4.75f, 4.75f)
            horizontalLineToRelative(-8.5f)
            close()
            moveToRelative(3f, -14.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineTo(10f)
            horizontalLineToRelative(2.75f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(11.5f)
            verticalLineToRelative(2.75f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveTo(10f, 14.664f, 10f, 14.25f)
            verticalLineTo(11.5f)
            horizontalLineTo(7.25f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            reflectiveCurveTo(6.836f, 10f, 7.25f, 10f)
            horizontalLineTo(10f)
            verticalLineTo(7.25f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            close()
        }
    }.build()
}
