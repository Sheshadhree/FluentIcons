package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Delete20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Delete20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.5f, 4f)
            horizontalLineToRelative(3f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveTo(8.5f, 3.172f, 8.5f, 4f)
            close()
            moveToRelative(-1f, 0f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            horizontalLineToRelative(5f)
            curveTo(17.776f, 4f, 18f, 4.224f, 18f, 4.5f)
            reflectiveCurveTo(17.776f, 5f, 17.5f, 5f)
            horizontalLineToRelative(-1.054f)
            lineToRelative(-1.194f, 10.344f)
            curveTo(15.077f, 16.858f, 13.796f, 18f, 12.272f, 18f)
            horizontalLineTo(7.728f)
            curveToRelative(-1.524f, 0f, -2.805f, -1.142f, -2.98f, -2.656f)
            lineTo(3.554f, 5f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 5f, 2f, 4.776f, 2f, 4.5f)
            reflectiveCurveTo(2.224f, 4f, 2.5f, 4f)
            horizontalLineToRelative(5f)
            close()
            moveTo(5.741f, 15.23f)
            curveTo(5.858f, 16.237f, 6.712f, 17f, 7.728f, 17f)
            horizontalLineToRelative(4.544f)
            curveToRelative(1.016f, 0f, 1.87f, -0.762f, 1.987f, -1.77f)
            lineTo(15.439f, 5f)
            horizontalLineTo(4.561f)
            lineToRelative(1.18f, 10.23f)
            close()
            moveTo(8.5f, 7.5f)
            curveTo(8.776f, 7.5f, 9f, 7.724f, 9f, 8f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(8f, 14.276f, 8f, 14f)
            verticalLineTo(8f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            close()
            moveTo(12f, 8f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            reflectiveCurveTo(11f, 7.724f, 11f, 8f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveTo(12f, 14.276f, 12f, 14f)
            verticalLineTo(8f)
            close()
        }
    }.build()
}
