package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.HardDrive24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.HardDrive24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.415f, 5.27f)
            curveTo(5.791f, 4.493f, 6.578f, 4f, 7.441f, 4f)
            horizontalLineToRelative(9.118f)
            curveToRelative(0.863f, 0f, 1.65f, 0.493f, 2.026f, 1.27f)
            lineToRelative(3.09f, 6.388f)
            curveTo(21.89f, 12.098f, 22f, 12.583f, 22f, 13.073f)
            verticalLineToRelative(3.677f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineTo(4.25f)
            curveTo(3.007f, 19f, 2f, 17.993f, 2f, 16.75f)
            verticalLineToRelative(-3.677f)
            curveToRelative(0f, -0.49f, 0.11f, -0.974f, 0.325f, -1.415f)
            lineToRelative(3.09f, -6.388f)
            close()
            moveToRelative(11.82f, 0.653f)
            curveTo(17.109f, 5.665f, 16.847f, 5.5f, 16.559f, 5.5f)
            horizontalLineTo(7.441f)
            curveToRelative(-0.288f, 0f, -0.55f, 0.165f, -0.675f, 0.423f)
            lineTo(4.309f, 11f)
            horizontalLineToRelative(15.382f)
            lineToRelative(-2.456f, -5.077f)
            close()
            moveTo(3.5f, 13.25f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(15.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-3.5f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(4.25f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            close()
            moveTo(18f, 16f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            close()
        }
    }.build()
}
