package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Options32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Options32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.5f, 4.5f)
            curveToRelative(-2.142f, 0f, -3.934f, 1.496f, -4.389f, 3.5f)
            horizontalLineTo(3f)
            curveTo(2.448f, 8f, 2f, 8.448f, 2f, 9f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(13.111f)
            curveToRelative(0.455f, 2.004f, 2.247f, 3.5f, 4.389f, 3.5f)
            curveToRelative(2.142f, 0f, 3.934f, -1.496f, 4.389f, -3.5f)
            horizontalLineTo(29f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-4.111f)
            curveToRelative(-0.455f, -2.004f, -2.247f, -3.5f, -4.389f, -3.5f)
            close()
            moveTo(15.889f, 22f)
            horizontalLineTo(29f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineTo(15.889f)
            curveToRelative(-0.455f, 2.004f, -2.247f, 3.5f, -4.389f, 3.5f)
            curveToRelative(-2.142f, 0f, -3.934f, -1.496f, -4.388f, -3.5f)
            horizontalLineTo(3f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(4.112f)
            curveToRelative(0.454f, -2.004f, 2.246f, -3.5f, 4.388f, -3.5f)
            reflectiveCurveToRelative(3.934f, 1.496f, 4.389f, 3.5f)
            close()
        }
    }.build()
}
