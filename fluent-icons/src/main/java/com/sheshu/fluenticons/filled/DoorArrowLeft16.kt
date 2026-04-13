package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DoorArrowLeft16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DoorArrowLeft16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 2.75f)
            curveTo(3f, 1.784f, 3.784f, 1f, 4.75f, 1f)
            horizontalLineToRelative(6.5f)
            curveTo(12.216f, 1f, 13f, 1.784f, 13f, 2.75f)
            verticalLineToRelative(3.457f)
            curveTo(12.523f, 6.072f, 12.02f, 6f, 11.5f, 6f)
            curveTo(8.462f, 6f, 6f, 8.462f, 6f, 11.5f)
            curveToRelative(0f, 1.33f, 0.472f, 2.55f, 1.257f, 3.5f)
            horizontalLineTo(4.75f)
            curveTo(3.784f, 15f, 3f, 14.216f, 3f, 13.25f)
            verticalLineTo(2.75f)
            close()
            moveTo(6f, 9f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveTo(6.552f, 7f, 6f, 7f)
            reflectiveCurveTo(5f, 7.448f, 5f, 8f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            close()
            moveToRelative(10f, 2.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(7f, 13.985f, 7f, 11.5f)
            reflectiveCurveTo(9.015f, 7f, 11.5f, 7f)
            reflectiveCurveTo(16f, 9.015f, 16f, 11.5f)
            close()
            moveToRelative(-6.853f, -0.354f)
            lineToRelative(-0.003f, 0.003f)
            curveToRelative(-0.047f, 0.047f, -0.082f, 0.102f, -0.106f, 0.16f)
            curveTo(9.014f, 11.367f, 9f, 11.43f, 9f, 11.497f)
            verticalLineToRelative(0.006f)
            curveToRelative(0f, 0.067f, 0.014f, 0.13f, 0.038f, 0.188f)
            curveToRelative(0.024f, 0.06f, 0.06f, 0.115f, 0.108f, 0.163f)
            lineToRelative(2f, 2f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineTo(10.707f, 12f)
            horizontalLineTo(13.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(13.776f, 11f, 13.5f, 11f)
            horizontalLineToRelative(-2.793f)
            lineToRelative(1.147f, -1.146f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.707f)
            curveToRelative(-0.196f, -0.196f, -0.512f, -0.196f, -0.708f, 0f)
            lineToRelative(-2f, 1.999f)
            close()
        }
    }.build()
}
