package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ClockLock24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ClockLock24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.25f, 13.5f)
            horizontalLineToRelative(-4f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineToRelative(-6f)
            curveTo(10.5f, 6.336f, 10.836f, 6f, 11.25f, 6f)
            reflectiveCurveTo(12f, 6.336f, 12f, 6.75f)
            verticalLineTo(12f)
            horizontalLineToRelative(3.25f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            close()
            moveTo(12f, 2f)
            curveTo(6.478f, 2f, 2f, 6.478f, 2f, 12f)
            curveToRelative(0f, 0.427f, 0.027f, 0.847f, 0.079f, 1.26f)
            curveToRelative(0.34f, -1.578f, 1.742f, -2.76f, 3.421f, -2.76f)
            curveTo(7.433f, 10.5f, 9f, 12.067f, 9f, 14f)
            verticalLineToRelative(0.05f)
            curveToRelative(1.141f, 0.232f, 2f, 1.24f, 2f, 2.45f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.152f, -0.014f, 0.302f, -0.04f, 0.447f)
            curveTo(11.302f, 21.982f, 11.65f, 22f, 12f, 22f)
            curveToRelative(5.522f, 0f, 10f, -4.478f, 10f, -10f)
            reflectiveCurveTo(17.522f, 2f, 12f, 2f)
            close()
            moveTo(3f, 15f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveTo(8f, 12.62f, 8f, 14f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-6f)
            curveTo(1.672f, 23f, 1f, 22.328f, 1f, 21.5f)
            verticalLineToRelative(-5f)
            curveTo(1f, 15.672f, 1.672f, 15f, 2.5f, 15f)
            horizontalLineTo(3f)
            close()
            moveToRelative(1.5f, -1f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            close()
            moveToRelative(2f, 5f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            close()
        }
    }.build()
}
