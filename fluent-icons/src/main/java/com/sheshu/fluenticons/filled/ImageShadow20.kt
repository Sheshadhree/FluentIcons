package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ImageShadow20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ImageShadow20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 2f)
            curveTo(3.343f, 2f, 2f, 3.343f, 2f, 5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.648f, 0.205f, 1.248f, 0.555f, 1.738f)
            lineToRelative(4.243f, -4.243f)
            curveToRelative(0.664f, -0.664f, 1.74f, -0.664f, 2.404f, 0f)
            lineToRelative(4.243f, 4.243f)
            curveTo(13.795f, 12.248f, 14f, 11.648f, 14f, 11f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineTo(5f)
            close()
            moveToRelative(0f, 12f)
            curveToRelative(-0.648f, 0f, -1.248f, -0.205f, -1.738f, -0.555f)
            lineToRelative(4.243f, -4.243f)
            curveToRelative(0.273f, -0.273f, 0.717f, -0.273f, 0.99f, 0f)
            lineToRelative(4.243f, 4.243f)
            curveTo(12.248f, 13.795f, 11.648f, 14f, 11f, 14f)
            horizontalLineTo(5f)
            close()
            moveToRelative(6f, -8f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveTo(9f, 6.552f, 9f, 6f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            close()
            moveToRelative(-5f, 9f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(3f)
            curveToRelative(3.314f, 0f, 6f, -2.686f, 6f, -6f)
            verticalLineTo(9f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            horizontalLineTo(6f)
            close()
        }
    }.build()
}
