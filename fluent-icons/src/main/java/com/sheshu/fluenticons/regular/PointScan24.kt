package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PointScan24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PointScan24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.25f, 2f)
            curveToRelative(0.38f, 0f, 0.694f, 0.282f, 0.743f, 0.648f)
            lineTo(11f, 2.75f)
            verticalLineToRelative(4.794f)
            curveToRelative(2.853f, 0.341f, 5.115f, 2.604f, 5.456f, 5.456f)
            horizontalLineToRelative(4.794f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            curveToRelative(0f, 0.38f, -0.282f, 0.694f, -0.648f, 0.743f)
            lineTo(21.25f, 14.5f)
            horizontalLineToRelative(-4.794f)
            curveToRelative(-0.342f, 2.853f, -2.604f, 5.114f, -5.455f, 5.455f)
            verticalLineToRelative(1.295f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            curveToRelative(-0.38f, 0f, -0.694f, -0.282f, -0.744f, -0.648f)
            lineTo(9.5f, 21.25f)
            verticalLineToRelative(-1.295f)
            curveToRelative(-2.852f, -0.34f, -5.114f, -2.602f, -5.455f, -5.454f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 14.5f, 2f, 14.163f, 2f, 13.75f)
            curveToRelative(0f, -0.38f, 0.282f, -0.694f, 0.648f, -0.744f)
            lineTo(2.75f, 13f)
            horizontalLineToRelative(1.295f)
            curveToRelative(0.34f, -2.852f, 2.603f, -5.115f, 5.455f, -5.456f)
            verticalLineTo(2.75f)
            curveTo(9.5f, 2.336f, 9.836f, 2f, 10.25f, 2f)
            close()
            moveTo(9.5f, 14.5f)
            horizontalLineTo(5.56f)
            curveToRelative(0.32f, 2.023f, 1.918f, 3.62f, 3.94f, 3.941f)
            verticalLineTo(14.5f)
            close()
            moveToRelative(5.441f, 0f)
            horizontalLineTo(11f)
            verticalLineToRelative(3.941f)
            curveToRelative(2.023f, -0.321f, 3.62f, -1.918f, 3.941f, -3.94f)
            close()
            moveToRelative(-5.44f, -5.442f)
            curveTo(7.476f, 9.38f, 5.88f, 10.978f, 5.558f, 13f)
            horizontalLineTo(9.5f)
            verticalLineTo(9.058f)
            close()
            moveToRelative(1.5f, 0f)
            lineTo(11f, 13f)
            horizontalLineToRelative(3.942f)
            curveToRelative(-0.31f, -1.95f, -1.806f, -3.506f, -3.726f, -3.902f)
            lineTo(11f, 9.058f)
            close()
        }
    }.build()
}
