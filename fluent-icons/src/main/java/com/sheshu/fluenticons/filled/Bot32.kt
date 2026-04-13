package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Bot32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Bot32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17f, 3f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(-4.75f)
            curveTo(8.455f, 4f, 7f, 5.455f, 7f, 7.25f)
            verticalLineToRelative(5.5f)
            curveTo(7f, 14.545f, 8.455f, 16f, 10.25f, 16f)
            horizontalLineToRelative(11.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineToRelative(-5.5f)
            curveTo(25f, 5.455f, 23.545f, 4f, 21.75f, 4f)
            horizontalLineTo(17f)
            verticalLineTo(3f)
            close()
            moveTo(8.25f, 19f)
            curveTo(6.455f, 19f, 5f, 20.455f, 5f, 22.25f)
            verticalLineToRelative(0.45f)
            curveToRelative(0f, 2.17f, 1.077f, 4.043f, 3.013f, 5.332f)
            curveTo(9.92f, 29.302f, 12.634f, 30f, 16f, 30f)
            curveToRelative(3.366f, 0f, 6.08f, -0.698f, 7.987f, -1.968f)
            curveTo(25.923f, 26.742f, 27f, 24.87f, 27f, 22.7f)
            verticalLineToRelative(-0.45f)
            curveToRelative(0f, -1.795f, -1.455f, -3.25f, -3.25f, -3.25f)
            horizontalLineTo(8.25f)
            close()
            moveToRelative(4.25f, -7.25f)
            curveToRelative(-0.966f, 0f, -1.75f, -0.784f, -1.75f, -1.75f)
            reflectiveCurveToRelative(0.784f, -1.75f, 1.75f, -1.75f)
            reflectiveCurveToRelative(1.75f, 0.784f, 1.75f, 1.75f)
            reflectiveCurveToRelative(-0.784f, 1.75f, -1.75f, 1.75f)
            close()
            moveTo(21.25f, 10f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            reflectiveCurveToRelative(-1.75f, -0.784f, -1.75f, -1.75f)
            reflectiveCurveToRelative(0.784f, -1.75f, 1.75f, -1.75f)
            reflectiveCurveToRelative(1.75f, 0.784f, 1.75f, 1.75f)
            close()
        }
    }.build()
}
