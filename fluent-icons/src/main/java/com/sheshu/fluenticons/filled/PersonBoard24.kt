package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonBoard24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonBoard24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineToRelative(8.5f)
            curveTo(3f, 16.545f, 4.455f, 18f, 6.25f, 18f)
            horizontalLineToRelative(8.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineToRelative(-8.5f)
            curveTo(18f, 4.455f, 16.545f, 3f, 14.75f, 3f)
            horizontalLineToRelative(-8.5f)
            close()
            moveToRelative(6.5f, 4.5f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            reflectiveCurveTo(8.25f, 8.743f, 8.25f, 7.5f)
            reflectiveCurveToRelative(1.007f, -2.25f, 2.25f, -2.25f)
            reflectiveCurveToRelative(2.25f, 1.007f, 2.25f, 2.25f)
            close()
            moveToRelative(0.75f, 3.25f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.496f, -0.086f, 0.86f, -0.254f, 1.16f)
            curveToRelative(-0.168f, 0.303f, -0.43f, 0.562f, -0.818f, 0.83f)
            curveToRelative(-0.733f, 0.503f, -1.858f, 0.76f, -3.428f, 0.76f)
            curveToRelative(-1.32f, 0f, -2.445f, -0.257f, -3.24f, -0.76f)
            curveToRelative(-0.418f, -0.266f, -0.73f, -0.524f, -0.938f, -0.83f)
            curveTo(6.117f, 13.61f, 6f, 13.246f, 6f, 12.75f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(6f)
            close()
            moveTo(6.01f, 19f)
            curveToRelative(0.578f, 0.902f, 1.59f, 1.5f, 2.74f, 1.5f)
            horizontalLineToRelative(6.5f)
            curveToRelative(2.9f, 0f, 5.25f, -2.35f, 5.25f, -5.25f)
            verticalLineToRelative(-6.5f)
            curveToRelative(0f, -1.15f, -0.598f, -2.162f, -1.5f, -2.74f)
            verticalLineToRelative(9.24f)
            curveToRelative(0f, 2.071f, -1.679f, 3.75f, -3.75f, 3.75f)
            horizontalLineTo(6.01f)
            close()
        }
    }.build()
}
