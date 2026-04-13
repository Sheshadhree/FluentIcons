package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PointScan24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PointScan24",
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
            moveToRelative(0f, 5.5f)
            curveToRelative(-0.254f, 0f, -0.504f, 0.015f, -0.75f, 0.044f)
            verticalLineTo(13f)
            horizontalLineTo(4.045f)
            curveTo(4.014f, 13.246f, 4f, 13.496f, 4f, 13.75f)
            reflectiveCurveToRelative(0.015f, 0.505f, 0.045f, 0.75f)
            horizontalLineTo(9.5f)
            verticalLineToRelative(5.455f)
            curveTo(9.746f, 19.985f, 9.996f, 20f, 10.25f, 20f)
            reflectiveCurveToRelative(0.505f, -0.015f, 0.75f, -0.045f)
            verticalLineTo(14.5f)
            horizontalLineToRelative(5.456f)
            curveToRelative(0.03f, -0.245f, 0.044f, -0.496f, 0.044f, -0.75f)
            reflectiveCurveToRelative(-0.015f, -0.504f, -0.044f, -0.75f)
            horizontalLineTo(11f)
            verticalLineTo(7.544f)
            curveTo(10.756f, 7.514f, 10.505f, 7.5f, 10.25f, 7.5f)
            close()
        }
    }.build()
}
