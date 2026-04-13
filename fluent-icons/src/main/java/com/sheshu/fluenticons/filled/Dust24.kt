package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Dust24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Dust24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 4f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveTo(6.552f, 2f, 6f, 2f)
            reflectiveCurveTo(5f, 2.448f, 5f, 3f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            close()
            moveToRelative(16f, 8f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            close()
            moveTo(7f, 21f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            close()
            moveTo(8.664f, 6.943f)
            curveTo(9.245f, 4.676f, 11.302f, 3f, 13.75f, 3f)
            curveTo(16.65f, 3f, 19f, 5.35f, 19f, 8.25f)
            curveToRelative(0f, 1.47f, -0.604f, 2.798f, -1.576f, 3.75f)
            curveTo(18.396f, 12.952f, 19f, 14.28f, 19f, 15.75f)
            curveToRelative(0f, 2.9f, -2.35f, 5.25f, -5.25f, 5.25f)
            curveToRelative(-2.448f, 0f, -4.505f, -1.676f, -5.086f, -3.943f)
            curveToRelative(-0.45f, 0.126f, -0.925f, 0.193f, -1.414f, 0.193f)
            curveTo(4.35f, 17.25f, 2f, 14.9f, 2f, 12f)
            reflectiveCurveToRelative(2.35f, -5.25f, 5.25f, -5.25f)
            curveToRelative(0.49f, 0f, 0.964f, 0.067f, 1.414f, 0.193f)
            close()
        }
    }.build()
}
