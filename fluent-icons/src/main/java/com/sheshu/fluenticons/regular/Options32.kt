package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Options32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Options32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.5f, 6.5f)
            curveTo(21.88f, 6.5f, 23f, 7.62f, 23f, 9f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveTo(18f, 10.38f, 18f, 9f)
            reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
            close()
            moveTo(3f, 10f)
            horizontalLineToRelative(13.111f)
            curveToRelative(0.455f, 2.004f, 2.247f, 3.5f, 4.389f, 3.5f)
            curveToRelative(2.142f, 0f, 3.934f, -1.496f, 4.389f, -3.5f)
            horizontalLineTo(29f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-4.111f)
            curveToRelative(-0.455f, -2.004f, -2.247f, -3.5f, -4.389f, -3.5f)
            curveToRelative(-2.142f, 0f, -3.934f, 1.496f, -4.389f, 3.5f)
            horizontalLineTo(3f)
            curveTo(2.448f, 8f, 2f, 8.448f, 2f, 9f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            close()
            moveToRelative(8.5f, 10.5f)
            curveTo(10.12f, 20.5f, 9f, 21.62f, 9f, 23f)
            reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveTo(14f, 24.38f, 14f, 23f)
            reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
            close()
            moveTo(29f, 24f)
            horizontalLineTo(15.889f)
            curveToRelative(-0.455f, 2.004f, -2.247f, 3.5f, -4.389f, 3.5f)
            curveToRelative(-2.142f, 0f, -3.934f, -1.496f, -4.388f, -3.5f)
            horizontalLineTo(3f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(4.112f)
            curveToRelative(0.454f, -2.004f, 2.246f, -3.5f, 4.388f, -3.5f)
            reflectiveCurveToRelative(3.934f, 1.496f, 4.389f, 3.5f)
            horizontalLineTo(29f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            close()
        }
    }.build()
}
