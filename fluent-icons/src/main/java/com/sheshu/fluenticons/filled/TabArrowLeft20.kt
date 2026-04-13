package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TabArrowLeft20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TabArrowLeft20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 5.5f)
            curveTo(3f, 4.12f, 4.12f, 3f, 5.5f, 3f)
            horizontalLineToRelative(9f)
            curveTo(15.88f, 3f, 17f, 4.12f, 17f, 5.5f)
            verticalLineToRelative(4.1f)
            curveToRelative(-0.465f, -0.238f, -0.97f, -0.412f, -1.5f, -0.51f)
            verticalLineTo(5.5f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-9f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(3.59f)
            curveToRelative(0.098f, 0.53f, 0.272f, 1.035f, 0.51f, 1.5f)
            horizontalLineTo(5.5f)
            curveTo(4.12f, 17f, 3f, 15.88f, 3f, 14.5f)
            verticalLineToRelative(-9f)
            close()
            moveTo(14.5f, 19f)
            curveToRelative(-2.485f, 0f, -4.5f, -2.015f, -4.5f, -4.5f)
            reflectiveCurveToRelative(2.015f, -4.5f, 4.5f, -4.5f)
            reflectiveCurveToRelative(4.5f, 2.015f, 4.5f, 4.5f)
            reflectiveCurveToRelative(-2.015f, 4.5f, -4.5f, 4.5f)
            close()
            moveToRelative(-2.353f, -4.854f)
            lineToRelative(-0.003f, 0.003f)
            curveToRelative(-0.047f, 0.047f, -0.082f, 0.102f, -0.106f, 0.16f)
            curveTo(12.014f, 14.367f, 12f, 14.43f, 12f, 14.497f)
            verticalLineToRelative(0.006f)
            curveToRelative(0f, 0.067f, 0.014f, 0.13f, 0.038f, 0.188f)
            curveToRelative(0.024f, 0.06f, 0.06f, 0.115f, 0.108f, 0.163f)
            lineToRelative(2f, 2f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineTo(13.707f, 15f)
            horizontalLineTo(16.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(16.776f, 14f, 16.5f, 14f)
            horizontalLineToRelative(-2.793f)
            lineToRelative(1.147f, -1.146f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            lineToRelative(-2f, 2f)
            close()
        }
    }.build()
}
